package com.bot.demo.controllers;


import com.bot.demo.enums.NodeType;
import com.bot.demo.model.BotNodeDto;
import com.bot.demo.model.BotRequestDto;
import com.bot.demo.model.BotResponseDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class ChatBotController {

    private static List<BotNodeDto> mainOptions;

    static {

        mainOptions = new ArrayList<>();
        BotNodeDto startOver = new BotNodeDto(0, NodeType.TEXT,"Start Over",new ArrayList<>(),"");
        startOver.getChildNode().add(1);
        startOver.getChildNode().add(4);
        startOver.getChildNode().add(5);
        startOver.getChildNode().add(6);
        BotNodeDto changeBooking = new BotNodeDto(1, NodeType.TEXT,"Change Booking",new ArrayList<>(),"");
        changeBooking.getChildNode().add(2);
        changeBooking.getChildNode().add(3);
        BotNodeDto cancelBooking = new BotNodeDto(2, NodeType.TEXT,"Cancel Booking",new ArrayList<>(),"itineraryNumber");
        BotNodeDto addToStay = new BotNodeDto(3, NodeType.TEXT,"addToStay",new ArrayList<>(),"itineraryNumber");
        mainOptions.add(startOver);
        mainOptions.add(changeBooking);
        mainOptions.add(cancelBooking);
        mainOptions.add(addToStay);
        changeBooking.getOptions().add(getChildOption(changeBooking.getChildNode().get(0)));
        changeBooking.getOptions().add(getChildOption(changeBooking.getChildNode().get(1)));




    }

    private static BotNodeDto getChildOption(int nodeId) {

        for(BotNodeDto botNode:mainOptions){
            if(botNode.getId() == nodeId)
                return botNode;

        }
        return null;
    }

    @PostMapping("/option")
    public BotResponseDto getOptions(@RequestBody BotRequestDto requestDto)
    {
        BotResponseDto responseDto = new BotResponseDto();
        responseDto.setDescriptionText("What do you want to do next?");
        for(BotNodeDto option: mainOptions)
        {
              if(option.getId() == requestDto.getOptionId())
              {
                  responseDto.getOptions().add(option);
                  return responseDto;
              }



        }
        return null;
    }


}

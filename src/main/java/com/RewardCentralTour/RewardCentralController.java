package com.RewardCentralTour;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import rewardCentral.RewardCentral;

@RestController
public class RewardCentralController {private RewardCentral rewardCentral;

@Autowired
public RewardCentralController(RewardCentral rewardCentral) {
	this.rewardCentral = rewardCentral;
}

/**
 * @param attractionId
 * @param userId
 * @return the reward point of that attraction.
 */
@RequestMapping("/attractionRewardPoint")
public int getAttractionRewardPoints(@RequestParam UUID attractionId, @RequestParam UUID userId) {
	return rewardCentral.getAttractionRewardPoints(attractionId, userId);
}

}

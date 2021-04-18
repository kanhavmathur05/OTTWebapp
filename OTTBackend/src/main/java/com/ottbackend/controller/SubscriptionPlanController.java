package com.ottbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ottbackend.model.SubscriptionPlan;
import com.ottbackend.service.SubscriptionPlanService;

import io.swagger.annotations.ApiOperation;

@RestController
public class SubscriptionPlanController {

	@Autowired
	SubscriptionPlanService subscribtionPlanService;

	@ApiOperation(value = "Create a new plan",response = SubscriptionPlan.class,tags="addPlan")
	@PostMapping("/create-plan")
	public void createPlan(@RequestBody SubscriptionPlan subscriptionPlan) {
		subscribtionPlanService.createSubscriptionPlan(subscriptionPlan);
	}

	@ApiOperation(value = "Get list of plans",response = Iterable.class,tags="getAllPlans")
	@GetMapping("/get-subscription-plans")
	public List<SubscriptionPlan> getSubscriptionPlansList() {
		return subscribtionPlanService.getAllPlans();
	}

	@ApiOperation(value = "Delete plan by id",response = SubscriptionPlan.class,tags="deletePlan")
	@DeleteMapping("/delete-plan/{id}")
	public void deletePlan(@PathVariable int id) {
		subscribtionPlanService.deleteSubscriptionPlan(id);
	}

	@ApiOperation(value = "Get plan details by id",response = SubscriptionPlan.class,tags="getPlanById")
	@GetMapping("/get-plan/{id}")
	public SubscriptionPlan getPlan(@PathVariable int id) {
		return subscribtionPlanService.getSubscriptionPlan(id);
	}
}

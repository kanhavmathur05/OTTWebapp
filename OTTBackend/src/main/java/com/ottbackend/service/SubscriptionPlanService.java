package com.ottbackend.service;

import java.util.List;

import com.ottbackend.model.SubscriptionPlan;

public interface SubscriptionPlanService {
	SubscriptionPlan createSubscriptionPlan(SubscriptionPlan subscriptionPlan);
	List<SubscriptionPlan> getAllPlans();
	SubscriptionPlan getSubscriptionPlan(int id);
	void deleteSubscriptionPlan(int id);
	SubscriptionPlan updateSubscriptionPlan(SubscriptionPlan subscribtionPlan);
}

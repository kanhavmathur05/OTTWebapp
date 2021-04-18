package com.ottbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ottbackend.model.SubscriptionPlan;
import com.ottbackend.repository.SubscriptionPlanRepository;

@Service
public class SubscriptionPlanServiceImpl implements SubscriptionPlanService{

	@Autowired
	SubscriptionPlanRepository subscriptionPlanRepository;
	
	@Override
	public List<SubscriptionPlan> getAllPlans() {
		return subscriptionPlanRepository.findAll();
	}

	@Override
	public SubscriptionPlan getSubscriptionPlan(int id) {
		return subscriptionPlanRepository.findById(id).get();
	}

	@Override
	public void deleteSubscriptionPlan(int id) {
		subscriptionPlanRepository.deleteById(id);
	}

	@Override
	public SubscriptionPlan updateSubscriptionPlan(SubscriptionPlan subscribtionPlan) {
		return subscriptionPlanRepository.save(subscribtionPlan);
	}

	@Override
	public SubscriptionPlan createSubscriptionPlan(SubscriptionPlan subscriptionPlan) {
		return subscriptionPlanRepository.save(subscriptionPlan);
	}

}

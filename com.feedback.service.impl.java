package com.feedback.service.impl;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feedback.dao.FeedbackDAO;
import com.feedback.exception.BusinessException;
import com.feedback.model.Feedback;
import com.feedback.servic.FeedbackService;

@Service

public class FeedbackServiceImpl  implements FeedbackService{
	@Autowired
	private FeedbackDAO dao;
		@Override
		public Feedback createFeedback(Feedback feedback) {
			return dao.save(feedback);
		}
		@Override
		public Feedback updateFeedback(Feedback feedback) {
			return dao.save(feedback);
		}
		@Override
		public Feedback getFeedbackById(int id) throws BusinessException{	
			if(id<=0) {
				throw new BusinessException("Id "+id +" is invalid");
			}
			Feedback feedback=null;
			try {
			feedback=dao.findById(id).get();
			}catch(NoSuchElementException e) {
				throw new BusinessException("No animal found for id "+id);
			}
			return feedback;
		}
		@Override
		public List<Feedback> getAllFeedbacks() {
			return dao.findAll();
		}
		@Override
		public List<Feedback> getFeedbacksByName(String name) {
		    return dao.findByName(name);
		}
		@Override
		public List<Feedback> getFeedbacksByCountry(String country) {
			return dao.findByCountry(country);
		}
		@Override
		public List<Feedback> getFeedbacksByEmail(String email) {
		    return dao.findByEmail(email);
		}
		@Override
		public List<Feedback> getFeedbacksByComments(String comments) {
			return dao.findByComments(comments);
		}
		@Override
		public void deleteFeedbackById(int id) {
			dao.deleteById(id);
			}
		}



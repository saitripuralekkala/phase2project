package com.feedback.servic;
import java.util.List;

import com.feedback.exception.BusinessException;
import com.feedback.model.Feedback;


public interface FeedbackService {
	public Feedback createFeedback(Feedback feedback);
	public Feedback updateFeedback(Feedback feedback);
	public Feedback getFeedbackById(int id) throws BusinessException;
    public List<Feedback> getAllFeedbacks();
    public List<Feedback> getFeedbacksByName(String Name);
    public List<Feedback> getFeedbacksByCountry(String country);
    public List<Feedback> getFeedbacksByEmail(String email);
    public List<Feedback> getFeedbacksByComments(String comments);
    public void deleteFeedbackById(int id);
    }

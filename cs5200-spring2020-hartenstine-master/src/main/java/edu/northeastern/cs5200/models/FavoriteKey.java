package edu.northeastern.cs5200.models;


import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class FavoriteKey implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    private Integer applicant;

    private Integer job;

  public FavoriteKey() {
  }

  public FavoriteKey(Integer applicant, Integer job) {
    this.applicant = applicant;
    this.job = job;
  }

  public Integer getApplicant() {
		return applicant;
	}

	public void setApplicant(Integer studentId) {
		this.applicant = studentId;
	}

	public Integer getJob() {
		return job;
	}

	public void setJob(Integer sectionId) {
		this.job = sectionId;
	}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((job == null) ? 0 : job.hashCode());
        result = prime * result + ((applicant == null) ? 0 : applicant.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        FavoriteKey other = (FavoriteKey) obj;
        if (job == null) {
            if (other.job != null)
                return false;
        } else if (!job.equals(other.job))
            return false;
        if (applicant == null) {
          return other.applicant == null;
        } else return applicant.equals(other.applicant);
    }
    

}

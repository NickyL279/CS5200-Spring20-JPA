package edu.northeastern.cs5200.models.job;


import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class FavoriteKey implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    private Integer student;

    private Integer job;

  public FavoriteKey() {
  }

  public FavoriteKey(Integer student, Integer job) {
    this.student = student;
    this.job = job;
  }

  public Integer getStudent() {
		return student;
	}

	public void setStudent(Integer studentId) {
		this.student = studentId;
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
        result = prime * result + ((student == null) ? 0 : student.hashCode());
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
        if (student == null) {
          return other.student == null;
        } else return student.equals(other.student);
    }
    

}

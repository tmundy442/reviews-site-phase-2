package review;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Review {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	String title;
	Date date;
	String author;
	String content;
	@ManyToOne
	Category category;

	protected Review() {
	}

	public Review(String title, Date date, String author, String content, Category category) {

		this.title = title;
		this.date = date;
		this.author = author;
		this.content = content;
		this.category = category;

	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Date getDate() {
		return date;
	}

	public String getAuthor() {
		return author;
	}

	public String getContent() {
		return content;
	}

	public String getCategory() {
		return category.categoryName;
	}
}

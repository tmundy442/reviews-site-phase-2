package review;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	String categoryName;

	@OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
	private Collection<Review> reviews;

	protected Category() {
	}

	public Category(Long id, String categoryName) {
		this.id = id;
		this.categoryName = categoryName;

	}

	public long getId() {
		return id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public Collection<Review> getReviews() {

		return reviews;

	}

}

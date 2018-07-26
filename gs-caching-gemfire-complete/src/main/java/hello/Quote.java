package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.springframework.util.ObjectUtils;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@SuppressWarnings("unused")
public class Quote {

	private Long id;

	private String quote;

	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the quote
	 */
	public String getQuote() {
		return quote;
	}

	/**
	 * @param quote the quote to set
	 */
	public void setQuote(String quote) {
		this.quote = quote;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Quote)) {
			return false;
		}

		Quote that = (Quote) obj;

		return ObjectUtils.nullSafeEquals(this.getId(), that.getId());
	}

	@Override
	public int hashCode() {

		int hashValue = 17;

		hashValue = 37 * hashValue + ObjectUtils.nullSafeHashCode(getId());

		return hashValue;
	}

	@Override
	public String toString() {
		return getQuote();
	}
}

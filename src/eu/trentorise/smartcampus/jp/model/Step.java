package eu.trentorise.smartcampus.jp.model;

import java.util.Map;

import android.text.Spanned;
import android.widget.ImageView;

public class Step {
	private String time;
	private Spanned description;
	private ImageView image;
	private String alert;
	private Map<String, Object> extra;

	public Step() {
	}

	public Step(String time, Spanned description, ImageView image, String alert) {
		setTime(time);
		setDescription(description);
		setImage(image);
		setAlert(alert);
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Spanned getDescription() {
		return description;
	}

	public void setDescription(Spanned description) {
		this.description = description;
	}

	public ImageView getImage() {
		return image;
	}

	public void setImage(ImageView image) {
		this.image = image;
	}

	public String getAlert() {
		return alert;
	}

	public void setAlert(String alert) {
		this.alert = alert;
	}

	public Map<String, Object> getExtra() {
		return extra;
	}

	public void setExtra(Map<String, Object> extra) {
		this.extra = extra;
	}
}

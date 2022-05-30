package com.ruanko.entity;

import javax.persistence.*;

/**
 * 新闻文章<br>
 * 新闻即文章，文章即新闻，有点混了
 * 
 * @author
 *
 */
@Entity
@Table(name = "article")
public class Article {

	/**
	 * 编号
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	/**
	 * 标题
	 */
	private String title;
	
	/**
	 * 作者
	 */
	private String author;
	
	/**
	 * 内容
	 */
	private String content;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}

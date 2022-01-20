package com.rakesh.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity

@Table(name = "websites")
@NamedQueries(value = {
		@NamedQuery(name = "getByName", query = "select web from WebSiteEntity  web where web.name='ebay'"),
		@NamedQuery(name = "getByLikeURLX", query = "select web from WebSiteEntity web where web.url like 'www.b%'"),
        @NamedQuery(name = "getMinSince", query = "select  web ,MIN(web.since)  from WebSiteEntity web "),	
	    @NamedQuery(name = "getmaxSince", query = "select web,max(web.since)  from WebSiteEntity web")
		
})
public class WebSiteEntity {

	@Id
	@Column(name = "w_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "w_name")
	private String name;
	@Column(name = "w_url")
	private String url;
	@Column(name = "w_since")
	private int since;
	@Column(name = "w_owner")
	private String owner;
	@Column(name = "w_domain")
	private String domain;

	public WebSiteEntity() {
	}

	public WebSiteEntity(String name, String url, int since, String owner, String domain) {
		super();
		this.name = name;
		this.url = url;
		this.since = since;
		this.owner = owner;
		this.domain = domain;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getSince() {
		return since;
	}

	public void setSince(int since) {
		this.since = since;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	@Override
	public String toString() {
		return "WebSiteEntity [id=" + id + ", name=" + name + ", url=" + url + ", since=" + since + ", owner=" + owner
				+ ", domain=" + domain + "]";
	}

}

package com.rakesh.crud;

import com.rakesh.crud.dao.WebSiteDAO;
import com.rakesh.crud.dao.WebSiteDAOimpl;
import com.rakesh.crud.entity.WebSiteEntity;

public class WebSiteScammer {

	public static void main(String[] args) {
     
		WebSiteEntity entity1=new WebSiteEntity("Google","www.goole.com", 1994, "Abhijeet", ".com");
		
		WebSiteDAO dao=new WebSiteDAOimpl();
		dao.add(entity1);
		dao.add(new WebSiteEntity("Amazon","www.amazon.com",2005,"Siddharth",".com"));
		dao.add(new WebSiteEntity("Facebook","www.Facebook.com",1997,"Pramod",".com"));
		dao.add(new WebSiteEntity("Yahoo","www.Yahoo.com",2002,"anmol",".com"));
		dao.add(new WebSiteEntity("Reddit","www.Reddit.org",2005,"Vanadana",".org"));
		dao.add(new WebSiteEntity("wikipidia","www.wikipidia.org",1999,"Harshita",".org"));
		dao.add(new WebSiteEntity("ebay","www.ebay.com",2001,"Parota Ayyappa",".com"));
		dao.add(new WebSiteEntity("bing","www.bing.org",2005,"Shreyas",".org"));
		dao.add(new WebSiteEntity("netflix","www.netflix.com",2000,"Mallikarjun",".com"));
		dao.add(new WebSiteEntity("office","www.office.org",2005,"KD",".org"));
		dao.add(new WebSiteEntity("instructure","www.instructure.com",1994,"Amruta",".com"));
		dao.add(new WebSiteEntity("shopify","www.shopify.com",2005,"AllahuddinKhilji",".com"));
		dao.add(new WebSiteEntity("twitch","www.twitch.org",2013,"mustappa",".org"));
		dao.add(new WebSiteEntity("CNN","www.CNN.com",2004,"sadia",".com"));
		dao.add(new WebSiteEntity("linkedin","www.linkedin.org",2003,"john",".org"));
		dao.add(new WebSiteEntity("instagram","www.instagam.com",1998,"Harkangi",".com"));
		dao.add(new WebSiteEntity("intuit","www.intuit.com",2000,"Naggappa",".com"));
		dao.add(new WebSiteEntity("microsoft","www.microsoft.com",2005,"Vinay sir",".com"));
		dao.add(new WebSiteEntity("cloudflare","www.cloudflare.in",2002,"omkar sir",".in"));
		dao.add(new WebSiteEntity("w3schools","www.w3schools.in",2010,"Akshara sir",".in"));

	}

}

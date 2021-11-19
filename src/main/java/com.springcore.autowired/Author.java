package com.springcore.autowired;

public class Author {
		private String authorName;
		private String address;
		private long contact;
		public String getAuthorName() {
			return authorName;
		}
		public void setAuthorName(String authorName) {
			this.authorName = authorName;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public long getContact() {
			return contact;
		}
		public void setContact(long contact) {
			this.contact = contact;
		}
		@Override
		public String toString() {
			return "Author [authorName=" + authorName + ", address=" + address + ", contact=" + contact + "]";
		}
		public Author(String authorName, String address, long contact) {
			super();
			this.authorName = authorName;
			this.address = address;
			this.contact = contact;
		}
		public Author() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
}

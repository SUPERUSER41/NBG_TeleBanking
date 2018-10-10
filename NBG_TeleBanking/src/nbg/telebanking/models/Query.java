package nbg.telebanking.models;

public class Query 
{
		private int query_id;
		private String queryname;

		public Query() {
			this(0,"");
		}

		public Query(int query_id, String queryname) {
			super();
			this.query_id = query_id;
			this.queryname = queryname;
		}

		public int getQuery_id() {
			return query_id;
		}

		public void setQuery_id(int query_id) {
			this.query_id = query_id;
		}

		public String getQueryname() {
			return queryname;
		}

		public void setQueryname(String queryname) {
			this.queryname = queryname;
		}

		@Override
		public String toString() {
			return "Query [query_id=" + query_id + ", queryname=" + queryname + "]";
		}	

}

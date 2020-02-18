package login_System;

public class RespondToRequestCntrlr {
 
	public RespondToRequestCntrlr( String requestBookName , boolean approveRequest) {
	if(approveRequest)
	{
		for (int i =0 ; i<Admin.requestBookList.size() ; i++)
		{
			if(Admin.requestBookList.get(i).name.contains(requestBookName))
			{
				RespondToRequest.bs.bookArrayList.add(Admin.requestBookList.get(i)) ; 
				Admin.requestBookList.remove(i) ; 
				
			}
		
			
		}
		
		
	}
		
	else
	{

		for (int i =0 ; i<Admin.requestBookList.size() ; i++)
		{
			if(Admin.requestBookList.get(i).name.contains(requestBookName))
			{
				
				Admin.requestBookList.remove(i) ; 
				
			}
		
			
		}
		
		
	}
		
		
		
		
	}
}

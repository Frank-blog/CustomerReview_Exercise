/*    */ package de.hybris.platform.customerreview.dao.impl;
/*    */ 

/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CurseWordDaoImpl implements CurseWordDao
/*    */ {
/*    */   public List<String> getCurseWords()
/*    */   {
				//assume all the curse words in table CurseWord
/* 36 */     String query = "SELECT word FROM CurseWord";
/* 37 */     FlexibleSearchQuery fsQuery = new FlexibleSearchQuery(query);
/* 39 */     fsQuery.setResultClassList(Collections.singletonList(String.class));
/*    */     
/* 41 */     SearchResult<String> searchResult = getFlexibleSearchService().search(fsQuery);
/* 42 */     return searchResult.getResult();
/*    */   }
/*    */   
/*    */ }

package pl.sda.webappaucitonsite.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TransactionEvaluation {
   Purchase purchase;
   int sellerEvaluation;

   String sellerComment;
   int buyerEvaluation;
   String buyerComment;


}

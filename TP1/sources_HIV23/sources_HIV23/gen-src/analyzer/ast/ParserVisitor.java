/* Generated By:JavaCC: Do not edit this line. ParserVisitor.java Version 7.0.2 */
package analyzer.ast;

public interface ParserVisitor
{
  public Object visit(SimpleNode node, Object data);
  public Object visit(ASTProgram node, Object data);
  public Object visit(ASTWhileStmt node, Object data);
  public Object visit(ASTWhileCond node, Object data);
  public Object visit(ASTWhileBlock node, Object data);
  public Object visit(ASTAssignStmt node, Object data);
  public Object visit(ASTIdentifier node, Object data);
  public Object visit(ASTIntValue node, Object data);
  public Object visit(ASTRealValue node, Object data);
}
/* JavaCC - OriginalChecksum=9767457fd60a18b7bd873f57dce13b0a (do not edit this line) */

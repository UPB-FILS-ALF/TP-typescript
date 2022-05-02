import { ASTNode } from "./index";
import symbol_tree from './index';
import { Expression, ValueNode, AttributionNode, FunctionCallNode } from './index';

var variable_id = 0;

let results: string[] = [];
function nextVar ()
{
    return 'var' + variable_id++;
}
 
 
function writeThreeAddressCode (node: any)
{
    if (node.id === 'StatementsNode')
    {
        for (var statement of node.statements)
        {
            writeThreeAddressCode(statement);
        }
    } else if (node instanceof ValueNode) {
        node.result = node.value.toString();
    } else if (node instanceof Expression) {
        if (node.left !== undefined && node.right !== undefined)
        {
            writeThreeAddressCode (node.left);
            writeThreeAddressCode (node.right);
            
            // TODO
        }
    } else if (node instanceof AttributionNode) {
        // TODO
    } else if (node instanceof FunctionCallNode) {
        // TODO
    }
}

writeThreeAddressCode(symbol_tree.ast); 

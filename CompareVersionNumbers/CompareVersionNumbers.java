/*  Author: noamme
 *  Date: March 1, 2015
 *  Source: https://oj.leetcode.com/problems/compare-version-numbers/
 *
 *
 * Compare two version numbers version1 and version2.
 * If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.
 *
 * You may assume that the version strings are non-empty and contain only digits and the . character.
 * The . character does not represent a decimal point and is used to separate number sequences.
 * For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.
 *
 * Here is an example of version numbers ordering:
 *     0.1 < 1.1 < 1.2 < 13.37
 *
 */


public class CompareVersionNumbers {

    public static void main(String[] args){

        System.out.println(compareVersion("1.2.3", "2.9")); //sample input
    }

    /*  
     * Takes two version numbers and compares them by first comparing length of the string, and then comparing each individual digit.
     */

    public static int compareVersion(String version1, String version2) {

        String[] v1 = version1.split("\\.");
    	String[] v2 = version2.split("\\.");
    	int num = 0;


    	if (v1.length == v2.length){
    		for (int i = 0; i < v1.length; i++){
    			if (Integer.parseInt(v1[i]) < Integer.parseInt(v2[i])){
    				num = -1;
    				break;
    			}
    			else if (Integer.parseInt(v1[i]) > Integer.parseInt(v2[i])){
    				num = 1;
    				break;
    			}
    			else{
    				continue;
    			}   		
    		}
    	}

    	else if (v1.length > v2.length){
    		for (int i = 0; i < v2.length; i++){
    			if (Integer.parseInt(v1[i]) < Integer.parseInt(v2[i])){
    				num = -1;
    				break;
    			}
    			else if (Integer.parseInt(v1[i]) > Integer.parseInt(v2[i])){
    				num = 1;
    				break;
    			}
    			else{
    				if (Integer.parseInt(v1[v1.length - 1]) == 0){ //checks to see if last digit is 0. Important for cases like ("1", "1.0").
    					num = 0;
    					continue;
    				}
    				else{
    					num = 1;
    					continue;
    				}
    				
    				
    			} 
    		}  

    	}
    	else if (v1.length < v2.length){
    		for (int i = 0; i < v1.length; i++){
    			if (Integer.parseInt(v1[i]) < Integer.parseInt(v2[i])){
    				num = -1;
    				break;
    			}
    			else if (Integer.parseInt(v1[i]) > Integer.parseInt(v2[i])){
    				num = 1;
    				break;
    			}
    			else{
    				if (Integer.parseInt(v2[v2.length - 1]) == 0){
    					num = 0;
    					continue;
    				}
    				else{
    					num = -1;
    					continue;
    				}
    				
    			} 
    		}  

    	}

    	return num;       
    }
}
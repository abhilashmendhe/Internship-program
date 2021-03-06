/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiddenmarkovmodel;

import java.util.ArrayList;

/**
 *
 * @author abhilash
 */
public class BackwardProbabilty {
    
    public ArrayList getBP(ArrayList data, double mean, double sd)
    {
        ArrayList fclust = new ArrayList();
        
        double val1 = mean - sd;
        double val2 = mean + sd;
        for(int i=0; i<data.size(); i++)
        {
            ArrayList t = (ArrayList) data.get(i);
            //System.out.println(t);
            double dval = (double) t.get(t.size()-1);
            if(dval < val1 || dval > val2)
            {
                //System.out.println(t);
                fclust.add(t);
            }
        }
        
        return fclust;
    }
    
}

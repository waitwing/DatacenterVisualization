/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kmitl.b_mw.queryadapter.vCenter.dataConverter.nodeConverter;

import com.kmitl.b_mw.common.nodeModel.BasicNode;
import java.util.List;

/**
 *
 * @author B_MW (Wai & May)
 */
public interface Convertable {

    List<BasicNode> toBasicNodes();

}

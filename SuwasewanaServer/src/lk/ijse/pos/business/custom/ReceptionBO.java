/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.business.custom;

import java.util.List;
import lk.ijse.pos.business.SuperBO;
import lk.ijse.pos.dto.ReceptionDTO;

/**
 *
 * @author DEll
 */
public interface ReceptionBO extends SuperBO{
        public boolean addReception(ReceptionDTO receptionDTO)throws Exception;
        public boolean updateReception(ReceptionDTO receptionDTO)throws Exception;
        public boolean deleteReception(String id)throws Exception;
        public List<ReceptionDTO> getAllReceptions()throws Exception;
        public ReceptionDTO searchByName(String Reception)throws Exception;
        public ReceptionDTO receptionLogin(String usernamde,String password)throws Exception;
        
    
}

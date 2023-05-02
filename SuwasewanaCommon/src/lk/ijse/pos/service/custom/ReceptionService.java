/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.pos.service.custom;

import java.util.List;
import lk.ijse.pos.dto.ReceptionDTO;
import lk.ijse.pos.service.SuperService;

/**
 *
 * @author DEll
 */
public interface ReceptionService extends SuperService{
    public boolean addReception(ReceptionDTO receptionDTO)throws Exception;
    public boolean updateReception(ReceptionDTO receptionDTO)throws Exception;
    public boolean deleteReception(String receptionID)throws Exception;
    public List<ReceptionDTO> getAllReceptions()throws Exception;
    public ReceptionDTO searchByNaem(String name)throws Exception;
    public ReceptionDTO receptionLogin(String username,String password)throws Exception;
    
}

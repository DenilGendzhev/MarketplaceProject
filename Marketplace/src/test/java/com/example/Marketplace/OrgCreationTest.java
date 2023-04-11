package com.example.Marketplace;

import com.example.Marketplace.entities.OrgManager;
import com.example.Marketplace.enums.Role;
import com.example.Marketplace.repositories.OrgManagerRepository;
import org.junit.jupiter.api.Test;

public class OrgCreationTest {
    @Test
    public void testCreateUser() {
        OrgManager org= new OrgManager();
        org.setTitle("testTitle");
        org.setEmail("testOrgEmail@gmail.com");
        org.setPassword("123456");
        org.setRole(Role.ORG_MANAGER);

        //OrgManager savedOrg = OrgManagerRepository.save(org);
    }
}

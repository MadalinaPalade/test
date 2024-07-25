
terraform {
       backend "test" {
         organization = "MadalinaPaladeOrganization"
         workspaces {
           name = "MadalinaPaladeWorkspace"
         }
       }
     }

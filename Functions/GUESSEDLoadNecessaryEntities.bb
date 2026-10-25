Function GUESSEDLoadNecessaryEntities%()
    Local local0.T402X2Z846
    Local local1.X44ZF6442X
    Local local2.TB86B8F2BX
    Local local3.X0442B862F
    For local0 = Each T402X2Z846
        If (len(local0\Field1) > $00) Then
            GUESSEDloaddocument(local0\Field1, $01)
        EndIf
    Next
    GUESSEDloadfont("Tahoma", ("GFX\Fonts\" + getfilelocalstring("Data\fonts.ini", "Tahoma", "File", "", $01)), 64.0, 1.0)
    GUESSEDloadfont("Icons", ("GFX\Fonts\" + getfilelocalstring("Data\fonts.ini", "Icons", "File", "", $01)), 64.0, 1.0)
    GUESSEDhideentity_2($01, "GFX\NPCs\class_d.b3d")
    GUESSEDcheckvalue_41($01, "GFX\NPCs\class_d.png", $01)
    GUESSEDcheckvalue_41($02, "GFX\NPCs\class_d(2).png", $01)
    GUESSEDcheckvalue_41($03, "GFX\NPCs\class_d(3).png", $01)
    GUESSEDcheckvalue_41($04, "GFX\NPCs\D_9341.png", $01)
    GUESSEDcheckvalue_41($05, "GFX\NPCs\class_d(4).png", $01)
    GUESSEDcheckvalue_41($06, "GFX\NPCs\class_d(5).png", $01)
    GUESSEDcheckvalue_41($08, "GFX\NPCs\Maynard.png", $00)
    GUESSEDcheckvalue_41($0A, "GFX\NPCs\scientist(1).png", $00)
    GUESSEDcheckvalue_41($0B, "GFX\NPCs\scientist(2).png", $00)
    GUESSEDcheckvalue_41($0C, "GFX\NPCs\scientist(3).png", $00)
    GUESSEDcheckvalue_41($0D, "GFX\NPCs\scientist(4).png", $00)
    GUESSEDcheckvalue_41($0E, "GFX\NPCs\scientist(5).png", $00)
    GUESSEDcheckvalue_41($0F, "GFX\NPCs\scientist.png", $00)
    GUESSEDcheckvalue_41($10, "GFX\NPCs\Franklin.png", $00)
    GUESSEDcheckvalue_41($11, "GFX\NPCs\janitor.png", $00)
    GUESSEDcheckvalue_41($15, "GFX\NPCs\class_d_zombie.png", $00)
    GUESSEDcheckvalue_41($16, "GFX\NPCs\scientist_zombie.png", $00)
    GUESSEDcheckvalue_41($17, "GFX\NPCs\janitor_zombie.png", $00)
    GUESSEDcheckvalue_41($18, "GFX\Items\hazmat_suit_bloody.png", $00)
    local1 = GUESSEDcheckvalue_12($01)
    local1\Field20 = $28
    local1\Field56 = -0.3
    local1\Field47 = 180.0
    local1\Field21 = "Bip01_Spine1"
    local1\Field30 = "Bip01_Head"
    local1\Field53 = "Bip01_L_Forearm"
    local1\Field31 = "Bip01_L_Finger0"
    local1\Field34 = $01
    local1\Field19 = $46
    local1\Field37 = $1E
    local1\Field35 = $3C
    local1\Field24 = (0.51 / meshwidth(GUESSEDgetarray($01)))
    local1\Field13 = 0.3
    local1\Field17 = 0.0
    local1\Field60 = 70.0
    local1\Field25 = 10.0
    local1\Field43 = 0.32
    local1\Field16 = 0.6
    local1\Field12 = -0.03
    local1\Field1 = 0.015
    local1\Field45 = 0.0
    local1\Field57 = -60.0
    local1\Field32 = -45.0
    local1\Field50 = 0.0
    local1\Field58[$01] = PackTwoValues($D2, $EB)
    local1\Field52[$01] = 0.1
    local1\Field58[$02] = PackTwoValues($EC, $104)
    local1\Field52[$02] = 0.33
    local1\Field18[$02] = 45.0
    local1\Field58[$03] = PackTwoValues($464, $476)
    local1\Field52[$03] = 0.38
    local1\Field18[$03] = 30.0
    local1\Field58[$04] = PackTwoValues($165, $17D)
    local1\Field52[$04] = 0.1
    local1\Field58[$05] = PackTwoValues($17E, $196)
    local1\Field52[$05] = 0.3
    local1\Field18[$05] = 45.0
    local1\Field58[$06] = PackTwoValues($C1, $C5)
    local1\Field52[$06] = 0.025
    local1\Field58[$07] = PackTwoValues($C7, $D1)
    local1\Field52[$07] = 0.33
    local1\Field18[$07] = 35.0
    local1\Field58[$08] = PackTwoValues($322, $336)
    local1\Field52[$08] = 0.23
    local1\Field58[$09] = PackTwoValues($30D, $321)
    local1\Field52[$09] = 0.33
    local1\Field58[$0A] = PackTwoValues($337, $350)
    local1\Field52[$0A] = 0.33
    local1\Field6[$0A] = "Bip01_Head@Bip01_Neck@Bip01_Spine1@Bip01_Spine2@Bip01_L_Clavicle@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Hand@Bip01_R_Finger0@Bip01_RUpArmTwist@Bip01_R_Clavicle@Bip01_L_UpperArm@Bip01_L_Forearm@Bip01_L_Hand@Bip01_L_Finger0@Bip01_LUpArmTwist"
    local1\Field58[$0F] = PackTwoValues($337, $350)
    local1\Field52[$0F] = 0.33
    local1\Field6[$0F] = "Bip01_Head@Bip01_Neck@Bip01_Spine1@Bip01_Spine2@Bip01_L_Clavicle@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Hand@Bip01_R_Finger0@Bip01_RUpArmTwist@Bip01_R_Clavicle@Bip01_L_UpperArm@Bip01_L_Forearm@Bip01_L_Hand@Bip01_L_Finger0@Bip01_LUpArmTwist"
    local1\Field58[$19] = PackTwoValues($3A5, $3D5)
    local1\Field52[$19] = 0.33
    local1\Field6[$19] = "Bip01_Head@Bip01_Neck@Bip01_Spine1@Bip01_Spine2@Bip01_L_Clavicle@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Hand@Bip01_R_Finger0@Bip01_RUpArmTwist@Bip01_R_Clavicle@Bip01_L_UpperArm@Bip01_L_Forearm@Bip01_L_Hand@Bip01_L_Finger0@Bip01_LUpArmTwist"
    local1\Field58[$1A] = PackTwoValues($3A5, $3D5)
    local1\Field52[$1A] = 0.33
    local1\Field6[$1A] = "Bip01_Head@Bip01_Neck@Bip01_Spine1@Bip01_Spine2@Bip01_L_Clavicle@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Hand@Bip01_R_Finger0@Bip01_RUpArmTwist@Bip01_R_Clavicle@Bip01_L_UpperArm@Bip01_L_Forearm@Bip01_L_Hand@Bip01_L_Finger0@Bip01_LUpArmTwist"
    local1\Field58[$1B] = PackTwoValues($140, $164)
    local1\Field52[$1B] = 0.8
    local1\Field6[$1B] = "Bip01_Head@Bip01_Neck@Bip01_Spine1@Bip01_Spine2@Bip01_L_Clavicle@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Hand@Bip01_R_Finger0@Bip01_RUpArmTwist@Bip01_R_Clavicle@Bip01_L_UpperArm@Bip01_L_Forearm@Bip01_L_Hand@Bip01_L_Finger0@Bip01_LUpArmTwist"
    local1\Field58[$1C] = PackTwoValues($14B, $14E)
    local1\Field52[$1C] = 0.4
    local1\Field6[$1C] = "Bip01_Spine1@Bip01_Spine2@Bip01_L_Clavicle@Bip01_Neck@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Hand@Bip01_R_Finger0@Bip01_RUpArmTwist@Bip01_R_Clavicle"
    local1\Field58[$1D] = PackTwoValues($758, $758)
    local1\Field52[$1D] = 0.8
    local1\Field6[$1D] = "Bip01_Head@Bip01_Neck@Bip01_Spine1@Bip01_Spine2@Bip01_L_Clavicle@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Hand@Bip01_R_Finger0@Bip01_RUpArmTwist@Bip01_R_Clavicle@Bip01_L_UpperArm@Bip01_L_Forearm@Bip01_L_Hand@Bip01_L_Finger0@Bip01_LUpArmTwist"
    local1\Field58[$14] = PackTwoValues($43A, $461)
    local1\Field52[$14] = 1.0
    local1\Field58[$14] = PackTwoValues($43A, $461)
    local1\Field52[$14] = 1.0
    local1\Field5[$08] = $01
    local1\Field5[$09] = $01
    local1\Field22[$00] = PackTwoValues($01, $14)
    local1\Field26[$00] = 0.4
    local1\Field22[$01] = PackTwoValues($29, $3C)
    local1\Field26[$01] = 0.4
    local1\Field22[$02] = PackTwoValues($2A6, $2C7)
    local1\Field26[$02] = 0.4
    local1\Field22[$03] = PackTwoValues($2C8, $30B)
    local1\Field26[$03] = 0.4
    local1\Field22[$04] = PackTwoValues($4C1, $55A)
    local1\Field26[$04] = 0.6
    local1\Field61 = 10.0
    local1\Field14 = 35.0
    local1\Field36 = 6.5
    GUESSEDhideentity_2($02, "GFX\Items\Wearable\Hazmat_wearmodel.b3d")
    GUESSEDcheckvalue_41($07, "GFX\Items\hazmat_suit.png", $00)
    GUESSEDcheckvalue_22($07, "GFX\Items\hazmat_suit_bloody.png")
    GUESSEDcheckvalue_41($09, "GFX\Items\hazmat_suit_heavy.png", $00)
    GUESSEDcheckvalue_22($09, "GFX\Items\hazmat_suit_heavy_bloody.png")
    local1 = GUESSEDcheckvalue_12($02)
    local1\Field56 = -0.3
    local1\Field47 = 180.0
    local1\Field21 = "Bip01_Spine1"
    local1\Field30 = "Bip01_Head"
    local1\Field53 = "Bip01_L_Forearm"
    local1\Field31 = "Bip01_L_Finger0"
    local1\Field34 = $01
    local1\Field19 = $4B
    local1\Field37 = $1E
    local1\Field35 = $3C
    local1\Field24 = 0.013
    local1\Field13 = 0.3
    local1\Field17 = 0.0
    local1\Field60 = 70.0
    local1\Field25 = 10.0
    local1\Field43 = 0.32
    local1\Field16 = 0.8
    local1\Field12 = -0.03
    local1\Field1 = 0.015
    local1\Field45 = 0.0
    local1\Field57 = -60.0
    local1\Field32 = -45.0
    local1\Field50 = 0.0
    local1\Field58[$01] = PackTwoValues($D2, $EB)
    local1\Field52[$01] = 0.1
    local1\Field58[$02] = PackTwoValues($EC, $104)
    local1\Field52[$02] = 0.33
    local1\Field18[$02] = 40.0
    local1\Field58[$03] = PackTwoValues($12D, $13F)
    local1\Field52[$03] = 0.38
    local1\Field18[$03] = 30.0
    local1\Field58[$04] = PackTwoValues($165, $17D)
    local1\Field52[$04] = 0.1
    local1\Field58[$05] = PackTwoValues($17E, $196)
    local1\Field52[$05] = 0.3
    local1\Field18[$05] = 40.0
    local1\Field58[$06] = PackTwoValues($C1, $C5)
    local1\Field52[$06] = 0.025
    local1\Field58[$07] = PackTwoValues($C7, $D1)
    local1\Field52[$07] = 0.33
    local1\Field18[$07] = 35.0
    local1\Field58[$08] = PackTwoValues($165, $17D)
    local1\Field52[$08] = 0.25
    local1\Field58[$09] = PackTwoValues($17E, $196)
    local1\Field52[$09] = 0.25
    local1\Field58[$0A] = PackTwoValues($23D, $256)
    local1\Field52[$0A] = 0.33
    local1\Field6[$0A] = "Bip01_Head@Bip01_HeadNub@Bip01_Neck@Bip01_Spine1@Bip01_Spine2@Bip01_L_Clavicle@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Hand@Bip01_R_Finger0@Bip01_RUpArmTwist@Bip01_R_Clavicle@Bip01_L_UpperArm@Bip01_L_Forearm@Bip01_L_Hand@Bip01_L_Finger0@Bip01_LUpArmTwist"
    local1\Field58[$0F] = PackTwoValues($23D, $256)
    local1\Field52[$0F] = 0.33
    local1\Field6[$0F] = "Bip01_Head@Bip01_HeadNub@Bip01_Neck@Bip01_Spine1@Bip01_Spine2@Bip01_L_Clavicle@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Hand@Bip01_R_Finger0@Bip01_RUpArmTwist@Bip01_R_Clavicle@Bip01_L_UpperArm@Bip01_L_Forearm@Bip01_L_Hand@Bip01_L_Finger0@Bip01_LUpArmTwist"
    local1\Field58[$19] = PackTwoValues($2AC, $2DC)
    local1\Field52[$19] = 0.33
    local1\Field6[$19] = "Bip01_Head@Bip01_HeadNub@Bip01_Neck@Bip01_Spine1@Bip01_Spine2@Bip01_L_Clavicle@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Hand@Bip01_R_Finger0@Bip01_RUpArmTwist@Bip01_R_Clavicle@Bip01_L_UpperArm@Bip01_L_Forearm@Bip01_L_Hand@Bip01_L_Finger0@Bip01_LUpArmTwist"
    local1\Field58[$1A] = PackTwoValues($2AC, $2DC)
    local1\Field52[$1A] = 0.33
    local1\Field6[$1A] = "Bip01_Head@Bip01_HeadNub@Bip01_Neck@Bip01_Spine1@Bip01_Spine2@Bip01_L_Clavicle@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Hand@Bip01_R_Finger0@Bip01_RUpArmTwist@Bip01_R_Clavicle@Bip01_L_UpperArm@Bip01_L_Forearm@Bip01_L_Hand@Bip01_L_Finger0@Bip01_LUpArmTwist"
    local1\Field58[$1B] = PackTwoValues($140, $164)
    local1\Field52[$1B] = 0.8
    local1\Field6[$1B] = "Bip01_Head@Bip01_HeadNub@Bip01_Neck@Bip01_Spine1@Bip01_Spine2@Bip01_L_Clavicle@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Hand@Bip01_R_Finger0@Bip01_RUpArmTwist@Bip01_R_Clavicle@Bip01_L_UpperArm@Bip01_L_Forearm@Bip01_L_Hand@Bip01_L_Finger0@Bip01_LUpArmTwist"
    local1\Field58[$1C] = PackTwoValues($14B, $14E)
    local1\Field52[$1C] = 0.4
    local1\Field6[$1C] = "Bip01_Spine1@Bip01_Spine2@Bip01_L_Clavicle@Bip01_Neck@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Hand@Bip01_R_Finger0@Bip01_RUpArmTwist@Bip01_R_Clavicle"
    local1\Field58[$1D] = PackTwoValues($37F, $37F)
    local1\Field52[$1D] = 0.4
    local1\Field6[$1D] = "Bip01_Spine1@Bip01_Spine2@Bip01_L_Clavicle@Bip01_Neck@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Hand@Bip01_R_Finger0@Bip01_RUpArmTwist@Bip01_R_Clavicle"
    local1\Field22[$00] = PackTwoValues($01, $14)
    local1\Field26[$00] = 0.4
    local1\Field22[$01] = PackTwoValues($29, $3C)
    local1\Field26[$01] = 0.4
    local1\Field61 = 10.0
    local1\Field14 = 35.0
    local1\Field36 = 6.5
    GUESSEDloadsound_2($02, $00, "SFX\Character\D9341\BreathGasRelaxed.ogg", $00)
    GUESSEDhideentity_2($09, "GFX\NPCs\guard_m.b3d")
    GUESSEDcheckvalue_41($14, "", $00)
    local1 = GUESSEDcheckvalue_12($09)
    local1\Field56 = -0.3
    local1\Field47 = 180.0
    local1\Field21 = "Chest"
    local1\Field30 = "Head"
    local1\Field31 = "Hand.R"
    local1\Field34 = $01
    local1\Field19 = $4B
    local1\Field37 = $1E
    local1\Field35 = $3C
    local1\Field24 = 0.108
    local1\Field13 = 0.26
    local1\Field43 = 0.26
    local1\Field16 = 0.5
    local1\Field58[$01] = PackTwoValues($271, $2ED)
    local1\Field52[$01] = 0.2
    local1\Field58[$02] = PackTwoValues($2EE, $313)
    local1\Field52[$02] = 0.6
    local1\Field18[$02] = 45.0
    local1\Field58[$03] = PackTwoValues($2EE, $313)
    local1\Field52[$03] = 1.0
    local1\Field18[$03] = 30.0
    local1\Field58[$04] = PackTwoValues($360, $361)
    local1\Field52[$04] = 0.1
    local1\Field58[$05] = PackTwoValues($314, $339)
    local1\Field52[$05] = 0.5
    local1\Field18[$05] = 45.0
    local1\Field58[$06] = PackTwoValues($2EE, $313)
    local1\Field52[$06] = 0.6
    local1\Field58[$07] = PackTwoValues($2EE, $313)
    local1\Field52[$07] = 0.6
    local1\Field18[$07] = 35.0
    local1\Field58[$0A] = PackTwoValues($CA, $F4)
    local1\Field52[$0A] = 0.08
    local1\Field6[$0A] = "Upper Arm.L@Upper Arm.L.002@Lower Arm.L@Thumb01.L@Thumb02.L@Fingers01.L@Fingers02.L@Upper Arm.R@Upper Arm.R.002@Lower Arm.R@Hand.R@Thumb01.R@Paper@@Thumb02.R@Fingers01.R@Fingers02.R@Thumb01.R.001"
    local1\Field58[$0F] = PackTwoValues($CA, $F4)
    local1\Field52[$0F] = 0.08
    local1\Field6[$0F] = "Upper Arm.L@Upper Arm.L.002@Lower Arm.L@Thumb01.L@Thumb02.L@Fingers01.L@Fingers02.L@Upper Arm.R@Upper Arm.R.002@Lower Arm.R@Hand.R@Thumb01.R@Paper@@Thumb02.R@Fingers01.R@Fingers02.R@Thumb01.R.001"
    local1\Field58[$19] = PackTwoValues($364, $391)
    local1\Field52[$19] = 0.5
    local1\Field6[$19] = "Upper Arm.L@Upper Arm.L.002@Lower Arm.L@Thumb01.L@Thumb02.L@Fingers01.L@Fingers02.L@Upper Arm.R@Upper Arm.R.002@Lower Arm.R@Hand.R@Thumb01.R@Paper@@Thumb02.R@Fingers01.R@Fingers02.R@Thumb01.R.001"
    local1\Field58[$1A] = PackTwoValues($364, $391)
    local1\Field52[$1A] = 0.5
    local1\Field6[$1A] = "Upper Arm.L@Upper Arm.L.002@Lower Arm.L@Thumb01.L@Thumb02.L@Fingers01.L@Fingers02.L@Upper Arm.R@Upper Arm.R.002@Lower Arm.R@Hand.R@Thumb01.R@Paper@@Thumb02.R@Fingers01.R@Fingers02.R@Thumb01.R.001"
    local1\Field58[$1B] = PackTwoValues($392, $3AA)
    local1\Field52[$1B] = 0.7
    local1\Field6[$1B] = "Upper Arm.L@Upper Arm.L.002@Lower Arm.L@Thumb01.L@Thumb02.L@Fingers01.L@Fingers02.L@Upper Arm.R@Upper Arm.R.002@Lower Arm.R@Hand.R@Thumb01.R@Paper@@Thumb02.R@Fingers01.R@Fingers02.R@Thumb01.R.001"
    local1\Field58[$1C] = PackTwoValues($3AC, $3B8)
    local1\Field52[$1C] = 0.6
    local1\Field6[$1C] = "Upper Arm.R@Upper Arm.R.002@Lower Arm.R@Hand.R@Thumb01.R@Paper@@Thumb02.R@Fingers01.R@Fingers02.R@Thumb01.R.001"
    local1\Field58[$1D] = PackTwoValues($3AB, $3AB)
    local1\Field52[$1D] = 0.8
    local1\Field6[$1D] = "Upper Arm.L@Upper Arm.L.002@Lower Arm.L@Thumb01.L@Thumb02.L@Fingers01.L@Fingers02.L@Upper Arm.R@Upper Arm.R.002@Lower Arm.R@Hand.R@Thumb01.R@Paper@@Thumb02.R@Fingers01.R@Fingers02.R@Thumb01.R.001"
    local1\Field22[$00] = PackTwoValues($FA, $11E)
    local1\Field26[$00] = 0.45
    local1\Field61 = 1.2
    local1\Field14 = 4.5
    local1\Field36 = 1.2
    GUESSEDhideentity_2($0A, "GFX\NPCs\MTF_m.b3d")
    GUESSEDcheckvalue_41($13, "", $00)
    GUESSEDcheckvalue_41($19, "GFX\NPCs\MTF(2).png", $00)
    GUESSEDcheckvalue_41($1A, "GFX\NPCs\MTF(3).png", $00)
    GUESSEDcheckvalue_41($1B, "GFX\NPCs\MTF(4).png", $00)
    local1 = GUESSEDcheckvalue_12($0A)
    local1\Field20 = $28
    local1\Field56 = -0.3
    local1\Field47 = 90.0
    local1\Field21 = "spine"
    local1\Field30 = "head"
    local1\Field31 = "hand_r"
    local1\Field34 = $01
    local1\Field23 = $01
    local1\Field29 = $01
    local1\Field19 = $4B
    local1\Field37 = $1E
    local1\Field35 = $3C
    local1\Field24 = (1.0 / 9.0)
    local1\Field13 = 0.26
    local1\Field43 = 0.26
    local1\Field16 = 0.5
    local1\Field58[$01] = PackTwoValues($81F, $8B0)
    local1\Field52[$01] = 0.6
    local1\Field58[$02] = PackTwoValues($8B4, $8E3)
    local1\Field52[$02] = 0.6
    local1\Field18[$02] = 45.0
    local1\Field58[$03] = PackTwoValues($8B3, $8E4)
    local1\Field52[$03] = 1.0
    local1\Field18[$03] = 30.0
    local1\Field58[$04] = PackTwoValues($8E7, $8E8)
    local1\Field52[$04] = 0.1
    local1\Field58[$05] = PackTwoValues($922, $957)
    local1\Field52[$05] = 0.6
    local1\Field18[$05] = 45.0
    local1\Field58[$06] = PackTwoValues($975, $97F)
    local1\Field52[$06] = 0.1
    local1\Field58[$07] = PackTwoValues($956, $973)
    local1\Field52[$07] = 0.8
    local1\Field18[$07] = 35.0
    local1\Field58[$0A] = PackTwoValues($74, $120)
    local1\Field52[$0A] = 0.5
    local1\Field6[$0A] = "spine@chest@shoulder_L@upper_arm_L@forearm_L@hand_L@palm_04_L@f_pinky_01_L@f_pinky_02_L@f_pinky_03_L@palm_03_L@f_ring_01_L@f_ring_02_L@f_ring_03_L@palm_02_L@f_middle_01_L@f_middle_02_L@f_middle_03_L@palm_01_L@f_index_01_L@f_index_02_L@f_index_03_L@thumb_01_L@thumb_02_L@thumb_03_L@shoulder_R@upper_arm_R@forearm_R@hand_R@thumb_03_R@thumb_02_R@thumb_01_R@palm_01_R@f_index_01_R@f_index_02_R@f_index_03_R@palm_02_R@f_middle_01_R@f_middle_02_R@f_middle_03_R@palm_03_R@f_ring_01_R@f_ring_02_R@f_ring_03_R@palm_04_R@f_pinky_01_R@f_pinky_02_R@f_pinky_03_R"
    local1\Field58[$0F] = PackTwoValues($74, $120)
    local1\Field52[$0F] = 0.5
    local1\Field6[$0F] = "spine@chest@shoulder_L@upper_arm_L@forearm_L@hand_L@palm_04_L@f_pinky_01_L@f_pinky_02_L@f_pinky_03_L@palm_03_L@f_ring_01_L@f_ring_02_L@f_ring_03_L@palm_02_L@f_middle_01_L@f_middle_02_L@f_middle_03_L@palm_01_L@f_index_01_L@f_index_02_L@f_index_03_L@thumb_01_L@thumb_02_L@thumb_03_L@shoulder_R@upper_arm_R@forearm_R@hand_R@thumb_03_R@thumb_02_R@thumb_01_R@palm_01_R@f_index_01_R@f_index_02_R@f_index_03_R@palm_02_R@f_middle_01_R@f_middle_02_R@f_middle_03_R@palm_03_R@f_ring_01_R@f_ring_02_R@f_ring_03_R@palm_04_R@f_pinky_01_R@f_pinky_02_R@f_pinky_03_R"
    local1\Field58[$19] = PackTwoValues($981, $9D5)
    local1\Field52[$19] = 0.6
    local1\Field6[$19] = "spine@chest@shoulder_L@upper_arm_L@forearm_L@hand_L@palm_04_L@f_pinky_01_L@f_pinky_02_L@f_pinky_03_L@palm_03_L@f_ring_01_L@f_ring_02_L@f_ring_03_L@palm_02_L@f_middle_01_L@f_middle_02_L@f_middle_03_L@palm_01_L@f_index_01_L@f_index_02_L@f_index_03_L@thumb_01_L@thumb_02_L@thumb_03_L@shoulder_R@upper_arm_R@forearm_R@hand_R@thumb_03_R@thumb_02_R@thumb_01_R@palm_01_R@f_index_01_R@f_index_02_R@f_index_03_R@palm_02_R@f_middle_01_R@f_middle_02_R@f_middle_03_R@palm_03_R@f_ring_01_R@f_ring_02_R@f_ring_03_R@palm_04_R@f_pinky_01_R@f_pinky_02_R@f_pinky_03_R"
    local1\Field58[$1A] = PackTwoValues($981, $9D5)
    local1\Field52[$1A] = 0.6
    local1\Field6[$1A] = "spine@chest@shoulder_L@upper_arm_L@forearm_L@hand_L@palm_04_L@f_pinky_01_L@f_pinky_02_L@f_pinky_03_L@palm_03_L@f_ring_01_L@f_ring_02_L@f_ring_03_L@palm_02_L@f_middle_01_L@f_middle_02_L@f_middle_03_L@palm_01_L@f_index_01_L@f_index_02_L@f_index_03_L@thumb_01_L@thumb_02_L@thumb_03_L@shoulder_R@upper_arm_R@forearm_R@hand_R@thumb_03_R@thumb_02_R@thumb_01_R@palm_01_R@f_index_01_R@f_index_02_R@f_index_03_R@palm_02_R@f_middle_01_R@f_middle_02_R@f_middle_03_R@palm_03_R@f_ring_01_R@f_ring_02_R@f_ring_03_R@palm_04_R@f_pinky_01_R@f_pinky_02_R@f_pinky_03_R"
    local1\Field58[$1D] = PackTwoValues($9D8, $9D8)
    local1\Field52[$1D] = 0.8
    local1\Field6[$1D] = "spine@chest@shoulder_L@upper_arm_L@forearm_L@hand_L@palm_04_L@f_pinky_01_L@f_pinky_02_L@f_pinky_03_L@palm_03_L@f_ring_01_L@f_ring_02_L@f_ring_03_L@palm_02_L@f_middle_01_L@f_middle_02_L@f_middle_03_L@palm_01_L@f_index_01_L@f_index_02_L@f_index_03_L@thumb_01_L@thumb_02_L@thumb_03_L@shoulder_R@upper_arm_R@forearm_R@hand_R@thumb_03_R@thumb_02_R@thumb_01_R@palm_01_R@f_index_01_R@f_index_02_R@f_index_03_R@palm_02_R@f_middle_01_R@f_middle_02_R@f_middle_03_R@palm_03_R@f_ring_01_R@f_ring_02_R@f_ring_03_R@palm_04_R@f_pinky_01_R@f_pinky_02_R@f_pinky_03_R"
    local1\Field58[$1B] = PackTwoValues($42, $69)
    local1\Field52[$1B] = 0.8
    local1\Field6[$1B] = "spine@chest@shoulder_L@upper_arm_L@forearm_L@hand_L@palm_04_L@f_pinky_01_L@f_pinky_02_L@f_pinky_03_L@palm_03_L@f_ring_01_L@f_ring_02_L@f_ring_03_L@palm_02_L@f_middle_01_L@f_middle_02_L@f_middle_03_L@palm_01_L@f_index_01_L@f_index_02_L@f_index_03_L@thumb_01_L@thumb_02_L@thumb_03_L@shoulder_R@upper_arm_R@forearm_R@hand_R@thumb_03_R@thumb_02_R@thumb_01_R@palm_01_R@f_index_01_R@f_index_02_R@f_index_03_R@palm_02_R@f_middle_01_R@f_middle_02_R@f_middle_03_R@palm_03_R@f_ring_01_R@f_ring_02_R@f_ring_03_R@palm_04_R@f_pinky_01_R@f_pinky_02_R@f_pinky_03_R"
    local1\Field58[$1C] = PackTwoValues($9D9, $9E2)
    local1\Field52[$1C] = 0.6
    local1\Field6[$1C] = "spine@chest@shoulder_R@upper_arm_R@forearm_R@hand_R@thumb_03_R@thumb_02_R@thumb_01_R@palm_01_R@f_index_01_R@f_index_02_R@f_index_03_R@palm_02_R@f_middle_01_R@f_middle_02_R@f_middle_03_R@palm_03_R@f_ring_01_R@f_ring_02_R@f_ring_03_R@palm_04_R@f_pinky_01_R@f_pinky_02_R@f_pinky_03_R"
    local1\Field22[$00] = PackTwoValues($0A, $28)
    local1\Field26[$00] = 0.45
    local1\Field61 = 1.2
    local1\Field14 = 4.5
    local1\Field36 = 1.2
    GUESSEDhideentity_2($0B, "GFX\NPCs\Chaos_m.b3d")
    GUESSEDcheckvalue_41($12, "", $00)
    GUESSEDcheckvalue_41($1D, "", $00)
    GUESSEDcheckvalue_41($20, "GFX\NPCs\ci_mp_e.png", $00)
    local1 = GUESSEDcheckvalue_12($0B)
    local1\Field56 = -0.3
    local1\Field47 = 0.0
    local1\Field21 = "Spine2"
    local1\Field30 = "NeckHead"
    local1\Field31 = "RArmHand"
    local1\Field34 = $01
    local1\Field19 = $4B
    local1\Field37 = $1E
    local1\Field35 = $3C
    local1\Field24 = (0.515 / meshwidth(GUESSEDgetarray($0B)))
    local1\Field13 = 0.26
    local1\Field43 = 0.26
    local1\Field16 = 0.5
    local1\Field58[$01] = PackTwoValues($199, $1FB)
    local1\Field52[$01] = 0.8
    local1\Field58[$02] = PackTwoValues($17C, $198)
    local1\Field52[$02] = 0.4
    local1\Field18[$02] = 45.0
    local1\Field58[$03] = PackTwoValues($17C, $198)
    local1\Field52[$03] = 0.8
    local1\Field18[$03] = 30.0
    local1\Field58[$04] = PackTwoValues($1FC, $210)
    local1\Field52[$04] = 0.5
    local1\Field58[$05] = PackTwoValues($211, $225)
    local1\Field52[$05] = 0.25
    local1\Field18[$05] = 45.0
    local1\Field58[$06] = PackTwoValues($299, $2A2)
    local1\Field52[$06] = 0.1
    local1\Field58[$07] = PackTwoValues($27A, $298)
    local1\Field52[$07] = 0.6
    local1\Field18[$07] = 35.0
    local1\Field58[$0A] = PackTwoValues($03, $B0)
    local1\Field52[$0A] = 0.8
    local1\Field6[$0A] = "Spine1@Spine2@Spine3@LArmCollarbone@LArmUpper1@LArmUpper2@LArmForearm1@LArmForearm2@LArmHand@LArmThumb1@LArmThumb2@LArmThumb3@LArmIndex1@LArmIndex2@LArmIndex3@LArmMid1@LArmMid2@LArmMid3@LArmRing1@LArmRing2@LArmRing3@LArmPinky1@LArmPinky2@LArmPinky3@RArmCollarbone@RArmUpper1@RArmUpper2@RArmForearm1@RArmForearm2@RArmHand@RArmThumb1@RArmThumb2@RArmThumb3@M4MB@RArmPinky1@RArmPinky2@RArmPinky3@RArmRing1@RArmRing2@RArmRing3@RArmMid1@RArmMid2@RArmMid3@RArmIndex1@RArmIndex2@RArmIndex3@RArmThumb1@RArmThumb2@RArmThumb3"
    local1\Field58[$0F] = PackTwoValues($03, $B0)
    local1\Field52[$0F] = 0.8
    local1\Field6[$0F] = "Spine1@Spine2@Spine3@LArmCollarbone@LArmUpper1@LArmUpper2@LArmForearm1@LArmForearm2@LArmHand@LArmThumb1@LArmThumb2@LArmThumb3@LArmIndex1@LArmIndex2@LArmIndex3@LArmMid1@LArmMid2@LArmMid3@LArmRing1@LArmRing2@LArmRing3@LArmPinky1@LArmPinky2@LArmPinky3@RArmCollarbone@RArmUpper1@RArmUpper2@RArmForearm1@RArmForearm2@RArmHand@RArmThumb1@RArmThumb2@RArmThumb3@M4MB@RArmPinky1@RArmPinky2@RArmPinky3@RArmRing1@RArmRing2@RArmRing3@RArmMid1@RArmMid2@RArmMid3@RArmIndex1@RArmIndex2@RArmIndex3@RArmThumb1@RArmThumb2@RArmThumb3"
    local1\Field58[$19] = PackTwoValues($2A5, $2F9)
    local1\Field52[$19] = 0.5
    local1\Field6[$19] = "Spine1@Spine2@Spine3@LArmCollarbone@LArmUpper1@LArmUpper2@LArmForearm1@LArmForearm2@LArmHand@LArmThumb1@LArmThumb2@LArmThumb3@LArmIndex1@LArmIndex2@LArmIndex3@LArmMid1@LArmMid2@LArmMid3@LArmRing1@LArmRing2@LArmRing3@LArmPinky1@LArmPinky2@LArmPinky3@RArmCollarbone@RArmUpper1@RArmUpper2@RArmForearm1@RArmForearm2@RArmHand@RArmThumb1@RArmThumb2@RArmThumb3@M4MB@RArmPinky1@RArmPinky2@RArmPinky3@RArmRing1@RArmRing2@RArmRing3@RArmMid1@RArmMid2@RArmMid3@RArmIndex1@RArmIndex2@RArmIndex3@RArmThumb1@RArmThumb2@RArmThumb3"
    local1\Field58[$1A] = PackTwoValues($2A5, $2F9)
    local1\Field52[$1A] = 0.5
    local1\Field6[$1A] = "Spine1@Spine2@Spine3@LArmCollarbone@LArmUpper1@LArmUpper2@LArmForearm1@LArmForearm2@LArmHand@LArmThumb1@LArmThumb2@LArmThumb3@LArmIndex1@LArmIndex2@LArmIndex3@LArmMid1@LArmMid2@LArmMid3@LArmRing1@LArmRing2@LArmRing3@LArmPinky1@LArmPinky2@LArmPinky3@RArmCollarbone@RArmUpper1@RArmUpper2@RArmForearm1@RArmForearm2@RArmHand@RArmThumb1@RArmThumb2@RArmThumb3@M4MB@RArmPinky1@RArmPinky2@RArmPinky3@RArmRing1@RArmRing2@RArmRing3@RArmMid1@RArmMid2@RArmMid3@RArmIndex1@RArmIndex2@RArmIndex3@RArmThumb1@RArmThumb2@RArmThumb3"
    local1\Field58[$1D] = PackTwoValues($309, $309)
    local1\Field52[$1D] = 0.8
    local1\Field6[$1D] = "Spine1@Spine2@Spine3@LArmCollarbone@LArmUpper1@LArmUpper2@LArmForearm1@LArmForearm2@LArmHand@LArmThumb1@LArmThumb2@LArmThumb3@LArmIndex1@LArmIndex2@LArmIndex3@LArmMid1@LArmMid2@LArmMid3@LArmRing1@LArmRing2@LArmRing3@LArmPinky1@LArmPinky2@LArmPinky3@RArmCollarbone@RArmUpper1@RArmUpper2@RArmForearm1@RArmForearm2@RArmHand@RArmThumb1@RArmThumb2@RArmThumb3@M4MB@RArmPinky1@RArmPinky2@RArmPinky3@RArmRing1@RArmRing2@RArmRing3@RArmMid1@RArmMid2@RArmMid3@RArmIndex1@RArmIndex2@RArmIndex3@RArmThumb1@RArmThumb2@RArmThumb3"
    local1\Field58[$1B] = PackTwoValues($2FB, $307)
    local1\Field52[$1B] = 0.7
    local1\Field6[$1B] = "LArmCollarbone@LArmUpper1@LArmUpper2@LArmForearm1@LArmForearm2@LArmHand@LArmThumb1@LArmThumb2@LArmThumb3@LArmIndex1@LArmIndex2@LArmIndex3@LArmMid1@LArmMid2@LArmMid3@LArmRing1@LArmRing2@LArmRing3@LArmPinky1@LArmPinky2@LArmPinky3@RArmCollarbone@RArmUpper1@RArmUpper2@RArmForearm1@RArmForearm2@RArmHand@RArmThumb1@RArmThumb2@RArmThumb3@M4MB@RArmPinky1@RArmPinky2@RArmPinky3@RArmRing1@RArmRing2@RArmRing3@RArmMid1@RArmMid2@RArmMid3@RArmIndex1@RArmIndex2@RArmIndex3@RArmThumb1@RArmThumb2@RArmThumb3"
    local1\Field58[$1C] = PackTwoValues($30A, $310)
    local1\Field52[$1C] = 0.7
    local1\Field6[$1C] = "Spine1@Spine2@Spine3@LArmCollarbon@RArmCollarbone@RArmUpper1@RArmUpper2@RArmForearm1@RArmForearm2@RArmHand@RArmThumb1@RArmThumb2@RArmThumb3@M4MB@RArmPinky1@RArmPinky2@RArmPinky3@RArmRing1@RArmRing2@RArmRing3@RArmMid1@RArmMid2@RArmMid3@RArmIndex1@RArmIndex2@RArmIndex3@RArmThumb1@RArmThumb2@RArmThumb3"
    local1\Field22[$00] = PackTwoValues($24B, $279)
    local1\Field26[$00] = 0.5
    local1\Field61 = 1.3
    local1\Field14 = 5.0
    local1\Field36 = 1.2
    GUESSEDhideentity_2($10, "GFX\NPCs\GOC.b3d")
    GUESSEDcheckvalue_41($1E, "", $00)
    local1 = GUESSEDcheckvalue_12($10)
    local1\Field56 = -0.3
    local1\Field47 = 0.0
    local1\Field21 = "Bip01_Spine"
    local1\Field30 = "Bip01_Head1"
    local1\Field31 = "Anim_Attachment_RH"
    local1\Field34 = $01
    local1\Field19 = $4B
    local1\Field37 = $1E
    local1\Field35 = $3C
    local1\Field24 = 0.0132
    local1\Field13 = 0.26
    local1\Field43 = 0.26
    local1\Field16 = 0.3
    local1\Field23 = $02
    local1\Field7 = $01
    local1\Field58[$01] = PackTwoValues($01, $3C)
    local1\Field52[$01] = 0.12
    local1\Field58[$02] = PackTwoValues($3D, $59)
    local1\Field52[$02] = 0.45
    local1\Field18[$02] = 45.0
    local1\Field58[$03] = PackTwoValues($3D, $59)
    local1\Field52[$03] = 0.7
    local1\Field18[$03] = 30.0
    local1\Field58[$04] = PackTwoValues($5A, $96)
    local1\Field52[$04] = 0.5
    local1\Field58[$05] = PackTwoValues($97, $AF)
    local1\Field52[$05] = 0.28
    local1\Field18[$05] = 45.0
    local1\Field58[$06] = PackTwoValues($3D, $59)
    local1\Field52[$06] = 0.8
    local1\Field58[$07] = PackTwoValues($3D, $59)
    local1\Field52[$07] = 0.8
    local1\Field18[$07] = 35.0
    local1\Field58[$0A] = PackTwoValues($B0, $EC)
    local1\Field52[$0A] = 0.12
    local1\Field6[$0A] = "Bip01_Spine1@Bip01_Spine2@Bip01_Spine4@Bip01_L_Clavicle@Bip01_L_UpperArm@Bip01_L_Forearm@ValveBiped.Bip01_L_Ulna@Bip01_L_Hand@ValveBiped.Bip01_L_Finger0@ValveBiped.Bip01_L_Finger01@ValveBiped.Bip01_L_Finger02@ValveBiped.Anim_Attachment_LH@ValveBiped.Bip01_L_Finger1@ValveBiped.Bip01_L_Finger11@ValveBiped.Bip01_L_Finger12@ValveBiped.Bip01_L_Finger2@ValveBiped.Bip01_L_Finger21@ValveBiped.Bip01_L_Finger22@Bip01_R_Clavicle@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Ulna@Bip01_R_Hand@Bip01_R_Finger0@Bip01_R_Finger01@Bip01_R_Finger02@Anim_Attachment_RH@Bip01_R_Finger1@Bip01_R_Finger11@Bip01_R_Finger12@Bip01_R_Finger2@Bip01_R_Finger21@Bip01_R_Finger22"
    local1\Field58[$0F] = PackTwoValues($B0, $EC)
    local1\Field52[$0F] = 0.12
    local1\Field6[$0F] = "Bip01_Spine1@Bip01_Spine2@Bip01_Spine4@Bip01_L_Clavicle@Bip01_L_UpperArm@Bip01_L_Forearm@ValveBiped.Bip01_L_Ulna@Bip01_L_Hand@ValveBiped.Bip01_L_Finger0@ValveBiped.Bip01_L_Finger01@ValveBiped.Bip01_L_Finger02@ValveBiped.Anim_Attachment_LH@ValveBiped.Bip01_L_Finger1@ValveBiped.Bip01_L_Finger11@ValveBiped.Bip01_L_Finger12@ValveBiped.Bip01_L_Finger2@ValveBiped.Bip01_L_Finger21@ValveBiped.Bip01_L_Finger22@Bip01_R_Clavicle@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Ulna@Bip01_R_Hand@Bip01_R_Finger0@Bip01_R_Finger01@Bip01_R_Finger02@Anim_Attachment_RH@Bip01_R_Finger1@Bip01_R_Finger11@Bip01_R_Finger12@Bip01_R_Finger2@Bip01_R_Finger21@Bip01_R_Finger22"
    local1\Field58[$19] = PackTwoValues($1E1, $202)
    local1\Field52[$19] = 0.5
    local1\Field6[$19] = "Bip01_Spine1@Bip01_Spine2@Bip01_Spine4@Bip01_L_Clavicle@Bip01_L_UpperArm@Bip01_L_Forearm@ValveBiped.Bip01_L_Ulna@Bip01_L_Hand@ValveBiped.Bip01_L_Finger0@ValveBiped.Bip01_L_Finger01@ValveBiped.Bip01_L_Finger02@ValveBiped.Anim_Attachment_LH@ValveBiped.Bip01_L_Finger1@ValveBiped.Bip01_L_Finger11@ValveBiped.Bip01_L_Finger12@ValveBiped.Bip01_L_Finger2@ValveBiped.Bip01_L_Finger21@ValveBiped.Bip01_L_Finger22@Bip01_R_Clavicle@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Ulna@Bip01_R_Hand@Bip01_R_Finger0@Bip01_R_Finger01@Bip01_R_Finger02@Anim_Attachment_RH@Bip01_R_Finger1@Bip01_R_Finger11@Bip01_R_Finger12@Bip01_R_Finger2@Bip01_R_Finger21@Bip01_R_Finger22"
    local1\Field58[$1A] = PackTwoValues($1E1, $202)
    local1\Field52[$1A] = 0.5
    local1\Field6[$1A] = "Bip01_Spine1@Bip01_Spine2@Bip01_Spine4@Bip01_L_Clavicle@Bip01_L_UpperArm@Bip01_L_Forearm@ValveBiped.Bip01_L_Ulna@Bip01_L_Hand@ValveBiped.Bip01_L_Finger0@ValveBiped.Bip01_L_Finger01@ValveBiped.Bip01_L_Finger02@ValveBiped.Anim_Attachment_LH@ValveBiped.Bip01_L_Finger1@ValveBiped.Bip01_L_Finger11@ValveBiped.Bip01_L_Finger12@ValveBiped.Bip01_L_Finger2@ValveBiped.Bip01_L_Finger21@ValveBiped.Bip01_L_Finger22@Bip01_R_Clavicle@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Ulna@Bip01_R_Hand@Bip01_R_Finger0@Bip01_R_Finger01@Bip01_R_Finger02@Anim_Attachment_RH@Bip01_R_Finger1@Bip01_R_Finger11@Bip01_R_Finger12@Bip01_R_Finger2@Bip01_R_Finger21@Bip01_R_Finger22"
    local1\Field58[$1C] = PackTwoValues($1AA, $1B6)
    local1\Field52[$1C] = 0.5
    local1\Field6[$1C] = "Bip01_Spine1@Bip01_Spine2@Bip01_Spine4@Bip01_L_Clavicle@Bip01_R_Clavicle@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Ulna@Bip01_R_Hand@Bip01_R_Finger0@Bip01_R_Finger01@Bip01_R_Finger02@Anim_Attachment_RH@Bip01_R_Finger1@Bip01_R_Finger11@Bip01_R_Finger12@Bip01_R_Finger2@Bip01_R_Finger21@Bip01_R_Finger22"
    local1\Field58[$1B] = PackTwoValues($1B9, $1E0)
    local1\Field52[$1B] = 0.8
    local1\Field6[$1B] = "Bip01_Spine1@Bip01_Spine2@Bip01_Spine4@Bip01_L_Clavicle@Bip01_L_UpperArm@Bip01_L_Forearm@ValveBiped.Bip01_L_Ulna@Bip01_L_Hand@ValveBiped.Bip01_L_Finger0@ValveBiped.Bip01_L_Finger01@ValveBiped.Bip01_L_Finger02@ValveBiped.Anim_Attachment_LH@ValveBiped.Bip01_L_Finger1@ValveBiped.Bip01_L_Finger11@ValveBiped.Bip01_L_Finger12@ValveBiped.Bip01_L_Finger2@ValveBiped.Bip01_L_Finger21@ValveBiped.Bip01_L_Finger22@Bip01_R_Clavicle@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Ulna@Bip01_R_Hand@Bip01_R_Finger0@Bip01_R_Finger01@Bip01_R_Finger02@Anim_Attachment_RH@Bip01_R_Finger1@Bip01_R_Finger11@Bip01_R_Finger12@Bip01_R_Finger2@Bip01_R_Finger21@Bip01_R_Finger22"
    local1\Field58[$1D] = PackTwoValues($1B8, $1B8)
    local1\Field52[$1D] = 0.5
    local1\Field6[$1D] = "Bip01_Spine1@Bip01_Spine2@Bip01_Spine4@Bip01_L_Clavicle@Bip01_L_UpperArm@Bip01_L_Forearm@ValveBiped.Bip01_L_Ulna@Bip01_L_Hand@ValveBiped.Bip01_L_Finger0@ValveBiped.Bip01_L_Finger01@ValveBiped.Bip01_L_Finger02@ValveBiped.Anim_Attachment_LH@ValveBiped.Bip01_L_Finger1@ValveBiped.Bip01_L_Finger11@ValveBiped.Bip01_L_Finger12@ValveBiped.Bip01_L_Finger2@ValveBiped.Bip01_L_Finger21@ValveBiped.Bip01_L_Finger22@Bip01_R_Clavicle@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Ulna@Bip01_R_Hand@Bip01_R_Finger0@Bip01_R_Finger01@Bip01_R_Finger02@Anim_Attachment_RH@Bip01_R_Finger1@Bip01_R_Finger11@Bip01_R_Finger12@Bip01_R_Finger2@Bip01_R_Finger21@Bip01_R_Finger22"
    local1\Field22[$00] = PackTwoValues($178, $18C)
    local1\Field26[$00] = 0.5
    local1\Field61 = 11.0
    local1\Field14 = 38.0
    local1\Field36 = 11.0
    GUESSEDhideentity_2($03, "GFX\NPCs\scp_173_m.b3d")
    GUESSEDloadsound_3($03, "SFX\SCP\173\StoneDrag.ogg")
    local1 = GUESSEDcheckvalue_12($03)
    local1\Field56 = -0.3
    local1\Field47 = 180.0
    local1\Field24 = (0.34 / meshdepth(GUESSEDgetarray($03)))
    local1\Field13 = 0.3
    local1\Field43 = 0.2
    local1\Field44 = 3.0
    local1\Field16 = 0.0001
    local1\Field3 = $01
    local1\Field0 = $01
    local1\Field33 = $01
    local1\Field55 = $01
    local1\Field27 = $01
    local1\Field46 = $01
    local1\Field22[$00] = PackTwoValues($02, $27)
    local1\Field26[$00] = 0.3
    local1\Field61 = 2.0
    local1\Field14 = 11.0
    local1\Field36 = 2.0
    GUESSEDhideentity_2($04, "GFX\NPCs\scp_106_m.b3d")
    local1 = GUESSEDcheckvalue_12($04)
    local1\Field56 = -0.3
    local1\Field47 = 0.0
    local1\Field24 = (1.0 / 8.8)
    local1\Field13 = 0.3
    local1\Field43 = 0.3
    local1\Field16 = 3.0
    local1\Field34 = $00
    local1\Field19 = $4B
    local1\Field37 = $1E
    local1\Field35 = $3C
    local1\Field21 = "Bone_001"
    local1\Field30 = "Bone_022"
    local1\Field41 = "SFX\Step\StepPD0.ogg"
    local1\Field0 = $01
    local1\Field33 = $01
    local1\Field7 = $01
    local1\Field55 = $01
    local1\Field2 = $06
    local1\Field58[$01] = PackTwoValues($14E, $1EE)
    local1\Field52[$01] = 0.3
    local1\Field58[$02] = PackTwoValues($11C, $14D)
    local1\Field52[$02] = 0.559
    local1\Field18[$02] = 40.0
    local1\Field58[$03] = PackTwoValues($11C, $14D)
    local1\Field52[$03] = 0.7
    local1\Field18[$03] = 30.0
    local1\Field58[$11] = PackTwoValues($69, $6E)
    local1\Field52[$11] = 0.3
    local1\Field58[$11] = PackTwoValues($69, $6E)
    local1\Field52[$11] = 0.3
    local1\Field22[$00] = PackTwoValues($6F, $103)
    local1\Field26[$00] = -0.15
    local1\Field61 = 1.5
    local1\Field14 = 4.5
    local1\Field36 = 1.5
    GUESSEDhideentity_2($05, "GFX\NPCs\scp_049.b3d")
    local1 = GUESSEDcheckvalue_12($05)
    local1\Field56 = -0.3
    local1\Field47 = 0.0
    local1\Field24 = 1.2
    local1\Field13 = 0.25
    local1\Field43 = 0.25
    local1\Field16 = 2.0
    local1\Field34 = $01
    local1\Field19 = $4B
    local1\Field37 = $1E
    local1\Field35 = $3C
    local1\Field21 = "Bone_001"
    local1\Field30 = "Bone_019"
    local1\Field0 = $01
    local1\Field33 = $01
    local1\Field7 = $01
    local1\Field55 = $01
    local1\Field58[$01] = PackTwoValues($10D, $159)
    local1\Field52[$01] = 0.2
    local1\Field58[$02] = PackTwoValues($192, $1B5)
    local1\Field52[$02] = 0.6
    local1\Field18[$02] = 40.0
    local1\Field58[$03] = PackTwoValues($192, $1B5)
    local1\Field52[$03] = 1.0
    local1\Field18[$03] = 30.0
    local1\Field58[$0F] = PackTwoValues($219, $294)
    local1\Field52[$0F] = 0.7
    local1\Field58[$11] = PackTwoValues($219, $294)
    local1\Field52[$11] = 0.7
    local1\Field22[$00] = PackTwoValues($4CA, $4F9)
    local1\Field26[$00] = 0.3
    local1\Field61 = 0.1
    local1\Field14 = 0.43
    local1\Field36 = 0.1
    GUESSEDhideentity_2($06, "GFX\NPCs\scp_939.b3d")
    GUESSEDcheckvalue_41($1F, "GFX\NPCs\scp_939_e.png", $00)
    local1 = GUESSEDcheckvalue_12($06)
    local1\Field56 = -0.34
    local1\Field47 = 0.0
    local1\Field24 = 0.6
    local1\Field13 = 0.47
    local1\Field43 = 0.47
    local1\Field16 = 0.7
    local1\Field34 = $00
    local1\Field19 = $32
    local1\Field30 = ""
    local1\Field0 = $01
    local1\Field33 = $01
    local1\Field27 = $01
    local1\Field55 = $01
    local1\Field38 = -0.2
    local1\Field58[$01] = PackTwoValues($0B, $59)
    local1\Field52[$01] = 0.2
    local1\Field58[$02] = PackTwoValues($303, $34A)
    local1\Field52[$02] = 0.32
    local1\Field18[$02] = 40.0
    local1\Field58[$03] = PackTwoValues($357, $36C)
    local1\Field52[$03] = 0.32
    local1\Field18[$03] = 30.0
    local1\Field58[$0F] = PackTwoValues($38F, $3AB)
    local1\Field52[$0F] = 1.0
    local1\Field58[$11] = PackTwoValues($3AC, $3C9)
    local1\Field52[$11] = 1.0
    local1\Field22[$00] = PackTwoValues($6FA, $741)
    local1\Field26[$00] = 0.3
    local1\Field61 = 0.5
    local1\Field14 = 0.375
    local1\Field36 = 0.875
    GUESSEDhideentity_2($07, "GFX\NPCs\scp_966_m.b3d")
    local1 = GUESSEDcheckvalue_12($07)
    local1\Field56 = -0.3
    local1\Field47 = 0.0
    local1\Field24 = 0.01125
    local1\Field13 = 0.2
    local1\Field43 = 0.2
    local1\Field16 = 2.0
    local1\Field34 = $01
    local1\Field19 = $4B
    local1\Field37 = $1E
    local1\Field35 = $3C
    local1\Field21 = "spine_002"
    local1\Field30 = "spine_005"
    local1\Field0 = $01
    local1\Field33 = $01
    local1\Field55 = $01
    local1\Field58[$01] = PackTwoValues($02, $70)
    local1\Field52[$01] = 0.2
    local1\Field58[$02] = PackTwoValues($245, $275)
    local1\Field52[$02] = 0.4
    local1\Field18[$02] = 45.0
    local1\Field58[$03] = PackTwoValues($245, $275)
    local1\Field52[$03] = 0.7
    local1\Field18[$03] = 30.0
    local1\Field58[$0F] = PackTwoValues($1CA, $1E7)
    local1\Field52[$0F] = 0.35
    local1\Field58[$11] = PackTwoValues($1E8, $205)
    local1\Field52[$11] = 0.35
    local1\Field22[$00] = PackTwoValues($2ED, $2FC)
    local1\Field26[$00] = 0.8
    local1\Field61 = 11.0
    local1\Field14 = 38.0
    local1\Field36 = 11.0
    GUESSEDhideentity_2($0F, "GFX\NPCs\scp_860_2_m.b3d")
    local1 = GUESSEDcheckvalue_12($0F)
    local1\Field56 = -0.3
    local1\Field47 = 0.0
    local1\Field24 = 0.025
    local1\Field13 = 0.4
    local1\Field43 = 0.4
    local1\Field16 = 0.2
    local1\Field34 = $00
    local1\Field19 = $4B
    local1\Field30 = "Bone_004"
    local1\Field0 = $01
    local1\Field33 = $01
    local1\Field55 = $01
    local1\Field27 = $01
    local1\Field58[$01] = PackTwoValues($C8, $129)
    local1\Field52[$01] = 0.2
    local1\Field58[$02] = PackTwoValues($1EE, $23A)
    local1\Field52[$02] = 0.7
    local1\Field18[$02] = 45.0
    local1\Field58[$03] = PackTwoValues($12A, $13B)
    local1\Field52[$03] = 0.6
    local1\Field18[$03] = 30.0
    local1\Field58[$0F] = PackTwoValues($1C2, $1EC)
    local1\Field52[$0F] = 0.8
    local1\Field58[$11] = PackTwoValues($1C2, $1EC)
    local1\Field52[$11] = 0.8
    local1\Field22[$00] = PackTwoValues($23B, $259)
    local1\Field26[$00] = 0.6
    local1\Field61 = 10.0
    local1\Field14 = 15.0
    local1\Field36 = 32.0
    GUESSEDhideentity_2($08, "GFX\NPCs\scp_096.b3d")
    GUESSEDcheckvalue_41($1C, "GFX\NPCs\scp_096_bloody.png", $00)
    local1 = GUESSEDcheckvalue_12($08)
    local1\Field56 = -0.05
    local1\Field47 = 0.0
    local1\Field24 = 0.17
    local1\Field13 = 0.23
    local1\Field43 = 0.23
    local1\Field16 = 0.3
    local1\Field34 = $01
    local1\Field19 = $4B
    local1\Field37 = $1E
    local1\Field35 = $3C
    local1\Field30 = ""
    local1\Field0 = $01
    local1\Field33 = $01
    local1\Field55 = $01
    local1\Field27 = $01
    local1\Field41 = "SFX\Step\NPCs\096\Step1.ogg"
    local1\Field58[$01] = PackTwoValues($1A7, $1D7)
    local1\Field52[$01] = 0.2
    local1\Field58[$02] = PackTwoValues($567, $5B0)
    local1\Field52[$02] = 1.0
    local1\Field18[$02] = 40.0
    local1\Field58[$03] = PackTwoValues($567, $5B0)
    local1\Field52[$03] = 1.6
    local1\Field18[$03] = 30.0
    local1\Field58[$0F] = PackTwoValues($02, $1C)
    local1\Field52[$0F] = 1.0
    local1\Field58[$11] = PackTwoValues($02, $1C)
    local1\Field52[$11] = 1.0
    local1\Field58[$0A] = PackTwoValues($5BF, $614)
    local1\Field52[$0A] = 0.5
    local1\Field58[$0B] = PackTwoValues($2E1, $337)
    local1\Field52[$0B] = 1.0
    local1\Field18[$0B] = 40.0
    local1\Field58[$0C] = PackTwoValues($38B, $3A7)
    local1\Field52[$0C] = 1.0
    local1\Field18[$0C] = 17.5
    local1\Field22[$00] = PackTwoValues($616, $629)
    local1\Field26[$00] = 0.8
    local1\Field61 = 1.0
    local1\Field14 = 2.5
    local1\Field36 = 1.0
    GUESSEDhideentity_2($0E, "GFX\NPCs\scp_999.b3d")
    local1 = GUESSEDcheckvalue_12($0E)
    local1\Field56 = -0.3
    local1\Field47 = -90.0
    local1\Field24 = 0.0035
    local1\Field13 = 0.2
    local1\Field43 = 0.2
    local1\Field16 = 2.5
    local1\Field34 = $01
    local1\Field19 = $4B
    local1\Field21 = ""
    local1\Field3 = $01
    local1\Field0 = $01
    local1\Field33 = $01
    local1\Field55 = $01
    local1\Field38 = -0.5
    local1\Field41 = " "
    local1\Field58[$01] = PackTwoValues($24, $24)
    local1\Field52[$01] = 0.8
    local1\Field58[$02] = PackTwoValues($24, $24)
    local1\Field52[$02] = 0.8
    local1\Field58[$03] = PackTwoValues($24, $24)
    local1\Field52[$03] = 0.8
    local1\Field22[$00] = PackTwoValues($01, $24)
    local1\Field26[$00] = 0.8
    local1\Field61 = 40.0
    local1\Field14 = 50.0
    local1\Field36 = 40.0
    GUESSEDhideentity_2($0C, "GFX\NPCs\class_d.b3d")
    local1 = GUESSEDcheckvalue_12($0C)
    local1\Field20 = $28
    local1\Field56 = -0.3
    local1\Field47 = 180.0
    local1\Field21 = "Bip01_Spine1"
    local1\Field30 = "Bip01_Head"
    local1\Field53 = "Bip01_L_Forearm"
    local1\Field31 = "Bip01_L_Finger0"
    local1\Field34 = $01
    local1\Field19 = $4B
    local1\Field37 = $1E
    local1\Field35 = $3C
    local1\Field24 = (0.51 / meshwidth(GUESSEDgetarray($0C)))
    local1\Field13 = 0.3
    local1\Field17 = 0.0
    local1\Field60 = 70.0
    local1\Field25 = 10.0
    local1\Field43 = 0.32
    local1\Field16 = 0.4
    local1\Field0 = $01
    local1\Field33 = $01
    local1\Field55 = $01
    local1\Field12 = -0.03
    local1\Field1 = 0.015
    local1\Field45 = 0.0
    local1\Field57 = -60.0
    local1\Field32 = -45.0
    local1\Field50 = 0.0
    local1\Field58[$01] = PackTwoValues($D2, $EB)
    local1\Field52[$01] = 0.1
    local1\Field58[$02] = PackTwoValues($EC, $104)
    local1\Field52[$02] = 0.33
    local1\Field18[$02] = 45.0
    local1\Field58[$03] = PackTwoValues($12D, $13F)
    local1\Field52[$03] = 0.33
    local1\Field18[$03] = 30.0
    local1\Field58[$04] = PackTwoValues($165, $17D)
    local1\Field52[$04] = 0.1
    local1\Field58[$05] = PackTwoValues($17E, $196)
    local1\Field52[$05] = 0.3
    local1\Field18[$05] = 45.0
    local1\Field58[$06] = PackTwoValues($C1, $C5)
    local1\Field52[$06] = 0.025
    local1\Field58[$07] = PackTwoValues($C7, $D1)
    local1\Field52[$07] = 0.33
    local1\Field18[$07] = 35.0
    local1\Field58[$08] = PackTwoValues($322, $336)
    local1\Field52[$08] = 0.23
    local1\Field58[$09] = PackTwoValues($30D, $321)
    local1\Field52[$09] = 0.33
    local1\Field58[$0A] = PackTwoValues($337, $350)
    local1\Field52[$0A] = 0.05
    local1\Field58[$0B] = PackTwoValues($351, $369)
    local1\Field52[$0B] = 0.33
    local1\Field18[$0B] = 45.0
    local1\Field58[$0C] = PackTwoValues($392, $3A4)
    local1\Field52[$0C] = 0.35
    local1\Field18[$0C] = 30.0
    local1\Field58[$0D] = PackTwoValues($3D8, $3EF)
    local1\Field52[$0D] = 0.05
    local1\Field58[$0E] = PackTwoValues($3F0, $408)
    local1\Field52[$0E] = 0.3
    local1\Field18[$0E] = 45.0
    local1\Field58[$0F] = PackTwoValues($337, $350)
    local1\Field52[$0F] = 0.05
    local1\Field58[$10] = PackTwoValues($351, $369)
    local1\Field52[$10] = 0.33
    local1\Field18[$10] = 45.0
    local1\Field58[$11] = PackTwoValues($392, $3A4)
    local1\Field52[$11] = 0.35
    local1\Field18[$11] = 30.0
    local1\Field58[$12] = PackTwoValues($3D8, $3EF)
    local1\Field52[$12] = 0.05
    local1\Field58[$13] = PackTwoValues($3F0, $408)
    local1\Field52[$13] = 0.3
    local1\Field18[$13] = 45.0
    local1\Field58[$14] = PackTwoValues($43A, $461)
    local1\Field52[$14] = 1.0
    local1\Field5[$08] = $01
    local1\Field5[$09] = $01
    local1\Field22[$00] = PackTwoValues($01, $14)
    local1\Field26[$00] = 0.4
    local1\Field22[$01] = PackTwoValues($29, $3C)
    local1\Field26[$01] = 0.4
    local1\Field22[$02] = PackTwoValues($2A6, $2C7)
    local1\Field26[$02] = 0.4
    local1\Field22[$03] = PackTwoValues($2C8, $30B)
    local1\Field26[$03] = 0.4
    local1\Field61 = 10.0
    local1\Field14 = 35.0
    local1\Field36 = 6.5
    GUESSEDhideentity_2($0D, "GFX\NPCs\scp_049_2m.b3d")
    local1 = GUESSEDcheckvalue_12($0D)
    local1\Field56 = -0.3
    local1\Field47 = 0.0
    local1\Field30 = "head"
    local1\Field34 = $00
    local1\Field19 = $4B
    local1\Field37 = $1E
    local1\Field35 = $3C
    local1\Field24 = 0.108
    local1\Field13 = 0.3
    local1\Field17 = 0.0
    local1\Field60 = 70.0
    local1\Field25 = 10.0
    local1\Field43 = 0.3
    local1\Field16 = 0.4
    local1\Field0 = $01
    local1\Field33 = $01
    local1\Field55 = $01
    local1\Field58[$01] = PackTwoValues($117, $1A9)
    local1\Field52[$01] = 0.3
    local1\Field58[$02] = PackTwoValues($1AC, $1FB)
    local1\Field52[$02] = 0.8
    local1\Field18[$02] = 45.0
    local1\Field58[$03] = PackTwoValues($1AC, $1FB)
    local1\Field52[$03] = 1.4
    local1\Field18[$03] = 30.0
    local1\Field58[$0F] = PackTwoValues($1FF, $23F)
    local1\Field52[$0F] = 0.8
    local1\Field58[$11] = PackTwoValues($242, $280)
    local1\Field52[$11] = 0.8
    local1\Field22[$00] = PackTwoValues($281, $2A7)
    local1\Field26[$00] = 0.3
    local1\Field61 = 1.5
    local1\Field14 = 3.8
    local1\Field36 = 1.5
    GUESSEDhideentity_2($11, "GFX\NPCs\class_d.b3d")
    local1 = GUESSEDcheckvalue_12($11)
    local1\Field20 = $28
    local1\Field56 = -0.3
    local1\Field47 = 180.0
    local1\Field21 = "Bip01_Spine1"
    local1\Field30 = "Bip01_Head"
    local1\Field53 = "Bip01_L_Forearm"
    local1\Field31 = "Bip01_L_Finger0"
    local1\Field34 = $01
    local1\Field19 = $4B
    local1\Field37 = $1E
    local1\Field35 = $3C
    local1\Field24 = (0.51 / meshwidth(GUESSEDgetarray($11)))
    local1\Field13 = 0.3
    local1\Field17 = 0.0
    local1\Field60 = 70.0
    local1\Field25 = 10.0
    local1\Field43 = 0.32
    local1\Field16 = 0.4
    local1\Field0 = $01
    local1\Field33 = $01
    local1\Field55 = $01
    local1\Field9 = $24
    local1\Field28 = "Bip01_R_Hand Bip01_R_Forearm Bip01_R_UpperArm Bip01_L_UpperArm Bip01_L_Forearm Bip01_L_Hand Bip01_L_Foot Bip01_L_Calf Bip01_L_Thigh Bip01_L_Thigh Bip01_R_Foot Bip01_R_Calf Bip01_R_Thigh Bip01_Head Bip01_Pelvis Bip01_Spine Bip01_Spine1 Bip01_Spine2"
    local1\Field11 = $01
    local1\Field46 = $01
    local1\Field42 = 2.0
    local1\Field39 = $00
    local1\Field15 = $FF
    local1\Field51 = $8C
    local1\Field54 = $32
    local1\Field59 = 0.0
    local1\Field12 = -0.03
    local1\Field1 = 0.015
    local1\Field45 = 0.0
    local1\Field57 = -60.0
    local1\Field32 = -45.0
    local1\Field50 = 0.0
    local1\Field58[$01] = PackTwoValues($D2, $EB)
    local1\Field52[$01] = 0.1
    local1\Field58[$02] = PackTwoValues($EC, $104)
    local1\Field52[$02] = 0.33
    local1\Field18[$02] = 45.0
    local1\Field58[$03] = PackTwoValues($12D, $13F)
    local1\Field52[$03] = 0.33
    local1\Field18[$03] = 30.0
    local1\Field58[$04] = PackTwoValues($165, $17D)
    local1\Field52[$04] = 0.1
    local1\Field58[$05] = PackTwoValues($17E, $196)
    local1\Field52[$05] = 0.3
    local1\Field18[$05] = 45.0
    local1\Field58[$06] = PackTwoValues($C1, $C5)
    local1\Field52[$06] = 0.025
    local1\Field58[$07] = PackTwoValues($C7, $D1)
    local1\Field52[$07] = 0.33
    local1\Field18[$07] = 35.0
    local1\Field58[$08] = PackTwoValues($322, $336)
    local1\Field52[$08] = 0.23
    local1\Field58[$09] = PackTwoValues($30D, $321)
    local1\Field52[$09] = 0.33
    local1\Field58[$0A] = PackTwoValues($337, $350)
    local1\Field52[$0A] = 0.05
    local1\Field58[$0B] = PackTwoValues($351, $369)
    local1\Field52[$0B] = 0.33
    local1\Field18[$0B] = 45.0
    local1\Field58[$0C] = PackTwoValues($392, $3A4)
    local1\Field52[$0C] = 0.35
    local1\Field18[$0C] = 30.0
    local1\Field58[$0D] = PackTwoValues($3D8, $3EF)
    local1\Field52[$0D] = 0.05
    local1\Field58[$0E] = PackTwoValues($3F0, $408)
    local1\Field52[$0E] = 0.3
    local1\Field18[$0E] = 45.0
    local1\Field58[$0F] = PackTwoValues($337, $350)
    local1\Field52[$0F] = 0.05
    local1\Field58[$10] = PackTwoValues($351, $369)
    local1\Field52[$10] = 0.33
    local1\Field18[$10] = 45.0
    local1\Field58[$11] = PackTwoValues($392, $3A4)
    local1\Field52[$11] = 0.35
    local1\Field18[$11] = 30.0
    local1\Field58[$12] = PackTwoValues($3D8, $3EF)
    local1\Field52[$12] = 0.05
    local1\Field58[$13] = PackTwoValues($3F0, $408)
    local1\Field52[$13] = 0.3
    local1\Field18[$13] = 45.0
    local1\Field58[$14] = PackTwoValues($43A, $461)
    local1\Field52[$14] = 1.0
    local1\Field5[$08] = $01
    local1\Field5[$09] = $01
    local1\Field22[$00] = PackTwoValues($01, $14)
    local1\Field26[$00] = 0.4
    local1\Field22[$01] = PackTwoValues($29, $3C)
    local1\Field26[$01] = 0.4
    local1\Field22[$02] = PackTwoValues($2A6, $2C7)
    local1\Field26[$02] = 0.4
    local1\Field22[$03] = PackTwoValues($2C8, $30B)
    local1\Field26[$03] = 0.4
    local1\Field61 = 10.0
    local1\Field14 = 35.0
    local1\Field36 = 6.5
    GUESSEDloadsound_2($11, $00, "SFX\SCP\457\FireLoop.ogg", $01)
    GUESSEDcheckvalue_26($01, "GFX\Items\Wearable\gasmask_wearmodel.b3d", "", $00, $01)
    GUESSEDcheckvalue_26($02, "GFX\Items\Wearable\gasmask_wearmodel.b3d", "", $00, $01)
    GUESSEDcheckvalue_26($03, "GFX\Items\Wearable\gasmask_wearmodel.b3d", "", $00, $01)
    GUESSEDcheckvalue_26($04, "GFX\Items\Wearable\gasmask_wearmodel.b3d", "GFX\Items\gas_mask_heavy.png", $00, $01)
    GUESSEDcheckvalue_26($05, "GFX\Items\Wearable\Ballistic_vest_wearmodel.b3d", "", $00, $01)
    GUESSEDcheckvalue_26($06, "GFX\Items\Wearable\Ballistic_vest_wearmodel.b3d", "", $00, $01)
    GUESSEDcheckvalue_26($07, "GFX\Items\ballistic_helmet.b3d", "", $00, $01)
    GUESSEDscaleentity_6($07, $01, "GFX\Items\Wearable\ballistic_helmet_visor.b3d", "")
    GUESSEDscaleentity_6($07, $02, "GFX\Items\GOC_helmet.b3d", "")
    GUESSEDcheckvalue_26($1D, "GFX\Items\heavy_helmet.b3d", "", $00, $01)
    GUESSEDcheckvalue_26($08, "GFX\Items\Wearable\NVG_wearmodel.b3d", "GFX\Items\night_vision_goggles_green.png", $00, $01)
    GUESSEDcheckvalue_26($09, "GFX\Items\Wearable\NVG_wearmodel.b3d", "GFX\Items\night_vision_goggles_red.png", $00, $01)
    GUESSEDcheckvalue_26($0A, "GFX\Items\Wearable\NVG_wearmodel.b3d", "GFX\Items\night_vision_goggles_blue.png", $00, $01)
    GUESSEDcheckvalue_26($0B, "GFX\Items\Wearable\SCRAMBLE_gear_wearmodel.b3d", "", $00, $01)
    GUESSEDcheckvalue_26($0C, "GFX\Items\Wearable\SCRAMBLE_gear_wearmodel.b3d", "", $00, $01)
    GUESSEDcheckvalue_26($0D, "GFX\Items\Wearable\427_wearmodel.b3d", "", $00, $01)
    GUESSEDcheckvalue_26($0F, "GFX\Items\scp_268.b3d", "", $00, $01)
    GUESSEDcheckvalue_26($10, "GFX\Items\scp_268.b3d", "", $00, $01)
    GUESSEDcheckvalue_26($0E, "GFX\Items\scp_268.b3d", "", $00, $01)
    GUESSEDcheckvalue_26($11, "GFX\Items\scp_714.b3d", "", $00, $01)
    GUESSEDcheckvalue_26($12, "GFX\Items\scp_714.b3d", "", $00, $01)
    GUESSEDcheckvalue_26($1C, "GFX\NPCs\scp_035_smile.b3d", "", $00, $01)
    GUESSEDcheckvalue_26($13, "GFX\Items\m4a1_wm.b3d", "", $01, $01)
    GUESSEDcheckvalue_26($14, "GFX\Items\glock_wm.b3d", "", $01, $01)
    GUESSEDcheckvalue_26($15, "GFX\Items\m60_wm.b3d", "", $01, $01)
    GUESSEDcheckvalue_26($16, "GFX\Items\sr556_wm.b3d", "", $01, $01)
    GUESSEDcheckvalue_26($17, "GFX\Items\mp5_wm.b3d", "", $01, $01)
    GUESSEDcheckvalue_26($18, "GFX\Items\fiveseven_wm.b3d", "", $01, $01)
    GUESSEDcheckvalue_26($19, "GFX\Items\kriss_vector_wm.b3d", "", $01, $01)
    GUESSEDcheckvalue_26($1E, "GFX\Items\p90_wm.b3d", "", $01, $01)
    GUESSEDcheckvalue_26($1F, "GFX\Items\mp7_wm.b3d", "", $01, $01)
    GUESSEDcheckvalue_26($20, "GFX\Items\m134_wm.b3d", "", $01, $01)
    GUESSEDcheckvalue_26($26, "GFX\Items\remington_wm.b3d", "", $01, $01)
    GUESSEDcheckvalue_26($1A, "GFX\Items\handcuffs_wm.b3d", "", $01, $01)
    GUESSEDcheckvalue_26($1B, "GFX\Items\handcuffs_wm.b3d", "", $01, $01)
    GUESSEDcheckvalue_26($27, "GFX\Items\rpg_wm.b3d", "", $01, $01)
    GUESSEDcheckvalue_26($28, "GFX\Items\g36_wm.b3d", "", $01, $01)
    GUESSEDcheckvalue_26($29, "GFX\Items\ak74_wm.b3d", "", $01, $01)
    GUESSEDcheckvalue_26($1F9, "GFX\Items\m69_wm.b3d", "", $01, $01)
    GUESSEDcheckvalue_26($1F6, "GFX\Items\emp_wm.b3d", "", $01, $01)
    GUESSEDcheckvalue_26($1F8, "GFX\Items\m9_wm.b3d", "", $01, $01)
    GUESSEDcheckvalue_26($1F7, "GFX\Items\stemtex_wm.b3d", "", $01, $01)
    GUESSEDcheckvalue_26($22, "", "", $00, $01)
    GUESSEDcheckvalue_26($24, "", "", $00, $01)
    GUESSEDcheckvalue_26($21, "", "", $00, $01)
    GUESSEDcheckvalue_26($25, "", "", $00, $01)
    GUESSEDcheckvalue_26($23, "", "", $00, $01)
    GUESSEDcheckvalue_26($1FF, "", "", $00, $01)
    GUESSEDcheckvalue_26($1FE, "", "", $00, $01)
    GUESSEDcheckvalue_26($1FD, "", "", $00, $01)
    GUESSEDcheckvalue_26($1FC, "", "", $00, $01)
    GUESSEDcheckvalue_26($1FB, "", "", $00, $01)
    GUESSEDcheckvalue_26($1FA, "", "", $00, $01)
    GUESSEDcheckvalue_26($1F5, "", "", $00, $01)
    GUESSEDcheckvalue_26($1F4, "", "", $00, $01)
    GUESSEDcheckvalue_26($1F3, "", "", $00, $01)
    GUESSEDcheckvalue_34($1B, $1D)
    GUESSEDloadsound($01, $00, "SFX\Character\D9341\BreathGasRelaxed.ogg")
    GUESSEDloadsound($02, $00, "SFX\Character\D9341\BreathGasRelaxed.ogg")
    GUESSEDloadsound($03, $00, "SFX\Character\D9341\BreathGasRelaxed.ogg")
    GUESSEDloadsound($04, $00, "SFX\Character\D9341\BreathGasRelaxed.ogg")
    local2 = GUESSEDcheckvalue_32($01, $01)
    local2\Field5 = "Bip01_Head"
    local2\Field4 = 179.9
    local2\Field3 = -90.0
    local2\Field0 = -3.0
    local2\Field1 = 0.5
    local2\Field7 = 1.04705
    GUESSEDcheckvalue_3($01, $01, $02, $FFFFFFFF)
    GUESSEDcheckvalue_3($01, $01, $03, $FFFFFFFF)
    GUESSEDcheckvalue_3($01, $01, $04, $FFFFFFFF)
    local2 = GUESSEDcheckvalue_32($07, $01)
    local2\Field5 = "Bip01_Head"
    local2\Field3 = 90.0
    local2\Field0 = -2.5
    local2\Field7 = 1.04705
    GUESSEDcheckvalue_3($07, $01, $1D, $FFFFFFFF)
    local2 = GUESSEDcheckvalue_32($08, $01)
    local2\Field5 = "Bip01_Head"
    local2\Field3 = -90.0
    local2\Field0 = -4.0
    local2\Field1 = 4.6
    local2\Field7 = 0.97725
    GUESSEDcheckvalue_3($08, $01, $09, $FFFFFFFF)
    GUESSEDcheckvalue_3($08, $01, $0A, $FFFFFFFF)
    GUESSEDcheckvalue_3($08, $01, $0B, $FFFFFFFF)
    GUESSEDcheckvalue_3($08, $01, $0C, $FFFFFFFF)
    local2 = GUESSEDcheckvalue_32($0F, $01)
    local2\Field5 = "Bip01_Head"
    local2\Field3 = 90.0
    local2\Field0 = -5.1
    local2\Field1 = 1.7
    local2\Field7 = 4.88625
    local2 = GUESSEDcheckvalue_32($1C, $01)
    local2\Field5 = "Bip01_Head"
    local2\Field0 = 1.0
    local2\Field2 = 0.0
    local2\Field1 = 5.9
    local2\Field4 = 190.0
    local2\Field3 = -90.0
    local2\Field7 = 1.0
    GUESSEDcheckvalue_3($0F, $01, $10, $FFFFFFFF)
    GUESSEDcheckvalue_3($0F, $01, $0E, $FFFFFFFF)
    local2 = GUESSEDcheckvalue_32($0D, $01)
    local2\Field5 = "Bip01_Neck"
    local2\Field0 = 0.3
    local2\Field1 = 3.5
    local2\Field3 = 90.0
    local2\Field4 = -65.0
    local2\Field7 = 1.04705
    local2 = GUESSEDcheckvalue_32($05, $01)
    local2\Field5 = "Bip01_Spine1"
    local2\Field7 = 1.15176
    local2\Field4 = 179.9
    local2\Field3 = -90.0
    local2\Field0 = -1.5
    GUESSEDcheckvalue_3($05, $01, $06, $FFFFFFFF)
    local2 = GUESSEDcheckvalue_32($11, $01)
    local2\Field5 = "Bip01_L_Finger0"
    local2\Field7 = 13.9609
    local2\Field3 = 90.0
    local2\Field0 = -1.0
    local2\Field2 = -1.3
    GUESSEDcheckvalue_3($11, $01, $12, $FFFFFFFF)
    local2 = GUESSEDcheckvalue_32($19, $01)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 80.0
    local2\Field4 = -90.0
    local2\Field7 = 4.5
    local2 = GUESSEDcheckvalue_32($18, $01)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 80.0
    local2\Field4 = -90.0
    local2\Field7 = 4.5
    local2 = GUESSEDcheckvalue_32($17, $01)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 80.0
    local2\Field4 = -90.0
    local2\Field7 = 4.5
    local2 = GUESSEDcheckvalue_32($28, $01)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 80.0
    local2\Field4 = -90.0
    local2\Field7 = 4.5
    local2 = GUESSEDcheckvalue_32($1E, $01)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 80.0
    local2\Field4 = -90.0
    local2\Field7 = 4.5
    local2 = GUESSEDcheckvalue_32($1F, $01)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 80.0
    local2\Field4 = -90.0
    local2\Field7 = 4.5
    local2 = GUESSEDcheckvalue_32($26, $01)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 80.0
    local2\Field4 = -90.0
    local2\Field7 = 4.5
    local2 = GUESSEDcheckvalue_32($20, $01)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = 3.0
    local2\Field1 = 2.0
    local2\Field3 = 80.0
    local2\Field4 = -90.0
    local2\Field7 = 4.5
    local2 = GUESSEDcheckvalue_32($27, $01)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = 3.0
    local2\Field1 = 2.0
    local2\Field3 = 80.0
    local2\Field4 = -90.0
    local2\Field7 = 4.5
    local2 = GUESSEDcheckvalue_32($16, $01)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 80.0
    local2\Field4 = -90.0
    local2\Field7 = 4.5
    local2 = GUESSEDcheckvalue_32($29, $01)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 80.0
    local2\Field4 = -90.0
    local2\Field7 = 4.5
    local2 = GUESSEDcheckvalue_32($15, $01)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 80.0
    local2\Field4 = -90.0
    local2\Field7 = 4.5
    local2 = GUESSEDcheckvalue_32($13, $01)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 80.0
    local2\Field4 = -90.0
    local2\Field7 = 4.5
    local2 = GUESSEDcheckvalue_32($14, $01)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 80.0
    local2\Field4 = -90.0
    local2\Field7 = 4.5
    local2 = GUESSEDcheckvalue_32($1B, $01)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = 0.0
    local2\Field2 = 2.5
    local2\Field1 = 0.0
    local2\Field3 = 90.0
    local2\Field7 = 0.32
    local2 = GUESSEDcheckvalue_32($1A, $01)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -2.0
    local2\Field2 = 0.0
    local2\Field1 = 2.0
    local2\Field7 = 0.32
    local2 = GUESSEDcheckvalue_32($1F9, $01)
    local2\Field5 = "Bip01_R_Hand"
    local2\Field0 = -3.06
    local2\Field2 = 0.7879
    local2\Field1 = 0.9939
    local2\Field8 = 3.0
    local2\Field4 = -87.83
    local2\Field3 = 82.34
    local2\Field7 = 1.0
    local2 = GUESSEDcheckvalue_32($1F6, $01)
    local2\Field5 = "Bip01_R_Hand"
    local2\Field0 = -3.06
    local2\Field2 = 0.7879
    local2\Field1 = 0.9939
    local2\Field8 = 3.0
    local2\Field4 = -87.83
    local2\Field3 = 82.34
    local2\Field7 = 1.0
    local2 = GUESSEDcheckvalue_32($1F7, $01)
    local2\Field5 = "Bip01_R_Hand"
    local2\Field0 = -3.06
    local2\Field2 = 0.7879
    local2\Field1 = 0.9939
    local2\Field8 = 3.0
    local2\Field4 = -87.83
    local2\Field3 = 82.34
    local2\Field7 = 1.0
    local2 = GUESSEDcheckvalue_32($1F8, $01)
    local2\Field5 = "Bip01_R_Hand"
    local2\Field0 = -3.48
    local2\Field2 = 2.49
    local2\Field1 = 1.924
    local2\Field8 = 74.0
    local2\Field4 = -178.0
    local2\Field3 = -171.0
    local2\Field7 = 4.5
    local2 = GUESSEDcheckvalue_32($19, $02)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 90.0
    local2\Field4 = -90.0
    local2\Field7 = 4.7
    local2 = GUESSEDcheckvalue_32($18, $02)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 90.0
    local2\Field4 = -90.0
    local2\Field7 = 4.7
    local2 = GUESSEDcheckvalue_32($17, $02)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 90.0
    local2\Field4 = -90.0
    local2\Field7 = 4.7
    local2 = GUESSEDcheckvalue_32($28, $02)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 90.0
    local2\Field4 = -90.0
    local2\Field7 = 4.7
    local2 = GUESSEDcheckvalue_32($1E, $02)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 90.0
    local2\Field4 = -90.0
    local2\Field7 = 4.7
    local2 = GUESSEDcheckvalue_32($1F, $02)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 90.0
    local2\Field4 = -90.0
    local2\Field7 = 4.7
    local2 = GUESSEDcheckvalue_32($26, $02)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 90.0
    local2\Field4 = -90.0
    local2\Field7 = 4.7
    local2 = GUESSEDcheckvalue_32($20, $02)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = 3.0
    local2\Field1 = 2.0
    local2\Field3 = 90.0
    local2\Field4 = -90.0
    local2\Field7 = 4.7
    local2 = GUESSEDcheckvalue_32($27, $02)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = 3.0
    local2\Field1 = 2.0
    local2\Field3 = 90.0
    local2\Field4 = -90.0
    local2\Field7 = 4.7
    local2 = GUESSEDcheckvalue_32($16, $02)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 90.0
    local2\Field4 = -90.0
    local2\Field7 = 4.7
    local2 = GUESSEDcheckvalue_32($29, $02)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 90.0
    local2\Field4 = -90.0
    local2\Field7 = 4.7
    local2 = GUESSEDcheckvalue_32($15, $02)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 90.0
    local2\Field4 = -90.0
    local2\Field7 = 4.7
    local2 = GUESSEDcheckvalue_32($13, $02)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 90.0
    local2\Field4 = -90.0
    local2\Field7 = 4.7
    local2 = GUESSEDcheckvalue_32($14, $02)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 90.0
    local2\Field4 = -90.0
    local2\Field7 = 4.7
    local2 = GUESSEDcheckvalue_32($1B, $02)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = 0.0
    local2\Field2 = 2.5
    local2\Field1 = 0.0
    local2\Field3 = 90.0
    local2\Field7 = 0.35
    local2 = GUESSEDcheckvalue_32($1A, $02)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -2.0
    local2\Field2 = 0.0
    local2\Field1 = 2.0
    local2\Field7 = 0.35
    local2 = GUESSEDcheckvalue_32($1F9, $02)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -3.06
    local2\Field2 = 0.7879
    local2\Field1 = 0.9939
    local2\Field8 = 3.0
    local2\Field4 = -87.83
    local2\Field3 = 82.34
    local2\Field7 = 1.0
    local2 = GUESSEDcheckvalue_32($1F6, $02)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -3.06
    local2\Field2 = 0.7879
    local2\Field1 = 0.9939
    local2\Field8 = 3.0
    local2\Field4 = -87.83
    local2\Field3 = 82.34
    local2\Field7 = 1.0
    local2 = GUESSEDcheckvalue_32($1F7, $02)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -3.06
    local2\Field2 = 0.7879
    local2\Field1 = 0.9939
    local2\Field8 = 3.0
    local2\Field4 = -87.83
    local2\Field3 = 82.34
    local2\Field7 = 1.0
    local2 = GUESSEDcheckvalue_32($1F8, $02)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -3.8
    local2\Field2 = -2.37
    local2\Field1 = 1.73
    local2\Field8 = -80.0
    local2\Field4 = -180.0
    local2\Field3 = 180.0
    local2\Field7 = 4.7
    local2 = GUESSEDcheckvalue_32($19, $0B)
    local2\Field5 = "RArmHand"
    local2\Field0 = -0.5
    local2\Field2 = 1.0
    local2\Field1 = 0.0
    local2\Field8 = 90.0
    local2\Field4 = -90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.5
    local2 = GUESSEDcheckvalue_32($18, $0B)
    local2\Field5 = "RArmHand"
    local2\Field0 = -0.5
    local2\Field2 = 1.0
    local2\Field1 = 0.0
    local2\Field8 = 90.0
    local2\Field4 = -90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.5
    local2 = GUESSEDcheckvalue_32($17, $0B)
    local2\Field5 = "RArmHand"
    local2\Field0 = -0.5
    local2\Field2 = 1.0
    local2\Field1 = 0.0
    local2\Field8 = 90.0
    local2\Field4 = -90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.5
    local2 = GUESSEDcheckvalue_32($28, $0B)
    local2\Field5 = "RArmHand"
    local2\Field0 = -0.5
    local2\Field2 = 1.0
    local2\Field1 = 0.0
    local2\Field8 = 90.0
    local2\Field4 = -90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.5
    local2 = GUESSEDcheckvalue_32($1E, $0B)
    local2\Field5 = "RArmHand"
    local2\Field0 = -0.5
    local2\Field2 = 1.0
    local2\Field1 = 0.0
    local2\Field8 = 90.0
    local2\Field4 = -90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.5
    local2 = GUESSEDcheckvalue_32($1F, $0B)
    local2\Field5 = "RArmHand"
    local2\Field0 = -0.5
    local2\Field2 = 1.0
    local2\Field1 = 0.0
    local2\Field8 = 90.0
    local2\Field4 = -90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.5
    local2 = GUESSEDcheckvalue_32($26, $0B)
    local2\Field5 = "RArmHand"
    local2\Field0 = -0.5
    local2\Field2 = 1.0
    local2\Field1 = 0.0
    local2\Field8 = 90.0
    local2\Field4 = -90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.5
    local2 = GUESSEDcheckvalue_32($20, $0B)
    local2\Field5 = "RArmHand"
    local2\Field0 = 0.0
    local2\Field2 = 1.0
    local2\Field1 = 0.0
    local2\Field8 = 90.0
    local2\Field4 = -90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.6
    local2 = GUESSEDcheckvalue_32($27, $0B)
    local2\Field5 = "RArmHand"
    local2\Field0 = 0.0
    local2\Field2 = 1.0
    local2\Field1 = 0.0
    local2\Field8 = 90.0
    local2\Field4 = -90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.6
    local2 = GUESSEDcheckvalue_32($16, $0B)
    local2\Field5 = "RArmHand"
    local2\Field0 = -0.5
    local2\Field2 = 1.0
    local2\Field1 = 0.0
    local2\Field8 = 90.0
    local2\Field4 = -90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.5
    local2 = GUESSEDcheckvalue_32($29, $0B)
    local2\Field5 = "RArmHand"
    local2\Field0 = -0.5
    local2\Field2 = 1.0
    local2\Field1 = 0.0
    local2\Field8 = 90.0
    local2\Field4 = -90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.5
    local2 = GUESSEDcheckvalue_32($15, $0B)
    local2\Field5 = "RArmHand"
    local2\Field0 = -0.5
    local2\Field2 = 1.0
    local2\Field1 = 0.0
    local2\Field8 = 90.0
    local2\Field4 = -90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.5
    local2 = GUESSEDcheckvalue_32($13, $0B)
    local2\Field5 = "RArmHand"
    local2\Field0 = -0.5
    local2\Field2 = 1.0
    local2\Field1 = 0.0
    local2\Field8 = 90.0
    local2\Field4 = -90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.5
    local2 = GUESSEDcheckvalue_32($14, $0B)
    local2\Field5 = "RArmHand"
    local2\Field0 = -0.5
    local2\Field2 = 1.0
    local2\Field1 = 0.0
    local2\Field8 = 90.0
    local2\Field4 = -90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.5
    local2 = GUESSEDcheckvalue_32($1B, $0B)
    local2\Field5 = "RArmHand"
    local2\Field0 = 0.4
    local2\Field7 = 0.05
    local2 = GUESSEDcheckvalue_32($1A, $0B)
    local2\Field5 = "RArmHand"
    local2\Field2 = 0.5
    local2\Field1 = 0.5
    local2\Field7 = 0.05
    local2 = GUESSEDcheckvalue_32($1F9, $0B)
    local2\Field5 = "RArmHand"
    local2\Field0 = -0.032
    local2\Field2 = 0.236
    local2\Field1 = 0.258
    local2\Field8 = -17.0
    local2\Field4 = -168.0
    local2\Field3 = 3.55
    local2\Field7 = 0.146
    local2 = GUESSEDcheckvalue_32($1F6, $0B)
    local2\Field5 = "RArmHand"
    local2\Field0 = -0.032
    local2\Field2 = 0.236
    local2\Field1 = 0.258
    local2\Field8 = -17.0
    local2\Field4 = -168.0
    local2\Field3 = 3.55
    local2\Field7 = 0.146
    local2 = GUESSEDcheckvalue_32($1F7, $0B)
    local2\Field5 = "RArmHand"
    local2\Field0 = -0.032
    local2\Field2 = 0.236
    local2\Field1 = 0.258
    local2\Field8 = -17.0
    local2\Field4 = -168.0
    local2\Field3 = 3.55
    local2\Field7 = 0.146
    local2 = GUESSEDcheckvalue_32($1F8, $0B)
    local2\Field5 = "RArmHand"
    local2\Field0 = -0.212
    local2\Field2 = 0.416
    local2\Field1 = 0.206
    local2\Field8 = 0.0
    local2\Field4 = -107.0
    local2\Field3 = 94.0
    local2\Field7 = 0.673
    local2 = GUESSEDcheckvalue_32($1C, $0B)
    local2\Field5 = "NeckHead"
    local2\Field2 = -0.7
    local2\Field1 = 0.6
    local2\Field4 = 180.0
    local2\Field7 = 0.15
    local2 = GUESSEDcheckvalue_32($1D, $0B)
    local2\Field5 = "NeckHead"
    local2\Field0 = 0.0
    local2\Field2 = 0.22
    local2\Field1 = -0.11
    local2\Field7 = 0.15
    local2 = GUESSEDcheckvalue_32($08, $0B)
    local2\Field5 = "NeckHead"
    local2\Field0 = 0.0
    local2\Field2 = 0.3
    local2\Field1 = 0.5
    local2\Field7 = 0.13
    GUESSEDcheckvalue_3($08, $0B, $09, $FFFFFFFF)
    GUESSEDcheckvalue_3($08, $0B, $0A, $FFFFFFFF)
    GUESSEDcheckvalue_3($08, $0B, $0B, $FFFFFFFF)
    GUESSEDcheckvalue_3($08, $0B, $0C, $FFFFFFFF)
    local2 = GUESSEDcheckvalue_32($0F, $0B)
    local2\Field5 = "NeckHead"
    local2\Field0 = 0.0
    local2\Field2 = 0.7
    local2\Field1 = 0.2
    local2\Field7 = 0.7
    GUESSEDcheckvalue_3($0F, $0B, $10, $FFFFFFFF)
    GUESSEDcheckvalue_3($0F, $0B, $0E, $FFFFFFFF)
    local2 = GUESSEDcheckvalue_32($0D, $0B)
    local2\Field5 = "Spine3"
    local2\Field0 = 0.0
    local2\Field2 = 1.1
    local2\Field1 = 0.6
    local2\Field8 = 70.0
    local2\Field7 = 0.13
    local2 = GUESSEDcheckvalue_32($11, $0B)
    local2\Field5 = "RArmIndex2"
    local2\Field7 = 2.0
    GUESSEDcheckvalue_3($11, $0B, $12, $FFFFFFFF)
    local2 = GUESSEDcheckvalue_32($19, $09)
    local2\Field5 = "Hand.R"
    local2\Field0 = (1.0 / -7.19844)
    local2\Field2 = 0.787846
    local2\Field1 = 0.0
    local2\Field8 = 80.0
    local2\Field4 = -90.0
    local2\Field3 = 20.0
    local2\Field7 = 0.6
    local2 = GUESSEDcheckvalue_32($18, $09)
    local2\Field5 = "Hand.R"
    local2\Field0 = (1.0 / -7.19844)
    local2\Field2 = 0.787846
    local2\Field1 = 0.0
    local2\Field8 = 80.0
    local2\Field4 = -90.0
    local2\Field3 = 20.0
    local2\Field7 = 0.6
    local2 = GUESSEDcheckvalue_32($17, $09)
    local2\Field5 = "Hand.R"
    local2\Field0 = (1.0 / -7.19844)
    local2\Field2 = 0.787846
    local2\Field1 = 0.0
    local2\Field8 = 80.0
    local2\Field4 = -90.0
    local2\Field3 = 20.0
    local2\Field7 = 0.6
    local2 = GUESSEDcheckvalue_32($28, $09)
    local2\Field5 = "Hand.R"
    local2\Field0 = (1.0 / -7.19844)
    local2\Field2 = 0.787846
    local2\Field1 = 0.0
    local2\Field8 = 80.0
    local2\Field4 = -90.0
    local2\Field3 = 20.0
    local2\Field7 = 0.6
    local2 = GUESSEDcheckvalue_32($1E, $09)
    local2\Field5 = "Hand.R"
    local2\Field0 = (1.0 / -7.19844)
    local2\Field2 = 0.787846
    local2\Field1 = 0.0
    local2\Field8 = 80.0
    local2\Field4 = -90.0
    local2\Field3 = 20.0
    local2\Field7 = 0.6
    local2 = GUESSEDcheckvalue_32($1F, $09)
    local2\Field5 = "Hand.R"
    local2\Field0 = (1.0 / -7.19844)
    local2\Field2 = 0.787846
    local2\Field1 = 0.0
    local2\Field8 = 80.0
    local2\Field4 = -90.0
    local2\Field3 = 20.0
    local2\Field7 = 0.6
    local2 = GUESSEDcheckvalue_32($26, $09)
    local2\Field5 = "Hand.R"
    local2\Field0 = (1.0 / -7.19844)
    local2\Field2 = 0.787846
    local2\Field1 = 0.0
    local2\Field8 = 80.0
    local2\Field4 = -90.0
    local2\Field3 = 20.0
    local2\Field7 = 0.6
    local2 = GUESSEDcheckvalue_32($20, $09)
    local2\Field5 = "Hand.R"
    local2\Field0 = (1.0 / -7.19844)
    local2\Field2 = 0.0
    local2\Field1 = 0.0
    local2\Field8 = 80.0
    local2\Field4 = -90.0
    local2\Field3 = 20.0
    local2\Field7 = 0.6
    local2 = GUESSEDcheckvalue_32($27, $09)
    local2\Field5 = "Hand.R"
    local2\Field0 = (1.0 / -7.19844)
    local2\Field2 = 0.0
    local2\Field1 = 0.0
    local2\Field8 = 80.0
    local2\Field4 = -90.0
    local2\Field3 = 20.0
    local2\Field7 = 0.6
    local2 = GUESSEDcheckvalue_32($16, $09)
    local2\Field5 = "Hand.R"
    local2\Field0 = (1.0 / -7.19844)
    local2\Field2 = 0.787846
    local2\Field1 = 0.0
    local2\Field8 = 80.0
    local2\Field4 = -90.0
    local2\Field3 = 20.0
    local2\Field7 = 0.6
    local2 = GUESSEDcheckvalue_32($29, $09)
    local2\Field5 = "Hand.R"
    local2\Field0 = (1.0 / -7.19844)
    local2\Field2 = 0.787846
    local2\Field1 = 0.0
    local2\Field8 = 80.0
    local2\Field4 = -90.0
    local2\Field3 = 20.0
    local2\Field7 = 0.6
    local2 = GUESSEDcheckvalue_32($15, $09)
    local2\Field5 = "Hand.R"
    local2\Field0 = (1.0 / -7.19844)
    local2\Field2 = 0.787846
    local2\Field1 = 0.0
    local2\Field8 = 80.0
    local2\Field4 = -90.0
    local2\Field3 = 20.0
    local2\Field7 = 0.58
    local2 = GUESSEDcheckvalue_32($13, $09)
    local2\Field5 = "Hand.R"
    local2\Field0 = (1.0 / -7.19844)
    local2\Field2 = 0.787846
    local2\Field1 = 0.0
    local2\Field8 = 80.0
    local2\Field4 = -90.0
    local2\Field3 = 20.0
    local2\Field7 = 0.6
    local2 = GUESSEDcheckvalue_32($14, $09)
    local2\Field5 = "Hand.R"
    local2\Field0 = (1.0 / -7.19844)
    local2\Field2 = 0.787846
    local2\Field1 = 0.0
    local2\Field8 = 80.0
    local2\Field4 = -90.0
    local2\Field3 = 20.0
    local2\Field7 = 0.6
    local2 = GUESSEDcheckvalue_32($1B, $09)
    local2\Field5 = "Hand.R"
    local2\Field0 = -0.4
    local2\Field2 = -0.5
    local2\Field1 = 0.0
    local2\Field8 = 0.0
    local2\Field4 = 0.0
    local2\Field3 = 0.0
    local2\Field7 = 0.05
    local2 = GUESSEDcheckvalue_32($1A, $09)
    local2\Field5 = "Hand.R"
    local2\Field0 = 0.2
    local2\Field2 = 0.2
    local2\Field1 = 0.2
    local2\Field8 = 90.0
    local2\Field4 = 90.0
    local2\Field3 = 0.0
    local2\Field7 = 0.05
    local2 = GUESSEDcheckvalue_32($1F9, $09)
    local2\Field5 = "Hand.R"
    local2\Field0 = 0.23
    local2\Field2 = 0.17
    local2\Field1 = -0.074
    local2\Field8 = 0.0
    local2\Field4 = 90.0
    local2\Field3 = -2.9
    local2\Field7 = 0.1311
    local2 = GUESSEDcheckvalue_32($1F6, $09)
    local2\Field5 = "Hand.R"
    local2\Field0 = 0.23
    local2\Field2 = 0.17
    local2\Field1 = -0.074
    local2\Field8 = 0.0
    local2\Field4 = 90.0
    local2\Field3 = -2.9
    local2\Field7 = 0.1311
    local2 = GUESSEDcheckvalue_32($1F7, $09)
    local2\Field5 = "Hand.R"
    local2\Field0 = 0.23
    local2\Field2 = 0.17
    local2\Field1 = -0.074
    local2\Field8 = 0.0
    local2\Field4 = 90.0
    local2\Field3 = -2.9
    local2\Field7 = 0.1311
    local2 = GUESSEDcheckvalue_32($1F8, $09)
    local2\Field5 = "Hand.R"
    local2\Field0 = 0.101
    local2\Field2 = 0.31
    local2\Field1 = 0.176
    local2\Field8 = -8.0
    local2\Field4 = 172.0
    local2\Field3 = 100.0
    local2\Field7 = 0.62
    local2 = GUESSEDcheckvalue_32($1C, $09)
    local2\Field5 = "Head"
    local2\Field0 = 0.0
    local2\Field2 = -0.144
    local2\Field1 = 0.794
    local2\Field8 = 7.95
    local2\Field4 = 180.0
    local2\Field3 = 0.0
    local2\Field7 = 0.12
    local2 = GUESSEDcheckvalue_32($07, $09)
    local2\Field5 = "Head"
    local2\Field0 = 0.0
    local2\Field2 = 0.19
    local2\Field1 = 0.0
    local2\Field7 = 0.115
    local2\Field6 = $01
    local2 = GUESSEDcheckvalue_32($1D, $09)
    local2\Field5 = "Head"
    local2\Field0 = 0.0
    local2\Field2 = 0.19
    local2\Field1 = 0.0
    local2\Field7 = 0.115
    local2 = GUESSEDcheckvalue_32($08, $09)
    local2\Field5 = "Head"
    local2\Field0 = 0.0
    local2\Field2 = 0.35
    local2\Field1 = 0.6
    local2\Field7 = 0.12
    GUESSEDcheckvalue_3($08, $09, $09, $FFFFFFFF)
    GUESSEDcheckvalue_3($08, $09, $0A, $FFFFFFFF)
    GUESSEDcheckvalue_3($08, $09, $0B, $FFFFFFFF)
    GUESSEDcheckvalue_3($08, $09, $0C, $FFFFFFFF)
    local2 = GUESSEDcheckvalue_32($0F, $09)
    local2\Field5 = "Head"
    local2\Field0 = 0.0
    local2\Field2 = 0.6
    local2\Field1 = 0.26
    local2\Field4 = 0.0
    local2\Field7 = 0.55
    GUESSEDcheckvalue_3($0F, $09, $10, $FFFFFFFF)
    GUESSEDcheckvalue_3($0F, $09, $0E, $FFFFFFFF)
    local2 = GUESSEDcheckvalue_32($0D, $09)
    local2\Field5 = "Chest"
    local2\Field0 = 0.0
    local2\Field2 = 1.6
    local2\Field1 = 0.85
    local2\Field8 = 80.0
    local2\Field7 = 0.13
    local2 = GUESSEDcheckvalue_32($11, $09)
    local2\Field5 = "Fingers02.R"
    local2\Field7 = 2.0
    local2\Field0 = -0.06
    local2\Field2 = 0.0
    local2\Field1 = -0.03
    GUESSEDcheckvalue_3($11, $09, $12, $FFFFFFFF)
    local2 = GUESSEDcheckvalue_32($19, $10)
    local2\Field5 = "Anim_Attachment_RH"
    local2\Field0 = 0.0
    local2\Field2 = 3.0
    local2\Field1 = 4.5
    local2\Field8 = 0.0
    local2\Field4 = 180.0
    local2\Field3 = -70.0
    local2\Field7 = 4.6
    local2 = GUESSEDcheckvalue_32($18, $10)
    local2\Field5 = "Anim_Attachment_RH"
    local2\Field0 = 0.0
    local2\Field2 = 3.0
    local2\Field1 = 4.5
    local2\Field8 = 0.0
    local2\Field4 = 180.0
    local2\Field3 = -70.0
    local2\Field7 = 4.6
    local2 = GUESSEDcheckvalue_32($17, $10)
    local2\Field5 = "Anim_Attachment_RH"
    local2\Field0 = 0.0
    local2\Field2 = 3.0
    local2\Field1 = 4.5
    local2\Field8 = 0.0
    local2\Field4 = 180.0
    local2\Field3 = -70.0
    local2\Field7 = 4.6
    local2 = GUESSEDcheckvalue_32($28, $10)
    local2\Field5 = "Anim_Attachment_RH"
    local2\Field0 = 0.0
    local2\Field2 = 3.0
    local2\Field1 = 4.5
    local2\Field8 = 0.0
    local2\Field4 = 180.0
    local2\Field3 = -70.0
    local2\Field7 = 4.6
    local2 = GUESSEDcheckvalue_32($1E, $10)
    local2\Field5 = "Anim_Attachment_RH"
    local2\Field0 = 0.0
    local2\Field2 = 3.0
    local2\Field1 = 4.5
    local2\Field8 = 0.0
    local2\Field4 = 180.0
    local2\Field3 = -70.0
    local2\Field7 = 4.6
    local2 = GUESSEDcheckvalue_32($1F, $10)
    local2\Field5 = "Anim_Attachment_RH"
    local2\Field0 = 0.0
    local2\Field2 = 3.0
    local2\Field1 = 4.5
    local2\Field8 = 0.0
    local2\Field4 = 180.0
    local2\Field3 = -70.0
    local2\Field7 = 4.6
    local2 = GUESSEDcheckvalue_32($26, $10)
    local2\Field5 = "Anim_Attachment_RH"
    local2\Field0 = 0.0
    local2\Field2 = 3.0
    local2\Field1 = 4.5
    local2\Field8 = 0.0
    local2\Field4 = 180.0
    local2\Field3 = -70.0
    local2\Field7 = 4.6
    local2 = GUESSEDcheckvalue_32($20, $10)
    local2\Field5 = "Anim_Attachment_RH"
    local2\Field0 = 0.0
    local2\Field2 = 0.0
    local2\Field1 = 4.5
    local2\Field8 = 0.0
    local2\Field4 = 180.0
    local2\Field3 = -70.0
    local2\Field7 = 4.6
    local2 = GUESSEDcheckvalue_32($27, $10)
    local2\Field5 = "Anim_Attachment_RH"
    local2\Field0 = 0.0
    local2\Field2 = 0.0
    local2\Field1 = 4.5
    local2\Field8 = 0.0
    local2\Field4 = 180.0
    local2\Field3 = -70.0
    local2\Field7 = 4.6
    local2 = GUESSEDcheckvalue_32($16, $10)
    local2\Field5 = "Anim_Attachment_RH"
    local2\Field0 = 0.0
    local2\Field2 = 3.0
    local2\Field1 = 4.5
    local2\Field8 = 0.0
    local2\Field4 = 180.0
    local2\Field3 = -70.0
    local2\Field7 = 4.6
    local2 = GUESSEDcheckvalue_32($29, $10)
    local2\Field5 = "Anim_Attachment_RH"
    local2\Field0 = 0.0
    local2\Field2 = 3.0
    local2\Field1 = 4.5
    local2\Field8 = 0.0
    local2\Field4 = 180.0
    local2\Field3 = -70.0
    local2\Field7 = 4.6
    local2 = GUESSEDcheckvalue_32($15, $10)
    local2\Field5 = "Anim_Attachment_RH"
    local2\Field0 = 0.0
    local2\Field2 = 3.0
    local2\Field1 = 4.5
    local2\Field8 = 0.0
    local2\Field4 = 180.0
    local2\Field3 = -70.0
    local2\Field7 = 4.6
    local2 = GUESSEDcheckvalue_32($13, $10)
    local2\Field5 = "Anim_Attachment_RH"
    local2\Field0 = 0.0
    local2\Field2 = 3.0
    local2\Field1 = 4.5
    local2\Field8 = 0.0
    local2\Field4 = 180.0
    local2\Field3 = -70.0
    local2\Field7 = 4.6
    local2 = GUESSEDcheckvalue_32($14, $10)
    local2\Field5 = "Anim_Attachment_RH"
    local2\Field0 = 0.0
    local2\Field2 = 3.0
    local2\Field1 = 4.5
    local2\Field8 = 0.0
    local2\Field4 = 180.0
    local2\Field3 = -70.0
    local2\Field7 = 4.6
    local2 = GUESSEDcheckvalue_32($1B, $10)
    local2\Field5 = "Bip01_R_Wrist"
    local2\Field0 = 1.0
    local2\Field2 = 0.0
    local2\Field1 = -3.8
    local2\Field8 = 90.0
    local2\Field4 = 0.0
    local2\Field3 = 90.0
    local2\Field7 = 0.383
    local2 = GUESSEDcheckvalue_32($1A, $10)
    local2\Field5 = "Anim_Attachment_RH"
    local2\Field0 = 0.0
    local2\Field2 = -1.0
    local2\Field1 = 0.0
    local2\Field8 = 0.0
    local2\Field4 = 0.0
    local2\Field3 = 90.0
    local2\Field7 = 0.383
    local2 = GUESSEDcheckvalue_32($1F9, $10)
    local2\Field5 = "Anim_Attachment_RH"
    local2\Field0 = 0.0
    local2\Field2 = 0.0
    local2\Field1 = 0.0
    local2\Field8 = 1.07
    local2\Field4 = -85.0
    local2\Field3 = 69.1
    local2\Field7 = 1.0
    local2 = GUESSEDcheckvalue_32($1F6, $10)
    local2\Field5 = "Anim_Attachment_RH"
    local2\Field0 = 0.0
    local2\Field2 = 0.0
    local2\Field1 = 0.0
    local2\Field8 = 1.07
    local2\Field4 = -85.0
    local2\Field3 = 69.1
    local2\Field7 = 1.0
    local2 = GUESSEDcheckvalue_32($1F7, $10)
    local2\Field5 = "Anim_Attachment_RH"
    local2\Field0 = 0.0
    local2\Field2 = 0.0
    local2\Field1 = 0.0
    local2\Field8 = 1.07
    local2\Field4 = -85.0
    local2\Field3 = 69.1
    local2\Field7 = 1.0
    local2 = GUESSEDcheckvalue_32($1F8, $10)
    local2\Field5 = "Anim_Attachment_RH"
    local2\Field0 = 0.51
    local2\Field2 = 2.34
    local2\Field1 = -0.72
    local2\Field8 = 84.61
    local2\Field4 = -21.0
    local2\Field3 = -58.0
    local2\Field7 = 5.0
    local2 = GUESSEDcheckvalue_32($1C, $10)
    local2\Field5 = "Bip01_Head1"
    local2\Field0 = 1.1
    local2\Field2 = -7.2
    local2\Field1 = 0.015
    local2\Field8 = -72.0
    local2\Field4 = -98.0
    local2\Field3 = -9.6
    local2\Field7 = 1.1
    local2 = GUESSEDcheckvalue_32($07, $10)
    local2\Field5 = "Bip01_Head1"
    local2\Field0 = -3.3
    local2\Field2 = 1.0
    local2\Field1 = 0.0
    local2\Field8 = 90.0
    local2\Field4 = 0.0
    local2\Field3 = 90.0
    local2\Field7 = 1.02
    local2\Field6 = $02
    local2 = GUESSEDcheckvalue_32($1D, $10)
    local2\Field5 = "Bip01_Head1"
    local2\Field0 = -3.3
    local2\Field2 = 1.0
    local2\Field1 = 0.0
    local2\Field7 = 1.02
    local2\Field8 = 90.0
    local2\Field4 = 0.0
    local2\Field3 = 90.0
    local2 = GUESSEDcheckvalue_32($08, $10)
    local2\Field5 = "Bip01_Head1"
    local2\Field0 = -4.7
    local2\Field2 = -3.8
    local2\Field1 = 0.0
    local2\Field7 = 1.07
    local2\Field8 = 83.0
    local2\Field4 = 80.0
    local2\Field3 = 8.75
    GUESSEDcheckvalue_3($08, $10, $09, $FFFFFFFF)
    GUESSEDcheckvalue_3($08, $10, $0A, $FFFFFFFF)
    GUESSEDcheckvalue_3($08, $10, $0B, $FFFFFFFF)
    GUESSEDcheckvalue_3($08, $10, $0C, $FFFFFFFF)
    local2 = GUESSEDcheckvalue_32($0F, $10)
    local2\Field5 = "Bip01_Head1"
    local2\Field0 = -5.3
    local2\Field2 = -1.6
    local2\Field1 = 0.0
    local2\Field7 = 5.3
    local2\Field8 = 90.0
    local2\Field4 = 0.0
    local2\Field3 = 90.0
    GUESSEDcheckvalue_3($0F, $10, $10, $FFFFFFFF)
    GUESSEDcheckvalue_3($0F, $10, $0E, $FFFFFFFF)
    local2 = GUESSEDcheckvalue_32($0D, $10)
    local2\Field5 = "Bip01_Spine4"
    local2\Field0 = -2.0
    local2\Field2 = 7.0
    local2\Field1 = 0.0
    local2\Field8 = 200.0
    local2\Field4 = 90.0
    local2\Field3 = 180.0
    local2\Field7 = 1.3
    local2 = GUESSEDcheckvalue_32($11, $10)
    local2\Field5 = "Bip01_R_Finger21"
    local2\Field7 = 10.0
    local2\Field8 = 90.0
    local2\Field4 = 0.0
    local2\Field3 = 90.0
    GUESSEDcheckvalue_3($11, $10, $12, $FFFFFFFF)
    local2 = GUESSEDcheckvalue_32($19, $0A)
    local2\Field5 = "hand_R"
    local2\Field0 = 0.353485
    local2\Field2 = 0.87467
    local2\Field1 = 0.0
    local2\Field8 = 110.0
    local2\Field4 = 90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.55
    local2 = GUESSEDcheckvalue_32($18, $0A)
    local2\Field5 = "hand_R"
    local2\Field0 = 0.353485
    local2\Field2 = 0.87467
    local2\Field1 = 0.0
    local2\Field8 = 110.0
    local2\Field4 = 90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.55
    local2 = GUESSEDcheckvalue_32($17, $0A)
    local2\Field5 = "hand_R"
    local2\Field0 = 0.353485
    local2\Field2 = 0.87467
    local2\Field1 = 0.0
    local2\Field8 = 110.0
    local2\Field4 = 90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.55
    local2 = GUESSEDcheckvalue_32($28, $0A)
    local2\Field5 = "hand_R"
    local2\Field0 = 0.353485
    local2\Field2 = 0.87467
    local2\Field1 = 0.0
    local2\Field8 = 110.0
    local2\Field4 = 90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.55
    local2 = GUESSEDcheckvalue_32($1E, $0A)
    local2\Field5 = "hand_R"
    local2\Field0 = 0.353485
    local2\Field2 = 0.87467
    local2\Field1 = 0.0
    local2\Field8 = 110.0
    local2\Field4 = 90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.55
    local2 = GUESSEDcheckvalue_32($1F, $0A)
    local2\Field5 = "hand_R"
    local2\Field0 = 0.353485
    local2\Field2 = 0.87467
    local2\Field1 = 0.0
    local2\Field8 = 110.0
    local2\Field4 = 90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.55
    local2 = GUESSEDcheckvalue_32($26, $0A)
    local2\Field5 = "hand_R"
    local2\Field0 = 0.353485
    local2\Field2 = 0.87467
    local2\Field1 = 0.0
    local2\Field8 = 110.0
    local2\Field4 = 90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.55
    local2 = GUESSEDcheckvalue_32($20, $0A)
    local2\Field5 = "hand_R"
    local2\Field0 = 0.353485
    local2\Field2 = 0.0
    local2\Field1 = 0.0
    local2\Field8 = 110.0
    local2\Field4 = 90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.55
    local2 = GUESSEDcheckvalue_32($27, $0A)
    local2\Field5 = "hand_R"
    local2\Field0 = 0.353485
    local2\Field2 = 0.0
    local2\Field1 = 0.0
    local2\Field8 = 110.0
    local2\Field4 = 90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.55
    local2 = GUESSEDcheckvalue_32($16, $0A)
    local2\Field5 = "hand_R"
    local2\Field0 = 0.353485
    local2\Field2 = 0.87467
    local2\Field1 = 0.0
    local2\Field8 = 110.0
    local2\Field4 = 90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.55
    local2 = GUESSEDcheckvalue_32($29, $0A)
    local2\Field5 = "hand_R"
    local2\Field0 = 0.353485
    local2\Field2 = 0.87467
    local2\Field1 = 0.0
    local2\Field8 = 110.0
    local2\Field4 = 90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.55
    local2 = GUESSEDcheckvalue_32($15, $0A)
    local2\Field5 = "hand_R"
    local2\Field0 = 0.353485
    local2\Field2 = 0.87467
    local2\Field1 = 0.0
    local2\Field8 = 110.0
    local2\Field4 = 90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.55
    local2 = GUESSEDcheckvalue_32($13, $0A)
    local2\Field5 = "hand_R"
    local2\Field0 = 0.353485
    local2\Field2 = 0.87467
    local2\Field1 = 0.0
    local2\Field8 = 110.0
    local2\Field4 = 90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.55
    local2 = GUESSEDcheckvalue_32($14, $0A)
    local2\Field5 = "hand_R"
    local2\Field0 = 0.353485
    local2\Field2 = 0.87467
    local2\Field1 = 0.0
    local2\Field8 = 110.0
    local2\Field4 = 90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.55
    local2 = GUESSEDcheckvalue_32($1B, $0A)
    local2\Field5 = "hand_R"
    local2\Field0 = -0.4
    local2\Field7 = 0.05
    local2 = GUESSEDcheckvalue_32($1A, $0A)
    local2\Field5 = "hand_R"
    local2\Field2 = 0.3
    local2\Field7 = 0.05
    local2 = GUESSEDcheckvalue_32($1F9, $0A)
    local2\Field5 = "hand_L"
    local2\Field0 = -0.108
    local2\Field2 = 0.206
    local2\Field1 = 0.22
    local2\Field7 = 0.131
    local2 = GUESSEDcheckvalue_32($1F6, $0A)
    local2\Field5 = "hand_L"
    local2\Field0 = -0.108
    local2\Field2 = 0.206
    local2\Field1 = 0.22
    local2\Field7 = 0.131
    local2 = GUESSEDcheckvalue_32($1F7, $0A)
    local2\Field5 = "hand_L"
    local2\Field0 = -0.108
    local2\Field2 = 0.206
    local2\Field1 = 0.22
    local2\Field7 = 0.131
    local2 = GUESSEDcheckvalue_32($1F8, $0A)
    local2\Field5 = "hand_R"
    local2\Field0 = 0.15
    local2\Field2 = 0.428
    local2\Field1 = -0.17
    local2\Field8 = 0.0
    local2\Field4 = 88.55
    local2\Field3 = -69.51
    local2\Field7 = 0.5629
    local2 = GUESSEDcheckvalue_32($1C, $0A)
    local2\Field5 = "head"
    local2\Field0 = -0.7
    local2\Field2 = -0.4
    local2\Field1 = 0.0
    local2\Field4 = -90.0
    local2\Field3 = 0.0
    local2\Field7 = 0.14
    local2 = GUESSEDcheckvalue_32($1D, $0A)
    local2\Field5 = "head"
    local2\Field0 = 0.2
    local2\Field2 = 0.18
    local2\Field1 = 0.0
    local2\Field4 = 90.0
    local2\Field3 = 0.0
    local2\Field7 = 0.14
    local2 = GUESSEDcheckvalue_32($08, $0A)
    local2\Field5 = "head"
    local2\Field0 = -0.4
    local2\Field2 = 0.4
    local2\Field1 = 0.0
    local2\Field4 = 90.0
    local2\Field7 = 0.13
    GUESSEDcheckvalue_3($08, $0A, $09, $FFFFFFFF)
    GUESSEDcheckvalue_3($08, $0A, $0A, $FFFFFFFF)
    GUESSEDcheckvalue_3($08, $0A, $0B, $FFFFFFFF)
    GUESSEDcheckvalue_3($08, $0A, $0C, $FFFFFFFF)
    local2 = GUESSEDcheckvalue_32($0F, $0A)
    local2\Field5 = "head"
    local2\Field0 = -0.15
    local2\Field2 = 0.6
    local2\Field1 = 0.0
    local2\Field4 = 90.0
    local2\Field7 = 0.7
    GUESSEDcheckvalue_3($0F, $0A, $10, $FFFFFFFF)
    GUESSEDcheckvalue_3($0F, $0A, $0E, $FFFFFFFF)
    local2 = GUESSEDcheckvalue_32($0D, $0A)
    local2\Field5 = "chest"
    local2\Field0 = -0.85
    local2\Field2 = 1.0
    local2\Field1 = 0.0
    local2\Field8 = 80.0
    local2\Field4 = 90.0
    local2\Field7 = 0.13
    local2 = GUESSEDcheckvalue_32($11, $0A)
    local2\Field5 = "f_index_01_R"
    local2\Field7 = 2.0
    GUESSEDcheckvalue_3($11, $0A, $12, $FFFFFFFF)
    GUESSEDcheckvalue_3($01, $01, $01, $0C)
    GUESSEDcheckvalue_3($01, $01, $02, $0C)
    GUESSEDcheckvalue_3($01, $01, $03, $0C)
    GUESSEDcheckvalue_3($01, $01, $04, $0C)
    GUESSEDcheckvalue_3($08, $01, $08, $0C)
    GUESSEDcheckvalue_3($08, $01, $09, $0C)
    GUESSEDcheckvalue_3($08, $01, $0A, $0C)
    GUESSEDcheckvalue_3($08, $01, $0B, $0C)
    GUESSEDcheckvalue_3($08, $01, $0C, $0C)
    GUESSEDcheckvalue_3($0F, $01, $0F, $0C)
    GUESSEDcheckvalue_3($0F, $01, $10, $0C)
    GUESSEDcheckvalue_3($0F, $01, $0E, $0C)
    GUESSEDcheckvalue_3($0D, $01, $0D, $0C)
    GUESSEDcheckvalue_3($05, $01, $05, $0C)
    GUESSEDcheckvalue_3($06, $01, $06, $0C)
    GUESSEDcheckvalue_3($07, $01, $07, $0C)
    GUESSEDcheckvalue_3($1D, $01, $1D, $0C)
    GUESSEDcheckvalue_3($11, $01, $11, $0C)
    GUESSEDcheckvalue_3($19, $01, $19, $0C)
    GUESSEDcheckvalue_3($18, $01, $18, $0C)
    GUESSEDcheckvalue_3($17, $01, $17, $0C)
    GUESSEDcheckvalue_3($1E, $01, $1E, $0C)
    GUESSEDcheckvalue_3($1F, $01, $1F, $0C)
    GUESSEDcheckvalue_3($20, $01, $20, $0C)
    GUESSEDcheckvalue_3($27, $01, $27, $0C)
    GUESSEDcheckvalue_3($28, $01, $28, $0C)
    GUESSEDcheckvalue_3($26, $01, $26, $0C)
    GUESSEDcheckvalue_3($16, $01, $16, $0C)
    GUESSEDcheckvalue_3($29, $01, $29, $0C)
    GUESSEDcheckvalue_3($15, $01, $15, $0C)
    GUESSEDcheckvalue_3($13, $01, $13, $0C)
    GUESSEDcheckvalue_3($14, $01, $14, $0C)
    GUESSEDcheckvalue_3($01, $01, $01, $11)
    GUESSEDcheckvalue_3($01, $01, $02, $11)
    GUESSEDcheckvalue_3($01, $01, $03, $11)
    GUESSEDcheckvalue_3($01, $01, $04, $11)
    GUESSEDcheckvalue_3($08, $01, $08, $11)
    GUESSEDcheckvalue_3($08, $01, $09, $11)
    GUESSEDcheckvalue_3($08, $01, $0A, $11)
    GUESSEDcheckvalue_3($08, $01, $0B, $11)
    GUESSEDcheckvalue_3($08, $01, $0C, $11)
    GUESSEDcheckvalue_3($0F, $01, $0F, $11)
    GUESSEDcheckvalue_3($0F, $01, $10, $11)
    GUESSEDcheckvalue_3($0F, $01, $0E, $11)
    GUESSEDcheckvalue_3($0D, $01, $0D, $11)
    GUESSEDcheckvalue_3($05, $01, $05, $11)
    GUESSEDcheckvalue_3($06, $01, $06, $11)
    GUESSEDcheckvalue_3($07, $01, $07, $11)
    GUESSEDcheckvalue_3($1D, $01, $1D, $11)
    GUESSEDcheckvalue_3($11, $01, $11, $11)
    GUESSEDcheckvalue_3($19, $01, $19, $11)
    GUESSEDcheckvalue_3($18, $01, $18, $11)
    GUESSEDcheckvalue_3($17, $01, $17, $11)
    GUESSEDcheckvalue_3($1E, $01, $1E, $11)
    GUESSEDcheckvalue_3($1F, $01, $1F, $11)
    GUESSEDcheckvalue_3($20, $01, $20, $11)
    GUESSEDcheckvalue_3($27, $01, $27, $11)
    GUESSEDcheckvalue_3($28, $01, $28, $11)
    GUESSEDcheckvalue_3($26, $01, $26, $11)
    GUESSEDcheckvalue_3($16, $01, $16, $11)
    GUESSEDcheckvalue_3($29, $01, $29, $11)
    GUESSEDcheckvalue_3($15, $01, $15, $11)
    GUESSEDcheckvalue_3($13, $01, $13, $11)
    GUESSEDcheckvalue_3($14, $01, $14, $11)
    GUESSEDcheckvalue_4($00, "GFX\Items\Weapons\Hands_textures\class_d_w_hands.png", $01)
    GUESSEDcheckvalue_4($02, "GFX\Items\Weapons\Hands_textures\class_d_b_hands.png", $01)
    GUESSEDcheckvalue_4($12, "GFX\Items\Weapons\Hands_textures\chaos_hands.png", $01)
    GUESSEDcheckvalue_4($1D, "GFX\Items\Weapons\Hands_textures\chaos_hands.png", $01)
    GUESSEDcheckvalue_4($20, "GFX\Items\Weapons\Hands_textures\chaos_hands.png", $01)
    GUESSEDcheckvalue_4($13, "GFX\Items\Weapons\Hands_textures\mtf_hands.png", $01)
    GUESSEDcheckvalue_4($1A, "GFX\Items\Weapons\Hands_textures\guard_hands.png", $01)
    GUESSEDcheckvalue_4($1B, "GFX\Items\Weapons\Hands_textures\mtf_hands_sergant.png", $01)
    GUESSEDcheckvalue_4($19, "GFX\Items\Weapons\Hands_textures\mtf_hands_captain.png", $01)
    GUESSEDcheckvalue_4($14, "GFX\Items\Weapons\Hands_textures\guard_hands.png", $01)
    GUESSEDcheckvalue_4($07, "GFX\Items\Weapons\Hands_textures\hazmat_arms.png", $01)
    GUESSEDcheckvalue_4($09, "GFX\Items\Weapons\Hands_textures\heavy_hazmat_arms.png", $01)
    GUESSEDcheckvalue_4($1E, "GFX\Items\Weapons\Hands_textures\goc_hands.png", $01)
    GUESSEDcreateentity_6($01, "GFX\Items\Weapons\M4A1\m4a1.b3d", $01, $01)
    GUESSEDcallcheckvalue($01, $13)
    local3 = GUESSEDcheckvalue_31($01)
    local3\Field21 = -0.003
    local3\Field31 = 0.0
    local3\Field53 = -0.01
    local3\Field47 = 0.005
    local3\Field13 = 0.027
    local3\Field24 = 8.0
    local3\Field50 = 2.0
    local3\Field32 = 6.363636
    local3\Field57 = $1A4
    local3\Field58 = 1.8
    local3\Field25 = "SFX\Weapons\M4A1\"
    local3\Field12 = "SFX\Weapons\M4A1\reload.ogg"
    local3\Field1 = "SFX\Weapons\M4A1\deploy.ogg"
    local3\Field52 = $1E
    local3\Field6 = $78
    local3\Field18 = 3.5
    local3\Field22 = 210.0
    local3\Field2 = 1.5
    local3\Field41 = -0.01345
    local3\Field43 = 0.0045
    local3\Field20[$01] = PackTwoValues($2D, $2D)
    local3\Field34[$01] = 0.5
    local3\Field20[$03] = PackTwoValues($BC, $CA)
    local3\Field34[$03] = 0.6
    local3\Field20[$02] = PackTwoValues($01, $2B)
    local3\Field34[$02] = 0.6
    local3\Field20[$06] = PackTwoValues($CC, $CC)
    local3\Field34[$06] = 1.0
    local3\Field20[$04] = PackTwoValues($CC, $CC)
    local3\Field34[$04] = 1.0
    local3\Field20[$07] = PackTwoValues($01, $2B)
    local3\Field34[$07] = -1.0
    local3\Field20[$05] = PackTwoValues($33, $9B)
    local3\Field34[$05] = 0.6
    GUESSEDcreateentity_6($02, "GFX\Items\Weapons\Glock\glock.b3d", $00, $01)
    GUESSEDcallcheckvalue($02, $14)
    local3 = GUESSEDcheckvalue_31($02)
    local3\Field21 = 0.0
    local3\Field31 = 0.0
    local3\Field53 = -0.01
    local3\Field47 = 0.005
    local3\Field13 = 0.015
    local3\Field24 = 6.0
    local3\Field50 = 2.6
    local3\Field32 = 17.5
    local3\Field58 = 2.1
    local3\Field57 = $163
    local3\Field25 = "SFX\Weapons\Glock\"
    local3\Field12 = "SFX\Weapons\Glock\reload.ogg"
    local3\Field1 = "SFX\Weapons\Glock\deploy.ogg"
    local3\Field52 = $11
    local3\Field6 = $3C
    local3\Field18 = 2.0
    local3\Field22 = 170.0
    local3\Field41 = -0.01
    local3\Field43 = 0.0056
    local3\Field20[$01] = PackTwoValues($22, $22)
    local3\Field34[$01] = 0.7
    local3\Field20[$03] = PackTwoValues($8B, $AA)
    local3\Field34[$03] = 0.7
    local3\Field20[$02] = PackTwoValues($01, $21)
    local3\Field34[$02] = 0.8
    local3\Field20[$04] = PackTwoValues($C9, $C9)
    local3\Field34[$04] = 1.0
    local3\Field20[$06] = PackTwoValues($C9, $C9)
    local3\Field34[$06] = 1.0
    local3\Field20[$07] = PackTwoValues($01, $21)
    local3\Field34[$07] = -1.2
    local3\Field20[$05] = PackTwoValues($24, $8A)
    local3\Field34[$05] = 0.7
    GUESSEDcreateentity_6($03, "GFX\Items\Weapons\M60\m60.b3d", $01, $01)
    GUESSEDcallcheckvalue($03, $15)
    local3 = GUESSEDcheckvalue_31($03)
    local3\Field21 = 0.0
    local3\Field31 = 0.0
    local3\Field53 = -0.012
    local3\Field47 = 0.005
    local3\Field13 = 0.05
    local3\Field24 = 6.0
    local3\Field50 = 3.0
    local3\Field32 = 8.0
    local3\Field58 = 1.8
    local3\Field57 = $E4
    local3\Field25 = "SFX\Weapons\M60\shoot.ogg"
    local3\Field12 = "SFX\Weapons\M60\reload.ogg"
    local3\Field1 = "SFX\Weapons\M60\deploy.ogg"
    local3\Field52 = $96
    local3\Field6 = $12C
    local3\Field18 = 5.0
    local3\Field22 = 420.0
    local3\Field41 = -0.0265
    local3\Field43 = 0.008
    local3\Field20[$01] = PackTwoValues($D0, $E4)
    local3\Field34[$01] = 0.5
    local3\Field20[$03] = PackTwoValues($E5, $FA)
    local3\Field34[$03] = 0.7
    local3\Field20[$02] = PackTwoValues($01, $1A)
    local3\Field34[$02] = 0.3
    local3\Field20[$04] = PackTwoValues($10F, $10F)
    local3\Field34[$04] = 1.0
    local3\Field20[$06] = PackTwoValues($10F, $10F)
    local3\Field34[$06] = 1.0
    local3\Field20[$07] = PackTwoValues($01, $1A)
    local3\Field34[$07] = -0.6
    local3\Field20[$05] = PackTwoValues($1B, $CF)
    local3\Field34[$05] = 0.5
    GUESSEDcreateentity_6($04, "GFX\Items\Weapons\SR556\SR556.b3d", $01, $01)
    GUESSEDcallcheckvalue($04, $16)
    local3 = GUESSEDcheckvalue_31($04)
    local3\Field21 = 0.0
    local3\Field31 = 0.0
    local3\Field53 = -0.008
    local3\Field47 = 0.005
    local3\Field13 = 0.035
    local3\Field24 = 6.0
    local3\Field50 = 2.2
    local3\Field32 = 10.0
    local3\Field58 = 1.95
    local3\Field57 = $D2
    local3\Field25 = "SFX\Weapons\SR556\"
    local3\Field12 = "SFX\Weapons\SR556\reload.ogg"
    local3\Field1 = "SFX\Weapons\SR556\deploy.ogg"
    local3\Field52 = $14
    local3\Field6 = $78
    local3\Field18 = 3.2
    local3\Field22 = 240.0
    local3\Field41 = -0.0129
    local3\Field43 = 0.001
    local3\Field20[$01] = PackTwoValues($AD, $AD)
    local3\Field34[$01] = 0.5
    local3\Field20[$03] = PackTwoValues($B0, $CB)
    local3\Field34[$03] = 0.8
    local3\Field20[$02] = PackTwoValues($01, $1A)
    local3\Field34[$02] = 0.6
    local3\Field20[$07] = PackTwoValues($01, $1A)
    local3\Field34[$07] = -0.9
    local3\Field20[$04] = PackTwoValues($108, $108)
    local3\Field34[$04] = 1.0
    local3\Field20[$06] = PackTwoValues($108, $108)
    local3\Field34[$06] = 1.0
    local3\Field20[$05] = PackTwoValues($1B, $AC)
    local3\Field34[$05] = 0.7
    GUESSEDcreateentity_6($05, "GFX\Items\Weapons\MP5\MP5.b3d", $01, $01)
    GUESSEDcallcheckvalue($05, $17)
    local3 = GUESSEDcheckvalue_31($05)
    local3\Field21 = 0.0
    local3\Field31 = 0.0
    local3\Field53 = -0.005
    local3\Field47 = 0.005
    local3\Field13 = 0.025
    local3\Field24 = 6.0
    local3\Field50 = 2.1
    local3\Field32 = 6.0
    local3\Field58 = 1.65
    local3\Field57 = $85
    local3\Field25 = "SFX\Weapons\MP5\"
    local3\Field12 = "SFX\Weapons\MP5\reload.ogg"
    local3\Field1 = "SFX\Weapons\MP5\deploy.ogg"
    local3\Field52 = $1E
    local3\Field6 = $96
    local3\Field18 = 3.0
    local3\Field22 = 210.0
    local3\Field41 = -0.0118
    local3\Field43 = 0.003
    local3\Field20[$01] = PackTwoValues($83, $8E)
    local3\Field34[$01] = 0.6
    local3\Field20[$03] = PackTwoValues($98, $A3)
    local3\Field34[$03] = 0.6
    local3\Field20[$02] = PackTwoValues($01, $24)
    local3\Field34[$02] = 0.6
    local3\Field20[$07] = PackTwoValues($01, $24)
    local3\Field34[$07] = -0.9
    local3\Field20[$04] = PackTwoValues($B0, $B0)
    local3\Field34[$04] = 1.0
    local3\Field20[$06] = PackTwoValues($B0, $B0)
    local3\Field34[$06] = 1.0
    local3\Field20[$05] = PackTwoValues($25, $82)
    local3\Field34[$05] = 0.6
    GUESSEDcreateentity_6($07, "GFX\Items\Weapons\krissvector\kriss_vector.b3d", $01, $01)
    GUESSEDcallcheckvalue($07, $19)
    local3 = GUESSEDcheckvalue_31($07)
    local3\Field21 = -0.002
    local3\Field31 = 0.005
    local3\Field53 = -0.012
    local3\Field47 = 0.005
    local3\Field13 = 0.02
    local3\Field24 = 6.0
    local3\Field50 = 1.2
    local3\Field32 = 5.0
    local3\Field58 = 1.5
    local3\Field57 = $1237
    local3\Field25 = "SFX\Weapons\KrissVector\"
    local3\Field12 = "SFX\Weapons\KrissVector\reload.ogg"
    local3\Field1 = "SFX\Weapons\KrissVector\deploy.ogg"
    local3\Field52 = $11
    local3\Field6 = $95
    local3\Field18 = 2.0
    local3\Field22 = 180.0
    local3\Field2 = 1.3
    local3\Field41 = -0.01725
    local3\Field43 = 0.00425
    local3\Field20[$01] = PackTwoValues($21, $36)
    local3\Field34[$01] = 0.75
    local3\Field20[$03] = PackTwoValues($98, $A5)
    local3\Field34[$03] = 0.8
    local3\Field20[$02] = PackTwoValues($01, $20)
    local3\Field34[$02] = 0.7
    local3\Field20[$07] = PackTwoValues($01, $20)
    local3\Field34[$07] = -0.75
    local3\Field20[$04] = PackTwoValues($A6, $A6)
    local3\Field34[$04] = 1.0
    local3\Field20[$06] = PackTwoValues($A6, $A6)
    local3\Field34[$06] = 1.0
    local3\Field20[$05] = PackTwoValues($37, $97)
    local3\Field34[$05] = 0.75
    GUESSEDcreateentity_6($06, "GFX\Items\Weapons\Fiveseven\Fiveseven.b3d", $00, $01)
    GUESSEDcallcheckvalue($06, $18)
    local3 = GUESSEDcheckvalue_31($06)
    local3\Field21 = -0.002
    local3\Field31 = 0.0018
    local3\Field53 = -0.005
    local3\Field37 = -1.0
    local3\Field47 = 0.005
    local3\Field13 = 0.02
    local3\Field24 = 6.0
    local3\Field50 = 2.6
    local3\Field32 = 23.0
    local3\Field58 = 2.1
    local3\Field57 = $61
    local3\Field25 = "SFX\Weapons\FiveSeven\"
    local3\Field12 = "SFX\Weapons\FiveSeven\reload.ogg"
    local3\Field1 = "SFX\Weapons\FiveSeven\deploy.ogg"
    local3\Field52 = $14
    local3\Field6 = $50
    local3\Field18 = 2.0
    local3\Field22 = 170.0
    local3\Field41 = -0.0118
    local3\Field43 = 0.0023
    local3\Field20[$01] = PackTwoValues($22, $22)
    local3\Field34[$01] = 0.7
    local3\Field20[$03] = PackTwoValues($88, $94)
    local3\Field34[$03] = 0.7
    local3\Field20[$02] = PackTwoValues($01, $21)
    local3\Field34[$02] = 0.7
    local3\Field20[$07] = PackTwoValues($01, $21)
    local3\Field34[$07] = -1.0
    local3\Field20[$04] = PackTwoValues($A0, $A0)
    local3\Field34[$04] = 1.0
    local3\Field20[$06] = PackTwoValues($A0, $A0)
    local3\Field34[$06] = 1.0
    local3\Field20[$05] = PackTwoValues($30, $87)
    local3\Field34[$05] = 0.7
    GUESSEDcreateentity_6($0A, "GFX\Items\Weapons\P90\P90.b3d", $01, $01)
    GUESSEDcallcheckvalue($0A, $1E)
    local3 = GUESSEDcheckvalue_31($0A)
    local3\Field21 = 0.0
    local3\Field31 = 0.0
    local3\Field53 = -0.01
    local3\Field47 = 0.005
    local3\Field13 = 0.02
    local3\Field24 = 6.0
    local3\Field50 = 2.1
    local3\Field32 = 5.0
    local3\Field58 = 1.725
    local3\Field57 = $21F
    local3\Field25 = "SFX\Weapons\P90\"
    local3\Field12 = "SFX\Weapons\P90\reload.ogg"
    local3\Field1 = "SFX\Weapons\P90\deploy.ogg"
    local3\Field52 = $32
    local3\Field6 = $C8
    local3\Field18 = 3.2
    local3\Field22 = 210.0
    local3\Field2 = 1.3
    local3\Field41 = -0.017
    local3\Field43 = -0.0017
    local3\Field20[$01] = PackTwoValues($2D, $32)
    local3\Field34[$01] = 0.6
    local3\Field20[$03] = PackTwoValues($B5, $C8)
    local3\Field34[$03] = 0.5
    local3\Field20[$02] = PackTwoValues($01, $2C)
    local3\Field34[$02] = 0.7
    local3\Field20[$07] = PackTwoValues($01, $2C)
    local3\Field34[$07] = -0.9
    local3\Field20[$04] = PackTwoValues($C9, $C9)
    local3\Field34[$04] = 1.0
    local3\Field20[$06] = PackTwoValues($C9, $C9)
    local3\Field34[$06] = 1.0
    local3\Field20[$05] = PackTwoValues($38, $B4)
    local3\Field34[$05] = 0.7
    GUESSEDcreateentity_6($0B, "GFX\Items\Weapons\MP7\MP7.b3d", $01, $01)
    GUESSEDcallcheckvalue($0B, $1F)
    local3 = GUESSEDcheckvalue_31($0B)
    local3\Field21 = 0.0
    local3\Field31 = 0.001
    local3\Field53 = -0.01
    local3\Field37 = 0.5
    local3\Field47 = 0.005
    local3\Field13 = 0.02
    local3\Field24 = 6.0
    local3\Field50 = 1.8
    local3\Field32 = 5.0
    local3\Field58 = 1.65
    local3\Field57 = $21F
    local3\Field25 = "SFX\Weapons\MP7\"
    local3\Field12 = "SFX\Weapons\MP7\reload.ogg"
    local3\Field1 = "SFX\Weapons\MP7\deploy.ogg"
    local3\Field52 = $1E
    local3\Field6 = $C8
    local3\Field18 = 3.0
    local3\Field22 = 210.0
    local3\Field41 = -0.0184
    local3\Field43 = 0.0045
    local3\Field20[$01] = PackTwoValues($11, $11)
    local3\Field34[$01] = 0.6
    local3\Field20[$03] = PackTwoValues($DF, $EA)
    local3\Field34[$03] = 0.8
    local3\Field20[$02] = PackTwoValues($01, $10)
    local3\Field34[$02] = 0.4
    local3\Field20[$07] = PackTwoValues($01, $10)
    local3\Field34[$07] = -0.6
    local3\Field20[$04] = PackTwoValues($EB, $EB)
    local3\Field34[$04] = 1.0
    local3\Field20[$06] = PackTwoValues($EB, $EB)
    local3\Field34[$06] = 1.0
    local3\Field20[$05] = PackTwoValues($A8, $DE)
    local3\Field34[$05] = 0.5
    GUESSEDcreateentity_6($08, "GFX\Items\Weapons\Handcuffs\Handcuffs.b3d", $00, $01)
    GUESSEDcallcheckvalue($08, $1A)
    local3 = GUESSEDcheckvalue_31($08)
    local3\Field21 = 0.0
    local3\Field31 = 0.0
    local3\Field53 = 0.0
    local3\Field47 = 0.005
    local3\Field1 = "SFX\Weapons\Handcuffs\deploy.ogg"
    local3\Field26 = $01
    local3\Field20[$01] = PackTwoValues($31, $31)
    local3\Field34[$01] = 0.5
    local3\Field20[$02] = PackTwoValues($01, $30)
    local3\Field34[$02] = 0.5
    local3\Field20[$07] = PackTwoValues($01, $31)
    local3\Field34[$07] = -0.8
    GUESSEDcreateentity_6($09, "GFX\Items\Weapons\Handcuffs\Handcuffs.b3d", $00, $01)
    GUESSEDcallcheckvalue($09, $1B)
    local3 = GUESSEDcheckvalue_31($09)
    local3\Field21 = 0.0
    local3\Field31 = 0.0
    local3\Field53 = 0.0
    local3\Field47 = 0.005
    local3\Field1 = "SFX\Weapons\Handcuffs\equip.ogg"
    local3\Field26 = $01
    local3\Field20[$01] = PackTwoValues($35, $35)
    local3\Field34[$01] = 0.7
    local3\Field20[$02] = PackTwoValues($33, $35)
    local3\Field34[$02] = 0.3
    local3\Field20[$07] = PackTwoValues($33, $35)
    local3\Field34[$07] = -1.0
    local3\Field20[$08] = PackTwoValues($35, $35)
    local3\Field34[$08] = 0.3
    local3\Field20[$06] = PackTwoValues($35, $35)
    local3\Field34[$06] = 0.3
    GUESSEDcreateentity_6($0E, "GFX\Items\Weapons\Hands\SCP\049_VM.b3d", $00, $01)
    GUESSEDcallcheckvalue($0E, $22)
    local3 = GUESSEDcheckvalue_31($0E)
    local3\Field21 = 0.0
    local3\Field31 = -0.01
    local3\Field53 = 0.02
    local3\Field47 = 0.005
    local3\Field1 = ""
    local3\Field26 = $01
    local3\Field5 = $01
    local3\Field20[$01] = PackTwoValues($01, $29)
    local3\Field34[$01] = 0.1
    local3\Field20[$02] = PackTwoValues($01, $01)
    local3\Field34[$02] = 0.3
    local3\Field20[$08] = PackTwoValues($2B, $52)
    local3\Field34[$08] = 0.4
    local3\Field20[$06] = PackTwoValues($2B, $52)
    local3\Field34[$06] = 0.7
    local3\Field20[$07] = PackTwoValues($01, $01)
    local3\Field34[$07] = -1.0
    local3\Field20[$03] = PackTwoValues($53, $71)
    local3\Field34[$03] = 0.7
    GUESSEDcreateentity_6($0F, "GFX\Items\Weapons\Hands\SCP\106_VM.b3d", $00, $01)
    GUESSEDcallcheckvalue($0F, $23)
    local3 = GUESSEDcheckvalue_31($0F)
    local3\Field21 = 0.0
    local3\Field31 = 0.0
    local3\Field53 = 0.01
    local3\Field47 = 0.005
    local3\Field1 = ""
    local3\Field26 = $01
    local3\Field5 = $01
    local3\Field20[$01] = PackTwoValues($01, $29)
    local3\Field34[$01] = 0.1
    local3\Field20[$02] = PackTwoValues($01, $01)
    local3\Field34[$02] = 0.3
    local3\Field20[$06] = PackTwoValues($2B, $52)
    local3\Field34[$06] = 0.6
    local3\Field20[$08] = PackTwoValues($2B, $52)
    local3\Field34[$08] = 0.3
    local3\Field20[$07] = PackTwoValues($01, $01)
    local3\Field34[$07] = -1.0
    local3\Field20[$03] = PackTwoValues($53, $6A)
    local3\Field34[$03] = 0.5
    GUESSEDcreateentity_6($10, "GFX\Items\Weapons\Hands\SCP\173_VM.b3d", $00, $01)
    GUESSEDcallcheckvalue($10, $24)
    local3 = GUESSEDcheckvalue_31($10)
    local3\Field21 = 0.0
    local3\Field31 = -0.04
    local3\Field53 = 0.01
    local3\Field47 = 0.005
    local3\Field1 = ""
    local3\Field26 = $01
    local3\Field5 = $01
    local3\Field20[$01] = PackTwoValues($01, $01)
    local3\Field34[$01] = 0.5
    local3\Field20[$02] = PackTwoValues($01, $01)
    local3\Field34[$02] = 0.3
    local3\Field20[$06] = PackTwoValues($01, $01)
    local3\Field34[$06] = 0.6
    local3\Field20[$08] = PackTwoValues($01, $01)
    local3\Field34[$08] = 0.6
    local3\Field20[$07] = PackTwoValues($01, $01)
    local3\Field34[$07] = -1.0
    GUESSEDcreateentity_6($11, "GFX\Items\Weapons\Hands\SCP\966_VM.b3d", $00, $01)
    GUESSEDcallcheckvalue($11, $25)
    local3 = GUESSEDcheckvalue_31($11)
    local3\Field21 = 0.0
    local3\Field31 = -0.008
    local3\Field53 = 0.001
    local3\Field47 = 0.005
    local3\Field1 = ""
    local3\Field26 = $01
    local3\Field5 = $01
    local3\Field20[$01] = PackTwoValues($01, $3F)
    local3\Field34[$01] = 0.1
    local3\Field20[$02] = PackTwoValues($01, $01)
    local3\Field34[$02] = 0.3
    local3\Field20[$06] = PackTwoValues($42, $7C)
    local3\Field34[$06] = 0.4
    local3\Field20[$08] = PackTwoValues($42, $7C)
    local3\Field34[$08] = 0.2
    local3\Field20[$07] = PackTwoValues($01, $01)
    local3\Field34[$07] = -1.0
    local3\Field20[$03] = PackTwoValues($7C, $94)
    local3\Field34[$03] = 0.5
    GUESSEDcreateentity_6($0D, "GFX\Items\Weapons\Hands\SCP\096_VM.b3d", $00, $01)
    GUESSEDcallcheckvalue($0D, $21)
    local3 = GUESSEDcheckvalue_31($0D)
    local3\Field21 = 0.0
    local3\Field31 = -0.02
    local3\Field53 = 0.01
    local3\Field47 = 0.005
    local3\Field1 = ""
    local3\Field26 = $01
    local3\Field5 = $01
    local3\Field20[$01] = PackTwoValues($01, $3E)
    local3\Field34[$01] = 0.2
    local3\Field20[$02] = PackTwoValues($01, $01)
    local3\Field34[$02] = 0.3
    local3\Field20[$08] = PackTwoValues($3F, $87)
    local3\Field34[$08] = 0.3
    local3\Field20[$06] = PackTwoValues($3F, $87)
    local3\Field34[$06] = 0.3
    local3\Field20[$07] = PackTwoValues($01, $01)
    local3\Field34[$07] = -1.0
    local3\Field20[$03] = PackTwoValues($14F, $159)
    local3\Field34[$03] = 0.3
    GUESSEDcreateentity_6($0C, "GFX\Items\Weapons\M134\M134.b3d", $00, $01)
    GUESSEDcallcheckvalue($0C, $20)
    local3 = GUESSEDcheckvalue_31($0C)
    local3\Field21 = -0.005
    local3\Field31 = (1.0 / 400.0)
    local3\Field53 = -0.018
    local3\Field47 = 0.005
    local3\Field13 = 0.05
    local3\Field24 = 6.0
    local3\Field50 = 2.6
    local3\Field32 = 3.0
    local3\Field58 = 1.82
    local3\Field57 = $E4
    local3\Field25 = "SFX\Weapons\M134\"
    local3\Field12 = "SFX\Weapons\M134\reload.ogg"
    local3\Field1 = "SFX\Weapons\M134\deploy.ogg"
    local3\Field52 = $96
    local3\Field6 = $12C
    local3\Field18 = 2.0
    local3\Field22 = 210.0
    local3\Field41 = -0.002
    local3\Field43 = 0.0
    local3\Field20[$01] = PackTwoValues($22, $22)
    local3\Field34[$01] = 0.5
    local3\Field20[$03] = PackTwoValues($8E, $A2)
    local3\Field34[$03] = 0.8
    local3\Field20[$02] = PackTwoValues($01, $1A)
    local3\Field34[$02] = 0.3
    local3\Field20[$04] = PackTwoValues($0D, $0D)
    local3\Field34[$04] = 1.0
    local3\Field20[$06] = PackTwoValues($0D, $0D)
    local3\Field34[$06] = 1.0
    local3\Field20[$07] = PackTwoValues($01, $1A)
    local3\Field34[$07] = -0.6
    local3\Field20[$05] = PackTwoValues($23, $8D)
    local3\Field34[$05] = 0.6
    GUESSEDcreateentity_6($12, "GFX\Items\Weapons\Remington\remington.b3d", $01, $01)
    GUESSEDcallcheckvalue($12, $26)
    local3 = GUESSEDcheckvalue_31($12)
    local3\Field21 = -0.003
    local3\Field31 = 0.002
    local3\Field53 = -0.01
    local3\Field47 = 0.005
    local3\Field13 = 0.038
    local3\Field24 = 6.0
    local3\Field50 = 5.0
    local3\Field32 = 70.0
    local3\Field58 = 1.5
    local3\Field57 = $591C
    local3\Field25 = "SFX\Weapons\Remington\"
    local3\Field12 = "SFX\Weapons\Remington\reload.ogg"
    local3\Field1 = "SFX\Weapons\Remington\deploy.ogg"
    local3\Field52 = $08
    local3\Field6 = $3C
    local3\Field18 = 5.0
    local3\Field22 = 210.0
    local3\Field60 = $05
    local3\Field41 = -0.0117
    local3\Field43 = 0.0047
    local3\Field20[$01] = PackTwoValues($32, $3C)
    local3\Field34[$01] = 0.5
    local3\Field20[$03] = PackTwoValues($E7, $107)
    local3\Field34[$03] = 0.47
    local3\Field20[$02] = PackTwoValues($01, $1F)
    local3\Field34[$02] = 0.6
    local3\Field20[$04] = PackTwoValues($02, $02)
    local3\Field34[$04] = 1.0
    local3\Field20[$06] = PackTwoValues($02, $02)
    local3\Field34[$06] = 1.0
    local3\Field20[$07] = PackTwoValues($01, $07)
    local3\Field34[$07] = -0.6
    local3\Field20[$05] = PackTwoValues($107, $1B9)
    local3\Field34[$05] = 0.7
    GUESSEDcreateentity_6($13, "GFX\Items\Weapons\RPG7\RPG.b3d", $00, $01)
    GUESSEDcallcheckvalue($13, $27)
    local3 = GUESSEDcheckvalue_31($13)
    local3\Field21 = -0.003
    local3\Field31 = 0.0
    local3\Field53 = -0.021
    local3\Field47 = 0.005
    local3\Field13 = 0.025
    local3\Field24 = 6.0
    local3\Field50 = 10.0
    local3\Field32 = 70.0
    local3\Field58 = 32.0
    local3\Field57 = $E4
    local3\Field25 = "SFX\Weapons\RPG7\shoot.ogg"
    local3\Field12 = "SFX\Weapons\RPG7\reload.ogg"
    local3\Field1 = "SFX\Weapons\RPG7\deploy.ogg"
    local3\Field52 = $01
    local3\Field6 = $03
    local3\Field18 = 0.5
    local3\Field22 = 210.0
    local3\Field10 = "rpg_projectile"
    local3\Field48 = "GFX\Items\Weapons\RPG7\rocket.b3d"
    local3\Field7 = 10.0
    local3\Field36 = 0.4
    local3\Field49 = 0.001
    local3\Field14 = 0.001
    local3\Field4 = 0.5
    local3\Field44 = 0.01
    local3\Field33 = "SFX\Weapons\RPG7\explosion.ogg"
    local3\Field23 = "SFX\Weapons\RPG7\shell.ogg"
    local3\Field3 = $30
    local3\Field0 = "49 51 52 53"
    local3\Field29 = 80.0
    local3\Field41 = -0.01225
    local3\Field43 = 0.0
    local3\Field20[$01] = PackTwoValues($2B, $2B)
    local3\Field34[$01] = 0.45
    local3\Field20[$03] = PackTwoValues($36, $51)
    local3\Field34[$03] = 0.55
    local3\Field20[$02] = PackTwoValues($01, $2A)
    local3\Field34[$02] = 0.45
    local3\Field20[$04] = PackTwoValues($2B, $2B)
    local3\Field34[$04] = 1.0
    local3\Field20[$06] = PackTwoValues($2B, $2B)
    local3\Field34[$06] = 1.0
    local3\Field20[$07] = PackTwoValues($01, $2A)
    local3\Field34[$07] = -0.6
    local3\Field20[$05] = PackTwoValues($52, $AC)
    local3\Field34[$05] = 0.45
    GUESSEDcreateentity_6($14, "GFX\Items\Weapons\G36\g36.b3d", $01, $01)
    GUESSEDcallcheckvalue($14, $28)
    local3 = GUESSEDcheckvalue_31($14)
    local3\Field21 = -0.01
    local3\Field31 = 0.005
    local3\Field53 = -0.02
    local3\Field47 = 0.005
    local3\Field13 = 0.022
    local3\Field24 = 6.0
    local3\Field50 = 2.5
    local3\Field32 = 6.0
    local3\Field58 = 1.8
    local3\Field57 = $21F
    local3\Field25 = "SFX\Weapons\G36\"
    local3\Field12 = "SFX\Weapons\SR556\reload.ogg"
    local3\Field1 = "SFX\Weapons\G36\deploy.ogg"
    local3\Field52 = $1E
    local3\Field6 = $78
    local3\Field18 = 2.2
    local3\Field22 = 210.0
    local3\Field41 = -0.019
    local3\Field43 = 0.0045
    local3\Field20[$01] = PackTwoValues($23, $23)
    local3\Field34[$01] = 0.5
    local3\Field20[$03] = PackTwoValues($97, $A8)
    local3\Field34[$03] = 0.5
    local3\Field20[$02] = PackTwoValues($01, $20)
    local3\Field34[$02] = 0.5
    local3\Field20[$07] = PackTwoValues($01, $20)
    local3\Field34[$07] = -0.7
    local3\Field20[$04] = PackTwoValues($E0, $E0)
    local3\Field34[$04] = 0.5
    local3\Field20[$06] = PackTwoValues($E0, $E0)
    local3\Field34[$06] = 0.5
    local3\Field20[$05] = PackTwoValues($30, $96)
    local3\Field34[$05] = 0.5
    GUESSEDcreateentity_6($15, "GFX\Items\Weapons\AK74\AK74.fbx", $01, $01)
    GUESSEDcallcheckvalue($15, $29)
    local3 = GUESSEDcheckvalue_31($15)
    local3\Field21 = -0.008
    local3\Field31 = -0.006
    local3\Field53 = -0.085
    local3\Field35 = -1.65
    local3\Field47 = (1.0 / 400.0)
    local3\Field13 = 0.04
    local3\Field24 = 8.0
    local3\Field50 = 1.5
    local3\Field32 = 7.0
    local3\Field57 = $1A4
    local3\Field58 = 2.04
    local3\Field25 = "SFX\Weapons\AK74\"
    local3\Field12 = "SFX\Weapons\AK74\reload.ogg"
    local3\Field1 = "SFX\Weapons\AK74\deploy.ogg"
    local3\Field52 = $1E
    local3\Field6 = $78
    local3\Field18 = 3.2
    local3\Field22 = 210.0
    local3\Field40 = $02
    local3\Field2 = 1.5
    local3\Field41 = -0.01425
    local3\Field43 = 0.0015
    local3\Field20[$01] = PackTwoValues($28, $28)
    local3\Field34[$01] = 0.5
    local3\Field20[$03] = PackTwoValues($91, $97)
    local3\Field34[$03] = 0.7
    local3\Field20[$02] = PackTwoValues($01, $26)
    local3\Field34[$02] = 0.47
    local3\Field20[$06] = PackTwoValues($8F, $8F)
    local3\Field34[$06] = 0.5
    local3\Field20[$04] = PackTwoValues($8F, $8F)
    local3\Field34[$04] = 0.5
    local3\Field20[$07] = PackTwoValues($01, $26)
    local3\Field34[$07] = -0.9
    local3\Field20[$05] = PackTwoValues($2C, $8C)
    local3\Field34[$05] = 0.46
    GUESSEDcreateentity_6($FF, "GFX\Items\Weapons\ItemsViewmodels\keycard.b3d", $00, $01)
    GUESSEDcallcheckvalue($FF, $1FF)
    local3 = GUESSEDcheckvalue_31($FF)
    local3\Field21 = -0.004
    local3\Field31 = -0.005
    local3\Field53 = -0.005
    local3\Field47 = 0.005
    local3\Field1 = "SFX\Weapons\MP7\deploy.ogg"
    local3\Field26 = $01
    local3\Field28 = $01
    local3\Field9 = $01
    local3\Field20[$01] = PackTwoValues($22, $22)
    local3\Field34[$01] = 0.5
    local3\Field20[$08] = PackTwoValues($22, $22)
    local3\Field34[$08] = 0.5
    local3\Field20[$06] = PackTwoValues($22, $22)
    local3\Field34[$06] = 0.5
    local3\Field20[$03] = PackTwoValues($23, $3E)
    local3\Field34[$03] = 0.7
    local3\Field20[$02] = PackTwoValues($03, $22)
    local3\Field34[$02] = 0.5
    local3\Field20[$07] = PackTwoValues($03, $22)
    local3\Field34[$07] = -0.8
    GUESSEDcreateentity_6($FE, "GFX\Items\Weapons\ItemsViewmodels\radio.b3d", $00, $01)
    GUESSEDcallcheckvalue($FE, $1FE)
    local3 = GUESSEDcheckvalue_31($FE)
    local3\Field21 = 0.0
    local3\Field31 = -0.01
    local3\Field53 = 0.008
    local3\Field47 = 0.005
    local3\Field1 = "SFX\Weapons\MP7\deploy.ogg"
    local3\Field26 = $01
    local3\Field28 = $01
    local3\Field9 = $01
    local3\Field11 = $03
    local3\Field20[$01] = PackTwoValues($20, $20)
    local3\Field34[$01] = 0.5
    local3\Field20[$08] = PackTwoValues($20, $20)
    local3\Field34[$08] = 0.5
    local3\Field20[$06] = PackTwoValues($20, $20)
    local3\Field34[$06] = 0.5
    local3\Field20[$02] = PackTwoValues($02, $1F)
    local3\Field34[$02] = 0.5
    local3\Field20[$07] = PackTwoValues($02, $1F)
    local3\Field34[$07] = -0.8
    GUESSEDcreateentity_6($FD, "GFX\Items\Weapons\ItemsViewmodels\snav.b3d", $00, $01)
    GUESSEDcallcheckvalue($FD, $1FD)
    local3 = GUESSEDcheckvalue_31($FD)
    local3\Field21 = 0.0
    local3\Field31 = -0.01
    local3\Field53 = -0.005
    local3\Field47 = 0.005
    local3\Field1 = "SFX\Weapons\MP7\deploy.ogg"
    local3\Field26 = $01
    local3\Field28 = $01
    local3\Field9 = $01
    local3\Field11 = $03
    local3\Field20[$01] = PackTwoValues($38, $38)
    local3\Field34[$01] = 0.5
    local3\Field20[$08] = PackTwoValues($38, $38)
    local3\Field34[$08] = 0.5
    local3\Field20[$06] = PackTwoValues($38, $38)
    local3\Field34[$06] = 0.5
    local3\Field20[$02] = PackTwoValues($02, $37)
    local3\Field34[$02] = 0.5
    local3\Field20[$07] = PackTwoValues($02, $37)
    local3\Field34[$07] = -0.8
    GUESSEDcreateentity_6($FC, "GFX\Items\Weapons\ItemsViewmodels\hackingdevice.b3d", $00, $01)
    GUESSEDcallcheckvalue($FC, $1FC)
    local3 = GUESSEDcheckvalue_31($FC)
    local3\Field21 = 0.0
    local3\Field31 = -0.015
    local3\Field53 = 0.005
    local3\Field47 = 0.005
    local3\Field1 = "SFX\Weapons\MP7\deploy.ogg"
    local3\Field26 = $01
    local3\Field28 = $01
    local3\Field9 = $01
    local3\Field11 = $03
    local3\Field20[$01] = PackTwoValues($22, $22)
    local3\Field34[$01] = 0.5
    local3\Field20[$08] = PackTwoValues($22, $22)
    local3\Field34[$08] = 0.5
    local3\Field20[$03] = PackTwoValues($23, $3E)
    local3\Field34[$03] = 0.7
    local3\Field20[$06] = PackTwoValues($22, $22)
    local3\Field34[$06] = 0.5
    local3\Field20[$02] = PackTwoValues($03, $21)
    local3\Field34[$02] = 0.5
    local3\Field20[$07] = PackTwoValues($03, $21)
    local3\Field34[$07] = -0.8
    GUESSEDcreateentity_6($FB, "GFX\Items\Weapons\ItemsViewmodels\sh.b3d", $00, $01)
    GUESSEDcallcheckvalue($FB, $1FB)
    local3 = GUESSEDcheckvalue_31($FB)
    local3\Field21 = -0.002
    local3\Field31 = -0.013
    local3\Field53 = -0.005
    local3\Field47 = 0.005
    local3\Field1 = "SFX\Weapons\MP7\deploy.ogg"
    local3\Field26 = $01
    local3\Field28 = $01
    local3\Field9 = $01
    local3\Field20[$01] = PackTwoValues($25, $25)
    local3\Field34[$01] = 0.5
    local3\Field20[$08] = PackTwoValues($25, $25)
    local3\Field34[$08] = 0.5
    local3\Field20[$03] = PackTwoValues($33, $44)
    local3\Field34[$03] = 0.7
    local3\Field20[$06] = PackTwoValues($25, $25)
    local3\Field34[$06] = 0.5
    local3\Field20[$02] = PackTwoValues($02, $24)
    local3\Field34[$02] = 0.5
    local3\Field20[$07] = PackTwoValues($02, $24)
    local3\Field34[$07] = -0.8
    GUESSEDcreateentity_6($FA, "GFX\Items\Weapons\ItemsViewmodels\005.b3d", $00, $01)
    GUESSEDcallcheckvalue($FA, $1FA)
    local3 = GUESSEDcheckvalue_31($FA)
    local3\Field21 = 0.0
    local3\Field31 = -0.01
    local3\Field53 = -0.005
    local3\Field47 = 0.005
    local3\Field1 = "SFX\Weapons\MP7\deploy.ogg"
    local3\Field26 = $01
    local3\Field28 = $01
    local3\Field9 = $01
    local3\Field20[$01] = PackTwoValues($20, $20)
    local3\Field34[$01] = 0.5
    local3\Field20[$08] = PackTwoValues($20, $20)
    local3\Field34[$08] = 0.5
    local3\Field20[$06] = PackTwoValues($20, $20)
    local3\Field34[$06] = 0.5
    local3\Field20[$03] = PackTwoValues($38, $46)
    local3\Field34[$03] = 0.6
    local3\Field20[$02] = PackTwoValues($03, $1F)
    local3\Field34[$02] = 0.5
    local3\Field20[$07] = PackTwoValues($03, $1F)
    local3\Field34[$07] = -0.8
    GUESSEDcreateentity_6($F9, "GFX\Items\Weapons\M69\M69.b3d", $00, $01)
    GUESSEDcallcheckvalue($F9, $1F9)
    local3 = GUESSEDcheckvalue_31($F9)
    local3\Field21 = 0.0
    local3\Field31 = -0.003
    local3\Field53 = 0.003
    local3\Field47 = 0.005
    local3\Field1 = "SFX\Weapons\MP7\deploy.ogg"
    local3\Field8 = "SFX\Weapons\M69\shoot.ogg"
    local3\Field32 = 140.0
    local3\Field52 = $01
    local3\Field6 = $00
    local3\Field42 = $01
    local3\Field39 = $01
    local3\Field15 = $1B
    local3\Field58 = 24.0
    local3\Field48 = "GFX\Items\m69_wm.b3d"
    local3\Field46 = $01
    local3\Field7 = 4.5
    local3\Field36 = 5.0
    local3\Field49 = 0.0
    local3\Field14 = 0.01
    local3\Field4 = 0.2
    local3\Field44 = 0.01
    local3\Field33 = "SFX\Weapons\RPG7\explosion.ogg"
    local3\Field0 = "49 51 52 53"
    local3\Field29 = 50.0
    local3\Field16 = 0.015
    local3\Field55 = "SFX\Weapons\M69\Impact.ogg"
    local3\Field20[$01] = PackTwoValues($01, $65)
    local3\Field34[$01] = 0.3
    local3\Field20[$02] = PackTwoValues($66, $8F)
    local3\Field34[$02] = 0.65
    local3\Field20[$03] = PackTwoValues($90, $B6)
    local3\Field34[$03] = 0.5
    local3\Field20[$07] = PackTwoValues($66, $8F)
    local3\Field34[$07] = -1.0
    local3\Field20[$08] = PackTwoValues($01, $65)
    local3\Field34[$08] = 0.3
    local3\Field20[$06] = PackTwoValues($01, $65)
    local3\Field34[$06] = 0.3
    GUESSEDcreateentity_6($F8, "GFX\Items\Weapons\M9Knife\M9Knife.b3d", $00, $01)
    GUESSEDcallcheckvalue($F8, $1F8)
    local3 = GUESSEDcheckvalue_31($F8)
    local3\Field21 = 0.0
    local3\Field31 = -0.015
    local3\Field53 = -0.03
    local3\Field19 = -4.0
    local3\Field47 = 0.005
    local3\Field1 = "SFX\Weapons\MP7\deploy.ogg"
    local3\Field25 = "SFX\Weapons\Knife\miss.ogg"
    local3\Field59[$00] = "SFX\Weapons\Knife\hit0.ogg SFX\Weapons\Knife\hit1.ogg"
    local3\Field59[$01] = "SFX\Weapons\Knife\hit2.ogg"
    local3\Field59[$02] = "SFX\Weapons\Knife\hit2.ogg"
    local3\Field32 = 41.17647
    local3\Field52 = $FFFF
    local3\Field51 = 0.4
    local3\Field6 = $00
    local3\Field42 = $01
    local3\Field15 = $1C
    local3\Field58 = 1.5
    local3\Field20[$01] = PackTwoValues($12, $12)
    local3\Field34[$01] = 0.4
    local3\Field20[$02] = PackTwoValues($01, $12)
    local3\Field34[$02] = 0.45
    local3\Field20[$03] = PackTwoValues($13, $24)
    local3\Field34[$03] = 0.6
    local3\Field20[$07] = PackTwoValues($01, $12)
    local3\Field34[$07] = -0.8
    local3\Field20[$08] = PackTwoValues($12, $12)
    local3\Field34[$08] = 0.3
    local3\Field20[$06] = PackTwoValues($12, $12)
    local3\Field34[$06] = 0.3
    GUESSEDcreateentity_6($F7, "GFX\Items\Weapons\Stemtex\Stemtex.b3d", $00, $01)
    GUESSEDcallcheckvalue($F7, $1F7)
    local3 = GUESSEDcheckvalue_31($F7)
    local3\Field21 = 0.0
    local3\Field31 = -0.003
    local3\Field53 = 0.003
    local3\Field47 = 0.005
    local3\Field1 = "SFX\Weapons\MP7\deploy.ogg"
    local3\Field8 = "SFX\Weapons\M69\shoot.ogg"
    local3\Field32 = 140.0
    local3\Field52 = $01
    local3\Field6 = $00
    local3\Field42 = $01
    local3\Field39 = $01
    local3\Field15 = $1B
    local3\Field58 = 10.0
    local3\Field48 = "GFX\Items\stemtex_wm.b3d"
    local3\Field46 = $01
    local3\Field7 = 15.0
    local3\Field36 = 5.0
    local3\Field49 = 0.0
    local3\Field14 = 0.01
    local3\Field4 = 0.2
    local3\Field44 = 0.01
    local3\Field33 = "SFX\Weapons\RPG7\explosion.ogg"
    local3\Field0 = "49 51 52 53"
    local3\Field29 = 25.0
    local3\Field16 = 0.015
    local3\Field27 = $01
    local3\Field20[$01] = PackTwoValues($01, $65)
    local3\Field34[$01] = 0.3
    local3\Field20[$02] = PackTwoValues($66, $8F)
    local3\Field34[$02] = 0.65
    local3\Field20[$03] = PackTwoValues($90, $B6)
    local3\Field34[$03] = 0.5
    local3\Field20[$07] = PackTwoValues($66, $8F)
    local3\Field34[$07] = -1.0
    local3\Field20[$08] = PackTwoValues($01, $65)
    local3\Field34[$08] = 0.3
    local3\Field20[$06] = PackTwoValues($01, $65)
    local3\Field34[$06] = 0.3
    GUESSEDcreateentity_6($F6, "GFX\Items\Weapons\EMP\EMPNade.b3d", $00, $01)
    GUESSEDcallcheckvalue($F6, $1F6)
    local3 = GUESSEDcheckvalue_31($F6)
    local3\Field21 = 0.0
    local3\Field31 = -0.003
    local3\Field53 = 0.003
    local3\Field47 = 0.005
    local3\Field1 = "SFX\Weapons\MP7\deploy.ogg"
    local3\Field8 = "SFX\Weapons\M69\shoot.ogg"
    local3\Field32 = 140.0
    local3\Field52 = $01
    local3\Field6 = $00
    local3\Field42 = $01
    local3\Field39 = $01
    local3\Field15 = $1B
    local3\Field58 = 0.0
    local3\Field48 = "GFX\Items\emp_wm.b3d"
    local3\Field46 = $01
    local3\Field7 = 30.0
    local3\Field36 = 5.0
    local3\Field49 = 0.0
    local3\Field14 = 0.01
    local3\Field4 = 0.2
    local3\Field44 = 0.01
    local3\Field33 = "SFX\Weapons\RPG7\explosion.ogg"
    local3\Field0 = "49 52 53"
    local3\Field29 = 10.0
    local3\Field16 = 0.015
    local3\Field55 = "SFX\Weapons\M69\Impact.ogg"
    local3\Field62 = $01
    local3\Field38 = 10.0
    local3\Field20[$01] = PackTwoValues($01, $65)
    local3\Field34[$01] = 0.3
    local3\Field20[$02] = PackTwoValues($66, $8F)
    local3\Field34[$02] = 0.65
    local3\Field20[$03] = PackTwoValues($90, $B6)
    local3\Field34[$03] = 0.5
    local3\Field20[$07] = PackTwoValues($66, $8F)
    local3\Field34[$07] = -1.0
    local3\Field20[$08] = PackTwoValues($01, $65)
    local3\Field34[$08] = 0.3
    local3\Field20[$06] = PackTwoValues($01, $65)
    local3\Field34[$06] = 0.3
    GUESSEDcreateentity_6($F5, "GFX\Items\Weapons\ItemsViewmodels\key.b3d", $00, $01)
    GUESSEDcallcheckvalue($F5, $1F5)
    local3 = GUESSEDcheckvalue_31($F5)
    local3\Field21 = 0.0
    local3\Field31 = -0.01
    local3\Field53 = -0.005
    local3\Field47 = 0.005
    local3\Field1 = "SFX\Weapons\MP7\deploy.ogg"
    local3\Field26 = $01
    local3\Field28 = $01
    local3\Field9 = $01
    local3\Field20[$01] = PackTwoValues($20, $20)
    local3\Field34[$01] = 0.5
    local3\Field20[$08] = PackTwoValues($20, $20)
    local3\Field34[$08] = 0.5
    local3\Field20[$06] = PackTwoValues($20, $20)
    local3\Field34[$06] = 0.5
    local3\Field20[$03] = PackTwoValues($38, $46)
    local3\Field34[$03] = 0.6
    local3\Field20[$02] = PackTwoValues($03, $1F)
    local3\Field34[$02] = 0.5
    local3\Field20[$07] = PackTwoValues($03, $1F)
    local3\Field34[$07] = -0.8
    GUESSEDcreateentity_6($F4, "GFX\Items\Weapons\ItemsViewmodels\key_860.b3d", $00, $01)
    GUESSEDcallcheckvalue($F4, $1F4)
    local3 = GUESSEDcheckvalue_31($F4)
    local3\Field21 = 0.0
    local3\Field31 = -0.01
    local3\Field53 = -0.005
    local3\Field47 = 0.005
    local3\Field1 = "SFX\Weapons\MP7\deploy.ogg"
    local3\Field26 = $01
    local3\Field28 = $01
    local3\Field9 = $01
    local3\Field20[$01] = PackTwoValues($20, $20)
    local3\Field34[$01] = 0.5
    local3\Field20[$08] = PackTwoValues($20, $20)
    local3\Field34[$08] = 0.5
    local3\Field20[$06] = PackTwoValues($20, $20)
    local3\Field34[$06] = 0.5
    local3\Field20[$03] = PackTwoValues($38, $46)
    local3\Field34[$03] = 0.6
    local3\Field20[$02] = PackTwoValues($03, $1F)
    local3\Field34[$02] = 0.5
    local3\Field20[$07] = PackTwoValues($03, $1F)
    local3\Field34[$07] = -0.8
    GUESSEDcreateentity_6($F3, "GFX\Items\Weapons\ItemsViewmodels\coin.b3d", $00, $01)
    GUESSEDcallcheckvalue($F3, $1F3)
    local3 = GUESSEDcheckvalue_31($F3)
    local3\Field21 = 0.0
    local3\Field31 = -0.01
    local3\Field53 = -0.005
    local3\Field47 = 0.005
    local3\Field1 = "SFX\Weapons\MP7\deploy.ogg"
    local3\Field26 = $01
    local3\Field28 = $01
    local3\Field9 = $01
    local3\Field20[$01] = PackTwoValues($20, $20)
    local3\Field34[$01] = 0.5
    local3\Field20[$08] = PackTwoValues($20, $20)
    local3\Field34[$08] = 0.5
    local3\Field20[$06] = PackTwoValues($20, $20)
    local3\Field34[$06] = 0.5
    local3\Field20[$03] = PackTwoValues($38, $46)
    local3\Field34[$03] = 0.6
    local3\Field20[$02] = PackTwoValues($03, $1F)
    local3\Field34[$02] = 0.5
    local3\Field20[$07] = PackTwoValues($03, $1F)
    local3\Field34[$07] = -0.8
    GUESSEDloadfiletype_2($00, "GFX\Items\badge.b3d")
    GUESSEDloadfiletype_2($01, "GFX\Items\ballistic_helmet.b3d")
    GUESSEDloadfiletype_2($02, "GFX\Items\ballistic_vest.b3d")
    GUESSEDloadfiletype_2($03, "GFX\Items\battery.b3d")
    GUESSEDloadfiletype_2($04, "GFX\Items\circuits.b3d")
    GUESSEDloadfiletype_2($05, "GFX\Items\clipboard.b3d")
    GUESSEDloadfiletype_2($06, "GFX\Items\coin.b3d")
    GUESSEDloadfiletype_2($07, "GFX\Items\cup.b3d")
    GUESSEDloadfiletype_2($08, "GFX\Items\cup_liquid.b3d")
    GUESSEDloadfiletype_2($09, "GFX\Items\eye_drops.b3d")
    GUESSEDloadfiletype_2($0A, "GFX\Items\e_reader.b3d")
    GUESSEDloadfiletype_2($0B, "GFX\Items\first_aid_kit.b3d")
    GUESSEDloadfiletype_2($0C, "GFX\Items\fiveseven_wm.b3d")
    GUESSEDloadfiletype_2($0D, "GFX\Items\gas_mask.b3d")
    GUESSEDloadfiletype_2($0E, "GFX\Items\glock_wm.b3d")
    GUESSEDloadfiletype_2($0F, "GFX\Items\hazmat_suit.b3d")
    GUESSEDloadfiletype_2($10, "GFX\Items\heavy_helmet.b3d")
    GUESSEDloadfiletype_2($11, "GFX\Items\key.b3d")
    GUESSEDloadfiletype_2($12, "GFX\Items\key_card.b3d")
    GUESSEDloadfiletype_2($13, "GFX\Items\m4a1_wm.b3d")
    GUESSEDloadfiletype_2($14, "GFX\Items\m60_wm.b3d")
    GUESSEDloadfiletype_2($15, "GFX\Items\metal_panel.b3d")
    GUESSEDloadfiletype_2($16, "GFX\Items\mp5_wm.b3d")
    GUESSEDloadfiletype_2($17, "GFX\Items\navigator.b3d")
    GUESSEDloadfiletype_2($18, "GFX\Items\night_vision_goggles.b3d")
    GUESSEDloadfiletype_2($19, "GFX\Items\note.b3d")
    GUESSEDloadfiletype_2($1A, "GFX\Items\origami.b3d")
    GUESSEDloadfiletype_2($1B, "GFX\Items\paper.b3d")
    GUESSEDloadfiletype_2($1C, "GFX\Items\pill.b3d")
    GUESSEDloadfiletype_2($1D, "GFX\Items\Pizza_Slice.b3d")
    GUESSEDloadfiletype_2($1E, "GFX\Items\radio.b3d")
    GUESSEDloadfiletype_2($1F, "GFX\Items\scp_005.b3d")
    GUESSEDloadfiletype_2($20, "GFX\Items\scp_1025.b3d")
    GUESSEDloadfiletype_2($21, "GFX\Items\scp_1123.b3d")
    GUESSEDloadfiletype_2($22, "GFX\Items\scp_148.b3d")
    GUESSEDloadfiletype_2($23, "GFX\Items\scp_1499.b3d")
    GUESSEDloadfiletype_2($24, "GFX\Items\scp_268.b3d")
    GUESSEDloadfiletype_2($25, "GFX\Items\scp_420_j.b3d")
    GUESSEDloadfiletype_2($26, "GFX\Items\scp_427.b3d")
    GUESSEDloadfiletype_2($27, "GFX\Items\scp_500.b3d")
    GUESSEDloadfiletype_2($28, "GFX\Items\scp_513.b3d")
    GUESSEDloadfiletype_2($29, "GFX\Items\scp_714.b3d")
    GUESSEDloadfiletype_2($2A, "GFX\Items\scp_860.b3d")
    GUESSEDloadfiletype_2($2B, "GFX\Items\SCRAMBLE_gear.b3d")
    GUESSEDloadfiletype_2($2C, "GFX\Items\severed_hand.b3d")
    GUESSEDloadfiletype_2($2D, "GFX\Items\sr556_wm.b3d")
    GUESSEDloadfiletype_2($2E, "GFX\Items\syringe.b3d")
    GUESSEDloadfiletype_2($2F, "GFX\Items\wallet.b3d")
    GUESSEDloadfiletype_2($30, "GFX\Items\Weapons\FiveSeven\fiveseven.b3d")
    GUESSEDloadfiletype_2($31, "GFX\Items\Weapons\Glock\glock.b3d")
    GUESSEDloadfiletype_2($32, "GFX\Items\Weapons\M4A1\m4a1.b3d")
    GUESSEDloadfiletype_2($33, "GFX\Items\Weapons\M60\m60.b3d")
    GUESSEDloadfiletype_2($34, "GFX\Items\Weapons\Mp5\Mp5.b3d")
    GUESSEDloadfiletype_2($35, "GFX\Items\Weapons\MuzzleFlash\Mflash.b3d")
    GUESSEDloadfiletype_2($36, "GFX\Items\Weapons\SR556\SR556.b3d")
    GUESSEDloadfiletype_2($37, "GFX\Items\Wearable\427_wearmodel.b3d")
    GUESSEDloadfiletype_2($38, "GFX\Items\Wearable\ballistic_helmet_visor.b3d")
    GUESSEDloadfiletype_2($39, "GFX\Items\Wearable\Ballistic_vest_wearmodel.b3d")
    GUESSEDloadfiletype_2($3A, "GFX\Items\Wearable\gasmask_wearmodel.b3d")
    GUESSEDloadfiletype_2($3B, "GFX\Items\Wearable\Hazmat_wearmodel.b3d")
    GUESSEDloadfiletype_2($3D, "GFX\Items\Wearable\NVG_wearmodel.b3d")
    GUESSEDloadfiletype_2($3E, "GFX\Items\Wearable\SCRAMBLE_gear_wearmodel.b3d")
    GUESSEDloadfiletype_2($3F, "GFX\Map\cont1_106_hb.b3d")
    GUESSEDloadfiletype_2($40, "GFX\Map\dimension1499\1499object0_cull.b3d")
    GUESSEDloadfiletype_2($41, "GFX\Map\dimension1499\1499plane.b3d")
    GUESSEDloadfiletype_2($42, "GFX\Map\dimension_106_terrain.b3d")
    GUESSEDloadfiletype_2($43, "GFX\Map\exit1terrain.b3d")
    GUESSEDloadfiletype_2($44, "GFX\Map\gateawall1.b3d")
    GUESSEDloadfiletype_2($45, "GFX\Map\gateawall2.b3d")
    GUESSEDloadfiletype_2($46, "GFX\Map\Props\096_tunnel_rocks.b3d")
    GUESSEDloadfiletype_2($47, "GFX\Map\Props\alcohol_hand_gel.b3d")
    GUESSEDloadfiletype_2($48, "GFX\Map\Props\baffle.b3d")
    GUESSEDloadfiletype_2($49, "GFX\Map\Props\bench.b3d")
    GUESSEDloadfiletype_2($4A, "GFX\Map\Props\bench2.b3d")
    GUESSEDloadfiletype_2($4B, "GFX\Map\Props\BigDoorColl.b3d")
    GUESSEDloadfiletype_2($4C, "GFX\Map\Props\Bishop.b3d")
    GUESSEDloadfiletype_2($4D, "GFX\Map\Props\book.b3d")
    GUESSEDloadfiletype_2($4E, "GFX\Map\Props\bowl.b3d")
    GUESSEDloadfiletype_2($4F, "GFX\Map\Props\boxfile.b3d")
    GUESSEDloadfiletype_2($50, "GFX\Map\Props\bucket.b3d")
    GUESSEDloadfiletype_2($51, "GFX\Map\Props\Button.b3d")
    GUESSEDloadfiletype_2($52, "GFX\Map\Props\ButtonCode.b3d")
    GUESSEDloadfiletype_2($53, "GFX\Map\Props\ButtonElevator.b3d")
    GUESSEDloadfiletype_2($54, "GFX\Map\Props\ButtonKeycard.b3d")
    GUESSEDloadfiletype_2($55, "GFX\Map\Props\ButtonScanner.b3d")
    GUESSEDloadfiletype_2($56, "GFX\Map\Props\cabinet_a.b3d")
    GUESSEDloadfiletype_2($57, "GFX\Map\Props\cabinet_b.b3d")
    GUESSEDloadfiletype_2($58, "GFX\Map\Props\cabinet_c.b3d")
    GUESSEDloadfiletype_2($59, "GFX\Map\Props\CamBase.b3d")
    GUESSEDloadfiletype_2($5A, "GFX\Map\Props\CamHead.b3d")
    GUESSEDloadfiletype_2($5B, "GFX\Map\Props\chair.b3d")
    GUESSEDloadfiletype_2($5C, "GFX\Map\Props\chessboard.b3d")
    GUESSEDloadfiletype_2($5D, "GFX\Map\Props\SCPlabel.b3d")
    GUESSEDloadfiletype_2($5E, "GFX\Map\Props\ContDoorFrame.b3d")
    GUESSEDloadfiletype_2($5F, "GFX\Map\Props\contdoorleft.b3d")
    GUESSEDloadfiletype_2($60, "GFX\Map\Props\contdoorright.b3d")
    GUESSEDloadfiletype_2($61, "GFX\Map\Props\crate1.b3d")
    GUESSEDloadfiletype_2($62, "GFX\Map\Props\crate2.b3d")
    GUESSEDloadfiletype_2($63, "GFX\Map\Props\crate3.b3d")
    GUESSEDloadfiletype_2($64, "GFX\Map\Props\dimension_106_pillar.b3d")
    GUESSEDloadfiletype_2($65, "GFX\Map\Props\Door01.b3d")
    GUESSEDloadfiletype_2($66, "GFX\Map\Props\Door02.b3d")
    GUESSEDloadfiletype_2($67, "GFX\Map\Props\DoorColl.b3d")
    GUESSEDloadfiletype_2($68, "GFX\Map\Props\DoorFrame.b3d")
    GUESSEDloadfiletype_2($69, "GFX\Map\Props\DoorWooden.b3d")
    GUESSEDloadfiletype_2($6A, "GFX\Map\Props\DoorWoodenFrame.b3d")
    GUESSEDloadfiletype_2($6B, "GFX\Map\Props\ElecBox.b3d")
    GUESSEDloadfiletype_2($6C, "GFX\Map\Props\ElevatorDoor.b3d")
    GUESSEDloadfiletype_2($6D, "GFX\Map\Props\elevator_panel.b3d")
    GUESSEDloadfiletype_2($6E, "GFX\Map\Props\femur_breaker.b3d")
    GUESSEDloadfiletype_2($6F, "GFX\Map\Props\FenceDoor.b3d")
    GUESSEDloadfiletype_2($70, "GFX\Map\Props\fire_extinguisher.b3d")
    GUESSEDloadfiletype_2($71, "GFX\Map\Props\forklift.b3d")
    GUESSEDloadfiletype_2($72, "GFX\Map\Props\garbage_bin.b3d")
    GUESSEDloadfiletype_2($73, "GFX\Map\Props\HeavyDoor1.b3d")
    GUESSEDloadfiletype_2($74, "GFX\Map\Props\HeavyDoor2.b3d")
    GUESSEDloadfiletype_2($75, "GFX\Map\Props\keyboard.b3d")
    GUESSEDloadfiletype_2($76, "GFX\Map\Props\King.b3d")
    GUESSEDloadfiletype_2($77, "GFX\Map\Props\Knight.b3d")
    GUESSEDloadfiletype_2($78, "GFX\Map\Props\lamp_a.b3d")
    GUESSEDloadfiletype_2($79, "GFX\Map\Props\lamp_b.b3d")
    GUESSEDloadfiletype_2($7A, "GFX\Map\Props\lamp_c.b3d")
    GUESSEDloadfiletype_2($7B, "GFX\Map\Props\lamp_d.b3d")
    GUESSEDloadfiletype_2($7C, "GFX\Map\Props\lamp_e.b3d")
    GUESSEDloadfiletype_2($7D, "GFX\Map\Props\lamp_f.b3d")
    GUESSEDloadfiletype_2($7E, "GFX\Map\Props\LeverBase.b3d")
    GUESSEDloadfiletype_2($7F, "GFX\Map\Props\LeverHandle.b3d")
    GUESSEDloadfiletype_2($80, "GFX\Map\Props\lightgun.b3d")
    GUESSEDloadfiletype_2($81, "GFX\Map\Props\lightgunbase.b3d")
    GUESSEDloadfiletype_2($82, "GFX\Map\Props\marker.b3d")
    GUESSEDloadfiletype_2($83, "GFX\Map\Props\microscope.b3d")
    GUESSEDloadfiletype_2($84, "GFX\Map\Props\monitor.b3d")
    GUESSEDloadfiletype_2($85, "GFX\Map\Props\monitor2.b3d")
    GUESSEDloadfiletype_2($86, "GFX\Map\Props\monitor_checkpoint.b3d")
    GUESSEDloadfiletype_2($87, "GFX\Map\Props\mop.b3d")
    GUESSEDloadfiletype_2($88, "GFX\Map\Props\mouse.b3d")
    GUESSEDloadfiletype_2($89, "GFX\Map\Props\mug.b3d")
    GUESSEDloadfiletype_2($8A, "GFX\Map\Props\officedoor.b3d")
    GUESSEDloadfiletype_2($8B, "GFX\Map\Props\officedoorframe.b3d")
    GUESSEDloadfiletype_2($8C, "GFX\Map\Props\officeseat_a.b3d")
    GUESSEDloadfiletype_2($8D, "GFX\Map\Props\oxygen_cylinder.b3d")
    GUESSEDloadfiletype_2($8E, "GFX\Map\Props\oxygen_cylinder_wheelbarrow.b3d")
    GUESSEDloadfiletype_2($8F, "GFX\Map\Props\paper.b3d")
    GUESSEDloadfiletype_2($90, "GFX\Map\Props\Pawn.b3d")
    GUESSEDloadfiletype_2($91, "GFX\Map\Props\Pencil.b3d")
    GUESSEDloadfiletype_2($92, "GFX\Map\Props\penny.b3d")
    GUESSEDloadfiletype_2($93, "GFX\Map\Props\Pipe_curved.b3d")
    GUESSEDloadfiletype_2($94, "GFX\Map\Props\Pipe_long.b3d")
    GUESSEDloadfiletype_2($95, "GFX\Map\Props\Pipe_short.b3d")
    GUESSEDloadfiletype_2($96, "GFX\Map\Props\Pipe_T.b3d")
    GUESSEDloadfiletype_2($97, "GFX\Map\Props\Plant.b3d")
    GUESSEDloadfiletype_2($98, "GFX\Map\Props\plant2.b3d")
    GUESSEDloadfiletype_2($99, "GFX\Map\Props\printer.b3d")
    GUESSEDloadfiletype_2($9A, "GFX\Map\Props\Queen.b3d")
    GUESSEDloadfiletype_2($9B, "GFX\Map\Props\rock.b3d")
    GUESSEDloadfiletype_2($9C, "GFX\Map\Props\rock2.b3d")
    GUESSEDloadfiletype_2($9D, "GFX\Map\Props\Rook.b3d")
    GUESSEDloadfiletype_2($9F, "GFX\Map\Props\scp_012.b3d")
    GUESSEDloadfiletype_2($A0, "GFX\Map\Props\scp_079.b3d")
    GUESSEDloadfiletype_2($A1, "GFX\Map\Props\scp_096_box.b3d")
    GUESSEDloadfiletype_2($A2, "GFX\Map\Props\scp_205.b3d")
    GUESSEDloadfiletype_2($A3, "GFX\Map\Props\scp_294.b3d")
    GUESSEDloadfiletype_2($A4, "GFX\Map\Props\scp_409.b3d")
    GUESSEDloadfiletype_2($A5, "GFX\Map\Props\scp_409_crystals.b3d")
    GUESSEDloadfiletype_2($A6, "GFX\Map\Props\scp_458.b3d")
    GUESSEDloadfiletype_2($A7, "GFX\Map\Props\scp_513_jelly.b3d")
    GUESSEDloadfiletype_2($A8, "GFX\Map\Props\scp_789_j.b3d")
    GUESSEDloadfiletype_2($A9, "GFX\Map\Props\scp_895.b3d")
    GUESSEDloadfiletype_2($AA, "GFX\Map\Props\scp_914_gears.b3d")
    GUESSEDloadfiletype_2($AB, "GFX\Map\Props\scp_914_key.b3d")
    GUESSEDloadfiletype_2($AC, "GFX\Map\Props\scp_914_knob.b3d")
    GUESSEDloadfiletype_2($AD, "GFX\Map\Props\sharpie.b3d")
    GUESSEDloadfiletype_2($AE, "GFX\Map\Props\shelves_a.b3d")
    GUESSEDloadfiletype_2($AF, "GFX\Map\Props\shelves_b.b3d")
    GUESSEDloadfiletype_2($B0, "GFX\Map\Props\shelves_c.b3d")
    GUESSEDloadfiletype_2($B1, "GFX\Map\Props\shelves_d.b3d")
    GUESSEDloadfiletype_2($B2, "GFX\Map\Props\sink.b3d")
    GUESSEDloadfiletype_2($B3, "GFX\Map\Props\sofa.b3d")
    GUESSEDloadfiletype_2($B4, "GFX\Map\Props\speaker.b3d")
    GUESSEDloadfiletype_2($B5, "GFX\Map\Props\surgical_lamp.b3d")
    GUESSEDloadfiletype_2($B6, "GFX\Map\Props\system_unit.b3d")
    GUESSEDloadfiletype_2($B7, "GFX\Map\Props\table_a.b3d")
    GUESSEDloadfiletype_2($B8, "GFX\Map\Props\table_b.b3d")
    GUESSEDloadfiletype_2($B9, "GFX\Map\Props\table_c.b3d")
    GUESSEDloadfiletype_2($BA, "GFX\Map\Props\table_d.b3d")
    GUESSEDloadfiletype_2($BB, "GFX\Map\Props\table_e.b3d")
    GUESSEDloadfiletype_2($BC, "GFX\Map\Props\Tank1.b3d")
    GUESSEDloadfiletype_2($BD, "GFX\Map\Props\Tank2.b3d")
    GUESSEDloadfiletype_2($BE, "GFX\Map\Props\throne_wall.b3d")
    GUESSEDloadfiletype_2($BF, "GFX\Map\Props\toilet.b3d")
    GUESSEDloadfiletype_2($C0, "GFX\Map\Props\Toolbox.b3d")
    GUESSEDloadfiletype_2($C1, "GFX\Map\Props\tree.b3d")
    GUESSEDloadfiletype_2($C2, "GFX\Map\Props\tree1.b3d")
    GUESSEDloadfiletype_2($C3, "GFX\Map\Props\tree2.b3d")
    GUESSEDloadfiletype_2($C4, "GFX\Map\Props\trolley_bed.b3d")
    GUESSEDloadfiletype_2($C5, "GFX\Map\Props\ventilation_grate.b3d")
    GUESSEDloadfiletype_2($C6, "GFX\Map\Props\walker.b3d")
    GUESSEDloadfiletype_2($C7, "GFX\Map\Props\watches.b3d")
    GUESSEDloadfiletype_2($C8, "GFX\Map\Props\water_cooler.b3d")
    GUESSEDloadfiletype_2($C9, "GFX\Map\Props\wet_floor_sign.b3d")
    GUESSEDloadfiletype_2($CA, "GFX\Map\Props\wooden_box.b3d")
    GUESSEDloadfiletype_2($CB, "GFX\Map\Props\Yucca.b3d")
    GUESSEDloadfiletype_2($CC, "GFX\Map\room2C_2_ez_hb.b3d")
    GUESSEDloadfiletype_2($CD, "GFX\Map\room2_3_ez_hb.b3d")
    GUESSEDloadfiletype_2($CE, "GFX\Map\room2_office_2_hb.b3d")
    GUESSEDloadfiletype_2($CF, "GFX\Map\room2_servers_hcz_hb.b3d")
    GUESSEDloadfiletype_2($D0, "GFX\Map\room2_test_hcz_hb.b3d")
    GUESSEDloadfiletype_2($D1, "GFX\Map\room3_ez_hb.b3d")
    GUESSEDloadfiletype_2($D2, "GFX\Map\room3_office_hb.b3d")
    GUESSEDloadfiletype_2($D3, "GFX\Map\room4_2_ez_hb.b3d")
    GUESSEDloadfiletype_2($D4, "GFX\NPCs\apache.b3d")
    GUESSEDloadfiletype_2($D5, "GFX\NPCs\apache_rotor(2).b3d")
    GUESSEDloadfiletype_2($D6, "GFX\NPCs\apache_rotor.b3d")
    GUESSEDloadfiletype_2($D7, "GFX\NPCs\Chaos_m.b3d")
    GUESSEDloadfiletype_2($D8, "GFX\NPCs\CI.b3d")
    GUESSEDloadfiletype_2($D9, "GFX\NPCs\class_d.b3d")
    GUESSEDloadfiletype_2($DA, "GFX\NPCs\clerk.b3d")
    GUESSEDloadfiletype_2($DB, "GFX\NPCs\duck.b3d")
    GUESSEDloadfiletype_2($DC, "GFX\NPCs\guard.b3d")
    GUESSEDloadfiletype_2($DD, "GFX\NPCs\guard_m.b3d")
    GUESSEDloadfiletype_2($DE, "GFX\NPCs\MTF.b3d")
    GUESSEDloadfiletype_2($DF, "GFX\NPCs\MTF_m.b3d")
    GUESSEDloadfiletype_2($E0, "GFX\NPCs\nazi_officer.b3d")
    GUESSEDloadfiletype_2($E1, "GFX\NPCs\scp_008_1.b3d")
    GUESSEDloadfiletype_2($E2, "GFX\NPCs\scp_035_sad.b3d")
    GUESSEDloadfiletype_2($E3, "GFX\NPCs\scp_035_smile.b3d")
    GUESSEDloadfiletype_2($E4, "GFX\NPCs\scp_035_tentacle.b3d")
    GUESSEDloadfiletype_2($E5, "GFX\NPCs\scp_049.b3d")
    GUESSEDloadfiletype_2($E6, "GFX\NPCs\scp_049_2.b3d")
    GUESSEDloadfiletype_2($E7, "GFX\NPCs\scp_066.b3d")
    GUESSEDloadfiletype_2($E8, "GFX\NPCs\scp_096.b3d")
    GUESSEDloadfiletype_2($E9, "GFX\NPCs\scp_1048.b3d")
    GUESSEDloadfiletype_2($EA, "GFX\NPCs\scp_1048_a.b3d")
    GUESSEDloadfiletype_2($EB, "GFX\NPCs\scp_106.b3d")
    GUESSEDloadfiletype_2($EC, "GFX\NPCs\scp_106_m.b3d")
    GUESSEDloadfiletype_2($ED, "GFX\NPCs\scp_1499_1.b3d")
    GUESSEDloadfiletype_2($EE, "GFX\NPCs\scp_173_body.b3d")
    GUESSEDloadfiletype_2($EF, "GFX\NPCs\scp_173_box.b3d")
    GUESSEDloadfiletype_2($F0, "GFX\NPCs\scp_173_head.b3d")
    GUESSEDloadfiletype_2($F1, "GFX\NPCs\scp_173_m.b3d")
    GUESSEDloadfiletype_2($F2, "GFX\NPCs\scp_205_demon(2).b3d")
    GUESSEDloadfiletype_2($F3, "GFX\NPCs\scp_205_demon(3).b3d")
    GUESSEDloadfiletype_2($F4, "GFX\NPCs\scp_205_demon.b3d")
    GUESSEDloadfiletype_2($F5, "GFX\NPCs\scp_205_woman.b3d")
    GUESSEDloadfiletype_2($F6, "GFX\NPCs\scp_372.b3d")
    GUESSEDloadfiletype_2($F7, "GFX\NPCs\scp_513_1.b3d")
    GUESSEDloadfiletype_2($F8, "GFX\NPCs\scp_682_arm.b3d")
    GUESSEDloadfiletype_2($F9, "GFX\NPCs\scp_860_2.b3d")
    GUESSEDloadfiletype_2($FA, "GFX\NPCs\scp_939.b3d")
    GUESSEDloadfiletype_2($FC, "GFX\NPCs\scp_966.b3d")
    GUESSEDloadfiletype_2($FD, "GFX\NPCs\scp_966_m.b3d")
    GUESSEDloadfiletype_2($FE, "GFX\NPCs\scp_999.b3d")
    GUESSEDloadfiletype_2($FF, "GFX\NPCs\vehicle.b3d")
    GUESSEDloadfiletype_2($100, "GFX\Map\Props\recontainer.b3d")
    GUESSEDloadfiletype($00, "GFX\Map\Textures\106sky_back.png")
    GUESSEDloadfiletype($01, "GFX\Map\Textures\106sky_front.png")
    GUESSEDloadfiletype($02, "GFX\Map\Textures\106sky_left.png")
    GUESSEDloadfiletype($03, "GFX\Map\Textures\106sky_right.png")
    GUESSEDloadfiletype($04, "GFX\Map\Textures\106sky_up.png")
    GUESSEDloadfiletype($05, "GFX\Map\Textures\1499sky_back.png")
    GUESSEDloadfiletype($06, "GFX\Map\Textures\1499sky_front.png")
    GUESSEDloadfiletype($07, "GFX\Map\Textures\1499sky_left.png")
    GUESSEDloadfiletype($08, "GFX\Map\Textures\1499sky_right.png")
    GUESSEDloadfiletype($09, "GFX\Map\Textures\1499sky_up.png")
    GUESSEDloadfiletype($0A, "GFX\Map\Textures\2daccum.png")
    GUESSEDloadfiletype($0B, "GFX\Map\Textures\2ddd.png")
    GUESSEDloadfiletype($0C, "GFX\Map\Textures\2_office_lamps_dif.jpg")
    GUESSEDloadfiletype($0D, "GFX\Map\Textures\6646.png")
    GUESSEDloadfiletype($0E, "GFX\Map\Textures\914.png")
    GUESSEDloadfiletype($0F, "GFX\Map\Textures\914board.png")
    GUESSEDloadfiletype($10, "GFX\Map\Textures\air_duct.jpg")
    GUESSEDloadfiletype($11, "GFX\Map\Textures\alcohol_hand_gel.png")
    GUESSEDloadfiletype($12, "GFX\Map\Textures\alcohol_hand_gel_bloody.png")
    GUESSEDloadfiletype($13, "GFX\Map\Textures\baffle.png")
    GUESSEDloadfiletype($14, "GFX\Map\Textures\balon3_Base_color.png")
    GUESSEDloadfiletype($15, "GFX\Map\Textures\barrel.png")
    GUESSEDloadfiletype($16, "GFX\Map\Textures\bathroomwall.png")
    GUESSEDloadfiletype($17, "GFX\Map\Textures\Black_Boxfile.png")
    GUESSEDloadfiletype($18, "GFX\Map\Textures\Book1.png")
    GUESSEDloadfiletype($19, "GFX\Map\Textures\Book10.png")
    GUESSEDloadfiletype($1A, "GFX\Map\Textures\Book11.png")
    GUESSEDloadfiletype($1B, "GFX\Map\Textures\Book2.png")
    GUESSEDloadfiletype($1C, "GFX\Map\Textures\Book3.png")
    GUESSEDloadfiletype($1D, "GFX\Map\Textures\Book4.png")
    GUESSEDloadfiletype($1E, "GFX\Map\Textures\Book5.png")
    GUESSEDloadfiletype($1F, "GFX\Map\Textures\Book6.png")
    GUESSEDloadfiletype($20, "GFX\Map\Textures\Book7.png")
    GUESSEDloadfiletype($21, "GFX\Map\Textures\Book8.png")
    GUESSEDloadfiletype($22, "GFX\Map\Textures\Book9.png")
    GUESSEDloadfiletype($23, "GFX\Map\Textures\bowl.png")
    GUESSEDloadfiletype($24, "GFX\Map\Textures\box.png")
    GUESSEDloadfiletype($25, "GFX\Map\Textures\branch.png")
    GUESSEDloadfiletype($26, "GFX\Map\Textures\brickwall.png")
    GUESSEDloadfiletype($27, "GFX\Map\Textures\bucket.png")
    GUESSEDloadfiletype($28, "GFX\Map\Textures\cabinet_a.png")
    GUESSEDloadfiletype($29, "GFX\Map\Textures\cable_black.jpg")
    GUESSEDloadfiletype($2A, "GFX\Map\Textures\cable_gray.jpg")
    GUESSEDloadfiletype($2B, "GFX\Map\Textures\cable_green.jpg")
    GUESSEDloadfiletype($2C, "GFX\Map\Textures\cable_light_block.jpg")
    GUESSEDloadfiletype($2D, "GFX\Map\Textures\cable_red.jpg")
    GUESSEDloadfiletype($2E, "GFX\Map\Textures\cable_white.jpg")
    GUESSEDloadfiletype($2F, "GFX\Map\Textures\cable_yellow.jpg")
    GUESSEDloadfiletype($30, "GFX\Map\Textures\camera(1).png")
    GUESSEDloadfiletype($31, "GFX\Map\Textures\camera(2).png")
    GUESSEDloadfiletype($32, "GFX\Map\Textures\caution.jpg")
    GUESSEDloadfiletype($33, "GFX\Map\Textures\ceiling.jpg")
    GUESSEDloadfiletype($34, "GFX\Map\Textures\cloth.jpg")
    GUESSEDloadfiletype($35, "GFX\Map\Textures\ColoredTiles.png")
    GUESSEDloadfiletype($36, "GFX\Map\Textures\concrete.jpg")
    GUESSEDloadfiletype($37, "GFX\Map\Textures\concretefloor.jpg")
    GUESSEDloadfiletype($38, "GFX\Map\Textures\concretefloor2.png")
    GUESSEDloadfiletype($39, "GFX\Map\Textures\concretefloor_dark.jpg")
    GUESSEDloadfiletype($3A, "GFX\Map\Textures\concretemoss.jpg")
    GUESSEDloadfiletype($3B, "GFX\Map\Textures\concretewall.jpg")
    GUESSEDloadfiletype($3C, "GFX\Map\Textures\concretewall2.png")
    GUESSEDloadfiletype($3D, "GFX\Map\Textures\concretewall_009.png")
    GUESSEDloadfiletype($3E, "GFX\Map\Textures\conference_screen.png")
    GUESSEDloadfiletype($3F, "GFX\Map\Textures\confwall.png")
    GUESSEDloadfiletype($40, "GFX\Map\Textures\containment_doors.jpg")
    GUESSEDloadfiletype($41, "GFX\Map\Textures\containment_doors_Corrosive.png")
    GUESSEDloadfiletype($42, "GFX\Map\Textures\controlpanel.jpg")
    GUESSEDloadfiletype($43, "GFX\Map\Textures\controlpanel2.jpg")
    GUESSEDloadfiletype($44, "GFX\Map\Textures\crate5.png")
    GUESSEDloadfiletype($45, "GFX\Map\Textures\crtbey.png")
    GUESSEDloadfiletype($46, "GFX\Map\Textures\crtrec.png")
    GUESSEDloadfiletype($47, "GFX\Map\Textures\crtroc.jpg")
    GUESSEDloadfiletype($48, "GFX\Map\Textures\ctbathroomwall.png")
    GUESSEDloadfiletype($49, "GFX\Map\Textures\ctconcretewalls.png")
    GUESSEDloadfiletype($4A, "GFX\Map\Textures\ctwalls.png")
    GUESSEDloadfiletype($4B, "GFX\Map\Textures\ctwalls2.png")
    GUESSEDloadfiletype($4C, "GFX\Map\Textures\darkwoodcrate.png")
    GUESSEDloadfiletype($4D, "GFX\Map\Textures\decorativemetal.png")
    GUESSEDloadfiletype($4E, "GFX\Map\Textures\Direction372.png")
    GUESSEDloadfiletype($4F, "GFX\Map\Textures\Direction409.png")
    GUESSEDloadfiletype($50, "GFX\Map\Textures\dirt.png")
    GUESSEDloadfiletype($51, "GFX\Map\Textures\dirtymetal.jpg")
    GUESSEDloadfiletype($52, "GFX\Map\Textures\Door01.jpg")
    GUESSEDloadfiletype($53, "GFX\Map\Textures\Door01_914.png")
    GUESSEDloadfiletype($54, "GFX\Map\Textures\Door01_Corrosive.png")
    GUESSEDloadfiletype($55, "GFX\Map\Textures\Door02.png")
    GUESSEDloadfiletype($56, "GFX\Map\Textures\DoorWooden.png")
    GUESSEDloadfiletype($57, "GFX\Map\Textures\double_desk.png")
    GUESSEDloadfiletype($58, "GFX\Map\Textures\ElecBox.jpg")
    GUESSEDloadfiletype($59, "GFX\Map\Textures\elevator_ceiling.png")
    GUESSEDloadfiletype($5A, "GFX\Map\Textures\elevator_floor.png")
    GUESSEDloadfiletype($5B, "GFX\Map\Textures\elevator_panel_down.png")
    GUESSEDloadfiletype($5C, "GFX\Map\Textures\elevator_panel_idle.png")
    GUESSEDloadfiletype($5D, "GFX\Map\Textures\elevator_panel_up.png")
    GUESSEDloadfiletype($5E, "GFX\Map\Textures\elevator_wall.png")
    GUESSEDloadfiletype($5F, "GFX\Map\Textures\fire_alarm.png")
    GUESSEDloadfiletype($60, "GFX\Map\Textures\fire_extinguisher.png")
    GUESSEDloadfiletype($61, "GFX\Map\Textures\fizzmachine.png")
    GUESSEDloadfiletype($62, "GFX\Map\Textures\foam_padding.png")
    GUESSEDloadfiletype($63, "GFX\Map\Textures\forestfloor.png")
    GUESSEDloadfiletype($64, "GFX\Map\Textures\forestpath.png")
    GUESSEDloadfiletype($65, "GFX\Map\Textures\forklift.png")
    GUESSEDloadfiletype($66, "GFX\Map\Textures\gears.jpg")
    GUESSEDloadfiletype($67, "GFX\Map\Textures\gift.png")
    GUESSEDloadfiletype($68, "GFX\Map\Textures\glass.png")
    GUESSEDloadfiletype($69, "GFX\Map\Textures\granite.png")
    GUESSEDloadfiletype($6A, "GFX\Map\Textures\grass.jpg")
    GUESSEDloadfiletype($6B, "GFX\Map\Textures\gravel.jpg")
    GUESSEDloadfiletype($6C, "GFX\Map\Textures\grit1.jpg")
    GUESSEDloadfiletype($6D, "GFX\Map\Textures\grit2.jpg")
    GUESSEDloadfiletype($6E, "GFX\Map\Textures\grit3.jpg")
    GUESSEDloadfiletype($6F, "GFX\Map\Textures\hardmetalwall.png")
    GUESSEDloadfiletype($70, "GFX\Map\Textures\HCZdoor.jpg")
    GUESSEDloadfiletype($71, "GFX\Map\Textures\HCZSupportWall.png")
    GUESSEDloadfiletype($72, "GFX\Map\Textures\Keyboard.png")
    GUESSEDloadfiletype($73, "GFX\Map\Textures\KeyPad.jpg")
    GUESSEDloadfiletype($74, "GFX\Map\Textures\keypad_106.png")
    GUESSEDloadfiletype($75, "GFX\Map\Textures\keypad_locked.png")
    GUESSEDloadfiletype($76, "GFX\Map\Textures\keypad_using.png")
    GUESSEDloadfiletype($77, "GFX\Map\Textures\lamp_c.png")
    GUESSEDloadfiletype($78, "GFX\Map\Textures\lamp_d.png")
    GUESSEDloadfiletype($79, "GFX\Map\Textures\lamp_e.png")
    GUESSEDloadfiletype($7A, "GFX\Map\Textures\lamp_f.png")
    GUESSEDloadfiletype($7B, "GFX\Map\Textures\lamp_h.png")
    GUESSEDloadfiletype($7C, "GFX\Map\Textures\laser.png")
    GUESSEDloadfiletype($7D, "GFX\Map\Textures\lavender..png")
    GUESSEDloadfiletype($7E, "GFX\Map\Textures\leaf.jpg")
    GUESSEDloadfiletype($7F, "GFX\Map\Textures\lightcone.png")
    GUESSEDloadfiletype($80, "GFX\Map\Textures\Logo_of_the_SCP_Foundation.png")
    GUESSEDloadfiletype($81, "GFX\Map\Textures\marble.png")
    GUESSEDloadfiletype($82, "GFX\Map\Textures\marker_blue.png")
    GUESSEDloadfiletype($83, "GFX\Map\Textures\marker_green.png")
    GUESSEDloadfiletype($84, "GFX\Map\Textures\marker_red.png")
    GUESSEDloadfiletype($85, "GFX\Map\Textures\marker_yellow.png")
    GUESSEDloadfiletype($86, "GFX\Map\Textures\mat_glass.png")
    GUESSEDloadfiletype($87, "GFX\Map\Textures\mechanical_lever.png")
    GUESSEDloadfiletype($88, "GFX\Map\Textures\medibaywall.png")
    GUESSEDloadfiletype($89, "GFX\Map\Textures\metal.jpg")
    GUESSEDloadfiletype($8A, "GFX\Map\Textures\metal3.jpg")
    GUESSEDloadfiletype($8B, "GFX\Map\Textures\metalpanels.png")
    GUESSEDloadfiletype($8C, "GFX\Map\Textures\metalpanels2.png")
    GUESSEDloadfiletype($8D, "GFX\Map\Textures\metalpanels2bloody1.png")
    GUESSEDloadfiletype($8E, "GFX\Map\Textures\metalpanels2bloody2.png")
    GUESSEDloadfiletype($8F, "GFX\Map\Textures\metalwall.png")
    GUESSEDloadfiletype($90, "GFX\Map\Textures\metal_curtain.jpg")
    GUESSEDloadfiletype($91, "GFX\Map\Textures\metal_darker.jpg")
    GUESSEDloadfiletype($92, "GFX\Map\Textures\microscope.png")
    GUESSEDloadfiletype($93, "GFX\Map\Textures\misc.jpg")
    GUESSEDloadfiletype($94, "GFX\Map\Textures\misc_signs(0).png")
    GUESSEDloadfiletype($95, "GFX\Map\Textures\misc_signs(1).png")
    GUESSEDloadfiletype($96, "GFX\Map\Textures\misc_signs(2).png")
    GUESSEDloadfiletype($97, "GFX\Map\Textures\misc_signs(3).png")
    GUESSEDloadfiletype($98, "GFX\Map\Textures\misc_signs(4).png")
    GUESSEDloadfiletype($99, "GFX\Map\Textures\misc_signs(5).png")
    GUESSEDloadfiletype($9A, "GFX\Map\Textures\misc_signs(6).png")
    GUESSEDloadfiletype($9B, "GFX\Map\Textures\misc_signs(7).png")
    GUESSEDloadfiletype($9C, "GFX\Map\Textures\misc_signs(8).png")
    GUESSEDloadfiletype($9D, "GFX\Map\Textures\monitor.png")
    GUESSEDloadfiletype($9E, "GFX\Map\Textures\MonitorTexture.jpg")
    GUESSEDloadfiletype($9F, "GFX\Map\Textures\MonitorTexture2.jpg")
    GUESSEDloadfiletype($A0, "GFX\Map\Textures\mop.png")
    GUESSEDloadfiletype($A1, "GFX\Map\Textures\mouse.png")
    GUESSEDloadfiletype($A2, "GFX\Map\Textures\mug.png")
    GUESSEDloadfiletype($A3, "GFX\Map\Textures\newyeartree_2.png")
    GUESSEDloadfiletype($A4, "GFX\Map\Textures\note(0).png")
    GUESSEDloadfiletype($A5, "GFX\Map\Textures\note(1).png")
    GUESSEDloadfiletype($A6, "GFX\Map\Textures\OfficeDoor.png")
    GUESSEDloadfiletype($A7, "GFX\Map\Textures\officeseat_a.png")
    GUESSEDloadfiletype($A8, "GFX\Map\Textures\officeseat_b.png")
    GUESSEDloadfiletype($A9, "GFX\Map\Textures\officewall.png")
    GUESSEDloadfiletype($AA, "GFX\Map\Textures\oxygen_cylinder_wheelbarrow.png")
    GUESSEDloadfiletype($AB, "GFX\Map\Textures\paper.png")
    GUESSEDloadfiletype($AC, "GFX\Map\Textures\paper_app_gears.png")
    GUESSEDloadfiletype($AD, "GFX\Map\Textures\paper_app_harp.png")
    GUESSEDloadfiletype($AE, "GFX\Map\Textures\paper_app_L.png")
    GUESSEDloadfiletype($AF, "GFX\Map\Textures\paper_app_maynard.png")
    GUESSEDloadfiletype($B0, "GFX\Map\Textures\paper_app_medibay.png")
    GUESSEDloadfiletype($B1, "GFX\Map\Textures\paper_app_rosewood.png")
    GUESSEDloadfiletype($B2, "GFX\Map\Textures\PC_UNIT.png")
    GUESSEDloadfiletype($B3, "GFX\Map\Textures\pdfloor.jpg")
    GUESSEDloadfiletype($B4, "GFX\Map\Textures\pdwall.jpg")
    GUESSEDloadfiletype($B5, "GFX\Map\Textures\Pencil.png")
    GUESSEDloadfiletype($B6, "GFX\Map\Textures\penny.png")
    GUESSEDloadfiletype($B7, "GFX\Map\Textures\Picture(0).png")
    GUESSEDloadfiletype($B8, "GFX\Map\Textures\Pipes.jpg")
    GUESSEDloadfiletype($B9, "GFX\Map\Textures\Pipes_NoRust.png")
    GUESSEDloadfiletype($BA, "GFX\Map\Textures\Plant.png")
    GUESSEDloadfiletype($BB, "GFX\Map\Textures\plants2.png")
    GUESSEDloadfiletype($BC, "GFX\Map\Textures\printer.png")
    GUESSEDloadfiletype($BD, "GFX\Map\Textures\projector.png")
    GUESSEDloadfiletype($BE, "GFX\Map\Textures\projector_accumulator.png")
    GUESSEDloadfiletype($BF, "GFX\Map\Textures\recontainer.png")
    GUESSEDloadfiletype($C0, "GFX\Map\Textures\Red_BoxFile.png")
    GUESSEDloadfiletype($C1, "GFX\Map\Textures\rock.jpg")
    GUESSEDloadfiletype($C2, "GFX\Map\Textures\rockmoss.jpg")
    GUESSEDloadfiletype($C3, "GFX\Map\Textures\RunMovie.png")
    GUESSEDloadfiletype($C4, "GFX\Map\Textures\scplogo.jpg")
    GUESSEDloadfiletype($C5, "GFX\Map\Textures\scp_009.png")
    GUESSEDloadfiletype($C6, "GFX\Map\Textures\scp_012(1).png")
    GUESSEDloadfiletype($C7, "GFX\Map\Textures\scp_012(2).png")
    GUESSEDloadfiletype($C8, "GFX\Map\Textures\scp_012(3).png")
    GUESSEDloadfiletype($C9, "GFX\Map\Textures\scp_012(4).png")
    GUESSEDloadfiletype($CA, "GFX\Map\Textures\scp_079.png")
    GUESSEDloadfiletype($CB, "GFX\Map\Textures\scp_096_box.png")
    GUESSEDloadfiletype($CC, "GFX\Map\Textures\scp_1162_arc.png")
    GUESSEDloadfiletype($CD, "GFX\Map\Textures\scp_1162_arc_wall.png")
    GUESSEDloadfiletype($CE, "GFX\Map\Textures\scp_148.png")
    GUESSEDloadfiletype($CF, "GFX\Map\Textures\scp_205.png")
    GUESSEDloadfiletype($D0, "GFX\Map\Textures\scp_294.png")
    GUESSEDloadfiletype($D1, "GFX\Map\Textures\scp_409.png")
    GUESSEDloadfiletype($D2, "GFX\Map\Textures\scp_409_crystals.png")
    GUESSEDloadfiletype($D3, "GFX\Map\Textures\scp_457_chamber.png")
    GUESSEDloadfiletype($D4, "GFX\Map\Textures\scp_458.png")
    GUESSEDloadfiletype($D5, "GFX\Map\Textures\scp_458_box.png")
    GUESSEDloadfiletype($D6, "GFX\Map\Textures\scp_789_j_face.png")
    GUESSEDloadfiletype($D7, "GFX\Map\Textures\servers1.png")
    GUESSEDloadfiletype($D8, "GFX\Map\Textures\Sharpie.png")
    GUESSEDloadfiletype($D9, "GFX\Map\Textures\shelves_f.png")
    GUESSEDloadfiletype($DA, "GFX\Map\Textures\sky_back.png")
    GUESSEDloadfiletype($DB, "GFX\Map\Textures\sky_back_001.png")
    GUESSEDloadfiletype($DC, "GFX\Map\Textures\sky_down.png")
    GUESSEDloadfiletype($DD, "GFX\Map\Textures\sky_front.png")
    GUESSEDloadfiletype($DE, "GFX\Map\Textures\sky_front_001.png")
    GUESSEDloadfiletype($DF, "GFX\Map\Textures\sky_left.png")
    GUESSEDloadfiletype($E0, "GFX\Map\Textures\sky_left_001.png")
    GUESSEDloadfiletype($E1, "GFX\Map\Textures\sky_right.png")
    GUESSEDloadfiletype($E2, "GFX\Map\Textures\sky_right_001.png")
    GUESSEDloadfiletype($E3, "GFX\Map\Textures\sky_up.png")
    GUESSEDloadfiletype($E4, "GFX\Map\Textures\sky_up_001.png")
    GUESSEDloadfiletype($E5, "GFX\Map\Textures\snow.png")
    GUESSEDloadfiletype($E6, "GFX\Map\Textures\soft grey.jpg")
    GUESSEDloadfiletype($E7, "GFX\Map\Textures\speaker.png")
    GUESSEDloadfiletype($E8, "GFX\Map\Textures\steelfloor.jpg")
    GUESSEDloadfiletype($E9, "GFX\Map\Textures\sun.png")
    GUESSEDloadfiletype($EA, "GFX\Map\Textures\surgical_lamp.png")
    GUESSEDloadfiletype($EB, "GFX\Map\Textures\table_d.png")
    GUESSEDloadfiletype($EC, "GFX\Map\Textures\tank1.jpg")
    GUESSEDloadfiletype($ED, "GFX\Map\Textures\tank2.jpg")
    GUESSEDloadfiletype($EE, "GFX\Map\Textures\tank2_damaged.png")
    GUESSEDloadfiletype($EF, "GFX\Map\Textures\tank_argon.png")
    GUESSEDloadfiletype($F0, "GFX\Map\Textures\tank_oxygen.png")
    GUESSEDloadfiletype($F1, "GFX\Map\Textures\tilefloor.jpg")
    GUESSEDloadfiletype($F2, "GFX\Map\Textures\toilet.jpg")
    GUESSEDloadfiletype($F3, "GFX\Map\Textures\Toolbox.png")
    GUESSEDloadfiletype($F4, "GFX\Map\Textures\tree1.jpg")
    GUESSEDloadfiletype($F5, "GFX\Map\Textures\tree1.png")
    GUESSEDloadfiletype($F6, "GFX\Map\Textures\trolley_bed.png")
    GUESSEDloadfiletype($F7, "GFX\Map\Textures\TV.png")
    GUESSEDloadfiletype($F8, "GFX\Map\Textures\vent.png")
    GUESSEDloadfiletype($F9, "GFX\Map\Textures\vent2.png")
    GUESSEDloadfiletype($FA, "GFX\Map\Textures\walker.png")
    GUESSEDloadfiletype($FB, "GFX\Map\Textures\watches.png")
    GUESSEDloadfiletype($FC, "GFX\Map\Textures\water.png")
    GUESSEDloadfiletype($FD, "GFX\Map\Textures\water_cooler.png")
    GUESSEDloadfiletype($FE, "GFX\Map\Textures\wet_floor.png")
    GUESSEDloadfiletype($FF, "GFX\Map\Textures\white.png")
    GUESSEDloadfiletype($100, "GFX\Map\Textures\whitewall.png")
    GUESSEDloadfiletype($101, "GFX\Map\Textures\wood.jpg")
    For local0 = Each T402X2Z846
        If (len(local0\Field1) > $00) Then
            GUESSEDplayid(local0\Field1, $01)
            local0\Field1 = ""
        EndIf
    Next
    If (GUESSEDupdateanimatenpc() <> 0) Then
        Select selecteddifficulty\Field1
            Case $00
                YX26B040F4 = $2710
            Case $01
                YX26B040F4 = $4E20
            Case $02,$03
                YX26B040F4 = $7530
        End Select
        FD020X0BZ\Field4 = YX26B040F4
    EndIf
    FD020X0BZ\Field5 = $01
    GUESSEDupdateextract()
    GUESSEDloadflash()
    Return $00
End Function

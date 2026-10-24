Function TXZD02FB0ZX%()
    Local local0.T402X2Z846
    Local local1.X44ZF6442X
    Local local2.TB86B8F2BX
    Local local3.X0442B862F
    For local0 = Each T402X2Z846
        If (len(local0\Field1) > $00) Then
            TX4XZ6XBFX4(local0\Field1, $01)
        EndIf
    Next
    TX864X664D2("Tahoma", ("GFX\Fonts\" + getfilelocalstring("Data\fonts.ini", "Tahoma", "File", "", $01)), 64.0, 1.0)
    TX864X664D2("Icons", ("GFX\Fonts\" + getfilelocalstring("Data\fonts.ini", "Icons", "File", "", $01)), 64.0, 1.0)
    D424F0DB6($01, "GFX\NPCs\class_d.b3d")
    Y462F42ZD($01, "GFX\NPCs\class_d.png", $01)
    Y462F42ZD($02, "GFX\NPCs\class_d(2).png", $01)
    Y462F42ZD($03, "GFX\NPCs\class_d(3).png", $01)
    Y462F42ZD($04, "GFX\NPCs\D_9341.png", $01)
    Y462F42ZD($05, "GFX\NPCs\class_d(4).png", $01)
    Y462F42ZD($06, "GFX\NPCs\class_d(5).png", $01)
    Y462F42ZD($08, "GFX\NPCs\Maynard.png", $00)
    Y462F42ZD($0A, "GFX\NPCs\scientist(1).png", $00)
    Y462F42ZD($0B, "GFX\NPCs\scientist(2).png", $00)
    Y462F42ZD($0C, "GFX\NPCs\scientist(3).png", $00)
    Y462F42ZD($0D, "GFX\NPCs\scientist(4).png", $00)
    Y462F42ZD($0E, "GFX\NPCs\scientist(5).png", $00)
    Y462F42ZD($0F, "GFX\NPCs\scientist.png", $00)
    Y462F42ZD($10, "GFX\NPCs\Franklin.png", $00)
    Y462F42ZD($11, "GFX\NPCs\janitor.png", $00)
    Y462F42ZD($15, "GFX\NPCs\class_d_zombie.png", $00)
    Y462F42ZD($16, "GFX\NPCs\scientist_zombie.png", $00)
    Y462F42ZD($17, "GFX\NPCs\janitor_zombie.png", $00)
    Y462F42ZD($18, "GFX\Items\hazmat_suit_bloody.png", $00)
    local1 = T60880B62X($01)
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
    local1\Field24 = (0.51 / meshwidth(BXF028D8B($01)))
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
    local1\Field58[$01] = XF2F44B806($D2, $EB)
    local1\Field52[$01] = 0.1
    local1\Field58[$02] = XF2F44B806($EC, $104)
    local1\Field52[$02] = 0.33
    local1\Field18[$02] = 45.0
    local1\Field58[$03] = XF2F44B806($464, $476)
    local1\Field52[$03] = 0.38
    local1\Field18[$03] = 30.0
    local1\Field58[$04] = XF2F44B806($165, $17D)
    local1\Field52[$04] = 0.1
    local1\Field58[$05] = XF2F44B806($17E, $196)
    local1\Field52[$05] = 0.3
    local1\Field18[$05] = 45.0
    local1\Field58[$06] = XF2F44B806($C1, $C5)
    local1\Field52[$06] = 0.025
    local1\Field58[$07] = XF2F44B806($C7, $D1)
    local1\Field52[$07] = 0.33
    local1\Field18[$07] = 35.0
    local1\Field58[$08] = XF2F44B806($322, $336)
    local1\Field52[$08] = 0.23
    local1\Field58[$09] = XF2F44B806($30D, $321)
    local1\Field52[$09] = 0.33
    local1\Field58[$0A] = XF2F44B806($337, $350)
    local1\Field52[$0A] = 0.33
    local1\Field6[$0A] = "Bip01_Head@Bip01_Neck@Bip01_Spine1@Bip01_Spine2@Bip01_L_Clavicle@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Hand@Bip01_R_Finger0@Bip01_RUpArmTwist@Bip01_R_Clavicle@Bip01_L_UpperArm@Bip01_L_Forearm@Bip01_L_Hand@Bip01_L_Finger0@Bip01_LUpArmTwist"
    local1\Field58[$0F] = XF2F44B806($337, $350)
    local1\Field52[$0F] = 0.33
    local1\Field6[$0F] = "Bip01_Head@Bip01_Neck@Bip01_Spine1@Bip01_Spine2@Bip01_L_Clavicle@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Hand@Bip01_R_Finger0@Bip01_RUpArmTwist@Bip01_R_Clavicle@Bip01_L_UpperArm@Bip01_L_Forearm@Bip01_L_Hand@Bip01_L_Finger0@Bip01_LUpArmTwist"
    local1\Field58[$19] = XF2F44B806($3A5, $3D5)
    local1\Field52[$19] = 0.33
    local1\Field6[$19] = "Bip01_Head@Bip01_Neck@Bip01_Spine1@Bip01_Spine2@Bip01_L_Clavicle@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Hand@Bip01_R_Finger0@Bip01_RUpArmTwist@Bip01_R_Clavicle@Bip01_L_UpperArm@Bip01_L_Forearm@Bip01_L_Hand@Bip01_L_Finger0@Bip01_LUpArmTwist"
    local1\Field58[$1A] = XF2F44B806($3A5, $3D5)
    local1\Field52[$1A] = 0.33
    local1\Field6[$1A] = "Bip01_Head@Bip01_Neck@Bip01_Spine1@Bip01_Spine2@Bip01_L_Clavicle@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Hand@Bip01_R_Finger0@Bip01_RUpArmTwist@Bip01_R_Clavicle@Bip01_L_UpperArm@Bip01_L_Forearm@Bip01_L_Hand@Bip01_L_Finger0@Bip01_LUpArmTwist"
    local1\Field58[$1B] = XF2F44B806($140, $164)
    local1\Field52[$1B] = 0.8
    local1\Field6[$1B] = "Bip01_Head@Bip01_Neck@Bip01_Spine1@Bip01_Spine2@Bip01_L_Clavicle@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Hand@Bip01_R_Finger0@Bip01_RUpArmTwist@Bip01_R_Clavicle@Bip01_L_UpperArm@Bip01_L_Forearm@Bip01_L_Hand@Bip01_L_Finger0@Bip01_LUpArmTwist"
    local1\Field58[$1C] = XF2F44B806($14B, $14E)
    local1\Field52[$1C] = 0.4
    local1\Field6[$1C] = "Bip01_Spine1@Bip01_Spine2@Bip01_L_Clavicle@Bip01_Neck@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Hand@Bip01_R_Finger0@Bip01_RUpArmTwist@Bip01_R_Clavicle"
    local1\Field58[$1D] = XF2F44B806($758, $758)
    local1\Field52[$1D] = 0.8
    local1\Field6[$1D] = "Bip01_Head@Bip01_Neck@Bip01_Spine1@Bip01_Spine2@Bip01_L_Clavicle@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Hand@Bip01_R_Finger0@Bip01_RUpArmTwist@Bip01_R_Clavicle@Bip01_L_UpperArm@Bip01_L_Forearm@Bip01_L_Hand@Bip01_L_Finger0@Bip01_LUpArmTwist"
    local1\Field58[$14] = XF2F44B806($43A, $461)
    local1\Field52[$14] = 1.0
    local1\Field58[$14] = XF2F44B806($43A, $461)
    local1\Field52[$14] = 1.0
    local1\Field5[$08] = $01
    local1\Field5[$09] = $01
    local1\Field22[$00] = XF2F44B806($01, $14)
    local1\Field26[$00] = 0.4
    local1\Field22[$01] = XF2F44B806($29, $3C)
    local1\Field26[$01] = 0.4
    local1\Field22[$02] = XF2F44B806($2A6, $2C7)
    local1\Field26[$02] = 0.4
    local1\Field22[$03] = XF2F44B806($2C8, $30B)
    local1\Field26[$03] = 0.4
    local1\Field22[$04] = XF2F44B806($4C1, $55A)
    local1\Field26[$04] = 0.6
    local1\Field61 = 10.0
    local1\Field14 = 35.0
    local1\Field36 = 6.5
    D424F0DB6($02, "GFX\Items\Wearable\Hazmat_wearmodel.b3d")
    Y462F42ZD($07, "GFX\Items\hazmat_suit.png", $00)
    TX6DFB06B44($07, "GFX\Items\hazmat_suit_bloody.png")
    Y462F42ZD($09, "GFX\Items\hazmat_suit_heavy.png", $00)
    TX6DFB06B44($09, "GFX\Items\hazmat_suit_heavy_bloody.png")
    local1 = T60880B62X($02)
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
    local1\Field58[$01] = XF2F44B806($D2, $EB)
    local1\Field52[$01] = 0.1
    local1\Field58[$02] = XF2F44B806($EC, $104)
    local1\Field52[$02] = 0.33
    local1\Field18[$02] = 40.0
    local1\Field58[$03] = XF2F44B806($12D, $13F)
    local1\Field52[$03] = 0.38
    local1\Field18[$03] = 30.0
    local1\Field58[$04] = XF2F44B806($165, $17D)
    local1\Field52[$04] = 0.1
    local1\Field58[$05] = XF2F44B806($17E, $196)
    local1\Field52[$05] = 0.3
    local1\Field18[$05] = 40.0
    local1\Field58[$06] = XF2F44B806($C1, $C5)
    local1\Field52[$06] = 0.025
    local1\Field58[$07] = XF2F44B806($C7, $D1)
    local1\Field52[$07] = 0.33
    local1\Field18[$07] = 35.0
    local1\Field58[$08] = XF2F44B806($165, $17D)
    local1\Field52[$08] = 0.25
    local1\Field58[$09] = XF2F44B806($17E, $196)
    local1\Field52[$09] = 0.25
    local1\Field58[$0A] = XF2F44B806($23D, $256)
    local1\Field52[$0A] = 0.33
    local1\Field6[$0A] = "Bip01_Head@Bip01_HeadNub@Bip01_Neck@Bip01_Spine1@Bip01_Spine2@Bip01_L_Clavicle@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Hand@Bip01_R_Finger0@Bip01_RUpArmTwist@Bip01_R_Clavicle@Bip01_L_UpperArm@Bip01_L_Forearm@Bip01_L_Hand@Bip01_L_Finger0@Bip01_LUpArmTwist"
    local1\Field58[$0F] = XF2F44B806($23D, $256)
    local1\Field52[$0F] = 0.33
    local1\Field6[$0F] = "Bip01_Head@Bip01_HeadNub@Bip01_Neck@Bip01_Spine1@Bip01_Spine2@Bip01_L_Clavicle@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Hand@Bip01_R_Finger0@Bip01_RUpArmTwist@Bip01_R_Clavicle@Bip01_L_UpperArm@Bip01_L_Forearm@Bip01_L_Hand@Bip01_L_Finger0@Bip01_LUpArmTwist"
    local1\Field58[$19] = XF2F44B806($2AC, $2DC)
    local1\Field52[$19] = 0.33
    local1\Field6[$19] = "Bip01_Head@Bip01_HeadNub@Bip01_Neck@Bip01_Spine1@Bip01_Spine2@Bip01_L_Clavicle@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Hand@Bip01_R_Finger0@Bip01_RUpArmTwist@Bip01_R_Clavicle@Bip01_L_UpperArm@Bip01_L_Forearm@Bip01_L_Hand@Bip01_L_Finger0@Bip01_LUpArmTwist"
    local1\Field58[$1A] = XF2F44B806($2AC, $2DC)
    local1\Field52[$1A] = 0.33
    local1\Field6[$1A] = "Bip01_Head@Bip01_HeadNub@Bip01_Neck@Bip01_Spine1@Bip01_Spine2@Bip01_L_Clavicle@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Hand@Bip01_R_Finger0@Bip01_RUpArmTwist@Bip01_R_Clavicle@Bip01_L_UpperArm@Bip01_L_Forearm@Bip01_L_Hand@Bip01_L_Finger0@Bip01_LUpArmTwist"
    local1\Field58[$1B] = XF2F44B806($140, $164)
    local1\Field52[$1B] = 0.8
    local1\Field6[$1B] = "Bip01_Head@Bip01_HeadNub@Bip01_Neck@Bip01_Spine1@Bip01_Spine2@Bip01_L_Clavicle@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Hand@Bip01_R_Finger0@Bip01_RUpArmTwist@Bip01_R_Clavicle@Bip01_L_UpperArm@Bip01_L_Forearm@Bip01_L_Hand@Bip01_L_Finger0@Bip01_LUpArmTwist"
    local1\Field58[$1C] = XF2F44B806($14B, $14E)
    local1\Field52[$1C] = 0.4
    local1\Field6[$1C] = "Bip01_Spine1@Bip01_Spine2@Bip01_L_Clavicle@Bip01_Neck@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Hand@Bip01_R_Finger0@Bip01_RUpArmTwist@Bip01_R_Clavicle"
    local1\Field58[$1D] = XF2F44B806($37F, $37F)
    local1\Field52[$1D] = 0.4
    local1\Field6[$1D] = "Bip01_Spine1@Bip01_Spine2@Bip01_L_Clavicle@Bip01_Neck@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Hand@Bip01_R_Finger0@Bip01_RUpArmTwist@Bip01_R_Clavicle"
    local1\Field22[$00] = XF2F44B806($01, $14)
    local1\Field26[$00] = 0.4
    local1\Field22[$01] = XF2F44B806($29, $3C)
    local1\Field26[$01] = 0.4
    local1\Field61 = 10.0
    local1\Field14 = 35.0
    local1\Field36 = 6.5
    XBB8DFD22Z($02, $00, "SFX\Character\D9341\BreathGasRelaxed.ogg", $00)
    D424F0DB6($09, "GFX\NPCs\guard_m.b3d")
    Y462F42ZD($14, "", $00)
    local1 = T60880B62X($09)
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
    local1\Field58[$01] = XF2F44B806($271, $2ED)
    local1\Field52[$01] = 0.2
    local1\Field58[$02] = XF2F44B806($2EE, $313)
    local1\Field52[$02] = 0.6
    local1\Field18[$02] = 45.0
    local1\Field58[$03] = XF2F44B806($2EE, $313)
    local1\Field52[$03] = 1.0
    local1\Field18[$03] = 30.0
    local1\Field58[$04] = XF2F44B806($360, $361)
    local1\Field52[$04] = 0.1
    local1\Field58[$05] = XF2F44B806($314, $339)
    local1\Field52[$05] = 0.5
    local1\Field18[$05] = 45.0
    local1\Field58[$06] = XF2F44B806($2EE, $313)
    local1\Field52[$06] = 0.6
    local1\Field58[$07] = XF2F44B806($2EE, $313)
    local1\Field52[$07] = 0.6
    local1\Field18[$07] = 35.0
    local1\Field58[$0A] = XF2F44B806($CA, $F4)
    local1\Field52[$0A] = 0.08
    local1\Field6[$0A] = "Upper Arm.L@Upper Arm.L.002@Lower Arm.L@Thumb01.L@Thumb02.L@Fingers01.L@Fingers02.L@Upper Arm.R@Upper Arm.R.002@Lower Arm.R@Hand.R@Thumb01.R@Paper@@Thumb02.R@Fingers01.R@Fingers02.R@Thumb01.R.001"
    local1\Field58[$0F] = XF2F44B806($CA, $F4)
    local1\Field52[$0F] = 0.08
    local1\Field6[$0F] = "Upper Arm.L@Upper Arm.L.002@Lower Arm.L@Thumb01.L@Thumb02.L@Fingers01.L@Fingers02.L@Upper Arm.R@Upper Arm.R.002@Lower Arm.R@Hand.R@Thumb01.R@Paper@@Thumb02.R@Fingers01.R@Fingers02.R@Thumb01.R.001"
    local1\Field58[$19] = XF2F44B806($364, $391)
    local1\Field52[$19] = 0.5
    local1\Field6[$19] = "Upper Arm.L@Upper Arm.L.002@Lower Arm.L@Thumb01.L@Thumb02.L@Fingers01.L@Fingers02.L@Upper Arm.R@Upper Arm.R.002@Lower Arm.R@Hand.R@Thumb01.R@Paper@@Thumb02.R@Fingers01.R@Fingers02.R@Thumb01.R.001"
    local1\Field58[$1A] = XF2F44B806($364, $391)
    local1\Field52[$1A] = 0.5
    local1\Field6[$1A] = "Upper Arm.L@Upper Arm.L.002@Lower Arm.L@Thumb01.L@Thumb02.L@Fingers01.L@Fingers02.L@Upper Arm.R@Upper Arm.R.002@Lower Arm.R@Hand.R@Thumb01.R@Paper@@Thumb02.R@Fingers01.R@Fingers02.R@Thumb01.R.001"
    local1\Field58[$1B] = XF2F44B806($392, $3AA)
    local1\Field52[$1B] = 0.7
    local1\Field6[$1B] = "Upper Arm.L@Upper Arm.L.002@Lower Arm.L@Thumb01.L@Thumb02.L@Fingers01.L@Fingers02.L@Upper Arm.R@Upper Arm.R.002@Lower Arm.R@Hand.R@Thumb01.R@Paper@@Thumb02.R@Fingers01.R@Fingers02.R@Thumb01.R.001"
    local1\Field58[$1C] = XF2F44B806($3AC, $3B8)
    local1\Field52[$1C] = 0.6
    local1\Field6[$1C] = "Upper Arm.R@Upper Arm.R.002@Lower Arm.R@Hand.R@Thumb01.R@Paper@@Thumb02.R@Fingers01.R@Fingers02.R@Thumb01.R.001"
    local1\Field58[$1D] = XF2F44B806($3AB, $3AB)
    local1\Field52[$1D] = 0.8
    local1\Field6[$1D] = "Upper Arm.L@Upper Arm.L.002@Lower Arm.L@Thumb01.L@Thumb02.L@Fingers01.L@Fingers02.L@Upper Arm.R@Upper Arm.R.002@Lower Arm.R@Hand.R@Thumb01.R@Paper@@Thumb02.R@Fingers01.R@Fingers02.R@Thumb01.R.001"
    local1\Field22[$00] = XF2F44B806($FA, $11E)
    local1\Field26[$00] = 0.45
    local1\Field61 = 1.2
    local1\Field14 = 4.5
    local1\Field36 = 1.2
    D424F0DB6($0A, "GFX\NPCs\MTF_m.b3d")
    Y462F42ZD($13, "", $00)
    Y462F42ZD($19, "GFX\NPCs\MTF(2).png", $00)
    Y462F42ZD($1A, "GFX\NPCs\MTF(3).png", $00)
    Y462F42ZD($1B, "GFX\NPCs\MTF(4).png", $00)
    local1 = T60880B62X($0A)
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
    local1\Field58[$01] = XF2F44B806($81F, $8B0)
    local1\Field52[$01] = 0.6
    local1\Field58[$02] = XF2F44B806($8B4, $8E3)
    local1\Field52[$02] = 0.6
    local1\Field18[$02] = 45.0
    local1\Field58[$03] = XF2F44B806($8B3, $8E4)
    local1\Field52[$03] = 1.0
    local1\Field18[$03] = 30.0
    local1\Field58[$04] = XF2F44B806($8E7, $8E8)
    local1\Field52[$04] = 0.1
    local1\Field58[$05] = XF2F44B806($922, $957)
    local1\Field52[$05] = 0.6
    local1\Field18[$05] = 45.0
    local1\Field58[$06] = XF2F44B806($975, $97F)
    local1\Field52[$06] = 0.1
    local1\Field58[$07] = XF2F44B806($956, $973)
    local1\Field52[$07] = 0.8
    local1\Field18[$07] = 35.0
    local1\Field58[$0A] = XF2F44B806($74, $120)
    local1\Field52[$0A] = 0.5
    local1\Field6[$0A] = "spine@chest@shoulder_L@upper_arm_L@forearm_L@hand_L@palm_04_L@f_pinky_01_L@f_pinky_02_L@f_pinky_03_L@palm_03_L@f_ring_01_L@f_ring_02_L@f_ring_03_L@palm_02_L@f_middle_01_L@f_middle_02_L@f_middle_03_L@palm_01_L@f_index_01_L@f_index_02_L@f_index_03_L@thumb_01_L@thumb_02_L@thumb_03_L@shoulder_R@upper_arm_R@forearm_R@hand_R@thumb_03_R@thumb_02_R@thumb_01_R@palm_01_R@f_index_01_R@f_index_02_R@f_index_03_R@palm_02_R@f_middle_01_R@f_middle_02_R@f_middle_03_R@palm_03_R@f_ring_01_R@f_ring_02_R@f_ring_03_R@palm_04_R@f_pinky_01_R@f_pinky_02_R@f_pinky_03_R"
    local1\Field58[$0F] = XF2F44B806($74, $120)
    local1\Field52[$0F] = 0.5
    local1\Field6[$0F] = "spine@chest@shoulder_L@upper_arm_L@forearm_L@hand_L@palm_04_L@f_pinky_01_L@f_pinky_02_L@f_pinky_03_L@palm_03_L@f_ring_01_L@f_ring_02_L@f_ring_03_L@palm_02_L@f_middle_01_L@f_middle_02_L@f_middle_03_L@palm_01_L@f_index_01_L@f_index_02_L@f_index_03_L@thumb_01_L@thumb_02_L@thumb_03_L@shoulder_R@upper_arm_R@forearm_R@hand_R@thumb_03_R@thumb_02_R@thumb_01_R@palm_01_R@f_index_01_R@f_index_02_R@f_index_03_R@palm_02_R@f_middle_01_R@f_middle_02_R@f_middle_03_R@palm_03_R@f_ring_01_R@f_ring_02_R@f_ring_03_R@palm_04_R@f_pinky_01_R@f_pinky_02_R@f_pinky_03_R"
    local1\Field58[$19] = XF2F44B806($981, $9D5)
    local1\Field52[$19] = 0.6
    local1\Field6[$19] = "spine@chest@shoulder_L@upper_arm_L@forearm_L@hand_L@palm_04_L@f_pinky_01_L@f_pinky_02_L@f_pinky_03_L@palm_03_L@f_ring_01_L@f_ring_02_L@f_ring_03_L@palm_02_L@f_middle_01_L@f_middle_02_L@f_middle_03_L@palm_01_L@f_index_01_L@f_index_02_L@f_index_03_L@thumb_01_L@thumb_02_L@thumb_03_L@shoulder_R@upper_arm_R@forearm_R@hand_R@thumb_03_R@thumb_02_R@thumb_01_R@palm_01_R@f_index_01_R@f_index_02_R@f_index_03_R@palm_02_R@f_middle_01_R@f_middle_02_R@f_middle_03_R@palm_03_R@f_ring_01_R@f_ring_02_R@f_ring_03_R@palm_04_R@f_pinky_01_R@f_pinky_02_R@f_pinky_03_R"
    local1\Field58[$1A] = XF2F44B806($981, $9D5)
    local1\Field52[$1A] = 0.6
    local1\Field6[$1A] = "spine@chest@shoulder_L@upper_arm_L@forearm_L@hand_L@palm_04_L@f_pinky_01_L@f_pinky_02_L@f_pinky_03_L@palm_03_L@f_ring_01_L@f_ring_02_L@f_ring_03_L@palm_02_L@f_middle_01_L@f_middle_02_L@f_middle_03_L@palm_01_L@f_index_01_L@f_index_02_L@f_index_03_L@thumb_01_L@thumb_02_L@thumb_03_L@shoulder_R@upper_arm_R@forearm_R@hand_R@thumb_03_R@thumb_02_R@thumb_01_R@palm_01_R@f_index_01_R@f_index_02_R@f_index_03_R@palm_02_R@f_middle_01_R@f_middle_02_R@f_middle_03_R@palm_03_R@f_ring_01_R@f_ring_02_R@f_ring_03_R@palm_04_R@f_pinky_01_R@f_pinky_02_R@f_pinky_03_R"
    local1\Field58[$1D] = XF2F44B806($9D8, $9D8)
    local1\Field52[$1D] = 0.8
    local1\Field6[$1D] = "spine@chest@shoulder_L@upper_arm_L@forearm_L@hand_L@palm_04_L@f_pinky_01_L@f_pinky_02_L@f_pinky_03_L@palm_03_L@f_ring_01_L@f_ring_02_L@f_ring_03_L@palm_02_L@f_middle_01_L@f_middle_02_L@f_middle_03_L@palm_01_L@f_index_01_L@f_index_02_L@f_index_03_L@thumb_01_L@thumb_02_L@thumb_03_L@shoulder_R@upper_arm_R@forearm_R@hand_R@thumb_03_R@thumb_02_R@thumb_01_R@palm_01_R@f_index_01_R@f_index_02_R@f_index_03_R@palm_02_R@f_middle_01_R@f_middle_02_R@f_middle_03_R@palm_03_R@f_ring_01_R@f_ring_02_R@f_ring_03_R@palm_04_R@f_pinky_01_R@f_pinky_02_R@f_pinky_03_R"
    local1\Field58[$1B] = XF2F44B806($42, $69)
    local1\Field52[$1B] = 0.8
    local1\Field6[$1B] = "spine@chest@shoulder_L@upper_arm_L@forearm_L@hand_L@palm_04_L@f_pinky_01_L@f_pinky_02_L@f_pinky_03_L@palm_03_L@f_ring_01_L@f_ring_02_L@f_ring_03_L@palm_02_L@f_middle_01_L@f_middle_02_L@f_middle_03_L@palm_01_L@f_index_01_L@f_index_02_L@f_index_03_L@thumb_01_L@thumb_02_L@thumb_03_L@shoulder_R@upper_arm_R@forearm_R@hand_R@thumb_03_R@thumb_02_R@thumb_01_R@palm_01_R@f_index_01_R@f_index_02_R@f_index_03_R@palm_02_R@f_middle_01_R@f_middle_02_R@f_middle_03_R@palm_03_R@f_ring_01_R@f_ring_02_R@f_ring_03_R@palm_04_R@f_pinky_01_R@f_pinky_02_R@f_pinky_03_R"
    local1\Field58[$1C] = XF2F44B806($9D9, $9E2)
    local1\Field52[$1C] = 0.6
    local1\Field6[$1C] = "spine@chest@shoulder_R@upper_arm_R@forearm_R@hand_R@thumb_03_R@thumb_02_R@thumb_01_R@palm_01_R@f_index_01_R@f_index_02_R@f_index_03_R@palm_02_R@f_middle_01_R@f_middle_02_R@f_middle_03_R@palm_03_R@f_ring_01_R@f_ring_02_R@f_ring_03_R@palm_04_R@f_pinky_01_R@f_pinky_02_R@f_pinky_03_R"
    local1\Field22[$00] = XF2F44B806($0A, $28)
    local1\Field26[$00] = 0.45
    local1\Field61 = 1.2
    local1\Field14 = 4.5
    local1\Field36 = 1.2
    D424F0DB6($0B, "GFX\NPCs\Chaos_m.b3d")
    Y462F42ZD($12, "", $00)
    Y462F42ZD($1D, "", $00)
    Y462F42ZD($20, "GFX\NPCs\ci_mp_e.png", $00)
    local1 = T60880B62X($0B)
    local1\Field56 = -0.3
    local1\Field47 = 0.0
    local1\Field21 = "Spine2"
    local1\Field30 = "NeckHead"
    local1\Field31 = "RArmHand"
    local1\Field34 = $01
    local1\Field19 = $4B
    local1\Field37 = $1E
    local1\Field35 = $3C
    local1\Field24 = (0.515 / meshwidth(BXF028D8B($0B)))
    local1\Field13 = 0.26
    local1\Field43 = 0.26
    local1\Field16 = 0.5
    local1\Field58[$01] = XF2F44B806($199, $1FB)
    local1\Field52[$01] = 0.8
    local1\Field58[$02] = XF2F44B806($17C, $198)
    local1\Field52[$02] = 0.4
    local1\Field18[$02] = 45.0
    local1\Field58[$03] = XF2F44B806($17C, $198)
    local1\Field52[$03] = 0.8
    local1\Field18[$03] = 30.0
    local1\Field58[$04] = XF2F44B806($1FC, $210)
    local1\Field52[$04] = 0.5
    local1\Field58[$05] = XF2F44B806($211, $225)
    local1\Field52[$05] = 0.25
    local1\Field18[$05] = 45.0
    local1\Field58[$06] = XF2F44B806($299, $2A2)
    local1\Field52[$06] = 0.1
    local1\Field58[$07] = XF2F44B806($27A, $298)
    local1\Field52[$07] = 0.6
    local1\Field18[$07] = 35.0
    local1\Field58[$0A] = XF2F44B806($03, $B0)
    local1\Field52[$0A] = 0.8
    local1\Field6[$0A] = "Spine1@Spine2@Spine3@LArmCollarbone@LArmUpper1@LArmUpper2@LArmForearm1@LArmForearm2@LArmHand@LArmThumb1@LArmThumb2@LArmThumb3@LArmIndex1@LArmIndex2@LArmIndex3@LArmMid1@LArmMid2@LArmMid3@LArmRing1@LArmRing2@LArmRing3@LArmPinky1@LArmPinky2@LArmPinky3@RArmCollarbone@RArmUpper1@RArmUpper2@RArmForearm1@RArmForearm2@RArmHand@RArmThumb1@RArmThumb2@RArmThumb3@M4MB@RArmPinky1@RArmPinky2@RArmPinky3@RArmRing1@RArmRing2@RArmRing3@RArmMid1@RArmMid2@RArmMid3@RArmIndex1@RArmIndex2@RArmIndex3@RArmThumb1@RArmThumb2@RArmThumb3"
    local1\Field58[$0F] = XF2F44B806($03, $B0)
    local1\Field52[$0F] = 0.8
    local1\Field6[$0F] = "Spine1@Spine2@Spine3@LArmCollarbone@LArmUpper1@LArmUpper2@LArmForearm1@LArmForearm2@LArmHand@LArmThumb1@LArmThumb2@LArmThumb3@LArmIndex1@LArmIndex2@LArmIndex3@LArmMid1@LArmMid2@LArmMid3@LArmRing1@LArmRing2@LArmRing3@LArmPinky1@LArmPinky2@LArmPinky3@RArmCollarbone@RArmUpper1@RArmUpper2@RArmForearm1@RArmForearm2@RArmHand@RArmThumb1@RArmThumb2@RArmThumb3@M4MB@RArmPinky1@RArmPinky2@RArmPinky3@RArmRing1@RArmRing2@RArmRing3@RArmMid1@RArmMid2@RArmMid3@RArmIndex1@RArmIndex2@RArmIndex3@RArmThumb1@RArmThumb2@RArmThumb3"
    local1\Field58[$19] = XF2F44B806($2A5, $2F9)
    local1\Field52[$19] = 0.5
    local1\Field6[$19] = "Spine1@Spine2@Spine3@LArmCollarbone@LArmUpper1@LArmUpper2@LArmForearm1@LArmForearm2@LArmHand@LArmThumb1@LArmThumb2@LArmThumb3@LArmIndex1@LArmIndex2@LArmIndex3@LArmMid1@LArmMid2@LArmMid3@LArmRing1@LArmRing2@LArmRing3@LArmPinky1@LArmPinky2@LArmPinky3@RArmCollarbone@RArmUpper1@RArmUpper2@RArmForearm1@RArmForearm2@RArmHand@RArmThumb1@RArmThumb2@RArmThumb3@M4MB@RArmPinky1@RArmPinky2@RArmPinky3@RArmRing1@RArmRing2@RArmRing3@RArmMid1@RArmMid2@RArmMid3@RArmIndex1@RArmIndex2@RArmIndex3@RArmThumb1@RArmThumb2@RArmThumb3"
    local1\Field58[$1A] = XF2F44B806($2A5, $2F9)
    local1\Field52[$1A] = 0.5
    local1\Field6[$1A] = "Spine1@Spine2@Spine3@LArmCollarbone@LArmUpper1@LArmUpper2@LArmForearm1@LArmForearm2@LArmHand@LArmThumb1@LArmThumb2@LArmThumb3@LArmIndex1@LArmIndex2@LArmIndex3@LArmMid1@LArmMid2@LArmMid3@LArmRing1@LArmRing2@LArmRing3@LArmPinky1@LArmPinky2@LArmPinky3@RArmCollarbone@RArmUpper1@RArmUpper2@RArmForearm1@RArmForearm2@RArmHand@RArmThumb1@RArmThumb2@RArmThumb3@M4MB@RArmPinky1@RArmPinky2@RArmPinky3@RArmRing1@RArmRing2@RArmRing3@RArmMid1@RArmMid2@RArmMid3@RArmIndex1@RArmIndex2@RArmIndex3@RArmThumb1@RArmThumb2@RArmThumb3"
    local1\Field58[$1D] = XF2F44B806($309, $309)
    local1\Field52[$1D] = 0.8
    local1\Field6[$1D] = "Spine1@Spine2@Spine3@LArmCollarbone@LArmUpper1@LArmUpper2@LArmForearm1@LArmForearm2@LArmHand@LArmThumb1@LArmThumb2@LArmThumb3@LArmIndex1@LArmIndex2@LArmIndex3@LArmMid1@LArmMid2@LArmMid3@LArmRing1@LArmRing2@LArmRing3@LArmPinky1@LArmPinky2@LArmPinky3@RArmCollarbone@RArmUpper1@RArmUpper2@RArmForearm1@RArmForearm2@RArmHand@RArmThumb1@RArmThumb2@RArmThumb3@M4MB@RArmPinky1@RArmPinky2@RArmPinky3@RArmRing1@RArmRing2@RArmRing3@RArmMid1@RArmMid2@RArmMid3@RArmIndex1@RArmIndex2@RArmIndex3@RArmThumb1@RArmThumb2@RArmThumb3"
    local1\Field58[$1B] = XF2F44B806($2FB, $307)
    local1\Field52[$1B] = 0.7
    local1\Field6[$1B] = "LArmCollarbone@LArmUpper1@LArmUpper2@LArmForearm1@LArmForearm2@LArmHand@LArmThumb1@LArmThumb2@LArmThumb3@LArmIndex1@LArmIndex2@LArmIndex3@LArmMid1@LArmMid2@LArmMid3@LArmRing1@LArmRing2@LArmRing3@LArmPinky1@LArmPinky2@LArmPinky3@RArmCollarbone@RArmUpper1@RArmUpper2@RArmForearm1@RArmForearm2@RArmHand@RArmThumb1@RArmThumb2@RArmThumb3@M4MB@RArmPinky1@RArmPinky2@RArmPinky3@RArmRing1@RArmRing2@RArmRing3@RArmMid1@RArmMid2@RArmMid3@RArmIndex1@RArmIndex2@RArmIndex3@RArmThumb1@RArmThumb2@RArmThumb3"
    local1\Field58[$1C] = XF2F44B806($30A, $310)
    local1\Field52[$1C] = 0.7
    local1\Field6[$1C] = "Spine1@Spine2@Spine3@LArmCollarbon@RArmCollarbone@RArmUpper1@RArmUpper2@RArmForearm1@RArmForearm2@RArmHand@RArmThumb1@RArmThumb2@RArmThumb3@M4MB@RArmPinky1@RArmPinky2@RArmPinky3@RArmRing1@RArmRing2@RArmRing3@RArmMid1@RArmMid2@RArmMid3@RArmIndex1@RArmIndex2@RArmIndex3@RArmThumb1@RArmThumb2@RArmThumb3"
    local1\Field22[$00] = XF2F44B806($24B, $279)
    local1\Field26[$00] = 0.5
    local1\Field61 = 1.3
    local1\Field14 = 5.0
    local1\Field36 = 1.2
    D424F0DB6($10, "GFX\NPCs\GOC.b3d")
    Y462F42ZD($1E, "", $00)
    local1 = T60880B62X($10)
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
    local1\Field58[$01] = XF2F44B806($01, $3C)
    local1\Field52[$01] = 0.12
    local1\Field58[$02] = XF2F44B806($3D, $59)
    local1\Field52[$02] = 0.45
    local1\Field18[$02] = 45.0
    local1\Field58[$03] = XF2F44B806($3D, $59)
    local1\Field52[$03] = 0.7
    local1\Field18[$03] = 30.0
    local1\Field58[$04] = XF2F44B806($5A, $96)
    local1\Field52[$04] = 0.5
    local1\Field58[$05] = XF2F44B806($97, $AF)
    local1\Field52[$05] = 0.28
    local1\Field18[$05] = 45.0
    local1\Field58[$06] = XF2F44B806($3D, $59)
    local1\Field52[$06] = 0.8
    local1\Field58[$07] = XF2F44B806($3D, $59)
    local1\Field52[$07] = 0.8
    local1\Field18[$07] = 35.0
    local1\Field58[$0A] = XF2F44B806($B0, $EC)
    local1\Field52[$0A] = 0.12
    local1\Field6[$0A] = "Bip01_Spine1@Bip01_Spine2@Bip01_Spine4@Bip01_L_Clavicle@Bip01_L_UpperArm@Bip01_L_Forearm@ValveBiped.Bip01_L_Ulna@Bip01_L_Hand@ValveBiped.Bip01_L_Finger0@ValveBiped.Bip01_L_Finger01@ValveBiped.Bip01_L_Finger02@ValveBiped.Anim_Attachment_LH@ValveBiped.Bip01_L_Finger1@ValveBiped.Bip01_L_Finger11@ValveBiped.Bip01_L_Finger12@ValveBiped.Bip01_L_Finger2@ValveBiped.Bip01_L_Finger21@ValveBiped.Bip01_L_Finger22@Bip01_R_Clavicle@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Ulna@Bip01_R_Hand@Bip01_R_Finger0@Bip01_R_Finger01@Bip01_R_Finger02@Anim_Attachment_RH@Bip01_R_Finger1@Bip01_R_Finger11@Bip01_R_Finger12@Bip01_R_Finger2@Bip01_R_Finger21@Bip01_R_Finger22"
    local1\Field58[$0F] = XF2F44B806($B0, $EC)
    local1\Field52[$0F] = 0.12
    local1\Field6[$0F] = "Bip01_Spine1@Bip01_Spine2@Bip01_Spine4@Bip01_L_Clavicle@Bip01_L_UpperArm@Bip01_L_Forearm@ValveBiped.Bip01_L_Ulna@Bip01_L_Hand@ValveBiped.Bip01_L_Finger0@ValveBiped.Bip01_L_Finger01@ValveBiped.Bip01_L_Finger02@ValveBiped.Anim_Attachment_LH@ValveBiped.Bip01_L_Finger1@ValveBiped.Bip01_L_Finger11@ValveBiped.Bip01_L_Finger12@ValveBiped.Bip01_L_Finger2@ValveBiped.Bip01_L_Finger21@ValveBiped.Bip01_L_Finger22@Bip01_R_Clavicle@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Ulna@Bip01_R_Hand@Bip01_R_Finger0@Bip01_R_Finger01@Bip01_R_Finger02@Anim_Attachment_RH@Bip01_R_Finger1@Bip01_R_Finger11@Bip01_R_Finger12@Bip01_R_Finger2@Bip01_R_Finger21@Bip01_R_Finger22"
    local1\Field58[$19] = XF2F44B806($1E1, $202)
    local1\Field52[$19] = 0.5
    local1\Field6[$19] = "Bip01_Spine1@Bip01_Spine2@Bip01_Spine4@Bip01_L_Clavicle@Bip01_L_UpperArm@Bip01_L_Forearm@ValveBiped.Bip01_L_Ulna@Bip01_L_Hand@ValveBiped.Bip01_L_Finger0@ValveBiped.Bip01_L_Finger01@ValveBiped.Bip01_L_Finger02@ValveBiped.Anim_Attachment_LH@ValveBiped.Bip01_L_Finger1@ValveBiped.Bip01_L_Finger11@ValveBiped.Bip01_L_Finger12@ValveBiped.Bip01_L_Finger2@ValveBiped.Bip01_L_Finger21@ValveBiped.Bip01_L_Finger22@Bip01_R_Clavicle@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Ulna@Bip01_R_Hand@Bip01_R_Finger0@Bip01_R_Finger01@Bip01_R_Finger02@Anim_Attachment_RH@Bip01_R_Finger1@Bip01_R_Finger11@Bip01_R_Finger12@Bip01_R_Finger2@Bip01_R_Finger21@Bip01_R_Finger22"
    local1\Field58[$1A] = XF2F44B806($1E1, $202)
    local1\Field52[$1A] = 0.5
    local1\Field6[$1A] = "Bip01_Spine1@Bip01_Spine2@Bip01_Spine4@Bip01_L_Clavicle@Bip01_L_UpperArm@Bip01_L_Forearm@ValveBiped.Bip01_L_Ulna@Bip01_L_Hand@ValveBiped.Bip01_L_Finger0@ValveBiped.Bip01_L_Finger01@ValveBiped.Bip01_L_Finger02@ValveBiped.Anim_Attachment_LH@ValveBiped.Bip01_L_Finger1@ValveBiped.Bip01_L_Finger11@ValveBiped.Bip01_L_Finger12@ValveBiped.Bip01_L_Finger2@ValveBiped.Bip01_L_Finger21@ValveBiped.Bip01_L_Finger22@Bip01_R_Clavicle@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Ulna@Bip01_R_Hand@Bip01_R_Finger0@Bip01_R_Finger01@Bip01_R_Finger02@Anim_Attachment_RH@Bip01_R_Finger1@Bip01_R_Finger11@Bip01_R_Finger12@Bip01_R_Finger2@Bip01_R_Finger21@Bip01_R_Finger22"
    local1\Field58[$1C] = XF2F44B806($1AA, $1B6)
    local1\Field52[$1C] = 0.5
    local1\Field6[$1C] = "Bip01_Spine1@Bip01_Spine2@Bip01_Spine4@Bip01_L_Clavicle@Bip01_R_Clavicle@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Ulna@Bip01_R_Hand@Bip01_R_Finger0@Bip01_R_Finger01@Bip01_R_Finger02@Anim_Attachment_RH@Bip01_R_Finger1@Bip01_R_Finger11@Bip01_R_Finger12@Bip01_R_Finger2@Bip01_R_Finger21@Bip01_R_Finger22"
    local1\Field58[$1B] = XF2F44B806($1B9, $1E0)
    local1\Field52[$1B] = 0.8
    local1\Field6[$1B] = "Bip01_Spine1@Bip01_Spine2@Bip01_Spine4@Bip01_L_Clavicle@Bip01_L_UpperArm@Bip01_L_Forearm@ValveBiped.Bip01_L_Ulna@Bip01_L_Hand@ValveBiped.Bip01_L_Finger0@ValveBiped.Bip01_L_Finger01@ValveBiped.Bip01_L_Finger02@ValveBiped.Anim_Attachment_LH@ValveBiped.Bip01_L_Finger1@ValveBiped.Bip01_L_Finger11@ValveBiped.Bip01_L_Finger12@ValveBiped.Bip01_L_Finger2@ValveBiped.Bip01_L_Finger21@ValveBiped.Bip01_L_Finger22@Bip01_R_Clavicle@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Ulna@Bip01_R_Hand@Bip01_R_Finger0@Bip01_R_Finger01@Bip01_R_Finger02@Anim_Attachment_RH@Bip01_R_Finger1@Bip01_R_Finger11@Bip01_R_Finger12@Bip01_R_Finger2@Bip01_R_Finger21@Bip01_R_Finger22"
    local1\Field58[$1D] = XF2F44B806($1B8, $1B8)
    local1\Field52[$1D] = 0.5
    local1\Field6[$1D] = "Bip01_Spine1@Bip01_Spine2@Bip01_Spine4@Bip01_L_Clavicle@Bip01_L_UpperArm@Bip01_L_Forearm@ValveBiped.Bip01_L_Ulna@Bip01_L_Hand@ValveBiped.Bip01_L_Finger0@ValveBiped.Bip01_L_Finger01@ValveBiped.Bip01_L_Finger02@ValveBiped.Anim_Attachment_LH@ValveBiped.Bip01_L_Finger1@ValveBiped.Bip01_L_Finger11@ValveBiped.Bip01_L_Finger12@ValveBiped.Bip01_L_Finger2@ValveBiped.Bip01_L_Finger21@ValveBiped.Bip01_L_Finger22@Bip01_R_Clavicle@Bip01_R_UpperArm@Bip01_R_Forearm@Bip01_R_Ulna@Bip01_R_Hand@Bip01_R_Finger0@Bip01_R_Finger01@Bip01_R_Finger02@Anim_Attachment_RH@Bip01_R_Finger1@Bip01_R_Finger11@Bip01_R_Finger12@Bip01_R_Finger2@Bip01_R_Finger21@Bip01_R_Finger22"
    local1\Field22[$00] = XF2F44B806($178, $18C)
    local1\Field26[$00] = 0.5
    local1\Field61 = 11.0
    local1\Field14 = 38.0
    local1\Field36 = 11.0
    D424F0DB6($03, "GFX\NPCs\scp_173_m.b3d")
    XZ6X8D0X2B($03, "SFX\SCP\173\StoneDrag.ogg")
    local1 = T60880B62X($03)
    local1\Field56 = -0.3
    local1\Field47 = 180.0
    local1\Field24 = (0.34 / meshdepth(BXF028D8B($03)))
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
    local1\Field22[$00] = XF2F44B806($02, $27)
    local1\Field26[$00] = 0.3
    local1\Field61 = 2.0
    local1\Field14 = 11.0
    local1\Field36 = 2.0
    D424F0DB6($04, "GFX\NPCs\scp_106_m.b3d")
    local1 = T60880B62X($04)
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
    local1\Field58[$01] = XF2F44B806($14E, $1EE)
    local1\Field52[$01] = 0.3
    local1\Field58[$02] = XF2F44B806($11C, $14D)
    local1\Field52[$02] = 0.559
    local1\Field18[$02] = 40.0
    local1\Field58[$03] = XF2F44B806($11C, $14D)
    local1\Field52[$03] = 0.7
    local1\Field18[$03] = 30.0
    local1\Field58[$11] = XF2F44B806($69, $6E)
    local1\Field52[$11] = 0.3
    local1\Field58[$11] = XF2F44B806($69, $6E)
    local1\Field52[$11] = 0.3
    local1\Field22[$00] = XF2F44B806($6F, $103)
    local1\Field26[$00] = -0.15
    local1\Field61 = 1.5
    local1\Field14 = 4.5
    local1\Field36 = 1.5
    D424F0DB6($05, "GFX\NPCs\scp_049.b3d")
    local1 = T60880B62X($05)
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
    local1\Field58[$01] = XF2F44B806($10D, $159)
    local1\Field52[$01] = 0.2
    local1\Field58[$02] = XF2F44B806($192, $1B5)
    local1\Field52[$02] = 0.6
    local1\Field18[$02] = 40.0
    local1\Field58[$03] = XF2F44B806($192, $1B5)
    local1\Field52[$03] = 1.0
    local1\Field18[$03] = 30.0
    local1\Field58[$0F] = XF2F44B806($219, $294)
    local1\Field52[$0F] = 0.7
    local1\Field58[$11] = XF2F44B806($219, $294)
    local1\Field52[$11] = 0.7
    local1\Field22[$00] = XF2F44B806($4CA, $4F9)
    local1\Field26[$00] = 0.3
    local1\Field61 = 0.1
    local1\Field14 = 0.43
    local1\Field36 = 0.1
    D424F0DB6($06, "GFX\NPCs\scp_939.b3d")
    Y462F42ZD($1F, "GFX\NPCs\scp_939_e.png", $00)
    local1 = T60880B62X($06)
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
    local1\Field58[$01] = XF2F44B806($0B, $59)
    local1\Field52[$01] = 0.2
    local1\Field58[$02] = XF2F44B806($303, $34A)
    local1\Field52[$02] = 0.32
    local1\Field18[$02] = 40.0
    local1\Field58[$03] = XF2F44B806($357, $36C)
    local1\Field52[$03] = 0.32
    local1\Field18[$03] = 30.0
    local1\Field58[$0F] = XF2F44B806($38F, $3AB)
    local1\Field52[$0F] = 1.0
    local1\Field58[$11] = XF2F44B806($3AC, $3C9)
    local1\Field52[$11] = 1.0
    local1\Field22[$00] = XF2F44B806($6FA, $741)
    local1\Field26[$00] = 0.3
    local1\Field61 = 0.5
    local1\Field14 = 0.375
    local1\Field36 = 0.875
    D424F0DB6($07, "GFX\NPCs\scp_966_m.b3d")
    local1 = T60880B62X($07)
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
    local1\Field58[$01] = XF2F44B806($02, $70)
    local1\Field52[$01] = 0.2
    local1\Field58[$02] = XF2F44B806($245, $275)
    local1\Field52[$02] = 0.4
    local1\Field18[$02] = 45.0
    local1\Field58[$03] = XF2F44B806($245, $275)
    local1\Field52[$03] = 0.7
    local1\Field18[$03] = 30.0
    local1\Field58[$0F] = XF2F44B806($1CA, $1E7)
    local1\Field52[$0F] = 0.35
    local1\Field58[$11] = XF2F44B806($1E8, $205)
    local1\Field52[$11] = 0.35
    local1\Field22[$00] = XF2F44B806($2ED, $2FC)
    local1\Field26[$00] = 0.8
    local1\Field61 = 11.0
    local1\Field14 = 38.0
    local1\Field36 = 11.0
    D424F0DB6($0F, "GFX\NPCs\scp_860_2_m.b3d")
    local1 = T60880B62X($0F)
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
    local1\Field58[$01] = XF2F44B806($C8, $129)
    local1\Field52[$01] = 0.2
    local1\Field58[$02] = XF2F44B806($1EE, $23A)
    local1\Field52[$02] = 0.7
    local1\Field18[$02] = 45.0
    local1\Field58[$03] = XF2F44B806($12A, $13B)
    local1\Field52[$03] = 0.6
    local1\Field18[$03] = 30.0
    local1\Field58[$0F] = XF2F44B806($1C2, $1EC)
    local1\Field52[$0F] = 0.8
    local1\Field58[$11] = XF2F44B806($1C2, $1EC)
    local1\Field52[$11] = 0.8
    local1\Field22[$00] = XF2F44B806($23B, $259)
    local1\Field26[$00] = 0.6
    local1\Field61 = 10.0
    local1\Field14 = 15.0
    local1\Field36 = 32.0
    D424F0DB6($08, "GFX\NPCs\scp_096.b3d")
    Y462F42ZD($1C, "GFX\NPCs\scp_096_bloody.png", $00)
    local1 = T60880B62X($08)
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
    local1\Field58[$01] = XF2F44B806($1A7, $1D7)
    local1\Field52[$01] = 0.2
    local1\Field58[$02] = XF2F44B806($567, $5B0)
    local1\Field52[$02] = 1.0
    local1\Field18[$02] = 40.0
    local1\Field58[$03] = XF2F44B806($567, $5B0)
    local1\Field52[$03] = 1.6
    local1\Field18[$03] = 30.0
    local1\Field58[$0F] = XF2F44B806($02, $1C)
    local1\Field52[$0F] = 1.0
    local1\Field58[$11] = XF2F44B806($02, $1C)
    local1\Field52[$11] = 1.0
    local1\Field58[$0A] = XF2F44B806($5BF, $614)
    local1\Field52[$0A] = 0.5
    local1\Field58[$0B] = XF2F44B806($2E1, $337)
    local1\Field52[$0B] = 1.0
    local1\Field18[$0B] = 40.0
    local1\Field58[$0C] = XF2F44B806($38B, $3A7)
    local1\Field52[$0C] = 1.0
    local1\Field18[$0C] = 17.5
    local1\Field22[$00] = XF2F44B806($616, $629)
    local1\Field26[$00] = 0.8
    local1\Field61 = 1.0
    local1\Field14 = 2.5
    local1\Field36 = 1.0
    D424F0DB6($0E, "GFX\NPCs\scp_999.b3d")
    local1 = T60880B62X($0E)
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
    local1\Field58[$01] = XF2F44B806($24, $24)
    local1\Field52[$01] = 0.8
    local1\Field58[$02] = XF2F44B806($24, $24)
    local1\Field52[$02] = 0.8
    local1\Field58[$03] = XF2F44B806($24, $24)
    local1\Field52[$03] = 0.8
    local1\Field22[$00] = XF2F44B806($01, $24)
    local1\Field26[$00] = 0.8
    local1\Field61 = 40.0
    local1\Field14 = 50.0
    local1\Field36 = 40.0
    D424F0DB6($0C, "GFX\NPCs\class_d.b3d")
    local1 = T60880B62X($0C)
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
    local1\Field24 = (0.51 / meshwidth(BXF028D8B($0C)))
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
    local1\Field58[$01] = XF2F44B806($D2, $EB)
    local1\Field52[$01] = 0.1
    local1\Field58[$02] = XF2F44B806($EC, $104)
    local1\Field52[$02] = 0.33
    local1\Field18[$02] = 45.0
    local1\Field58[$03] = XF2F44B806($12D, $13F)
    local1\Field52[$03] = 0.33
    local1\Field18[$03] = 30.0
    local1\Field58[$04] = XF2F44B806($165, $17D)
    local1\Field52[$04] = 0.1
    local1\Field58[$05] = XF2F44B806($17E, $196)
    local1\Field52[$05] = 0.3
    local1\Field18[$05] = 45.0
    local1\Field58[$06] = XF2F44B806($C1, $C5)
    local1\Field52[$06] = 0.025
    local1\Field58[$07] = XF2F44B806($C7, $D1)
    local1\Field52[$07] = 0.33
    local1\Field18[$07] = 35.0
    local1\Field58[$08] = XF2F44B806($322, $336)
    local1\Field52[$08] = 0.23
    local1\Field58[$09] = XF2F44B806($30D, $321)
    local1\Field52[$09] = 0.33
    local1\Field58[$0A] = XF2F44B806($337, $350)
    local1\Field52[$0A] = 0.05
    local1\Field58[$0B] = XF2F44B806($351, $369)
    local1\Field52[$0B] = 0.33
    local1\Field18[$0B] = 45.0
    local1\Field58[$0C] = XF2F44B806($392, $3A4)
    local1\Field52[$0C] = 0.35
    local1\Field18[$0C] = 30.0
    local1\Field58[$0D] = XF2F44B806($3D8, $3EF)
    local1\Field52[$0D] = 0.05
    local1\Field58[$0E] = XF2F44B806($3F0, $408)
    local1\Field52[$0E] = 0.3
    local1\Field18[$0E] = 45.0
    local1\Field58[$0F] = XF2F44B806($337, $350)
    local1\Field52[$0F] = 0.05
    local1\Field58[$10] = XF2F44B806($351, $369)
    local1\Field52[$10] = 0.33
    local1\Field18[$10] = 45.0
    local1\Field58[$11] = XF2F44B806($392, $3A4)
    local1\Field52[$11] = 0.35
    local1\Field18[$11] = 30.0
    local1\Field58[$12] = XF2F44B806($3D8, $3EF)
    local1\Field52[$12] = 0.05
    local1\Field58[$13] = XF2F44B806($3F0, $408)
    local1\Field52[$13] = 0.3
    local1\Field18[$13] = 45.0
    local1\Field58[$14] = XF2F44B806($43A, $461)
    local1\Field52[$14] = 1.0
    local1\Field5[$08] = $01
    local1\Field5[$09] = $01
    local1\Field22[$00] = XF2F44B806($01, $14)
    local1\Field26[$00] = 0.4
    local1\Field22[$01] = XF2F44B806($29, $3C)
    local1\Field26[$01] = 0.4
    local1\Field22[$02] = XF2F44B806($2A6, $2C7)
    local1\Field26[$02] = 0.4
    local1\Field22[$03] = XF2F44B806($2C8, $30B)
    local1\Field26[$03] = 0.4
    local1\Field61 = 10.0
    local1\Field14 = 35.0
    local1\Field36 = 6.5
    D424F0DB6($0D, "GFX\NPCs\scp_049_2m.b3d")
    local1 = T60880B62X($0D)
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
    local1\Field58[$01] = XF2F44B806($117, $1A9)
    local1\Field52[$01] = 0.3
    local1\Field58[$02] = XF2F44B806($1AC, $1FB)
    local1\Field52[$02] = 0.8
    local1\Field18[$02] = 45.0
    local1\Field58[$03] = XF2F44B806($1AC, $1FB)
    local1\Field52[$03] = 1.4
    local1\Field18[$03] = 30.0
    local1\Field58[$0F] = XF2F44B806($1FF, $23F)
    local1\Field52[$0F] = 0.8
    local1\Field58[$11] = XF2F44B806($242, $280)
    local1\Field52[$11] = 0.8
    local1\Field22[$00] = XF2F44B806($281, $2A7)
    local1\Field26[$00] = 0.3
    local1\Field61 = 1.5
    local1\Field14 = 3.8
    local1\Field36 = 1.5
    D424F0DB6($11, "GFX\NPCs\class_d.b3d")
    local1 = T60880B62X($11)
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
    local1\Field24 = (0.51 / meshwidth(BXF028D8B($11)))
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
    local1\Field58[$01] = XF2F44B806($D2, $EB)
    local1\Field52[$01] = 0.1
    local1\Field58[$02] = XF2F44B806($EC, $104)
    local1\Field52[$02] = 0.33
    local1\Field18[$02] = 45.0
    local1\Field58[$03] = XF2F44B806($12D, $13F)
    local1\Field52[$03] = 0.33
    local1\Field18[$03] = 30.0
    local1\Field58[$04] = XF2F44B806($165, $17D)
    local1\Field52[$04] = 0.1
    local1\Field58[$05] = XF2F44B806($17E, $196)
    local1\Field52[$05] = 0.3
    local1\Field18[$05] = 45.0
    local1\Field58[$06] = XF2F44B806($C1, $C5)
    local1\Field52[$06] = 0.025
    local1\Field58[$07] = XF2F44B806($C7, $D1)
    local1\Field52[$07] = 0.33
    local1\Field18[$07] = 35.0
    local1\Field58[$08] = XF2F44B806($322, $336)
    local1\Field52[$08] = 0.23
    local1\Field58[$09] = XF2F44B806($30D, $321)
    local1\Field52[$09] = 0.33
    local1\Field58[$0A] = XF2F44B806($337, $350)
    local1\Field52[$0A] = 0.05
    local1\Field58[$0B] = XF2F44B806($351, $369)
    local1\Field52[$0B] = 0.33
    local1\Field18[$0B] = 45.0
    local1\Field58[$0C] = XF2F44B806($392, $3A4)
    local1\Field52[$0C] = 0.35
    local1\Field18[$0C] = 30.0
    local1\Field58[$0D] = XF2F44B806($3D8, $3EF)
    local1\Field52[$0D] = 0.05
    local1\Field58[$0E] = XF2F44B806($3F0, $408)
    local1\Field52[$0E] = 0.3
    local1\Field18[$0E] = 45.0
    local1\Field58[$0F] = XF2F44B806($337, $350)
    local1\Field52[$0F] = 0.05
    local1\Field58[$10] = XF2F44B806($351, $369)
    local1\Field52[$10] = 0.33
    local1\Field18[$10] = 45.0
    local1\Field58[$11] = XF2F44B806($392, $3A4)
    local1\Field52[$11] = 0.35
    local1\Field18[$11] = 30.0
    local1\Field58[$12] = XF2F44B806($3D8, $3EF)
    local1\Field52[$12] = 0.05
    local1\Field58[$13] = XF2F44B806($3F0, $408)
    local1\Field52[$13] = 0.3
    local1\Field18[$13] = 45.0
    local1\Field58[$14] = XF2F44B806($43A, $461)
    local1\Field52[$14] = 1.0
    local1\Field5[$08] = $01
    local1\Field5[$09] = $01
    local1\Field22[$00] = XF2F44B806($01, $14)
    local1\Field26[$00] = 0.4
    local1\Field22[$01] = XF2F44B806($29, $3C)
    local1\Field26[$01] = 0.4
    local1\Field22[$02] = XF2F44B806($2A6, $2C7)
    local1\Field26[$02] = 0.4
    local1\Field22[$03] = XF2F44B806($2C8, $30B)
    local1\Field26[$03] = 0.4
    local1\Field61 = 10.0
    local1\Field14 = 35.0
    local1\Field36 = 6.5
    XBB8DFD22Z($11, $00, "SFX\SCP\457\FireLoop.ogg", $01)
    TXXZ04066BX($01, "GFX\Items\Wearable\gasmask_wearmodel.b3d", "", $00, $01)
    TXXZ04066BX($02, "GFX\Items\Wearable\gasmask_wearmodel.b3d", "", $00, $01)
    TXXZ04066BX($03, "GFX\Items\Wearable\gasmask_wearmodel.b3d", "", $00, $01)
    TXXZ04066BX($04, "GFX\Items\Wearable\gasmask_wearmodel.b3d", "GFX\Items\gas_mask_heavy.png", $00, $01)
    TXXZ04066BX($05, "GFX\Items\Wearable\Ballistic_vest_wearmodel.b3d", "", $00, $01)
    TXXZ04066BX($06, "GFX\Items\Wearable\Ballistic_vest_wearmodel.b3d", "", $00, $01)
    TXXZ04066BX($07, "GFX\Items\ballistic_helmet.b3d", "", $00, $01)
    XZDDF222BF($07, $01, "GFX\Items\Wearable\ballistic_helmet_visor.b3d", "")
    XZDDF222BF($07, $02, "GFX\Items\GOC_helmet.b3d", "")
    TXXZ04066BX($1D, "GFX\Items\heavy_helmet.b3d", "", $00, $01)
    TXXZ04066BX($08, "GFX\Items\Wearable\NVG_wearmodel.b3d", "GFX\Items\night_vision_goggles_green.png", $00, $01)
    TXXZ04066BX($09, "GFX\Items\Wearable\NVG_wearmodel.b3d", "GFX\Items\night_vision_goggles_red.png", $00, $01)
    TXXZ04066BX($0A, "GFX\Items\Wearable\NVG_wearmodel.b3d", "GFX\Items\night_vision_goggles_blue.png", $00, $01)
    TXXZ04066BX($0B, "GFX\Items\Wearable\SCRAMBLE_gear_wearmodel.b3d", "", $00, $01)
    TXXZ04066BX($0C, "GFX\Items\Wearable\SCRAMBLE_gear_wearmodel.b3d", "", $00, $01)
    TXXZ04066BX($0D, "GFX\Items\Wearable\427_wearmodel.b3d", "", $00, $01)
    TXXZ04066BX($0F, "GFX\Items\scp_268.b3d", "", $00, $01)
    TXXZ04066BX($10, "GFX\Items\scp_268.b3d", "", $00, $01)
    TXXZ04066BX($0E, "GFX\Items\scp_268.b3d", "", $00, $01)
    TXXZ04066BX($11, "GFX\Items\scp_714.b3d", "", $00, $01)
    TXXZ04066BX($12, "GFX\Items\scp_714.b3d", "", $00, $01)
    TXXZ04066BX($1C, "GFX\NPCs\scp_035_smile.b3d", "", $00, $01)
    TXXZ04066BX($13, "GFX\Items\m4a1_wm.b3d", "", $01, $01)
    TXXZ04066BX($14, "GFX\Items\glock_wm.b3d", "", $01, $01)
    TXXZ04066BX($15, "GFX\Items\m60_wm.b3d", "", $01, $01)
    TXXZ04066BX($16, "GFX\Items\sr556_wm.b3d", "", $01, $01)
    TXXZ04066BX($17, "GFX\Items\mp5_wm.b3d", "", $01, $01)
    TXXZ04066BX($18, "GFX\Items\fiveseven_wm.b3d", "", $01, $01)
    TXXZ04066BX($19, "GFX\Items\kriss_vector_wm.b3d", "", $01, $01)
    TXXZ04066BX($1E, "GFX\Items\p90_wm.b3d", "", $01, $01)
    TXXZ04066BX($1F, "GFX\Items\mp7_wm.b3d", "", $01, $01)
    TXXZ04066BX($20, "GFX\Items\m134_wm.b3d", "", $01, $01)
    TXXZ04066BX($26, "GFX\Items\remington_wm.b3d", "", $01, $01)
    TXXZ04066BX($1A, "GFX\Items\handcuffs_wm.b3d", "", $01, $01)
    TXXZ04066BX($1B, "GFX\Items\handcuffs_wm.b3d", "", $01, $01)
    TXXZ04066BX($27, "GFX\Items\rpg_wm.b3d", "", $01, $01)
    TXXZ04066BX($28, "GFX\Items\g36_wm.b3d", "", $01, $01)
    TXXZ04066BX($29, "GFX\Items\ak74_wm.b3d", "", $01, $01)
    TXXZ04066BX($1F9, "GFX\Items\m69_wm.b3d", "", $01, $01)
    TXXZ04066BX($1F6, "GFX\Items\emp_wm.b3d", "", $01, $01)
    TXXZ04066BX($1F8, "GFX\Items\m9_wm.b3d", "", $01, $01)
    TXXZ04066BX($1F7, "GFX\Items\stemtex_wm.b3d", "", $01, $01)
    TXXZ04066BX($22, "", "", $00, $01)
    TXXZ04066BX($24, "", "", $00, $01)
    TXXZ04066BX($21, "", "", $00, $01)
    TXXZ04066BX($25, "", "", $00, $01)
    TXXZ04066BX($23, "", "", $00, $01)
    TXXZ04066BX($1FF, "", "", $00, $01)
    TXXZ04066BX($1FE, "", "", $00, $01)
    TXXZ04066BX($1FD, "", "", $00, $01)
    TXXZ04066BX($1FC, "", "", $00, $01)
    TXXZ04066BX($1FB, "", "", $00, $01)
    TXXZ04066BX($1FA, "", "", $00, $01)
    TXXZ04066BX($1F5, "", "", $00, $01)
    TXXZ04066BX($1F4, "", "", $00, $01)
    TXXZ04066BX($1F3, "", "", $00, $01)
    X8ZB82DD84($1B, $1D)
    TXD6DFZ4DF8($01, $00, "SFX\Character\D9341\BreathGasRelaxed.ogg")
    TXD6DFZ4DF8($02, $00, "SFX\Character\D9341\BreathGasRelaxed.ogg")
    TXD6DFZ4DF8($03, $00, "SFX\Character\D9341\BreathGasRelaxed.ogg")
    TXD6DFZ4DF8($04, $00, "SFX\Character\D9341\BreathGasRelaxed.ogg")
    local2 = X644BX6FZ0($01, $01)
    local2\Field5 = "Bip01_Head"
    local2\Field4 = 179.9
    local2\Field3 = -90.0
    local2\Field0 = -3.0
    local2\Field1 = 0.5
    local2\Field7 = 1.04705
    BX8X22F44($01, $01, $02, $FFFFFFFF)
    BX8X22F44($01, $01, $03, $FFFFFFFF)
    BX8X22F44($01, $01, $04, $FFFFFFFF)
    local2 = X644BX6FZ0($07, $01)
    local2\Field5 = "Bip01_Head"
    local2\Field3 = 90.0
    local2\Field0 = -2.5
    local2\Field7 = 1.04705
    BX8X22F44($07, $01, $1D, $FFFFFFFF)
    local2 = X644BX6FZ0($08, $01)
    local2\Field5 = "Bip01_Head"
    local2\Field3 = -90.0
    local2\Field0 = -4.0
    local2\Field1 = 4.6
    local2\Field7 = 0.97725
    BX8X22F44($08, $01, $09, $FFFFFFFF)
    BX8X22F44($08, $01, $0A, $FFFFFFFF)
    BX8X22F44($08, $01, $0B, $FFFFFFFF)
    BX8X22F44($08, $01, $0C, $FFFFFFFF)
    local2 = X644BX6FZ0($0F, $01)
    local2\Field5 = "Bip01_Head"
    local2\Field3 = 90.0
    local2\Field0 = -5.1
    local2\Field1 = 1.7
    local2\Field7 = 4.88625
    local2 = X644BX6FZ0($1C, $01)
    local2\Field5 = "Bip01_Head"
    local2\Field0 = 1.0
    local2\Field2 = 0.0
    local2\Field1 = 5.9
    local2\Field4 = 190.0
    local2\Field3 = -90.0
    local2\Field7 = 1.0
    BX8X22F44($0F, $01, $10, $FFFFFFFF)
    BX8X22F44($0F, $01, $0E, $FFFFFFFF)
    local2 = X644BX6FZ0($0D, $01)
    local2\Field5 = "Bip01_Neck"
    local2\Field0 = 0.3
    local2\Field1 = 3.5
    local2\Field3 = 90.0
    local2\Field4 = -65.0
    local2\Field7 = 1.04705
    local2 = X644BX6FZ0($05, $01)
    local2\Field5 = "Bip01_Spine1"
    local2\Field7 = 1.15176
    local2\Field4 = 179.9
    local2\Field3 = -90.0
    local2\Field0 = -1.5
    BX8X22F44($05, $01, $06, $FFFFFFFF)
    local2 = X644BX6FZ0($11, $01)
    local2\Field5 = "Bip01_L_Finger0"
    local2\Field7 = 13.9609
    local2\Field3 = 90.0
    local2\Field0 = -1.0
    local2\Field2 = -1.3
    BX8X22F44($11, $01, $12, $FFFFFFFF)
    local2 = X644BX6FZ0($19, $01)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 80.0
    local2\Field4 = -90.0
    local2\Field7 = 4.5
    local2 = X644BX6FZ0($18, $01)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 80.0
    local2\Field4 = -90.0
    local2\Field7 = 4.5
    local2 = X644BX6FZ0($17, $01)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 80.0
    local2\Field4 = -90.0
    local2\Field7 = 4.5
    local2 = X644BX6FZ0($28, $01)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 80.0
    local2\Field4 = -90.0
    local2\Field7 = 4.5
    local2 = X644BX6FZ0($1E, $01)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 80.0
    local2\Field4 = -90.0
    local2\Field7 = 4.5
    local2 = X644BX6FZ0($1F, $01)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 80.0
    local2\Field4 = -90.0
    local2\Field7 = 4.5
    local2 = X644BX6FZ0($26, $01)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 80.0
    local2\Field4 = -90.0
    local2\Field7 = 4.5
    local2 = X644BX6FZ0($20, $01)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = 3.0
    local2\Field1 = 2.0
    local2\Field3 = 80.0
    local2\Field4 = -90.0
    local2\Field7 = 4.5
    local2 = X644BX6FZ0($27, $01)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = 3.0
    local2\Field1 = 2.0
    local2\Field3 = 80.0
    local2\Field4 = -90.0
    local2\Field7 = 4.5
    local2 = X644BX6FZ0($16, $01)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 80.0
    local2\Field4 = -90.0
    local2\Field7 = 4.5
    local2 = X644BX6FZ0($29, $01)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 80.0
    local2\Field4 = -90.0
    local2\Field7 = 4.5
    local2 = X644BX6FZ0($15, $01)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 80.0
    local2\Field4 = -90.0
    local2\Field7 = 4.5
    local2 = X644BX6FZ0($13, $01)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 80.0
    local2\Field4 = -90.0
    local2\Field7 = 4.5
    local2 = X644BX6FZ0($14, $01)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 80.0
    local2\Field4 = -90.0
    local2\Field7 = 4.5
    local2 = X644BX6FZ0($1B, $01)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = 0.0
    local2\Field2 = 2.5
    local2\Field1 = 0.0
    local2\Field3 = 90.0
    local2\Field7 = 0.32
    local2 = X644BX6FZ0($1A, $01)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -2.0
    local2\Field2 = 0.0
    local2\Field1 = 2.0
    local2\Field7 = 0.32
    local2 = X644BX6FZ0($1F9, $01)
    local2\Field5 = "Bip01_R_Hand"
    local2\Field0 = -3.06
    local2\Field2 = 0.7879
    local2\Field1 = 0.9939
    local2\Field8 = 3.0
    local2\Field4 = -87.83
    local2\Field3 = 82.34
    local2\Field7 = 1.0
    local2 = X644BX6FZ0($1F6, $01)
    local2\Field5 = "Bip01_R_Hand"
    local2\Field0 = -3.06
    local2\Field2 = 0.7879
    local2\Field1 = 0.9939
    local2\Field8 = 3.0
    local2\Field4 = -87.83
    local2\Field3 = 82.34
    local2\Field7 = 1.0
    local2 = X644BX6FZ0($1F7, $01)
    local2\Field5 = "Bip01_R_Hand"
    local2\Field0 = -3.06
    local2\Field2 = 0.7879
    local2\Field1 = 0.9939
    local2\Field8 = 3.0
    local2\Field4 = -87.83
    local2\Field3 = 82.34
    local2\Field7 = 1.0
    local2 = X644BX6FZ0($1F8, $01)
    local2\Field5 = "Bip01_R_Hand"
    local2\Field0 = -3.48
    local2\Field2 = 2.49
    local2\Field1 = 1.924
    local2\Field8 = 74.0
    local2\Field4 = -178.0
    local2\Field3 = -171.0
    local2\Field7 = 4.5
    local2 = X644BX6FZ0($19, $02)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 90.0
    local2\Field4 = -90.0
    local2\Field7 = 4.7
    local2 = X644BX6FZ0($18, $02)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 90.0
    local2\Field4 = -90.0
    local2\Field7 = 4.7
    local2 = X644BX6FZ0($17, $02)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 90.0
    local2\Field4 = -90.0
    local2\Field7 = 4.7
    local2 = X644BX6FZ0($28, $02)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 90.0
    local2\Field4 = -90.0
    local2\Field7 = 4.7
    local2 = X644BX6FZ0($1E, $02)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 90.0
    local2\Field4 = -90.0
    local2\Field7 = 4.7
    local2 = X644BX6FZ0($1F, $02)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 90.0
    local2\Field4 = -90.0
    local2\Field7 = 4.7
    local2 = X644BX6FZ0($26, $02)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 90.0
    local2\Field4 = -90.0
    local2\Field7 = 4.7
    local2 = X644BX6FZ0($20, $02)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = 3.0
    local2\Field1 = 2.0
    local2\Field3 = 90.0
    local2\Field4 = -90.0
    local2\Field7 = 4.7
    local2 = X644BX6FZ0($27, $02)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = 3.0
    local2\Field1 = 2.0
    local2\Field3 = 90.0
    local2\Field4 = -90.0
    local2\Field7 = 4.7
    local2 = X644BX6FZ0($16, $02)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 90.0
    local2\Field4 = -90.0
    local2\Field7 = 4.7
    local2 = X644BX6FZ0($29, $02)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 90.0
    local2\Field4 = -90.0
    local2\Field7 = 4.7
    local2 = X644BX6FZ0($15, $02)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 90.0
    local2\Field4 = -90.0
    local2\Field7 = 4.7
    local2 = X644BX6FZ0($13, $02)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 90.0
    local2\Field4 = -90.0
    local2\Field7 = 4.7
    local2 = X644BX6FZ0($14, $02)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -7.0
    local2\Field2 = -1.0
    local2\Field1 = 2.0
    local2\Field3 = 90.0
    local2\Field4 = -90.0
    local2\Field7 = 4.7
    local2 = X644BX6FZ0($1B, $02)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = 0.0
    local2\Field2 = 2.5
    local2\Field1 = 0.0
    local2\Field3 = 90.0
    local2\Field7 = 0.35
    local2 = X644BX6FZ0($1A, $02)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -2.0
    local2\Field2 = 0.0
    local2\Field1 = 2.0
    local2\Field7 = 0.35
    local2 = X644BX6FZ0($1F9, $02)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -3.06
    local2\Field2 = 0.7879
    local2\Field1 = 0.9939
    local2\Field8 = 3.0
    local2\Field4 = -87.83
    local2\Field3 = 82.34
    local2\Field7 = 1.0
    local2 = X644BX6FZ0($1F6, $02)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -3.06
    local2\Field2 = 0.7879
    local2\Field1 = 0.9939
    local2\Field8 = 3.0
    local2\Field4 = -87.83
    local2\Field3 = 82.34
    local2\Field7 = 1.0
    local2 = X644BX6FZ0($1F7, $02)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -3.06
    local2\Field2 = 0.7879
    local2\Field1 = 0.9939
    local2\Field8 = 3.0
    local2\Field4 = -87.83
    local2\Field3 = 82.34
    local2\Field7 = 1.0
    local2 = X644BX6FZ0($1F8, $02)
    local2\Field5 = "Bip01_L_Hand"
    local2\Field0 = -3.8
    local2\Field2 = -2.37
    local2\Field1 = 1.73
    local2\Field8 = -80.0
    local2\Field4 = -180.0
    local2\Field3 = 180.0
    local2\Field7 = 4.7
    local2 = X644BX6FZ0($19, $0B)
    local2\Field5 = "RArmHand"
    local2\Field0 = -0.5
    local2\Field2 = 1.0
    local2\Field1 = 0.0
    local2\Field8 = 90.0
    local2\Field4 = -90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.5
    local2 = X644BX6FZ0($18, $0B)
    local2\Field5 = "RArmHand"
    local2\Field0 = -0.5
    local2\Field2 = 1.0
    local2\Field1 = 0.0
    local2\Field8 = 90.0
    local2\Field4 = -90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.5
    local2 = X644BX6FZ0($17, $0B)
    local2\Field5 = "RArmHand"
    local2\Field0 = -0.5
    local2\Field2 = 1.0
    local2\Field1 = 0.0
    local2\Field8 = 90.0
    local2\Field4 = -90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.5
    local2 = X644BX6FZ0($28, $0B)
    local2\Field5 = "RArmHand"
    local2\Field0 = -0.5
    local2\Field2 = 1.0
    local2\Field1 = 0.0
    local2\Field8 = 90.0
    local2\Field4 = -90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.5
    local2 = X644BX6FZ0($1E, $0B)
    local2\Field5 = "RArmHand"
    local2\Field0 = -0.5
    local2\Field2 = 1.0
    local2\Field1 = 0.0
    local2\Field8 = 90.0
    local2\Field4 = -90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.5
    local2 = X644BX6FZ0($1F, $0B)
    local2\Field5 = "RArmHand"
    local2\Field0 = -0.5
    local2\Field2 = 1.0
    local2\Field1 = 0.0
    local2\Field8 = 90.0
    local2\Field4 = -90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.5
    local2 = X644BX6FZ0($26, $0B)
    local2\Field5 = "RArmHand"
    local2\Field0 = -0.5
    local2\Field2 = 1.0
    local2\Field1 = 0.0
    local2\Field8 = 90.0
    local2\Field4 = -90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.5
    local2 = X644BX6FZ0($20, $0B)
    local2\Field5 = "RArmHand"
    local2\Field0 = 0.0
    local2\Field2 = 1.0
    local2\Field1 = 0.0
    local2\Field8 = 90.0
    local2\Field4 = -90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.6
    local2 = X644BX6FZ0($27, $0B)
    local2\Field5 = "RArmHand"
    local2\Field0 = 0.0
    local2\Field2 = 1.0
    local2\Field1 = 0.0
    local2\Field8 = 90.0
    local2\Field4 = -90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.6
    local2 = X644BX6FZ0($16, $0B)
    local2\Field5 = "RArmHand"
    local2\Field0 = -0.5
    local2\Field2 = 1.0
    local2\Field1 = 0.0
    local2\Field8 = 90.0
    local2\Field4 = -90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.5
    local2 = X644BX6FZ0($29, $0B)
    local2\Field5 = "RArmHand"
    local2\Field0 = -0.5
    local2\Field2 = 1.0
    local2\Field1 = 0.0
    local2\Field8 = 90.0
    local2\Field4 = -90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.5
    local2 = X644BX6FZ0($15, $0B)
    local2\Field5 = "RArmHand"
    local2\Field0 = -0.5
    local2\Field2 = 1.0
    local2\Field1 = 0.0
    local2\Field8 = 90.0
    local2\Field4 = -90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.5
    local2 = X644BX6FZ0($13, $0B)
    local2\Field5 = "RArmHand"
    local2\Field0 = -0.5
    local2\Field2 = 1.0
    local2\Field1 = 0.0
    local2\Field8 = 90.0
    local2\Field4 = -90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.5
    local2 = X644BX6FZ0($14, $0B)
    local2\Field5 = "RArmHand"
    local2\Field0 = -0.5
    local2\Field2 = 1.0
    local2\Field1 = 0.0
    local2\Field8 = 90.0
    local2\Field4 = -90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.5
    local2 = X644BX6FZ0($1B, $0B)
    local2\Field5 = "RArmHand"
    local2\Field0 = 0.4
    local2\Field7 = 0.05
    local2 = X644BX6FZ0($1A, $0B)
    local2\Field5 = "RArmHand"
    local2\Field2 = 0.5
    local2\Field1 = 0.5
    local2\Field7 = 0.05
    local2 = X644BX6FZ0($1F9, $0B)
    local2\Field5 = "RArmHand"
    local2\Field0 = -0.032
    local2\Field2 = 0.236
    local2\Field1 = 0.258
    local2\Field8 = -17.0
    local2\Field4 = -168.0
    local2\Field3 = 3.55
    local2\Field7 = 0.146
    local2 = X644BX6FZ0($1F6, $0B)
    local2\Field5 = "RArmHand"
    local2\Field0 = -0.032
    local2\Field2 = 0.236
    local2\Field1 = 0.258
    local2\Field8 = -17.0
    local2\Field4 = -168.0
    local2\Field3 = 3.55
    local2\Field7 = 0.146
    local2 = X644BX6FZ0($1F7, $0B)
    local2\Field5 = "RArmHand"
    local2\Field0 = -0.032
    local2\Field2 = 0.236
    local2\Field1 = 0.258
    local2\Field8 = -17.0
    local2\Field4 = -168.0
    local2\Field3 = 3.55
    local2\Field7 = 0.146
    local2 = X644BX6FZ0($1F8, $0B)
    local2\Field5 = "RArmHand"
    local2\Field0 = -0.212
    local2\Field2 = 0.416
    local2\Field1 = 0.206
    local2\Field8 = 0.0
    local2\Field4 = -107.0
    local2\Field3 = 94.0
    local2\Field7 = 0.673
    local2 = X644BX6FZ0($1C, $0B)
    local2\Field5 = "NeckHead"
    local2\Field2 = -0.7
    local2\Field1 = 0.6
    local2\Field4 = 180.0
    local2\Field7 = 0.15
    local2 = X644BX6FZ0($1D, $0B)
    local2\Field5 = "NeckHead"
    local2\Field0 = 0.0
    local2\Field2 = 0.22
    local2\Field1 = -0.11
    local2\Field7 = 0.15
    local2 = X644BX6FZ0($08, $0B)
    local2\Field5 = "NeckHead"
    local2\Field0 = 0.0
    local2\Field2 = 0.3
    local2\Field1 = 0.5
    local2\Field7 = 0.13
    BX8X22F44($08, $0B, $09, $FFFFFFFF)
    BX8X22F44($08, $0B, $0A, $FFFFFFFF)
    BX8X22F44($08, $0B, $0B, $FFFFFFFF)
    BX8X22F44($08, $0B, $0C, $FFFFFFFF)
    local2 = X644BX6FZ0($0F, $0B)
    local2\Field5 = "NeckHead"
    local2\Field0 = 0.0
    local2\Field2 = 0.7
    local2\Field1 = 0.2
    local2\Field7 = 0.7
    BX8X22F44($0F, $0B, $10, $FFFFFFFF)
    BX8X22F44($0F, $0B, $0E, $FFFFFFFF)
    local2 = X644BX6FZ0($0D, $0B)
    local2\Field5 = "Spine3"
    local2\Field0 = 0.0
    local2\Field2 = 1.1
    local2\Field1 = 0.6
    local2\Field8 = 70.0
    local2\Field7 = 0.13
    local2 = X644BX6FZ0($11, $0B)
    local2\Field5 = "RArmIndex2"
    local2\Field7 = 2.0
    BX8X22F44($11, $0B, $12, $FFFFFFFF)
    local2 = X644BX6FZ0($19, $09)
    local2\Field5 = "Hand.R"
    local2\Field0 = (1.0 / -7.19844)
    local2\Field2 = 0.787846
    local2\Field1 = 0.0
    local2\Field8 = 80.0
    local2\Field4 = -90.0
    local2\Field3 = 20.0
    local2\Field7 = 0.6
    local2 = X644BX6FZ0($18, $09)
    local2\Field5 = "Hand.R"
    local2\Field0 = (1.0 / -7.19844)
    local2\Field2 = 0.787846
    local2\Field1 = 0.0
    local2\Field8 = 80.0
    local2\Field4 = -90.0
    local2\Field3 = 20.0
    local2\Field7 = 0.6
    local2 = X644BX6FZ0($17, $09)
    local2\Field5 = "Hand.R"
    local2\Field0 = (1.0 / -7.19844)
    local2\Field2 = 0.787846
    local2\Field1 = 0.0
    local2\Field8 = 80.0
    local2\Field4 = -90.0
    local2\Field3 = 20.0
    local2\Field7 = 0.6
    local2 = X644BX6FZ0($28, $09)
    local2\Field5 = "Hand.R"
    local2\Field0 = (1.0 / -7.19844)
    local2\Field2 = 0.787846
    local2\Field1 = 0.0
    local2\Field8 = 80.0
    local2\Field4 = -90.0
    local2\Field3 = 20.0
    local2\Field7 = 0.6
    local2 = X644BX6FZ0($1E, $09)
    local2\Field5 = "Hand.R"
    local2\Field0 = (1.0 / -7.19844)
    local2\Field2 = 0.787846
    local2\Field1 = 0.0
    local2\Field8 = 80.0
    local2\Field4 = -90.0
    local2\Field3 = 20.0
    local2\Field7 = 0.6
    local2 = X644BX6FZ0($1F, $09)
    local2\Field5 = "Hand.R"
    local2\Field0 = (1.0 / -7.19844)
    local2\Field2 = 0.787846
    local2\Field1 = 0.0
    local2\Field8 = 80.0
    local2\Field4 = -90.0
    local2\Field3 = 20.0
    local2\Field7 = 0.6
    local2 = X644BX6FZ0($26, $09)
    local2\Field5 = "Hand.R"
    local2\Field0 = (1.0 / -7.19844)
    local2\Field2 = 0.787846
    local2\Field1 = 0.0
    local2\Field8 = 80.0
    local2\Field4 = -90.0
    local2\Field3 = 20.0
    local2\Field7 = 0.6
    local2 = X644BX6FZ0($20, $09)
    local2\Field5 = "Hand.R"
    local2\Field0 = (1.0 / -7.19844)
    local2\Field2 = 0.0
    local2\Field1 = 0.0
    local2\Field8 = 80.0
    local2\Field4 = -90.0
    local2\Field3 = 20.0
    local2\Field7 = 0.6
    local2 = X644BX6FZ0($27, $09)
    local2\Field5 = "Hand.R"
    local2\Field0 = (1.0 / -7.19844)
    local2\Field2 = 0.0
    local2\Field1 = 0.0
    local2\Field8 = 80.0
    local2\Field4 = -90.0
    local2\Field3 = 20.0
    local2\Field7 = 0.6
    local2 = X644BX6FZ0($16, $09)
    local2\Field5 = "Hand.R"
    local2\Field0 = (1.0 / -7.19844)
    local2\Field2 = 0.787846
    local2\Field1 = 0.0
    local2\Field8 = 80.0
    local2\Field4 = -90.0
    local2\Field3 = 20.0
    local2\Field7 = 0.6
    local2 = X644BX6FZ0($29, $09)
    local2\Field5 = "Hand.R"
    local2\Field0 = (1.0 / -7.19844)
    local2\Field2 = 0.787846
    local2\Field1 = 0.0
    local2\Field8 = 80.0
    local2\Field4 = -90.0
    local2\Field3 = 20.0
    local2\Field7 = 0.6
    local2 = X644BX6FZ0($15, $09)
    local2\Field5 = "Hand.R"
    local2\Field0 = (1.0 / -7.19844)
    local2\Field2 = 0.787846
    local2\Field1 = 0.0
    local2\Field8 = 80.0
    local2\Field4 = -90.0
    local2\Field3 = 20.0
    local2\Field7 = 0.58
    local2 = X644BX6FZ0($13, $09)
    local2\Field5 = "Hand.R"
    local2\Field0 = (1.0 / -7.19844)
    local2\Field2 = 0.787846
    local2\Field1 = 0.0
    local2\Field8 = 80.0
    local2\Field4 = -90.0
    local2\Field3 = 20.0
    local2\Field7 = 0.6
    local2 = X644BX6FZ0($14, $09)
    local2\Field5 = "Hand.R"
    local2\Field0 = (1.0 / -7.19844)
    local2\Field2 = 0.787846
    local2\Field1 = 0.0
    local2\Field8 = 80.0
    local2\Field4 = -90.0
    local2\Field3 = 20.0
    local2\Field7 = 0.6
    local2 = X644BX6FZ0($1B, $09)
    local2\Field5 = "Hand.R"
    local2\Field0 = -0.4
    local2\Field2 = -0.5
    local2\Field1 = 0.0
    local2\Field8 = 0.0
    local2\Field4 = 0.0
    local2\Field3 = 0.0
    local2\Field7 = 0.05
    local2 = X644BX6FZ0($1A, $09)
    local2\Field5 = "Hand.R"
    local2\Field0 = 0.2
    local2\Field2 = 0.2
    local2\Field1 = 0.2
    local2\Field8 = 90.0
    local2\Field4 = 90.0
    local2\Field3 = 0.0
    local2\Field7 = 0.05
    local2 = X644BX6FZ0($1F9, $09)
    local2\Field5 = "Hand.R"
    local2\Field0 = 0.23
    local2\Field2 = 0.17
    local2\Field1 = -0.074
    local2\Field8 = 0.0
    local2\Field4 = 90.0
    local2\Field3 = -2.9
    local2\Field7 = 0.1311
    local2 = X644BX6FZ0($1F6, $09)
    local2\Field5 = "Hand.R"
    local2\Field0 = 0.23
    local2\Field2 = 0.17
    local2\Field1 = -0.074
    local2\Field8 = 0.0
    local2\Field4 = 90.0
    local2\Field3 = -2.9
    local2\Field7 = 0.1311
    local2 = X644BX6FZ0($1F7, $09)
    local2\Field5 = "Hand.R"
    local2\Field0 = 0.23
    local2\Field2 = 0.17
    local2\Field1 = -0.074
    local2\Field8 = 0.0
    local2\Field4 = 90.0
    local2\Field3 = -2.9
    local2\Field7 = 0.1311
    local2 = X644BX6FZ0($1F8, $09)
    local2\Field5 = "Hand.R"
    local2\Field0 = 0.101
    local2\Field2 = 0.31
    local2\Field1 = 0.176
    local2\Field8 = -8.0
    local2\Field4 = 172.0
    local2\Field3 = 100.0
    local2\Field7 = 0.62
    local2 = X644BX6FZ0($1C, $09)
    local2\Field5 = "Head"
    local2\Field0 = 0.0
    local2\Field2 = -0.144
    local2\Field1 = 0.794
    local2\Field8 = 7.95
    local2\Field4 = 180.0
    local2\Field3 = 0.0
    local2\Field7 = 0.12
    local2 = X644BX6FZ0($07, $09)
    local2\Field5 = "Head"
    local2\Field0 = 0.0
    local2\Field2 = 0.19
    local2\Field1 = 0.0
    local2\Field7 = 0.115
    local2\Field6 = $01
    local2 = X644BX6FZ0($1D, $09)
    local2\Field5 = "Head"
    local2\Field0 = 0.0
    local2\Field2 = 0.19
    local2\Field1 = 0.0
    local2\Field7 = 0.115
    local2 = X644BX6FZ0($08, $09)
    local2\Field5 = "Head"
    local2\Field0 = 0.0
    local2\Field2 = 0.35
    local2\Field1 = 0.6
    local2\Field7 = 0.12
    BX8X22F44($08, $09, $09, $FFFFFFFF)
    BX8X22F44($08, $09, $0A, $FFFFFFFF)
    BX8X22F44($08, $09, $0B, $FFFFFFFF)
    BX8X22F44($08, $09, $0C, $FFFFFFFF)
    local2 = X644BX6FZ0($0F, $09)
    local2\Field5 = "Head"
    local2\Field0 = 0.0
    local2\Field2 = 0.6
    local2\Field1 = 0.26
    local2\Field4 = 0.0
    local2\Field7 = 0.55
    BX8X22F44($0F, $09, $10, $FFFFFFFF)
    BX8X22F44($0F, $09, $0E, $FFFFFFFF)
    local2 = X644BX6FZ0($0D, $09)
    local2\Field5 = "Chest"
    local2\Field0 = 0.0
    local2\Field2 = 1.6
    local2\Field1 = 0.85
    local2\Field8 = 80.0
    local2\Field7 = 0.13
    local2 = X644BX6FZ0($11, $09)
    local2\Field5 = "Fingers02.R"
    local2\Field7 = 2.0
    local2\Field0 = -0.06
    local2\Field2 = 0.0
    local2\Field1 = -0.03
    BX8X22F44($11, $09, $12, $FFFFFFFF)
    local2 = X644BX6FZ0($19, $10)
    local2\Field5 = "Anim_Attachment_RH"
    local2\Field0 = 0.0
    local2\Field2 = 3.0
    local2\Field1 = 4.5
    local2\Field8 = 0.0
    local2\Field4 = 180.0
    local2\Field3 = -70.0
    local2\Field7 = 4.6
    local2 = X644BX6FZ0($18, $10)
    local2\Field5 = "Anim_Attachment_RH"
    local2\Field0 = 0.0
    local2\Field2 = 3.0
    local2\Field1 = 4.5
    local2\Field8 = 0.0
    local2\Field4 = 180.0
    local2\Field3 = -70.0
    local2\Field7 = 4.6
    local2 = X644BX6FZ0($17, $10)
    local2\Field5 = "Anim_Attachment_RH"
    local2\Field0 = 0.0
    local2\Field2 = 3.0
    local2\Field1 = 4.5
    local2\Field8 = 0.0
    local2\Field4 = 180.0
    local2\Field3 = -70.0
    local2\Field7 = 4.6
    local2 = X644BX6FZ0($28, $10)
    local2\Field5 = "Anim_Attachment_RH"
    local2\Field0 = 0.0
    local2\Field2 = 3.0
    local2\Field1 = 4.5
    local2\Field8 = 0.0
    local2\Field4 = 180.0
    local2\Field3 = -70.0
    local2\Field7 = 4.6
    local2 = X644BX6FZ0($1E, $10)
    local2\Field5 = "Anim_Attachment_RH"
    local2\Field0 = 0.0
    local2\Field2 = 3.0
    local2\Field1 = 4.5
    local2\Field8 = 0.0
    local2\Field4 = 180.0
    local2\Field3 = -70.0
    local2\Field7 = 4.6
    local2 = X644BX6FZ0($1F, $10)
    local2\Field5 = "Anim_Attachment_RH"
    local2\Field0 = 0.0
    local2\Field2 = 3.0
    local2\Field1 = 4.5
    local2\Field8 = 0.0
    local2\Field4 = 180.0
    local2\Field3 = -70.0
    local2\Field7 = 4.6
    local2 = X644BX6FZ0($26, $10)
    local2\Field5 = "Anim_Attachment_RH"
    local2\Field0 = 0.0
    local2\Field2 = 3.0
    local2\Field1 = 4.5
    local2\Field8 = 0.0
    local2\Field4 = 180.0
    local2\Field3 = -70.0
    local2\Field7 = 4.6
    local2 = X644BX6FZ0($20, $10)
    local2\Field5 = "Anim_Attachment_RH"
    local2\Field0 = 0.0
    local2\Field2 = 0.0
    local2\Field1 = 4.5
    local2\Field8 = 0.0
    local2\Field4 = 180.0
    local2\Field3 = -70.0
    local2\Field7 = 4.6
    local2 = X644BX6FZ0($27, $10)
    local2\Field5 = "Anim_Attachment_RH"
    local2\Field0 = 0.0
    local2\Field2 = 0.0
    local2\Field1 = 4.5
    local2\Field8 = 0.0
    local2\Field4 = 180.0
    local2\Field3 = -70.0
    local2\Field7 = 4.6
    local2 = X644BX6FZ0($16, $10)
    local2\Field5 = "Anim_Attachment_RH"
    local2\Field0 = 0.0
    local2\Field2 = 3.0
    local2\Field1 = 4.5
    local2\Field8 = 0.0
    local2\Field4 = 180.0
    local2\Field3 = -70.0
    local2\Field7 = 4.6
    local2 = X644BX6FZ0($29, $10)
    local2\Field5 = "Anim_Attachment_RH"
    local2\Field0 = 0.0
    local2\Field2 = 3.0
    local2\Field1 = 4.5
    local2\Field8 = 0.0
    local2\Field4 = 180.0
    local2\Field3 = -70.0
    local2\Field7 = 4.6
    local2 = X644BX6FZ0($15, $10)
    local2\Field5 = "Anim_Attachment_RH"
    local2\Field0 = 0.0
    local2\Field2 = 3.0
    local2\Field1 = 4.5
    local2\Field8 = 0.0
    local2\Field4 = 180.0
    local2\Field3 = -70.0
    local2\Field7 = 4.6
    local2 = X644BX6FZ0($13, $10)
    local2\Field5 = "Anim_Attachment_RH"
    local2\Field0 = 0.0
    local2\Field2 = 3.0
    local2\Field1 = 4.5
    local2\Field8 = 0.0
    local2\Field4 = 180.0
    local2\Field3 = -70.0
    local2\Field7 = 4.6
    local2 = X644BX6FZ0($14, $10)
    local2\Field5 = "Anim_Attachment_RH"
    local2\Field0 = 0.0
    local2\Field2 = 3.0
    local2\Field1 = 4.5
    local2\Field8 = 0.0
    local2\Field4 = 180.0
    local2\Field3 = -70.0
    local2\Field7 = 4.6
    local2 = X644BX6FZ0($1B, $10)
    local2\Field5 = "Bip01_R_Wrist"
    local2\Field0 = 1.0
    local2\Field2 = 0.0
    local2\Field1 = -3.8
    local2\Field8 = 90.0
    local2\Field4 = 0.0
    local2\Field3 = 90.0
    local2\Field7 = 0.383
    local2 = X644BX6FZ0($1A, $10)
    local2\Field5 = "Anim_Attachment_RH"
    local2\Field0 = 0.0
    local2\Field2 = -1.0
    local2\Field1 = 0.0
    local2\Field8 = 0.0
    local2\Field4 = 0.0
    local2\Field3 = 90.0
    local2\Field7 = 0.383
    local2 = X644BX6FZ0($1F9, $10)
    local2\Field5 = "Anim_Attachment_RH"
    local2\Field0 = 0.0
    local2\Field2 = 0.0
    local2\Field1 = 0.0
    local2\Field8 = 1.07
    local2\Field4 = -85.0
    local2\Field3 = 69.1
    local2\Field7 = 1.0
    local2 = X644BX6FZ0($1F6, $10)
    local2\Field5 = "Anim_Attachment_RH"
    local2\Field0 = 0.0
    local2\Field2 = 0.0
    local2\Field1 = 0.0
    local2\Field8 = 1.07
    local2\Field4 = -85.0
    local2\Field3 = 69.1
    local2\Field7 = 1.0
    local2 = X644BX6FZ0($1F7, $10)
    local2\Field5 = "Anim_Attachment_RH"
    local2\Field0 = 0.0
    local2\Field2 = 0.0
    local2\Field1 = 0.0
    local2\Field8 = 1.07
    local2\Field4 = -85.0
    local2\Field3 = 69.1
    local2\Field7 = 1.0
    local2 = X644BX6FZ0($1F8, $10)
    local2\Field5 = "Anim_Attachment_RH"
    local2\Field0 = 0.51
    local2\Field2 = 2.34
    local2\Field1 = -0.72
    local2\Field8 = 84.61
    local2\Field4 = -21.0
    local2\Field3 = -58.0
    local2\Field7 = 5.0
    local2 = X644BX6FZ0($1C, $10)
    local2\Field5 = "Bip01_Head1"
    local2\Field0 = 1.1
    local2\Field2 = -7.2
    local2\Field1 = 0.015
    local2\Field8 = -72.0
    local2\Field4 = -98.0
    local2\Field3 = -9.6
    local2\Field7 = 1.1
    local2 = X644BX6FZ0($07, $10)
    local2\Field5 = "Bip01_Head1"
    local2\Field0 = -3.3
    local2\Field2 = 1.0
    local2\Field1 = 0.0
    local2\Field8 = 90.0
    local2\Field4 = 0.0
    local2\Field3 = 90.0
    local2\Field7 = 1.02
    local2\Field6 = $02
    local2 = X644BX6FZ0($1D, $10)
    local2\Field5 = "Bip01_Head1"
    local2\Field0 = -3.3
    local2\Field2 = 1.0
    local2\Field1 = 0.0
    local2\Field7 = 1.02
    local2\Field8 = 90.0
    local2\Field4 = 0.0
    local2\Field3 = 90.0
    local2 = X644BX6FZ0($08, $10)
    local2\Field5 = "Bip01_Head1"
    local2\Field0 = -4.7
    local2\Field2 = -3.8
    local2\Field1 = 0.0
    local2\Field7 = 1.07
    local2\Field8 = 83.0
    local2\Field4 = 80.0
    local2\Field3 = 8.75
    BX8X22F44($08, $10, $09, $FFFFFFFF)
    BX8X22F44($08, $10, $0A, $FFFFFFFF)
    BX8X22F44($08, $10, $0B, $FFFFFFFF)
    BX8X22F44($08, $10, $0C, $FFFFFFFF)
    local2 = X644BX6FZ0($0F, $10)
    local2\Field5 = "Bip01_Head1"
    local2\Field0 = -5.3
    local2\Field2 = -1.6
    local2\Field1 = 0.0
    local2\Field7 = 5.3
    local2\Field8 = 90.0
    local2\Field4 = 0.0
    local2\Field3 = 90.0
    BX8X22F44($0F, $10, $10, $FFFFFFFF)
    BX8X22F44($0F, $10, $0E, $FFFFFFFF)
    local2 = X644BX6FZ0($0D, $10)
    local2\Field5 = "Bip01_Spine4"
    local2\Field0 = -2.0
    local2\Field2 = 7.0
    local2\Field1 = 0.0
    local2\Field8 = 200.0
    local2\Field4 = 90.0
    local2\Field3 = 180.0
    local2\Field7 = 1.3
    local2 = X644BX6FZ0($11, $10)
    local2\Field5 = "Bip01_R_Finger21"
    local2\Field7 = 10.0
    local2\Field8 = 90.0
    local2\Field4 = 0.0
    local2\Field3 = 90.0
    BX8X22F44($11, $10, $12, $FFFFFFFF)
    local2 = X644BX6FZ0($19, $0A)
    local2\Field5 = "hand_R"
    local2\Field0 = 0.353485
    local2\Field2 = 0.87467
    local2\Field1 = 0.0
    local2\Field8 = 110.0
    local2\Field4 = 90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.55
    local2 = X644BX6FZ0($18, $0A)
    local2\Field5 = "hand_R"
    local2\Field0 = 0.353485
    local2\Field2 = 0.87467
    local2\Field1 = 0.0
    local2\Field8 = 110.0
    local2\Field4 = 90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.55
    local2 = X644BX6FZ0($17, $0A)
    local2\Field5 = "hand_R"
    local2\Field0 = 0.353485
    local2\Field2 = 0.87467
    local2\Field1 = 0.0
    local2\Field8 = 110.0
    local2\Field4 = 90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.55
    local2 = X644BX6FZ0($28, $0A)
    local2\Field5 = "hand_R"
    local2\Field0 = 0.353485
    local2\Field2 = 0.87467
    local2\Field1 = 0.0
    local2\Field8 = 110.0
    local2\Field4 = 90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.55
    local2 = X644BX6FZ0($1E, $0A)
    local2\Field5 = "hand_R"
    local2\Field0 = 0.353485
    local2\Field2 = 0.87467
    local2\Field1 = 0.0
    local2\Field8 = 110.0
    local2\Field4 = 90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.55
    local2 = X644BX6FZ0($1F, $0A)
    local2\Field5 = "hand_R"
    local2\Field0 = 0.353485
    local2\Field2 = 0.87467
    local2\Field1 = 0.0
    local2\Field8 = 110.0
    local2\Field4 = 90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.55
    local2 = X644BX6FZ0($26, $0A)
    local2\Field5 = "hand_R"
    local2\Field0 = 0.353485
    local2\Field2 = 0.87467
    local2\Field1 = 0.0
    local2\Field8 = 110.0
    local2\Field4 = 90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.55
    local2 = X644BX6FZ0($20, $0A)
    local2\Field5 = "hand_R"
    local2\Field0 = 0.353485
    local2\Field2 = 0.0
    local2\Field1 = 0.0
    local2\Field8 = 110.0
    local2\Field4 = 90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.55
    local2 = X644BX6FZ0($27, $0A)
    local2\Field5 = "hand_R"
    local2\Field0 = 0.353485
    local2\Field2 = 0.0
    local2\Field1 = 0.0
    local2\Field8 = 110.0
    local2\Field4 = 90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.55
    local2 = X644BX6FZ0($16, $0A)
    local2\Field5 = "hand_R"
    local2\Field0 = 0.353485
    local2\Field2 = 0.87467
    local2\Field1 = 0.0
    local2\Field8 = 110.0
    local2\Field4 = 90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.55
    local2 = X644BX6FZ0($29, $0A)
    local2\Field5 = "hand_R"
    local2\Field0 = 0.353485
    local2\Field2 = 0.87467
    local2\Field1 = 0.0
    local2\Field8 = 110.0
    local2\Field4 = 90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.55
    local2 = X644BX6FZ0($15, $0A)
    local2\Field5 = "hand_R"
    local2\Field0 = 0.353485
    local2\Field2 = 0.87467
    local2\Field1 = 0.0
    local2\Field8 = 110.0
    local2\Field4 = 90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.55
    local2 = X644BX6FZ0($13, $0A)
    local2\Field5 = "hand_R"
    local2\Field0 = 0.353485
    local2\Field2 = 0.87467
    local2\Field1 = 0.0
    local2\Field8 = 110.0
    local2\Field4 = 90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.55
    local2 = X644BX6FZ0($14, $0A)
    local2\Field5 = "hand_R"
    local2\Field0 = 0.353485
    local2\Field2 = 0.87467
    local2\Field1 = 0.0
    local2\Field8 = 110.0
    local2\Field4 = 90.0
    local2\Field3 = 90.0
    local2\Field7 = 0.55
    local2 = X644BX6FZ0($1B, $0A)
    local2\Field5 = "hand_R"
    local2\Field0 = -0.4
    local2\Field7 = 0.05
    local2 = X644BX6FZ0($1A, $0A)
    local2\Field5 = "hand_R"
    local2\Field2 = 0.3
    local2\Field7 = 0.05
    local2 = X644BX6FZ0($1F9, $0A)
    local2\Field5 = "hand_L"
    local2\Field0 = -0.108
    local2\Field2 = 0.206
    local2\Field1 = 0.22
    local2\Field7 = 0.131
    local2 = X644BX6FZ0($1F6, $0A)
    local2\Field5 = "hand_L"
    local2\Field0 = -0.108
    local2\Field2 = 0.206
    local2\Field1 = 0.22
    local2\Field7 = 0.131
    local2 = X644BX6FZ0($1F7, $0A)
    local2\Field5 = "hand_L"
    local2\Field0 = -0.108
    local2\Field2 = 0.206
    local2\Field1 = 0.22
    local2\Field7 = 0.131
    local2 = X644BX6FZ0($1F8, $0A)
    local2\Field5 = "hand_R"
    local2\Field0 = 0.15
    local2\Field2 = 0.428
    local2\Field1 = -0.17
    local2\Field8 = 0.0
    local2\Field4 = 88.55
    local2\Field3 = -69.51
    local2\Field7 = 0.5629
    local2 = X644BX6FZ0($1C, $0A)
    local2\Field5 = "head"
    local2\Field0 = -0.7
    local2\Field2 = -0.4
    local2\Field1 = 0.0
    local2\Field4 = -90.0
    local2\Field3 = 0.0
    local2\Field7 = 0.14
    local2 = X644BX6FZ0($1D, $0A)
    local2\Field5 = "head"
    local2\Field0 = 0.2
    local2\Field2 = 0.18
    local2\Field1 = 0.0
    local2\Field4 = 90.0
    local2\Field3 = 0.0
    local2\Field7 = 0.14
    local2 = X644BX6FZ0($08, $0A)
    local2\Field5 = "head"
    local2\Field0 = -0.4
    local2\Field2 = 0.4
    local2\Field1 = 0.0
    local2\Field4 = 90.0
    local2\Field7 = 0.13
    BX8X22F44($08, $0A, $09, $FFFFFFFF)
    BX8X22F44($08, $0A, $0A, $FFFFFFFF)
    BX8X22F44($08, $0A, $0B, $FFFFFFFF)
    BX8X22F44($08, $0A, $0C, $FFFFFFFF)
    local2 = X644BX6FZ0($0F, $0A)
    local2\Field5 = "head"
    local2\Field0 = -0.15
    local2\Field2 = 0.6
    local2\Field1 = 0.0
    local2\Field4 = 90.0
    local2\Field7 = 0.7
    BX8X22F44($0F, $0A, $10, $FFFFFFFF)
    BX8X22F44($0F, $0A, $0E, $FFFFFFFF)
    local2 = X644BX6FZ0($0D, $0A)
    local2\Field5 = "chest"
    local2\Field0 = -0.85
    local2\Field2 = 1.0
    local2\Field1 = 0.0
    local2\Field8 = 80.0
    local2\Field4 = 90.0
    local2\Field7 = 0.13
    local2 = X644BX6FZ0($11, $0A)
    local2\Field5 = "f_index_01_R"
    local2\Field7 = 2.0
    BX8X22F44($11, $0A, $12, $FFFFFFFF)
    BX8X22F44($01, $01, $01, $0C)
    BX8X22F44($01, $01, $02, $0C)
    BX8X22F44($01, $01, $03, $0C)
    BX8X22F44($01, $01, $04, $0C)
    BX8X22F44($08, $01, $08, $0C)
    BX8X22F44($08, $01, $09, $0C)
    BX8X22F44($08, $01, $0A, $0C)
    BX8X22F44($08, $01, $0B, $0C)
    BX8X22F44($08, $01, $0C, $0C)
    BX8X22F44($0F, $01, $0F, $0C)
    BX8X22F44($0F, $01, $10, $0C)
    BX8X22F44($0F, $01, $0E, $0C)
    BX8X22F44($0D, $01, $0D, $0C)
    BX8X22F44($05, $01, $05, $0C)
    BX8X22F44($06, $01, $06, $0C)
    BX8X22F44($07, $01, $07, $0C)
    BX8X22F44($1D, $01, $1D, $0C)
    BX8X22F44($11, $01, $11, $0C)
    BX8X22F44($19, $01, $19, $0C)
    BX8X22F44($18, $01, $18, $0C)
    BX8X22F44($17, $01, $17, $0C)
    BX8X22F44($1E, $01, $1E, $0C)
    BX8X22F44($1F, $01, $1F, $0C)
    BX8X22F44($20, $01, $20, $0C)
    BX8X22F44($27, $01, $27, $0C)
    BX8X22F44($28, $01, $28, $0C)
    BX8X22F44($26, $01, $26, $0C)
    BX8X22F44($16, $01, $16, $0C)
    BX8X22F44($29, $01, $29, $0C)
    BX8X22F44($15, $01, $15, $0C)
    BX8X22F44($13, $01, $13, $0C)
    BX8X22F44($14, $01, $14, $0C)
    BX8X22F44($01, $01, $01, $11)
    BX8X22F44($01, $01, $02, $11)
    BX8X22F44($01, $01, $03, $11)
    BX8X22F44($01, $01, $04, $11)
    BX8X22F44($08, $01, $08, $11)
    BX8X22F44($08, $01, $09, $11)
    BX8X22F44($08, $01, $0A, $11)
    BX8X22F44($08, $01, $0B, $11)
    BX8X22F44($08, $01, $0C, $11)
    BX8X22F44($0F, $01, $0F, $11)
    BX8X22F44($0F, $01, $10, $11)
    BX8X22F44($0F, $01, $0E, $11)
    BX8X22F44($0D, $01, $0D, $11)
    BX8X22F44($05, $01, $05, $11)
    BX8X22F44($06, $01, $06, $11)
    BX8X22F44($07, $01, $07, $11)
    BX8X22F44($1D, $01, $1D, $11)
    BX8X22F44($11, $01, $11, $11)
    BX8X22F44($19, $01, $19, $11)
    BX8X22F44($18, $01, $18, $11)
    BX8X22F44($17, $01, $17, $11)
    BX8X22F44($1E, $01, $1E, $11)
    BX8X22F44($1F, $01, $1F, $11)
    BX8X22F44($20, $01, $20, $11)
    BX8X22F44($27, $01, $27, $11)
    BX8X22F44($28, $01, $28, $11)
    BX8X22F44($26, $01, $26, $11)
    BX8X22F44($16, $01, $16, $11)
    BX8X22F44($29, $01, $29, $11)
    BX8X22F44($15, $01, $15, $11)
    BX8X22F44($13, $01, $13, $11)
    BX8X22F44($14, $01, $14, $11)
    C6440Z8FZ($00, "GFX\Items\Weapons\Hands_textures\class_d_w_hands.png", $01)
    C6440Z8FZ($02, "GFX\Items\Weapons\Hands_textures\class_d_b_hands.png", $01)
    C6440Z8FZ($12, "GFX\Items\Weapons\Hands_textures\chaos_hands.png", $01)
    C6440Z8FZ($1D, "GFX\Items\Weapons\Hands_textures\chaos_hands.png", $01)
    C6440Z8FZ($20, "GFX\Items\Weapons\Hands_textures\chaos_hands.png", $01)
    C6440Z8FZ($13, "GFX\Items\Weapons\Hands_textures\mtf_hands.png", $01)
    C6440Z8FZ($1A, "GFX\Items\Weapons\Hands_textures\guard_hands.png", $01)
    C6440Z8FZ($1B, "GFX\Items\Weapons\Hands_textures\mtf_hands_sergant.png", $01)
    C6440Z8FZ($19, "GFX\Items\Weapons\Hands_textures\mtf_hands_captain.png", $01)
    C6440Z8FZ($14, "GFX\Items\Weapons\Hands_textures\guard_hands.png", $01)
    C6440Z8FZ($07, "GFX\Items\Weapons\Hands_textures\hazmat_arms.png", $01)
    C6440Z8FZ($09, "GFX\Items\Weapons\Hands_textures\heavy_hazmat_arms.png", $01)
    C6440Z8FZ($1E, "GFX\Items\Weapons\Hands_textures\goc_hands.png", $01)
    TXDDB62DBZ($01, "GFX\Items\Weapons\M4A1\m4a1.b3d", $01, $01)
    TX4XFD0X0BB($01, $13)
    local3 = X628F22202($01)
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
    local3\Field20[$01] = XF2F44B806($2D, $2D)
    local3\Field34[$01] = 0.5
    local3\Field20[$03] = XF2F44B806($BC, $CA)
    local3\Field34[$03] = 0.6
    local3\Field20[$02] = XF2F44B806($01, $2B)
    local3\Field34[$02] = 0.6
    local3\Field20[$06] = XF2F44B806($CC, $CC)
    local3\Field34[$06] = 1.0
    local3\Field20[$04] = XF2F44B806($CC, $CC)
    local3\Field34[$04] = 1.0
    local3\Field20[$07] = XF2F44B806($01, $2B)
    local3\Field34[$07] = -1.0
    local3\Field20[$05] = XF2F44B806($33, $9B)
    local3\Field34[$05] = 0.6
    TXDDB62DBZ($02, "GFX\Items\Weapons\Glock\glock.b3d", $00, $01)
    TX4XFD0X0BB($02, $14)
    local3 = X628F22202($02)
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
    local3\Field20[$01] = XF2F44B806($22, $22)
    local3\Field34[$01] = 0.7
    local3\Field20[$03] = XF2F44B806($8B, $AA)
    local3\Field34[$03] = 0.7
    local3\Field20[$02] = XF2F44B806($01, $21)
    local3\Field34[$02] = 0.8
    local3\Field20[$04] = XF2F44B806($C9, $C9)
    local3\Field34[$04] = 1.0
    local3\Field20[$06] = XF2F44B806($C9, $C9)
    local3\Field34[$06] = 1.0
    local3\Field20[$07] = XF2F44B806($01, $21)
    local3\Field34[$07] = -1.2
    local3\Field20[$05] = XF2F44B806($24, $8A)
    local3\Field34[$05] = 0.7
    TXDDB62DBZ($03, "GFX\Items\Weapons\M60\m60.b3d", $01, $01)
    TX4XFD0X0BB($03, $15)
    local3 = X628F22202($03)
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
    local3\Field20[$01] = XF2F44B806($D0, $E4)
    local3\Field34[$01] = 0.5
    local3\Field20[$03] = XF2F44B806($E5, $FA)
    local3\Field34[$03] = 0.7
    local3\Field20[$02] = XF2F44B806($01, $1A)
    local3\Field34[$02] = 0.3
    local3\Field20[$04] = XF2F44B806($10F, $10F)
    local3\Field34[$04] = 1.0
    local3\Field20[$06] = XF2F44B806($10F, $10F)
    local3\Field34[$06] = 1.0
    local3\Field20[$07] = XF2F44B806($01, $1A)
    local3\Field34[$07] = -0.6
    local3\Field20[$05] = XF2F44B806($1B, $CF)
    local3\Field34[$05] = 0.5
    TXDDB62DBZ($04, "GFX\Items\Weapons\SR556\SR556.b3d", $01, $01)
    TX4XFD0X0BB($04, $16)
    local3 = X628F22202($04)
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
    local3\Field20[$01] = XF2F44B806($AD, $AD)
    local3\Field34[$01] = 0.5
    local3\Field20[$03] = XF2F44B806($B0, $CB)
    local3\Field34[$03] = 0.8
    local3\Field20[$02] = XF2F44B806($01, $1A)
    local3\Field34[$02] = 0.6
    local3\Field20[$07] = XF2F44B806($01, $1A)
    local3\Field34[$07] = -0.9
    local3\Field20[$04] = XF2F44B806($108, $108)
    local3\Field34[$04] = 1.0
    local3\Field20[$06] = XF2F44B806($108, $108)
    local3\Field34[$06] = 1.0
    local3\Field20[$05] = XF2F44B806($1B, $AC)
    local3\Field34[$05] = 0.7
    TXDDB62DBZ($05, "GFX\Items\Weapons\MP5\MP5.b3d", $01, $01)
    TX4XFD0X0BB($05, $17)
    local3 = X628F22202($05)
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
    local3\Field20[$01] = XF2F44B806($83, $8E)
    local3\Field34[$01] = 0.6
    local3\Field20[$03] = XF2F44B806($98, $A3)
    local3\Field34[$03] = 0.6
    local3\Field20[$02] = XF2F44B806($01, $24)
    local3\Field34[$02] = 0.6
    local3\Field20[$07] = XF2F44B806($01, $24)
    local3\Field34[$07] = -0.9
    local3\Field20[$04] = XF2F44B806($B0, $B0)
    local3\Field34[$04] = 1.0
    local3\Field20[$06] = XF2F44B806($B0, $B0)
    local3\Field34[$06] = 1.0
    local3\Field20[$05] = XF2F44B806($25, $82)
    local3\Field34[$05] = 0.6
    TXDDB62DBZ($07, "GFX\Items\Weapons\krissvector\kriss_vector.b3d", $01, $01)
    TX4XFD0X0BB($07, $19)
    local3 = X628F22202($07)
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
    local3\Field20[$01] = XF2F44B806($21, $36)
    local3\Field34[$01] = 0.75
    local3\Field20[$03] = XF2F44B806($98, $A5)
    local3\Field34[$03] = 0.8
    local3\Field20[$02] = XF2F44B806($01, $20)
    local3\Field34[$02] = 0.7
    local3\Field20[$07] = XF2F44B806($01, $20)
    local3\Field34[$07] = -0.75
    local3\Field20[$04] = XF2F44B806($A6, $A6)
    local3\Field34[$04] = 1.0
    local3\Field20[$06] = XF2F44B806($A6, $A6)
    local3\Field34[$06] = 1.0
    local3\Field20[$05] = XF2F44B806($37, $97)
    local3\Field34[$05] = 0.75
    TXDDB62DBZ($06, "GFX\Items\Weapons\Fiveseven\Fiveseven.b3d", $00, $01)
    TX4XFD0X0BB($06, $18)
    local3 = X628F22202($06)
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
    local3\Field20[$01] = XF2F44B806($22, $22)
    local3\Field34[$01] = 0.7
    local3\Field20[$03] = XF2F44B806($88, $94)
    local3\Field34[$03] = 0.7
    local3\Field20[$02] = XF2F44B806($01, $21)
    local3\Field34[$02] = 0.7
    local3\Field20[$07] = XF2F44B806($01, $21)
    local3\Field34[$07] = -1.0
    local3\Field20[$04] = XF2F44B806($A0, $A0)
    local3\Field34[$04] = 1.0
    local3\Field20[$06] = XF2F44B806($A0, $A0)
    local3\Field34[$06] = 1.0
    local3\Field20[$05] = XF2F44B806($30, $87)
    local3\Field34[$05] = 0.7
    TXDDB62DBZ($0A, "GFX\Items\Weapons\P90\P90.b3d", $01, $01)
    TX4XFD0X0BB($0A, $1E)
    local3 = X628F22202($0A)
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
    local3\Field20[$01] = XF2F44B806($2D, $32)
    local3\Field34[$01] = 0.6
    local3\Field20[$03] = XF2F44B806($B5, $C8)
    local3\Field34[$03] = 0.5
    local3\Field20[$02] = XF2F44B806($01, $2C)
    local3\Field34[$02] = 0.7
    local3\Field20[$07] = XF2F44B806($01, $2C)
    local3\Field34[$07] = -0.9
    local3\Field20[$04] = XF2F44B806($C9, $C9)
    local3\Field34[$04] = 1.0
    local3\Field20[$06] = XF2F44B806($C9, $C9)
    local3\Field34[$06] = 1.0
    local3\Field20[$05] = XF2F44B806($38, $B4)
    local3\Field34[$05] = 0.7
    TXDDB62DBZ($0B, "GFX\Items\Weapons\MP7\MP7.b3d", $01, $01)
    TX4XFD0X0BB($0B, $1F)
    local3 = X628F22202($0B)
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
    local3\Field20[$01] = XF2F44B806($11, $11)
    local3\Field34[$01] = 0.6
    local3\Field20[$03] = XF2F44B806($DF, $EA)
    local3\Field34[$03] = 0.8
    local3\Field20[$02] = XF2F44B806($01, $10)
    local3\Field34[$02] = 0.4
    local3\Field20[$07] = XF2F44B806($01, $10)
    local3\Field34[$07] = -0.6
    local3\Field20[$04] = XF2F44B806($EB, $EB)
    local3\Field34[$04] = 1.0
    local3\Field20[$06] = XF2F44B806($EB, $EB)
    local3\Field34[$06] = 1.0
    local3\Field20[$05] = XF2F44B806($A8, $DE)
    local3\Field34[$05] = 0.5
    TXDDB62DBZ($08, "GFX\Items\Weapons\Handcuffs\Handcuffs.b3d", $00, $01)
    TX4XFD0X0BB($08, $1A)
    local3 = X628F22202($08)
    local3\Field21 = 0.0
    local3\Field31 = 0.0
    local3\Field53 = 0.0
    local3\Field47 = 0.005
    local3\Field1 = "SFX\Weapons\Handcuffs\deploy.ogg"
    local3\Field26 = $01
    local3\Field20[$01] = XF2F44B806($31, $31)
    local3\Field34[$01] = 0.5
    local3\Field20[$02] = XF2F44B806($01, $30)
    local3\Field34[$02] = 0.5
    local3\Field20[$07] = XF2F44B806($01, $31)
    local3\Field34[$07] = -0.8
    TXDDB62DBZ($09, "GFX\Items\Weapons\Handcuffs\Handcuffs.b3d", $00, $01)
    TX4XFD0X0BB($09, $1B)
    local3 = X628F22202($09)
    local3\Field21 = 0.0
    local3\Field31 = 0.0
    local3\Field53 = 0.0
    local3\Field47 = 0.005
    local3\Field1 = "SFX\Weapons\Handcuffs\equip.ogg"
    local3\Field26 = $01
    local3\Field20[$01] = XF2F44B806($35, $35)
    local3\Field34[$01] = 0.7
    local3\Field20[$02] = XF2F44B806($33, $35)
    local3\Field34[$02] = 0.3
    local3\Field20[$07] = XF2F44B806($33, $35)
    local3\Field34[$07] = -1.0
    local3\Field20[$08] = XF2F44B806($35, $35)
    local3\Field34[$08] = 0.3
    local3\Field20[$06] = XF2F44B806($35, $35)
    local3\Field34[$06] = 0.3
    TXDDB62DBZ($0E, "GFX\Items\Weapons\Hands\SCP\049_VM.b3d", $00, $01)
    TX4XFD0X0BB($0E, $22)
    local3 = X628F22202($0E)
    local3\Field21 = 0.0
    local3\Field31 = -0.01
    local3\Field53 = 0.02
    local3\Field47 = 0.005
    local3\Field1 = ""
    local3\Field26 = $01
    local3\Field5 = $01
    local3\Field20[$01] = XF2F44B806($01, $29)
    local3\Field34[$01] = 0.1
    local3\Field20[$02] = XF2F44B806($01, $01)
    local3\Field34[$02] = 0.3
    local3\Field20[$08] = XF2F44B806($2B, $52)
    local3\Field34[$08] = 0.4
    local3\Field20[$06] = XF2F44B806($2B, $52)
    local3\Field34[$06] = 0.7
    local3\Field20[$07] = XF2F44B806($01, $01)
    local3\Field34[$07] = -1.0
    local3\Field20[$03] = XF2F44B806($53, $71)
    local3\Field34[$03] = 0.7
    TXDDB62DBZ($0F, "GFX\Items\Weapons\Hands\SCP\106_VM.b3d", $00, $01)
    TX4XFD0X0BB($0F, $23)
    local3 = X628F22202($0F)
    local3\Field21 = 0.0
    local3\Field31 = 0.0
    local3\Field53 = 0.01
    local3\Field47 = 0.005
    local3\Field1 = ""
    local3\Field26 = $01
    local3\Field5 = $01
    local3\Field20[$01] = XF2F44B806($01, $29)
    local3\Field34[$01] = 0.1
    local3\Field20[$02] = XF2F44B806($01, $01)
    local3\Field34[$02] = 0.3
    local3\Field20[$06] = XF2F44B806($2B, $52)
    local3\Field34[$06] = 0.6
    local3\Field20[$08] = XF2F44B806($2B, $52)
    local3\Field34[$08] = 0.3
    local3\Field20[$07] = XF2F44B806($01, $01)
    local3\Field34[$07] = -1.0
    local3\Field20[$03] = XF2F44B806($53, $6A)
    local3\Field34[$03] = 0.5
    TXDDB62DBZ($10, "GFX\Items\Weapons\Hands\SCP\173_VM.b3d", $00, $01)
    TX4XFD0X0BB($10, $24)
    local3 = X628F22202($10)
    local3\Field21 = 0.0
    local3\Field31 = -0.04
    local3\Field53 = 0.01
    local3\Field47 = 0.005
    local3\Field1 = ""
    local3\Field26 = $01
    local3\Field5 = $01
    local3\Field20[$01] = XF2F44B806($01, $01)
    local3\Field34[$01] = 0.5
    local3\Field20[$02] = XF2F44B806($01, $01)
    local3\Field34[$02] = 0.3
    local3\Field20[$06] = XF2F44B806($01, $01)
    local3\Field34[$06] = 0.6
    local3\Field20[$08] = XF2F44B806($01, $01)
    local3\Field34[$08] = 0.6
    local3\Field20[$07] = XF2F44B806($01, $01)
    local3\Field34[$07] = -1.0
    TXDDB62DBZ($11, "GFX\Items\Weapons\Hands\SCP\966_VM.b3d", $00, $01)
    TX4XFD0X0BB($11, $25)
    local3 = X628F22202($11)
    local3\Field21 = 0.0
    local3\Field31 = -0.008
    local3\Field53 = 0.001
    local3\Field47 = 0.005
    local3\Field1 = ""
    local3\Field26 = $01
    local3\Field5 = $01
    local3\Field20[$01] = XF2F44B806($01, $3F)
    local3\Field34[$01] = 0.1
    local3\Field20[$02] = XF2F44B806($01, $01)
    local3\Field34[$02] = 0.3
    local3\Field20[$06] = XF2F44B806($42, $7C)
    local3\Field34[$06] = 0.4
    local3\Field20[$08] = XF2F44B806($42, $7C)
    local3\Field34[$08] = 0.2
    local3\Field20[$07] = XF2F44B806($01, $01)
    local3\Field34[$07] = -1.0
    local3\Field20[$03] = XF2F44B806($7C, $94)
    local3\Field34[$03] = 0.5
    TXDDB62DBZ($0D, "GFX\Items\Weapons\Hands\SCP\096_VM.b3d", $00, $01)
    TX4XFD0X0BB($0D, $21)
    local3 = X628F22202($0D)
    local3\Field21 = 0.0
    local3\Field31 = -0.02
    local3\Field53 = 0.01
    local3\Field47 = 0.005
    local3\Field1 = ""
    local3\Field26 = $01
    local3\Field5 = $01
    local3\Field20[$01] = XF2F44B806($01, $3E)
    local3\Field34[$01] = 0.2
    local3\Field20[$02] = XF2F44B806($01, $01)
    local3\Field34[$02] = 0.3
    local3\Field20[$08] = XF2F44B806($3F, $87)
    local3\Field34[$08] = 0.3
    local3\Field20[$06] = XF2F44B806($3F, $87)
    local3\Field34[$06] = 0.3
    local3\Field20[$07] = XF2F44B806($01, $01)
    local3\Field34[$07] = -1.0
    local3\Field20[$03] = XF2F44B806($14F, $159)
    local3\Field34[$03] = 0.3
    TXDDB62DBZ($0C, "GFX\Items\Weapons\M134\M134.b3d", $00, $01)
    TX4XFD0X0BB($0C, $20)
    local3 = X628F22202($0C)
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
    local3\Field20[$01] = XF2F44B806($22, $22)
    local3\Field34[$01] = 0.5
    local3\Field20[$03] = XF2F44B806($8E, $A2)
    local3\Field34[$03] = 0.8
    local3\Field20[$02] = XF2F44B806($01, $1A)
    local3\Field34[$02] = 0.3
    local3\Field20[$04] = XF2F44B806($0D, $0D)
    local3\Field34[$04] = 1.0
    local3\Field20[$06] = XF2F44B806($0D, $0D)
    local3\Field34[$06] = 1.0
    local3\Field20[$07] = XF2F44B806($01, $1A)
    local3\Field34[$07] = -0.6
    local3\Field20[$05] = XF2F44B806($23, $8D)
    local3\Field34[$05] = 0.6
    TXDDB62DBZ($12, "GFX\Items\Weapons\Remington\remington.b3d", $01, $01)
    TX4XFD0X0BB($12, $26)
    local3 = X628F22202($12)
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
    local3\Field20[$01] = XF2F44B806($32, $3C)
    local3\Field34[$01] = 0.5
    local3\Field20[$03] = XF2F44B806($E7, $107)
    local3\Field34[$03] = 0.47
    local3\Field20[$02] = XF2F44B806($01, $1F)
    local3\Field34[$02] = 0.6
    local3\Field20[$04] = XF2F44B806($02, $02)
    local3\Field34[$04] = 1.0
    local3\Field20[$06] = XF2F44B806($02, $02)
    local3\Field34[$06] = 1.0
    local3\Field20[$07] = XF2F44B806($01, $07)
    local3\Field34[$07] = -0.6
    local3\Field20[$05] = XF2F44B806($107, $1B9)
    local3\Field34[$05] = 0.7
    TXDDB62DBZ($13, "GFX\Items\Weapons\RPG7\RPG.b3d", $00, $01)
    TX4XFD0X0BB($13, $27)
    local3 = X628F22202($13)
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
    local3\Field20[$01] = XF2F44B806($2B, $2B)
    local3\Field34[$01] = 0.45
    local3\Field20[$03] = XF2F44B806($36, $51)
    local3\Field34[$03] = 0.55
    local3\Field20[$02] = XF2F44B806($01, $2A)
    local3\Field34[$02] = 0.45
    local3\Field20[$04] = XF2F44B806($2B, $2B)
    local3\Field34[$04] = 1.0
    local3\Field20[$06] = XF2F44B806($2B, $2B)
    local3\Field34[$06] = 1.0
    local3\Field20[$07] = XF2F44B806($01, $2A)
    local3\Field34[$07] = -0.6
    local3\Field20[$05] = XF2F44B806($52, $AC)
    local3\Field34[$05] = 0.45
    TXDDB62DBZ($14, "GFX\Items\Weapons\G36\g36.b3d", $01, $01)
    TX4XFD0X0BB($14, $28)
    local3 = X628F22202($14)
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
    local3\Field20[$01] = XF2F44B806($23, $23)
    local3\Field34[$01] = 0.5
    local3\Field20[$03] = XF2F44B806($97, $A8)
    local3\Field34[$03] = 0.5
    local3\Field20[$02] = XF2F44B806($01, $20)
    local3\Field34[$02] = 0.5
    local3\Field20[$07] = XF2F44B806($01, $20)
    local3\Field34[$07] = -0.7
    local3\Field20[$04] = XF2F44B806($E0, $E0)
    local3\Field34[$04] = 0.5
    local3\Field20[$06] = XF2F44B806($E0, $E0)
    local3\Field34[$06] = 0.5
    local3\Field20[$05] = XF2F44B806($30, $96)
    local3\Field34[$05] = 0.5
    TXDDB62DBZ($15, "GFX\Items\Weapons\AK74\AK74.fbx", $01, $01)
    TX4XFD0X0BB($15, $29)
    local3 = X628F22202($15)
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
    local3\Field20[$01] = XF2F44B806($28, $28)
    local3\Field34[$01] = 0.5
    local3\Field20[$03] = XF2F44B806($91, $97)
    local3\Field34[$03] = 0.7
    local3\Field20[$02] = XF2F44B806($01, $26)
    local3\Field34[$02] = 0.47
    local3\Field20[$06] = XF2F44B806($8F, $8F)
    local3\Field34[$06] = 0.5
    local3\Field20[$04] = XF2F44B806($8F, $8F)
    local3\Field34[$04] = 0.5
    local3\Field20[$07] = XF2F44B806($01, $26)
    local3\Field34[$07] = -0.9
    local3\Field20[$05] = XF2F44B806($2C, $8C)
    local3\Field34[$05] = 0.46
    TXDDB62DBZ($FF, "GFX\Items\Weapons\ItemsViewmodels\keycard.b3d", $00, $01)
    TX4XFD0X0BB($FF, $1FF)
    local3 = X628F22202($FF)
    local3\Field21 = -0.004
    local3\Field31 = -0.005
    local3\Field53 = -0.005
    local3\Field47 = 0.005
    local3\Field1 = "SFX\Weapons\MP7\deploy.ogg"
    local3\Field26 = $01
    local3\Field28 = $01
    local3\Field9 = $01
    local3\Field20[$01] = XF2F44B806($22, $22)
    local3\Field34[$01] = 0.5
    local3\Field20[$08] = XF2F44B806($22, $22)
    local3\Field34[$08] = 0.5
    local3\Field20[$06] = XF2F44B806($22, $22)
    local3\Field34[$06] = 0.5
    local3\Field20[$03] = XF2F44B806($23, $3E)
    local3\Field34[$03] = 0.7
    local3\Field20[$02] = XF2F44B806($03, $22)
    local3\Field34[$02] = 0.5
    local3\Field20[$07] = XF2F44B806($03, $22)
    local3\Field34[$07] = -0.8
    TXDDB62DBZ($FE, "GFX\Items\Weapons\ItemsViewmodels\radio.b3d", $00, $01)
    TX4XFD0X0BB($FE, $1FE)
    local3 = X628F22202($FE)
    local3\Field21 = 0.0
    local3\Field31 = -0.01
    local3\Field53 = 0.008
    local3\Field47 = 0.005
    local3\Field1 = "SFX\Weapons\MP7\deploy.ogg"
    local3\Field26 = $01
    local3\Field28 = $01
    local3\Field9 = $01
    local3\Field11 = $03
    local3\Field20[$01] = XF2F44B806($20, $20)
    local3\Field34[$01] = 0.5
    local3\Field20[$08] = XF2F44B806($20, $20)
    local3\Field34[$08] = 0.5
    local3\Field20[$06] = XF2F44B806($20, $20)
    local3\Field34[$06] = 0.5
    local3\Field20[$02] = XF2F44B806($02, $1F)
    local3\Field34[$02] = 0.5
    local3\Field20[$07] = XF2F44B806($02, $1F)
    local3\Field34[$07] = -0.8
    TXDDB62DBZ($FD, "GFX\Items\Weapons\ItemsViewmodels\snav.b3d", $00, $01)
    TX4XFD0X0BB($FD, $1FD)
    local3 = X628F22202($FD)
    local3\Field21 = 0.0
    local3\Field31 = -0.01
    local3\Field53 = -0.005
    local3\Field47 = 0.005
    local3\Field1 = "SFX\Weapons\MP7\deploy.ogg"
    local3\Field26 = $01
    local3\Field28 = $01
    local3\Field9 = $01
    local3\Field11 = $03
    local3\Field20[$01] = XF2F44B806($38, $38)
    local3\Field34[$01] = 0.5
    local3\Field20[$08] = XF2F44B806($38, $38)
    local3\Field34[$08] = 0.5
    local3\Field20[$06] = XF2F44B806($38, $38)
    local3\Field34[$06] = 0.5
    local3\Field20[$02] = XF2F44B806($02, $37)
    local3\Field34[$02] = 0.5
    local3\Field20[$07] = XF2F44B806($02, $37)
    local3\Field34[$07] = -0.8
    TXDDB62DBZ($FC, "GFX\Items\Weapons\ItemsViewmodels\hackingdevice.b3d", $00, $01)
    TX4XFD0X0BB($FC, $1FC)
    local3 = X628F22202($FC)
    local3\Field21 = 0.0
    local3\Field31 = -0.015
    local3\Field53 = 0.005
    local3\Field47 = 0.005
    local3\Field1 = "SFX\Weapons\MP7\deploy.ogg"
    local3\Field26 = $01
    local3\Field28 = $01
    local3\Field9 = $01
    local3\Field11 = $03
    local3\Field20[$01] = XF2F44B806($22, $22)
    local3\Field34[$01] = 0.5
    local3\Field20[$08] = XF2F44B806($22, $22)
    local3\Field34[$08] = 0.5
    local3\Field20[$03] = XF2F44B806($23, $3E)
    local3\Field34[$03] = 0.7
    local3\Field20[$06] = XF2F44B806($22, $22)
    local3\Field34[$06] = 0.5
    local3\Field20[$02] = XF2F44B806($03, $21)
    local3\Field34[$02] = 0.5
    local3\Field20[$07] = XF2F44B806($03, $21)
    local3\Field34[$07] = -0.8
    TXDDB62DBZ($FB, "GFX\Items\Weapons\ItemsViewmodels\sh.b3d", $00, $01)
    TX4XFD0X0BB($FB, $1FB)
    local3 = X628F22202($FB)
    local3\Field21 = -0.002
    local3\Field31 = -0.013
    local3\Field53 = -0.005
    local3\Field47 = 0.005
    local3\Field1 = "SFX\Weapons\MP7\deploy.ogg"
    local3\Field26 = $01
    local3\Field28 = $01
    local3\Field9 = $01
    local3\Field20[$01] = XF2F44B806($25, $25)
    local3\Field34[$01] = 0.5
    local3\Field20[$08] = XF2F44B806($25, $25)
    local3\Field34[$08] = 0.5
    local3\Field20[$03] = XF2F44B806($33, $44)
    local3\Field34[$03] = 0.7
    local3\Field20[$06] = XF2F44B806($25, $25)
    local3\Field34[$06] = 0.5
    local3\Field20[$02] = XF2F44B806($02, $24)
    local3\Field34[$02] = 0.5
    local3\Field20[$07] = XF2F44B806($02, $24)
    local3\Field34[$07] = -0.8
    TXDDB62DBZ($FA, "GFX\Items\Weapons\ItemsViewmodels\005.b3d", $00, $01)
    TX4XFD0X0BB($FA, $1FA)
    local3 = X628F22202($FA)
    local3\Field21 = 0.0
    local3\Field31 = -0.01
    local3\Field53 = -0.005
    local3\Field47 = 0.005
    local3\Field1 = "SFX\Weapons\MP7\deploy.ogg"
    local3\Field26 = $01
    local3\Field28 = $01
    local3\Field9 = $01
    local3\Field20[$01] = XF2F44B806($20, $20)
    local3\Field34[$01] = 0.5
    local3\Field20[$08] = XF2F44B806($20, $20)
    local3\Field34[$08] = 0.5
    local3\Field20[$06] = XF2F44B806($20, $20)
    local3\Field34[$06] = 0.5
    local3\Field20[$03] = XF2F44B806($38, $46)
    local3\Field34[$03] = 0.6
    local3\Field20[$02] = XF2F44B806($03, $1F)
    local3\Field34[$02] = 0.5
    local3\Field20[$07] = XF2F44B806($03, $1F)
    local3\Field34[$07] = -0.8
    TXDDB62DBZ($F9, "GFX\Items\Weapons\M69\M69.b3d", $00, $01)
    TX4XFD0X0BB($F9, $1F9)
    local3 = X628F22202($F9)
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
    local3\Field20[$01] = XF2F44B806($01, $65)
    local3\Field34[$01] = 0.3
    local3\Field20[$02] = XF2F44B806($66, $8F)
    local3\Field34[$02] = 0.65
    local3\Field20[$03] = XF2F44B806($90, $B6)
    local3\Field34[$03] = 0.5
    local3\Field20[$07] = XF2F44B806($66, $8F)
    local3\Field34[$07] = -1.0
    local3\Field20[$08] = XF2F44B806($01, $65)
    local3\Field34[$08] = 0.3
    local3\Field20[$06] = XF2F44B806($01, $65)
    local3\Field34[$06] = 0.3
    TXDDB62DBZ($F8, "GFX\Items\Weapons\M9Knife\M9Knife.b3d", $00, $01)
    TX4XFD0X0BB($F8, $1F8)
    local3 = X628F22202($F8)
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
    local3\Field20[$01] = XF2F44B806($12, $12)
    local3\Field34[$01] = 0.4
    local3\Field20[$02] = XF2F44B806($01, $12)
    local3\Field34[$02] = 0.45
    local3\Field20[$03] = XF2F44B806($13, $24)
    local3\Field34[$03] = 0.6
    local3\Field20[$07] = XF2F44B806($01, $12)
    local3\Field34[$07] = -0.8
    local3\Field20[$08] = XF2F44B806($12, $12)
    local3\Field34[$08] = 0.3
    local3\Field20[$06] = XF2F44B806($12, $12)
    local3\Field34[$06] = 0.3
    TXDDB62DBZ($F7, "GFX\Items\Weapons\Stemtex\Stemtex.b3d", $00, $01)
    TX4XFD0X0BB($F7, $1F7)
    local3 = X628F22202($F7)
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
    local3\Field20[$01] = XF2F44B806($01, $65)
    local3\Field34[$01] = 0.3
    local3\Field20[$02] = XF2F44B806($66, $8F)
    local3\Field34[$02] = 0.65
    local3\Field20[$03] = XF2F44B806($90, $B6)
    local3\Field34[$03] = 0.5
    local3\Field20[$07] = XF2F44B806($66, $8F)
    local3\Field34[$07] = -1.0
    local3\Field20[$08] = XF2F44B806($01, $65)
    local3\Field34[$08] = 0.3
    local3\Field20[$06] = XF2F44B806($01, $65)
    local3\Field34[$06] = 0.3
    TXDDB62DBZ($F6, "GFX\Items\Weapons\EMP\EMPNade.b3d", $00, $01)
    TX4XFD0X0BB($F6, $1F6)
    local3 = X628F22202($F6)
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
    local3\Field20[$01] = XF2F44B806($01, $65)
    local3\Field34[$01] = 0.3
    local3\Field20[$02] = XF2F44B806($66, $8F)
    local3\Field34[$02] = 0.65
    local3\Field20[$03] = XF2F44B806($90, $B6)
    local3\Field34[$03] = 0.5
    local3\Field20[$07] = XF2F44B806($66, $8F)
    local3\Field34[$07] = -1.0
    local3\Field20[$08] = XF2F44B806($01, $65)
    local3\Field34[$08] = 0.3
    local3\Field20[$06] = XF2F44B806($01, $65)
    local3\Field34[$06] = 0.3
    TXDDB62DBZ($F5, "GFX\Items\Weapons\ItemsViewmodels\key.b3d", $00, $01)
    TX4XFD0X0BB($F5, $1F5)
    local3 = X628F22202($F5)
    local3\Field21 = 0.0
    local3\Field31 = -0.01
    local3\Field53 = -0.005
    local3\Field47 = 0.005
    local3\Field1 = "SFX\Weapons\MP7\deploy.ogg"
    local3\Field26 = $01
    local3\Field28 = $01
    local3\Field9 = $01
    local3\Field20[$01] = XF2F44B806($20, $20)
    local3\Field34[$01] = 0.5
    local3\Field20[$08] = XF2F44B806($20, $20)
    local3\Field34[$08] = 0.5
    local3\Field20[$06] = XF2F44B806($20, $20)
    local3\Field34[$06] = 0.5
    local3\Field20[$03] = XF2F44B806($38, $46)
    local3\Field34[$03] = 0.6
    local3\Field20[$02] = XF2F44B806($03, $1F)
    local3\Field34[$02] = 0.5
    local3\Field20[$07] = XF2F44B806($03, $1F)
    local3\Field34[$07] = -0.8
    TXDDB62DBZ($F4, "GFX\Items\Weapons\ItemsViewmodels\key_860.b3d", $00, $01)
    TX4XFD0X0BB($F4, $1F4)
    local3 = X628F22202($F4)
    local3\Field21 = 0.0
    local3\Field31 = -0.01
    local3\Field53 = -0.005
    local3\Field47 = 0.005
    local3\Field1 = "SFX\Weapons\MP7\deploy.ogg"
    local3\Field26 = $01
    local3\Field28 = $01
    local3\Field9 = $01
    local3\Field20[$01] = XF2F44B806($20, $20)
    local3\Field34[$01] = 0.5
    local3\Field20[$08] = XF2F44B806($20, $20)
    local3\Field34[$08] = 0.5
    local3\Field20[$06] = XF2F44B806($20, $20)
    local3\Field34[$06] = 0.5
    local3\Field20[$03] = XF2F44B806($38, $46)
    local3\Field34[$03] = 0.6
    local3\Field20[$02] = XF2F44B806($03, $1F)
    local3\Field34[$02] = 0.5
    local3\Field20[$07] = XF2F44B806($03, $1F)
    local3\Field34[$07] = -0.8
    TXDDB62DBZ($F3, "GFX\Items\Weapons\ItemsViewmodels\coin.b3d", $00, $01)
    TX4XFD0X0BB($F3, $1F3)
    local3 = X628F22202($F3)
    local3\Field21 = 0.0
    local3\Field31 = -0.01
    local3\Field53 = -0.005
    local3\Field47 = 0.005
    local3\Field1 = "SFX\Weapons\MP7\deploy.ogg"
    local3\Field26 = $01
    local3\Field28 = $01
    local3\Field9 = $01
    local3\Field20[$01] = XF2F44B806($20, $20)
    local3\Field34[$01] = 0.5
    local3\Field20[$08] = XF2F44B806($20, $20)
    local3\Field34[$08] = 0.5
    local3\Field20[$06] = XF2F44B806($20, $20)
    local3\Field34[$06] = 0.5
    local3\Field20[$03] = XF2F44B806($38, $46)
    local3\Field34[$03] = 0.6
    local3\Field20[$02] = XF2F44B806($03, $1F)
    local3\Field34[$02] = 0.5
    local3\Field20[$07] = XF2F44B806($03, $1F)
    local3\Field34[$07] = -0.8
    TB86Z4Z42B($00, "GFX\Items\badge.b3d")
    TB86Z4Z42B($01, "GFX\Items\ballistic_helmet.b3d")
    TB86Z4Z42B($02, "GFX\Items\ballistic_vest.b3d")
    TB86Z4Z42B($03, "GFX\Items\battery.b3d")
    TB86Z4Z42B($04, "GFX\Items\circuits.b3d")
    TB86Z4Z42B($05, "GFX\Items\clipboard.b3d")
    TB86Z4Z42B($06, "GFX\Items\coin.b3d")
    TB86Z4Z42B($07, "GFX\Items\cup.b3d")
    TB86Z4Z42B($08, "GFX\Items\cup_liquid.b3d")
    TB86Z4Z42B($09, "GFX\Items\eye_drops.b3d")
    TB86Z4Z42B($0A, "GFX\Items\e_reader.b3d")
    TB86Z4Z42B($0B, "GFX\Items\first_aid_kit.b3d")
    TB86Z4Z42B($0C, "GFX\Items\fiveseven_wm.b3d")
    TB86Z4Z42B($0D, "GFX\Items\gas_mask.b3d")
    TB86Z4Z42B($0E, "GFX\Items\glock_wm.b3d")
    TB86Z4Z42B($0F, "GFX\Items\hazmat_suit.b3d")
    TB86Z4Z42B($10, "GFX\Items\heavy_helmet.b3d")
    TB86Z4Z42B($11, "GFX\Items\key.b3d")
    TB86Z4Z42B($12, "GFX\Items\key_card.b3d")
    TB86Z4Z42B($13, "GFX\Items\m4a1_wm.b3d")
    TB86Z4Z42B($14, "GFX\Items\m60_wm.b3d")
    TB86Z4Z42B($15, "GFX\Items\metal_panel.b3d")
    TB86Z4Z42B($16, "GFX\Items\mp5_wm.b3d")
    TB86Z4Z42B($17, "GFX\Items\navigator.b3d")
    TB86Z4Z42B($18, "GFX\Items\night_vision_goggles.b3d")
    TB86Z4Z42B($19, "GFX\Items\note.b3d")
    TB86Z4Z42B($1A, "GFX\Items\origami.b3d")
    TB86Z4Z42B($1B, "GFX\Items\paper.b3d")
    TB86Z4Z42B($1C, "GFX\Items\pill.b3d")
    TB86Z4Z42B($1D, "GFX\Items\Pizza_Slice.b3d")
    TB86Z4Z42B($1E, "GFX\Items\radio.b3d")
    TB86Z4Z42B($1F, "GFX\Items\scp_005.b3d")
    TB86Z4Z42B($20, "GFX\Items\scp_1025.b3d")
    TB86Z4Z42B($21, "GFX\Items\scp_1123.b3d")
    TB86Z4Z42B($22, "GFX\Items\scp_148.b3d")
    TB86Z4Z42B($23, "GFX\Items\scp_1499.b3d")
    TB86Z4Z42B($24, "GFX\Items\scp_268.b3d")
    TB86Z4Z42B($25, "GFX\Items\scp_420_j.b3d")
    TB86Z4Z42B($26, "GFX\Items\scp_427.b3d")
    TB86Z4Z42B($27, "GFX\Items\scp_500.b3d")
    TB86Z4Z42B($28, "GFX\Items\scp_513.b3d")
    TB86Z4Z42B($29, "GFX\Items\scp_714.b3d")
    TB86Z4Z42B($2A, "GFX\Items\scp_860.b3d")
    TB86Z4Z42B($2B, "GFX\Items\SCRAMBLE_gear.b3d")
    TB86Z4Z42B($2C, "GFX\Items\severed_hand.b3d")
    TB86Z4Z42B($2D, "GFX\Items\sr556_wm.b3d")
    TB86Z4Z42B($2E, "GFX\Items\syringe.b3d")
    TB86Z4Z42B($2F, "GFX\Items\wallet.b3d")
    TB86Z4Z42B($30, "GFX\Items\Weapons\FiveSeven\fiveseven.b3d")
    TB86Z4Z42B($31, "GFX\Items\Weapons\Glock\glock.b3d")
    TB86Z4Z42B($32, "GFX\Items\Weapons\M4A1\m4a1.b3d")
    TB86Z4Z42B($33, "GFX\Items\Weapons\M60\m60.b3d")
    TB86Z4Z42B($34, "GFX\Items\Weapons\Mp5\Mp5.b3d")
    TB86Z4Z42B($35, "GFX\Items\Weapons\MuzzleFlash\Mflash.b3d")
    TB86Z4Z42B($36, "GFX\Items\Weapons\SR556\SR556.b3d")
    TB86Z4Z42B($37, "GFX\Items\Wearable\427_wearmodel.b3d")
    TB86Z4Z42B($38, "GFX\Items\Wearable\ballistic_helmet_visor.b3d")
    TB86Z4Z42B($39, "GFX\Items\Wearable\Ballistic_vest_wearmodel.b3d")
    TB86Z4Z42B($3A, "GFX\Items\Wearable\gasmask_wearmodel.b3d")
    TB86Z4Z42B($3B, "GFX\Items\Wearable\Hazmat_wearmodel.b3d")
    TB86Z4Z42B($3D, "GFX\Items\Wearable\NVG_wearmodel.b3d")
    TB86Z4Z42B($3E, "GFX\Items\Wearable\SCRAMBLE_gear_wearmodel.b3d")
    TB86Z4Z42B($3F, "GFX\Map\cont1_106_hb.b3d")
    TB86Z4Z42B($40, "GFX\Map\dimension1499\1499object0_cull.b3d")
    TB86Z4Z42B($41, "GFX\Map\dimension1499\1499plane.b3d")
    TB86Z4Z42B($42, "GFX\Map\dimension_106_terrain.b3d")
    TB86Z4Z42B($43, "GFX\Map\exit1terrain.b3d")
    TB86Z4Z42B($44, "GFX\Map\gateawall1.b3d")
    TB86Z4Z42B($45, "GFX\Map\gateawall2.b3d")
    TB86Z4Z42B($46, "GFX\Map\Props\096_tunnel_rocks.b3d")
    TB86Z4Z42B($47, "GFX\Map\Props\alcohol_hand_gel.b3d")
    TB86Z4Z42B($48, "GFX\Map\Props\baffle.b3d")
    TB86Z4Z42B($49, "GFX\Map\Props\bench.b3d")
    TB86Z4Z42B($4A, "GFX\Map\Props\bench2.b3d")
    TB86Z4Z42B($4B, "GFX\Map\Props\BigDoorColl.b3d")
    TB86Z4Z42B($4C, "GFX\Map\Props\Bishop.b3d")
    TB86Z4Z42B($4D, "GFX\Map\Props\book.b3d")
    TB86Z4Z42B($4E, "GFX\Map\Props\bowl.b3d")
    TB86Z4Z42B($4F, "GFX\Map\Props\boxfile.b3d")
    TB86Z4Z42B($50, "GFX\Map\Props\bucket.b3d")
    TB86Z4Z42B($51, "GFX\Map\Props\Button.b3d")
    TB86Z4Z42B($52, "GFX\Map\Props\ButtonCode.b3d")
    TB86Z4Z42B($53, "GFX\Map\Props\ButtonElevator.b3d")
    TB86Z4Z42B($54, "GFX\Map\Props\ButtonKeycard.b3d")
    TB86Z4Z42B($55, "GFX\Map\Props\ButtonScanner.b3d")
    TB86Z4Z42B($56, "GFX\Map\Props\cabinet_a.b3d")
    TB86Z4Z42B($57, "GFX\Map\Props\cabinet_b.b3d")
    TB86Z4Z42B($58, "GFX\Map\Props\cabinet_c.b3d")
    TB86Z4Z42B($59, "GFX\Map\Props\CamBase.b3d")
    TB86Z4Z42B($5A, "GFX\Map\Props\CamHead.b3d")
    TB86Z4Z42B($5B, "GFX\Map\Props\chair.b3d")
    TB86Z4Z42B($5C, "GFX\Map\Props\chessboard.b3d")
    TB86Z4Z42B($5D, "GFX\Map\Props\SCPlabel.b3d")
    TB86Z4Z42B($5E, "GFX\Map\Props\ContDoorFrame.b3d")
    TB86Z4Z42B($5F, "GFX\Map\Props\contdoorleft.b3d")
    TB86Z4Z42B($60, "GFX\Map\Props\contdoorright.b3d")
    TB86Z4Z42B($61, "GFX\Map\Props\crate1.b3d")
    TB86Z4Z42B($62, "GFX\Map\Props\crate2.b3d")
    TB86Z4Z42B($63, "GFX\Map\Props\crate3.b3d")
    TB86Z4Z42B($64, "GFX\Map\Props\dimension_106_pillar.b3d")
    TB86Z4Z42B($65, "GFX\Map\Props\Door01.b3d")
    TB86Z4Z42B($66, "GFX\Map\Props\Door02.b3d")
    TB86Z4Z42B($67, "GFX\Map\Props\DoorColl.b3d")
    TB86Z4Z42B($68, "GFX\Map\Props\DoorFrame.b3d")
    TB86Z4Z42B($69, "GFX\Map\Props\DoorWooden.b3d")
    TB86Z4Z42B($6A, "GFX\Map\Props\DoorWoodenFrame.b3d")
    TB86Z4Z42B($6B, "GFX\Map\Props\ElecBox.b3d")
    TB86Z4Z42B($6C, "GFX\Map\Props\ElevatorDoor.b3d")
    TB86Z4Z42B($6D, "GFX\Map\Props\elevator_panel.b3d")
    TB86Z4Z42B($6E, "GFX\Map\Props\femur_breaker.b3d")
    TB86Z4Z42B($6F, "GFX\Map\Props\FenceDoor.b3d")
    TB86Z4Z42B($70, "GFX\Map\Props\fire_extinguisher.b3d")
    TB86Z4Z42B($71, "GFX\Map\Props\forklift.b3d")
    TB86Z4Z42B($72, "GFX\Map\Props\garbage_bin.b3d")
    TB86Z4Z42B($73, "GFX\Map\Props\HeavyDoor1.b3d")
    TB86Z4Z42B($74, "GFX\Map\Props\HeavyDoor2.b3d")
    TB86Z4Z42B($75, "GFX\Map\Props\keyboard.b3d")
    TB86Z4Z42B($76, "GFX\Map\Props\King.b3d")
    TB86Z4Z42B($77, "GFX\Map\Props\Knight.b3d")
    TB86Z4Z42B($78, "GFX\Map\Props\lamp_a.b3d")
    TB86Z4Z42B($79, "GFX\Map\Props\lamp_b.b3d")
    TB86Z4Z42B($7A, "GFX\Map\Props\lamp_c.b3d")
    TB86Z4Z42B($7B, "GFX\Map\Props\lamp_d.b3d")
    TB86Z4Z42B($7C, "GFX\Map\Props\lamp_e.b3d")
    TB86Z4Z42B($7D, "GFX\Map\Props\lamp_f.b3d")
    TB86Z4Z42B($7E, "GFX\Map\Props\LeverBase.b3d")
    TB86Z4Z42B($7F, "GFX\Map\Props\LeverHandle.b3d")
    TB86Z4Z42B($80, "GFX\Map\Props\lightgun.b3d")
    TB86Z4Z42B($81, "GFX\Map\Props\lightgunbase.b3d")
    TB86Z4Z42B($82, "GFX\Map\Props\marker.b3d")
    TB86Z4Z42B($83, "GFX\Map\Props\microscope.b3d")
    TB86Z4Z42B($84, "GFX\Map\Props\monitor.b3d")
    TB86Z4Z42B($85, "GFX\Map\Props\monitor2.b3d")
    TB86Z4Z42B($86, "GFX\Map\Props\monitor_checkpoint.b3d")
    TB86Z4Z42B($87, "GFX\Map\Props\mop.b3d")
    TB86Z4Z42B($88, "GFX\Map\Props\mouse.b3d")
    TB86Z4Z42B($89, "GFX\Map\Props\mug.b3d")
    TB86Z4Z42B($8A, "GFX\Map\Props\officedoor.b3d")
    TB86Z4Z42B($8B, "GFX\Map\Props\officedoorframe.b3d")
    TB86Z4Z42B($8C, "GFX\Map\Props\officeseat_a.b3d")
    TB86Z4Z42B($8D, "GFX\Map\Props\oxygen_cylinder.b3d")
    TB86Z4Z42B($8E, "GFX\Map\Props\oxygen_cylinder_wheelbarrow.b3d")
    TB86Z4Z42B($8F, "GFX\Map\Props\paper.b3d")
    TB86Z4Z42B($90, "GFX\Map\Props\Pawn.b3d")
    TB86Z4Z42B($91, "GFX\Map\Props\Pencil.b3d")
    TB86Z4Z42B($92, "GFX\Map\Props\penny.b3d")
    TB86Z4Z42B($93, "GFX\Map\Props\Pipe_curved.b3d")
    TB86Z4Z42B($94, "GFX\Map\Props\Pipe_long.b3d")
    TB86Z4Z42B($95, "GFX\Map\Props\Pipe_short.b3d")
    TB86Z4Z42B($96, "GFX\Map\Props\Pipe_T.b3d")
    TB86Z4Z42B($97, "GFX\Map\Props\Plant.b3d")
    TB86Z4Z42B($98, "GFX\Map\Props\plant2.b3d")
    TB86Z4Z42B($99, "GFX\Map\Props\printer.b3d")
    TB86Z4Z42B($9A, "GFX\Map\Props\Queen.b3d")
    TB86Z4Z42B($9B, "GFX\Map\Props\rock.b3d")
    TB86Z4Z42B($9C, "GFX\Map\Props\rock2.b3d")
    TB86Z4Z42B($9D, "GFX\Map\Props\Rook.b3d")
    TB86Z4Z42B($9F, "GFX\Map\Props\scp_012.b3d")
    TB86Z4Z42B($A0, "GFX\Map\Props\scp_079.b3d")
    TB86Z4Z42B($A1, "GFX\Map\Props\scp_096_box.b3d")
    TB86Z4Z42B($A2, "GFX\Map\Props\scp_205.b3d")
    TB86Z4Z42B($A3, "GFX\Map\Props\scp_294.b3d")
    TB86Z4Z42B($A4, "GFX\Map\Props\scp_409.b3d")
    TB86Z4Z42B($A5, "GFX\Map\Props\scp_409_crystals.b3d")
    TB86Z4Z42B($A6, "GFX\Map\Props\scp_458.b3d")
    TB86Z4Z42B($A7, "GFX\Map\Props\scp_513_jelly.b3d")
    TB86Z4Z42B($A8, "GFX\Map\Props\scp_789_j.b3d")
    TB86Z4Z42B($A9, "GFX\Map\Props\scp_895.b3d")
    TB86Z4Z42B($AA, "GFX\Map\Props\scp_914_gears.b3d")
    TB86Z4Z42B($AB, "GFX\Map\Props\scp_914_key.b3d")
    TB86Z4Z42B($AC, "GFX\Map\Props\scp_914_knob.b3d")
    TB86Z4Z42B($AD, "GFX\Map\Props\sharpie.b3d")
    TB86Z4Z42B($AE, "GFX\Map\Props\shelves_a.b3d")
    TB86Z4Z42B($AF, "GFX\Map\Props\shelves_b.b3d")
    TB86Z4Z42B($B0, "GFX\Map\Props\shelves_c.b3d")
    TB86Z4Z42B($B1, "GFX\Map\Props\shelves_d.b3d")
    TB86Z4Z42B($B2, "GFX\Map\Props\sink.b3d")
    TB86Z4Z42B($B3, "GFX\Map\Props\sofa.b3d")
    TB86Z4Z42B($B4, "GFX\Map\Props\speaker.b3d")
    TB86Z4Z42B($B5, "GFX\Map\Props\surgical_lamp.b3d")
    TB86Z4Z42B($B6, "GFX\Map\Props\system_unit.b3d")
    TB86Z4Z42B($B7, "GFX\Map\Props\table_a.b3d")
    TB86Z4Z42B($B8, "GFX\Map\Props\table_b.b3d")
    TB86Z4Z42B($B9, "GFX\Map\Props\table_c.b3d")
    TB86Z4Z42B($BA, "GFX\Map\Props\table_d.b3d")
    TB86Z4Z42B($BB, "GFX\Map\Props\table_e.b3d")
    TB86Z4Z42B($BC, "GFX\Map\Props\Tank1.b3d")
    TB86Z4Z42B($BD, "GFX\Map\Props\Tank2.b3d")
    TB86Z4Z42B($BE, "GFX\Map\Props\throne_wall.b3d")
    TB86Z4Z42B($BF, "GFX\Map\Props\toilet.b3d")
    TB86Z4Z42B($C0, "GFX\Map\Props\Toolbox.b3d")
    TB86Z4Z42B($C1, "GFX\Map\Props\tree.b3d")
    TB86Z4Z42B($C2, "GFX\Map\Props\tree1.b3d")
    TB86Z4Z42B($C3, "GFX\Map\Props\tree2.b3d")
    TB86Z4Z42B($C4, "GFX\Map\Props\trolley_bed.b3d")
    TB86Z4Z42B($C5, "GFX\Map\Props\ventilation_grate.b3d")
    TB86Z4Z42B($C6, "GFX\Map\Props\walker.b3d")
    TB86Z4Z42B($C7, "GFX\Map\Props\watches.b3d")
    TB86Z4Z42B($C8, "GFX\Map\Props\water_cooler.b3d")
    TB86Z4Z42B($C9, "GFX\Map\Props\wet_floor_sign.b3d")
    TB86Z4Z42B($CA, "GFX\Map\Props\wooden_box.b3d")
    TB86Z4Z42B($CB, "GFX\Map\Props\Yucca.b3d")
    TB86Z4Z42B($CC, "GFX\Map\room2C_2_ez_hb.b3d")
    TB86Z4Z42B($CD, "GFX\Map\room2_3_ez_hb.b3d")
    TB86Z4Z42B($CE, "GFX\Map\room2_office_2_hb.b3d")
    TB86Z4Z42B($CF, "GFX\Map\room2_servers_hcz_hb.b3d")
    TB86Z4Z42B($D0, "GFX\Map\room2_test_hcz_hb.b3d")
    TB86Z4Z42B($D1, "GFX\Map\room3_ez_hb.b3d")
    TB86Z4Z42B($D2, "GFX\Map\room3_office_hb.b3d")
    TB86Z4Z42B($D3, "GFX\Map\room4_2_ez_hb.b3d")
    TB86Z4Z42B($D4, "GFX\NPCs\apache.b3d")
    TB86Z4Z42B($D5, "GFX\NPCs\apache_rotor(2).b3d")
    TB86Z4Z42B($D6, "GFX\NPCs\apache_rotor.b3d")
    TB86Z4Z42B($D7, "GFX\NPCs\Chaos_m.b3d")
    TB86Z4Z42B($D8, "GFX\NPCs\CI.b3d")
    TB86Z4Z42B($D9, "GFX\NPCs\class_d.b3d")
    TB86Z4Z42B($DA, "GFX\NPCs\clerk.b3d")
    TB86Z4Z42B($DB, "GFX\NPCs\duck.b3d")
    TB86Z4Z42B($DC, "GFX\NPCs\guard.b3d")
    TB86Z4Z42B($DD, "GFX\NPCs\guard_m.b3d")
    TB86Z4Z42B($DE, "GFX\NPCs\MTF.b3d")
    TB86Z4Z42B($DF, "GFX\NPCs\MTF_m.b3d")
    TB86Z4Z42B($E0, "GFX\NPCs\nazi_officer.b3d")
    TB86Z4Z42B($E1, "GFX\NPCs\scp_008_1.b3d")
    TB86Z4Z42B($E2, "GFX\NPCs\scp_035_sad.b3d")
    TB86Z4Z42B($E3, "GFX\NPCs\scp_035_smile.b3d")
    TB86Z4Z42B($E4, "GFX\NPCs\scp_035_tentacle.b3d")
    TB86Z4Z42B($E5, "GFX\NPCs\scp_049.b3d")
    TB86Z4Z42B($E6, "GFX\NPCs\scp_049_2.b3d")
    TB86Z4Z42B($E7, "GFX\NPCs\scp_066.b3d")
    TB86Z4Z42B($E8, "GFX\NPCs\scp_096.b3d")
    TB86Z4Z42B($E9, "GFX\NPCs\scp_1048.b3d")
    TB86Z4Z42B($EA, "GFX\NPCs\scp_1048_a.b3d")
    TB86Z4Z42B($EB, "GFX\NPCs\scp_106.b3d")
    TB86Z4Z42B($EC, "GFX\NPCs\scp_106_m.b3d")
    TB86Z4Z42B($ED, "GFX\NPCs\scp_1499_1.b3d")
    TB86Z4Z42B($EE, "GFX\NPCs\scp_173_body.b3d")
    TB86Z4Z42B($EF, "GFX\NPCs\scp_173_box.b3d")
    TB86Z4Z42B($F0, "GFX\NPCs\scp_173_head.b3d")
    TB86Z4Z42B($F1, "GFX\NPCs\scp_173_m.b3d")
    TB86Z4Z42B($F2, "GFX\NPCs\scp_205_demon(2).b3d")
    TB86Z4Z42B($F3, "GFX\NPCs\scp_205_demon(3).b3d")
    TB86Z4Z42B($F4, "GFX\NPCs\scp_205_demon.b3d")
    TB86Z4Z42B($F5, "GFX\NPCs\scp_205_woman.b3d")
    TB86Z4Z42B($F6, "GFX\NPCs\scp_372.b3d")
    TB86Z4Z42B($F7, "GFX\NPCs\scp_513_1.b3d")
    TB86Z4Z42B($F8, "GFX\NPCs\scp_682_arm.b3d")
    TB86Z4Z42B($F9, "GFX\NPCs\scp_860_2.b3d")
    TB86Z4Z42B($FA, "GFX\NPCs\scp_939.b3d")
    TB86Z4Z42B($FC, "GFX\NPCs\scp_966.b3d")
    TB86Z4Z42B($FD, "GFX\NPCs\scp_966_m.b3d")
    TB86Z4Z42B($FE, "GFX\NPCs\scp_999.b3d")
    TB86Z4Z42B($FF, "GFX\NPCs\vehicle.b3d")
    TB86Z4Z42B($100, "GFX\Map\Props\recontainer.b3d")
    BZZ00B6FF($00, "GFX\Map\Textures\106sky_back.png")
    BZZ00B6FF($01, "GFX\Map\Textures\106sky_front.png")
    BZZ00B6FF($02, "GFX\Map\Textures\106sky_left.png")
    BZZ00B6FF($03, "GFX\Map\Textures\106sky_right.png")
    BZZ00B6FF($04, "GFX\Map\Textures\106sky_up.png")
    BZZ00B6FF($05, "GFX\Map\Textures\1499sky_back.png")
    BZZ00B6FF($06, "GFX\Map\Textures\1499sky_front.png")
    BZZ00B6FF($07, "GFX\Map\Textures\1499sky_left.png")
    BZZ00B6FF($08, "GFX\Map\Textures\1499sky_right.png")
    BZZ00B6FF($09, "GFX\Map\Textures\1499sky_up.png")
    BZZ00B6FF($0A, "GFX\Map\Textures\2daccum.png")
    BZZ00B6FF($0B, "GFX\Map\Textures\2ddd.png")
    BZZ00B6FF($0C, "GFX\Map\Textures\2_office_lamps_dif.jpg")
    BZZ00B6FF($0D, "GFX\Map\Textures\6646.png")
    BZZ00B6FF($0E, "GFX\Map\Textures\914.png")
    BZZ00B6FF($0F, "GFX\Map\Textures\914board.png")
    BZZ00B6FF($10, "GFX\Map\Textures\air_duct.jpg")
    BZZ00B6FF($11, "GFX\Map\Textures\alcohol_hand_gel.png")
    BZZ00B6FF($12, "GFX\Map\Textures\alcohol_hand_gel_bloody.png")
    BZZ00B6FF($13, "GFX\Map\Textures\baffle.png")
    BZZ00B6FF($14, "GFX\Map\Textures\balon3_Base_color.png")
    BZZ00B6FF($15, "GFX\Map\Textures\barrel.png")
    BZZ00B6FF($16, "GFX\Map\Textures\bathroomwall.png")
    BZZ00B6FF($17, "GFX\Map\Textures\Black_Boxfile.png")
    BZZ00B6FF($18, "GFX\Map\Textures\Book1.png")
    BZZ00B6FF($19, "GFX\Map\Textures\Book10.png")
    BZZ00B6FF($1A, "GFX\Map\Textures\Book11.png")
    BZZ00B6FF($1B, "GFX\Map\Textures\Book2.png")
    BZZ00B6FF($1C, "GFX\Map\Textures\Book3.png")
    BZZ00B6FF($1D, "GFX\Map\Textures\Book4.png")
    BZZ00B6FF($1E, "GFX\Map\Textures\Book5.png")
    BZZ00B6FF($1F, "GFX\Map\Textures\Book6.png")
    BZZ00B6FF($20, "GFX\Map\Textures\Book7.png")
    BZZ00B6FF($21, "GFX\Map\Textures\Book8.png")
    BZZ00B6FF($22, "GFX\Map\Textures\Book9.png")
    BZZ00B6FF($23, "GFX\Map\Textures\bowl.png")
    BZZ00B6FF($24, "GFX\Map\Textures\box.png")
    BZZ00B6FF($25, "GFX\Map\Textures\branch.png")
    BZZ00B6FF($26, "GFX\Map\Textures\brickwall.png")
    BZZ00B6FF($27, "GFX\Map\Textures\bucket.png")
    BZZ00B6FF($28, "GFX\Map\Textures\cabinet_a.png")
    BZZ00B6FF($29, "GFX\Map\Textures\cable_black.jpg")
    BZZ00B6FF($2A, "GFX\Map\Textures\cable_gray.jpg")
    BZZ00B6FF($2B, "GFX\Map\Textures\cable_green.jpg")
    BZZ00B6FF($2C, "GFX\Map\Textures\cable_light_block.jpg")
    BZZ00B6FF($2D, "GFX\Map\Textures\cable_red.jpg")
    BZZ00B6FF($2E, "GFX\Map\Textures\cable_white.jpg")
    BZZ00B6FF($2F, "GFX\Map\Textures\cable_yellow.jpg")
    BZZ00B6FF($30, "GFX\Map\Textures\camera(1).png")
    BZZ00B6FF($31, "GFX\Map\Textures\camera(2).png")
    BZZ00B6FF($32, "GFX\Map\Textures\caution.jpg")
    BZZ00B6FF($33, "GFX\Map\Textures\ceiling.jpg")
    BZZ00B6FF($34, "GFX\Map\Textures\cloth.jpg")
    BZZ00B6FF($35, "GFX\Map\Textures\ColoredTiles.png")
    BZZ00B6FF($36, "GFX\Map\Textures\concrete.jpg")
    BZZ00B6FF($37, "GFX\Map\Textures\concretefloor.jpg")
    BZZ00B6FF($38, "GFX\Map\Textures\concretefloor2.png")
    BZZ00B6FF($39, "GFX\Map\Textures\concretefloor_dark.jpg")
    BZZ00B6FF($3A, "GFX\Map\Textures\concretemoss.jpg")
    BZZ00B6FF($3B, "GFX\Map\Textures\concretewall.jpg")
    BZZ00B6FF($3C, "GFX\Map\Textures\concretewall2.png")
    BZZ00B6FF($3D, "GFX\Map\Textures\concretewall_009.png")
    BZZ00B6FF($3E, "GFX\Map\Textures\conference_screen.png")
    BZZ00B6FF($3F, "GFX\Map\Textures\confwall.png")
    BZZ00B6FF($40, "GFX\Map\Textures\containment_doors.jpg")
    BZZ00B6FF($41, "GFX\Map\Textures\containment_doors_Corrosive.png")
    BZZ00B6FF($42, "GFX\Map\Textures\controlpanel.jpg")
    BZZ00B6FF($43, "GFX\Map\Textures\controlpanel2.jpg")
    BZZ00B6FF($44, "GFX\Map\Textures\crate5.png")
    BZZ00B6FF($45, "GFX\Map\Textures\crtbey.png")
    BZZ00B6FF($46, "GFX\Map\Textures\crtrec.png")
    BZZ00B6FF($47, "GFX\Map\Textures\crtroc.jpg")
    BZZ00B6FF($48, "GFX\Map\Textures\ctbathroomwall.png")
    BZZ00B6FF($49, "GFX\Map\Textures\ctconcretewalls.png")
    BZZ00B6FF($4A, "GFX\Map\Textures\ctwalls.png")
    BZZ00B6FF($4B, "GFX\Map\Textures\ctwalls2.png")
    BZZ00B6FF($4C, "GFX\Map\Textures\darkwoodcrate.png")
    BZZ00B6FF($4D, "GFX\Map\Textures\decorativemetal.png")
    BZZ00B6FF($4E, "GFX\Map\Textures\Direction372.png")
    BZZ00B6FF($4F, "GFX\Map\Textures\Direction409.png")
    BZZ00B6FF($50, "GFX\Map\Textures\dirt.png")
    BZZ00B6FF($51, "GFX\Map\Textures\dirtymetal.jpg")
    BZZ00B6FF($52, "GFX\Map\Textures\Door01.jpg")
    BZZ00B6FF($53, "GFX\Map\Textures\Door01_914.png")
    BZZ00B6FF($54, "GFX\Map\Textures\Door01_Corrosive.png")
    BZZ00B6FF($55, "GFX\Map\Textures\Door02.png")
    BZZ00B6FF($56, "GFX\Map\Textures\DoorWooden.png")
    BZZ00B6FF($57, "GFX\Map\Textures\double_desk.png")
    BZZ00B6FF($58, "GFX\Map\Textures\ElecBox.jpg")
    BZZ00B6FF($59, "GFX\Map\Textures\elevator_ceiling.png")
    BZZ00B6FF($5A, "GFX\Map\Textures\elevator_floor.png")
    BZZ00B6FF($5B, "GFX\Map\Textures\elevator_panel_down.png")
    BZZ00B6FF($5C, "GFX\Map\Textures\elevator_panel_idle.png")
    BZZ00B6FF($5D, "GFX\Map\Textures\elevator_panel_up.png")
    BZZ00B6FF($5E, "GFX\Map\Textures\elevator_wall.png")
    BZZ00B6FF($5F, "GFX\Map\Textures\fire_alarm.png")
    BZZ00B6FF($60, "GFX\Map\Textures\fire_extinguisher.png")
    BZZ00B6FF($61, "GFX\Map\Textures\fizzmachine.png")
    BZZ00B6FF($62, "GFX\Map\Textures\foam_padding.png")
    BZZ00B6FF($63, "GFX\Map\Textures\forestfloor.png")
    BZZ00B6FF($64, "GFX\Map\Textures\forestpath.png")
    BZZ00B6FF($65, "GFX\Map\Textures\forklift.png")
    BZZ00B6FF($66, "GFX\Map\Textures\gears.jpg")
    BZZ00B6FF($67, "GFX\Map\Textures\gift.png")
    BZZ00B6FF($68, "GFX\Map\Textures\glass.png")
    BZZ00B6FF($69, "GFX\Map\Textures\granite.png")
    BZZ00B6FF($6A, "GFX\Map\Textures\grass.jpg")
    BZZ00B6FF($6B, "GFX\Map\Textures\gravel.jpg")
    BZZ00B6FF($6C, "GFX\Map\Textures\grit1.jpg")
    BZZ00B6FF($6D, "GFX\Map\Textures\grit2.jpg")
    BZZ00B6FF($6E, "GFX\Map\Textures\grit3.jpg")
    BZZ00B6FF($6F, "GFX\Map\Textures\hardmetalwall.png")
    BZZ00B6FF($70, "GFX\Map\Textures\HCZdoor.jpg")
    BZZ00B6FF($71, "GFX\Map\Textures\HCZSupportWall.png")
    BZZ00B6FF($72, "GFX\Map\Textures\Keyboard.png")
    BZZ00B6FF($73, "GFX\Map\Textures\KeyPad.jpg")
    BZZ00B6FF($74, "GFX\Map\Textures\keypad_106.png")
    BZZ00B6FF($75, "GFX\Map\Textures\keypad_locked.png")
    BZZ00B6FF($76, "GFX\Map\Textures\keypad_using.png")
    BZZ00B6FF($77, "GFX\Map\Textures\lamp_c.png")
    BZZ00B6FF($78, "GFX\Map\Textures\lamp_d.png")
    BZZ00B6FF($79, "GFX\Map\Textures\lamp_e.png")
    BZZ00B6FF($7A, "GFX\Map\Textures\lamp_f.png")
    BZZ00B6FF($7B, "GFX\Map\Textures\lamp_h.png")
    BZZ00B6FF($7C, "GFX\Map\Textures\laser.png")
    BZZ00B6FF($7D, "GFX\Map\Textures\lavender..png")
    BZZ00B6FF($7E, "GFX\Map\Textures\leaf.jpg")
    BZZ00B6FF($7F, "GFX\Map\Textures\lightcone.png")
    BZZ00B6FF($80, "GFX\Map\Textures\Logo_of_the_SCP_Foundation.png")
    BZZ00B6FF($81, "GFX\Map\Textures\marble.png")
    BZZ00B6FF($82, "GFX\Map\Textures\marker_blue.png")
    BZZ00B6FF($83, "GFX\Map\Textures\marker_green.png")
    BZZ00B6FF($84, "GFX\Map\Textures\marker_red.png")
    BZZ00B6FF($85, "GFX\Map\Textures\marker_yellow.png")
    BZZ00B6FF($86, "GFX\Map\Textures\mat_glass.png")
    BZZ00B6FF($87, "GFX\Map\Textures\mechanical_lever.png")
    BZZ00B6FF($88, "GFX\Map\Textures\medibaywall.png")
    BZZ00B6FF($89, "GFX\Map\Textures\metal.jpg")
    BZZ00B6FF($8A, "GFX\Map\Textures\metal3.jpg")
    BZZ00B6FF($8B, "GFX\Map\Textures\metalpanels.png")
    BZZ00B6FF($8C, "GFX\Map\Textures\metalpanels2.png")
    BZZ00B6FF($8D, "GFX\Map\Textures\metalpanels2bloody1.png")
    BZZ00B6FF($8E, "GFX\Map\Textures\metalpanels2bloody2.png")
    BZZ00B6FF($8F, "GFX\Map\Textures\metalwall.png")
    BZZ00B6FF($90, "GFX\Map\Textures\metal_curtain.jpg")
    BZZ00B6FF($91, "GFX\Map\Textures\metal_darker.jpg")
    BZZ00B6FF($92, "GFX\Map\Textures\microscope.png")
    BZZ00B6FF($93, "GFX\Map\Textures\misc.jpg")
    BZZ00B6FF($94, "GFX\Map\Textures\misc_signs(0).png")
    BZZ00B6FF($95, "GFX\Map\Textures\misc_signs(1).png")
    BZZ00B6FF($96, "GFX\Map\Textures\misc_signs(2).png")
    BZZ00B6FF($97, "GFX\Map\Textures\misc_signs(3).png")
    BZZ00B6FF($98, "GFX\Map\Textures\misc_signs(4).png")
    BZZ00B6FF($99, "GFX\Map\Textures\misc_signs(5).png")
    BZZ00B6FF($9A, "GFX\Map\Textures\misc_signs(6).png")
    BZZ00B6FF($9B, "GFX\Map\Textures\misc_signs(7).png")
    BZZ00B6FF($9C, "GFX\Map\Textures\misc_signs(8).png")
    BZZ00B6FF($9D, "GFX\Map\Textures\monitor.png")
    BZZ00B6FF($9E, "GFX\Map\Textures\MonitorTexture.jpg")
    BZZ00B6FF($9F, "GFX\Map\Textures\MonitorTexture2.jpg")
    BZZ00B6FF($A0, "GFX\Map\Textures\mop.png")
    BZZ00B6FF($A1, "GFX\Map\Textures\mouse.png")
    BZZ00B6FF($A2, "GFX\Map\Textures\mug.png")
    BZZ00B6FF($A3, "GFX\Map\Textures\newyeartree_2.png")
    BZZ00B6FF($A4, "GFX\Map\Textures\note(0).png")
    BZZ00B6FF($A5, "GFX\Map\Textures\note(1).png")
    BZZ00B6FF($A6, "GFX\Map\Textures\OfficeDoor.png")
    BZZ00B6FF($A7, "GFX\Map\Textures\officeseat_a.png")
    BZZ00B6FF($A8, "GFX\Map\Textures\officeseat_b.png")
    BZZ00B6FF($A9, "GFX\Map\Textures\officewall.png")
    BZZ00B6FF($AA, "GFX\Map\Textures\oxygen_cylinder_wheelbarrow.png")
    BZZ00B6FF($AB, "GFX\Map\Textures\paper.png")
    BZZ00B6FF($AC, "GFX\Map\Textures\paper_app_gears.png")
    BZZ00B6FF($AD, "GFX\Map\Textures\paper_app_harp.png")
    BZZ00B6FF($AE, "GFX\Map\Textures\paper_app_L.png")
    BZZ00B6FF($AF, "GFX\Map\Textures\paper_app_maynard.png")
    BZZ00B6FF($B0, "GFX\Map\Textures\paper_app_medibay.png")
    BZZ00B6FF($B1, "GFX\Map\Textures\paper_app_rosewood.png")
    BZZ00B6FF($B2, "GFX\Map\Textures\PC_UNIT.png")
    BZZ00B6FF($B3, "GFX\Map\Textures\pdfloor.jpg")
    BZZ00B6FF($B4, "GFX\Map\Textures\pdwall.jpg")
    BZZ00B6FF($B5, "GFX\Map\Textures\Pencil.png")
    BZZ00B6FF($B6, "GFX\Map\Textures\penny.png")
    BZZ00B6FF($B7, "GFX\Map\Textures\Picture(0).png")
    BZZ00B6FF($B8, "GFX\Map\Textures\Pipes.jpg")
    BZZ00B6FF($B9, "GFX\Map\Textures\Pipes_NoRust.png")
    BZZ00B6FF($BA, "GFX\Map\Textures\Plant.png")
    BZZ00B6FF($BB, "GFX\Map\Textures\plants2.png")
    BZZ00B6FF($BC, "GFX\Map\Textures\printer.png")
    BZZ00B6FF($BD, "GFX\Map\Textures\projector.png")
    BZZ00B6FF($BE, "GFX\Map\Textures\projector_accumulator.png")
    BZZ00B6FF($BF, "GFX\Map\Textures\recontainer.png")
    BZZ00B6FF($C0, "GFX\Map\Textures\Red_BoxFile.png")
    BZZ00B6FF($C1, "GFX\Map\Textures\rock.jpg")
    BZZ00B6FF($C2, "GFX\Map\Textures\rockmoss.jpg")
    BZZ00B6FF($C3, "GFX\Map\Textures\RunMovie.png")
    BZZ00B6FF($C4, "GFX\Map\Textures\scplogo.jpg")
    BZZ00B6FF($C5, "GFX\Map\Textures\scp_009.png")
    BZZ00B6FF($C6, "GFX\Map\Textures\scp_012(1).png")
    BZZ00B6FF($C7, "GFX\Map\Textures\scp_012(2).png")
    BZZ00B6FF($C8, "GFX\Map\Textures\scp_012(3).png")
    BZZ00B6FF($C9, "GFX\Map\Textures\scp_012(4).png")
    BZZ00B6FF($CA, "GFX\Map\Textures\scp_079.png")
    BZZ00B6FF($CB, "GFX\Map\Textures\scp_096_box.png")
    BZZ00B6FF($CC, "GFX\Map\Textures\scp_1162_arc.png")
    BZZ00B6FF($CD, "GFX\Map\Textures\scp_1162_arc_wall.png")
    BZZ00B6FF($CE, "GFX\Map\Textures\scp_148.png")
    BZZ00B6FF($CF, "GFX\Map\Textures\scp_205.png")
    BZZ00B6FF($D0, "GFX\Map\Textures\scp_294.png")
    BZZ00B6FF($D1, "GFX\Map\Textures\scp_409.png")
    BZZ00B6FF($D2, "GFX\Map\Textures\scp_409_crystals.png")
    BZZ00B6FF($D3, "GFX\Map\Textures\scp_457_chamber.png")
    BZZ00B6FF($D4, "GFX\Map\Textures\scp_458.png")
    BZZ00B6FF($D5, "GFX\Map\Textures\scp_458_box.png")
    BZZ00B6FF($D6, "GFX\Map\Textures\scp_789_j_face.png")
    BZZ00B6FF($D7, "GFX\Map\Textures\servers1.png")
    BZZ00B6FF($D8, "GFX\Map\Textures\Sharpie.png")
    BZZ00B6FF($D9, "GFX\Map\Textures\shelves_f.png")
    BZZ00B6FF($DA, "GFX\Map\Textures\sky_back.png")
    BZZ00B6FF($DB, "GFX\Map\Textures\sky_back_001.png")
    BZZ00B6FF($DC, "GFX\Map\Textures\sky_down.png")
    BZZ00B6FF($DD, "GFX\Map\Textures\sky_front.png")
    BZZ00B6FF($DE, "GFX\Map\Textures\sky_front_001.png")
    BZZ00B6FF($DF, "GFX\Map\Textures\sky_left.png")
    BZZ00B6FF($E0, "GFX\Map\Textures\sky_left_001.png")
    BZZ00B6FF($E1, "GFX\Map\Textures\sky_right.png")
    BZZ00B6FF($E2, "GFX\Map\Textures\sky_right_001.png")
    BZZ00B6FF($E3, "GFX\Map\Textures\sky_up.png")
    BZZ00B6FF($E4, "GFX\Map\Textures\sky_up_001.png")
    BZZ00B6FF($E5, "GFX\Map\Textures\snow.png")
    BZZ00B6FF($E6, "GFX\Map\Textures\soft grey.jpg")
    BZZ00B6FF($E7, "GFX\Map\Textures\speaker.png")
    BZZ00B6FF($E8, "GFX\Map\Textures\steelfloor.jpg")
    BZZ00B6FF($E9, "GFX\Map\Textures\sun.png")
    BZZ00B6FF($EA, "GFX\Map\Textures\surgical_lamp.png")
    BZZ00B6FF($EB, "GFX\Map\Textures\table_d.png")
    BZZ00B6FF($EC, "GFX\Map\Textures\tank1.jpg")
    BZZ00B6FF($ED, "GFX\Map\Textures\tank2.jpg")
    BZZ00B6FF($EE, "GFX\Map\Textures\tank2_damaged.png")
    BZZ00B6FF($EF, "GFX\Map\Textures\tank_argon.png")
    BZZ00B6FF($F0, "GFX\Map\Textures\tank_oxygen.png")
    BZZ00B6FF($F1, "GFX\Map\Textures\tilefloor.jpg")
    BZZ00B6FF($F2, "GFX\Map\Textures\toilet.jpg")
    BZZ00B6FF($F3, "GFX\Map\Textures\Toolbox.png")
    BZZ00B6FF($F4, "GFX\Map\Textures\tree1.jpg")
    BZZ00B6FF($F5, "GFX\Map\Textures\tree1.png")
    BZZ00B6FF($F6, "GFX\Map\Textures\trolley_bed.png")
    BZZ00B6FF($F7, "GFX\Map\Textures\TV.png")
    BZZ00B6FF($F8, "GFX\Map\Textures\vent.png")
    BZZ00B6FF($F9, "GFX\Map\Textures\vent2.png")
    BZZ00B6FF($FA, "GFX\Map\Textures\walker.png")
    BZZ00B6FF($FB, "GFX\Map\Textures\watches.png")
    BZZ00B6FF($FC, "GFX\Map\Textures\water.png")
    BZZ00B6FF($FD, "GFX\Map\Textures\water_cooler.png")
    BZZ00B6FF($FE, "GFX\Map\Textures\wet_floor.png")
    BZZ00B6FF($FF, "GFX\Map\Textures\white.png")
    BZZ00B6FF($100, "GFX\Map\Textures\whitewall.png")
    BZZ00B6FF($101, "GFX\Map\Textures\wood.jpg")
    For local0 = Each T402X2Z846
        If (len(local0\Field1) > $00) Then
            TXFD66FZ84B(local0\Field1, $01)
            local0\Field1 = ""
        EndIf
    Next
    If (TXB2BFFFFFX() <> 0) Then
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
    X044BFB6BB()
    TBB4Z82Z6F()
    Return $00
End Function

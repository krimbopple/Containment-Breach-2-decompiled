Function loadgame%(arg0$)
    Local local0.rooms
    Local local1.npcs
    Local local2.doors
    Local local3.emitter
    Local local4.roomtemplates
    Local local5#
    Local local6#
    Local local7#
    Local local8%
    Local local9%
    Local local10%
    Local local11%
    Local local12$
    Local local13%
    Local local14%
    Local local15%
    Local local16%
    Local local17#
    Local local18#
    Local local19$
    Local local20%
    Local local22#
    Local local24.npcs
    Local local25%
    Local local26%
    Local local27%
    Local local28%
    Local local29%
    Local local30#
    Local local31#
    Local local32#
    Local local33%
    Local local34%
    Local local37%
    Local local38#
    Local local39%
    Local local40%
    Local local41#
    Local local42#
    Local local43#
    Local local44#
    Local local45#
    Local local46#
    Local local47#
    Local local48%
    Local local49%
    Local local50%
    Local local51%
    Local local52%
    Local local53.decals
    Local local54#
    Local local55#
    Local local56#
    Local local57.events
    Local local58.chunk
    Local local59.chunkpart
    Local local60.props
    Local local61.dummy1499_1
    Local local63.items
    Local local64$
    Local local65$
    Local local66$
    Local local67%
    Local local68%
    Local local69%
    Local local70%
    Local local71%
    Local local72.itemtemplates
    Local local73.items
    Local local74%
    Local local75.securitycams
    Local local76.screens
    Local local77.rooms
    catcherrors((("LoadGame(" + arg0) + ")"))
    local10 = $00
    local11 = $00
    local12 = ""
    local15 = readfile_strict((("Saves\" + arg0) + "\save.cb"))
    XZ0260X8X2\Field16 = 0.0
    gamesaved = $01
    readstring(local15)
    readstring(local15)
    local12 = readstring(local15)
    If (local12 <> "2.1.5") Then
        runtimeerrorex(format(format(getlocalstring("save", "imcompatible"), local12, "{0}"), "2.1.5", "{1}"))
    EndIf
    readbyte(local15)
    readstring(local15)
    readstring(local15)
    code_dr_maynard = readint(local15)
    T20200F42ZD = readint(local15)
    code_maintenance_tunnels = readint(local15)
    code_dr_gears = readint(local15)
    local5 = readfloat(local15)
    local6 = readfloat(local15)
    local7 = readfloat(local15)
    positionentity(XZ0260X8X2\Field74, local5, (local6 + 0.3), local7, $00)
    resetentity(XZ0260X8X2\Field74)
    showentity(XZ0260X8X2\Field74)
    local5 = readfloat(local15)
    local6 = readfloat(local15)
    local7 = readfloat(local15)
    positionentity(XZ0260X8X2\Field28, local5, (local6 + 0.3), local7, $00)
    resetentity(XZ0260X8X2\Field28)
    local5 = readfloat(local15)
    local6 = readfloat(local15)
    rotateentity(XZ0260X8X2\Field74, local5, local6, 0.0, $00)
    XZ0260X8X2\Field53 = readfloat(local15)
    XZ0260X8X2\Field12 = readfloat(local15)
    XZ0260X8X2\Field7 = readfloat(local15)
    XZ0260X8X2\Field30 = readfloat(local15)
    XZ0260X8X2\Field64 = readfloat(local15)
    XZ0260X8X2\Field45 = readfloat(local15)
    XZ0260X8X2\Field25 = readbyte(local15)
    XZ0260X8X2\Field56 = readfloat(local15)
    XZ0260X8X2\Field65 = readfloat(local15)
    XZ0260X8X2\Field34 = readfloat(local15)
    XZ0260X8X2\Field43 = readfloat(local15)
    XZ0260X8X2\Field70 = readfloat(local15)
    XZ0260X8X2\Field11 = readfloat(local15)
    XZ0260X8X2\Field39 = readfloat(local15)
    XZ0260X8X2\Field20 = readfloat(local15)
    XZ0260X8X2\Field73 = readfloat(local15)
    msg\Field8 = readstring(local15)
    XZ0260X8X2\Field44 = readint(local15)
    XZ0260X8X2\Field63 = readbyte(local15)
    XZ0260X8X2\Field82 = readfloat(local15)
    XZ0260X8X2\Field37 = readbyte(local15)
    XZ0260X8X2\Field60 = readfloat(local15)
    XZ0260X8X2\Field1 = readfloat(local15)
    XZ0260X8X2\Field14 = readfloat(local15)
    XZ0260X8X2\Field8 = readfloat(local15)
    XZ0260X8X2\Field78 = readfloat(local15)
    XZ0260X8X2\Field42 = readfloat(local15)
    XZ0260X8X2\Field80 = readint(local15)
    i_2022\Field0 = readfloat(local15)
    i_2022\Field1 = readfloat(local15)
    i_005\Field0 = readbyte(local15)
    For local8 = $00 To $06 Step $01
        i_1025\Field0[local8] = readfloat(local15)
    Next
    For local8 = $00 To $04 Step $01
        i_1025\Field1[local8] = readfloat(local15)
    Next
    i_008\Field0 = readfloat(local15)
    i_008\Field1 = readbyte(local15)
    i_009\Field0 = readfloat(local15)
    i_009\Field1 = readbyte(local15)
    i_409\Field0 = readfloat(local15)
    i_409\Field1 = readbyte(local15)
    i_035\Field0 = readbyte(local15)
    local16 = readbyte(local15)
    selecteddifficulty = difficulties[local16]
    If (local16 = $04) Then
        selecteddifficulty\Field2 = readbyte(local15)
        selecteddifficulty\Field1 = readbyte(local15)
        selecteddifficulty\Field8 = readbyte(local15)
        selecteddifficulty\Field4 = readbyte(local15)
    EndIf
    maxitemamount = (selecteddifficulty\Field4 + ((0.0 < i_1025\Field1[$00]) Shl $01))
    Dim TX60DB8XBBZ.items((selecteddifficulty\Field4 + $02))
    T8660BZ460\Field0 = readfloat(local15)
    T8660BZ460\Field3 = readbyte(local15)
    T8660BZ460\Field6 = readbyte(local15)
    T8660BZ460\Field7 = readbyte(local15)
    T8660BZ460\Field10 = readbyte(local15)
    T8660BZ460\Field8 = readbyte(local15)
    T8660BZ460\Field11 = readbyte(local15)
    T8660BZ460\Field4 = readbyte(local15)
    i_1499\Field8 = readbyte(local15)
    i_1499\Field1 = readfloat(local15)
    i_1499\Field3 = readfloat(local15)
    i_1499\Field6 = readfloat(local15)
    i_1499\Field5 = readfloat(local15)
    i_1499\Field0 = readfloat(local15)
    i_1499\Field7 = readfloat(local15)
    local17 = readfloat(local15)
    local18 = readfloat(local15)
    i_966\Field1 = readfloat(local15)
    i_966\Field0 = readfloat(local15)
    i_1048a\Field2 = readfloat(local15)
    i_1048a\Field1 = readbyte(local15)
    i_268\Field2 = readbyte(local15)
    i_268\Field1 = readfloat(local15)
    i_427\Field2 = readbyte(local15)
    i_427\Field1 = readfloat(local15)
    i_714\Field0 = readbyte(local15)
    i_294\Field4 = readbyte(local15)
    randomseed = readstring(local15)
    secondarylighton = readfloat(local15)
    lightvolume = readfloat(local15)
    isblackout = readbyte(local15)
    previsblackout = readbyte(local15)
    remotedooron = readbyte(local15)
    soundtransmission = readbyte(local15)
    key2_spawnrate = readbyte(local15)
    Repeat
        local19 = readstring(local15)
        If (local19 = "EOA") Then
            Exit
        EndIf
        YFZ8BD2F6(unlockedachievements, local19, $1)
    Forever
    usedconsole = readbyte(local15)
    mtftimer = readfloat(local15)
    remove714timer = readfloat(local15)
    removehazmattimer = readfloat(local15)
    currmapgrid = (New mapgrid)
    For local5 = 0.0 To (Float X824BX6D68) Step 1.0
        For local6 = 0.0 To (Float X824BX6D68) Step 1.0
            currmapgrid\Field4[(Int ((local6 * (Float X824BX6D68)) + local5))] = readbyte(local15)
            currmapgrid\Field0[(Int ((local6 * (Float X824BX6D68)) + local5))] = readbyte(local15)
        Next
    Next
    If (readint(local15) <> $71) Then
        runtimeerrorex(getlocalstring("save", "corrupted_1"))
    EndIf
    local10 = readint(local15)
    For local8 = $01 To local10 Step $01
        local20 = readbyte(local15)
        local5 = readfloat(local15)
        local6 = readfloat(local15)
        local7 = readfloat(local15)
        local1 = createnpc(local20, local5, local6, local7)
        Select local20
            Case $08
                n_i\Field3 = local1
            Case $07
                n_i\Field2 = local1
            Case $06
                n_i\Field10 = local1
            Case $0A
                n_i\Field6 = local1
            Case $0B
                n_i\Field0 = local1
            Case $03
                n_i\Field8 = local1
            Case $05
                n_i\Field1 = local1
        End Select
        local5 = readfloat(local15)
        local6 = readfloat(local15)
        local7 = readfloat(local15)
        rotateentity(local1\Field82, local5, local6, local7, $00)
        local1\Field66 = readfloat(local15)
        local1\Field65 = readfloat(local15)
        local1\Field57 = readfloat(local15)
        local1\Field13 = readint(local15)
        local1\Field31 = (Float readbyte(local15))
        local1\Field38 = readfloat(local15)
        local1\Field17 = readint(local15)
        local1\Field64 = readfloat(local15)
        local1\Field84 = readfloat(local15)
        local1\Field62 = readfloat(local15)
        local1\Field34 = readfloat(local15)
        forcesetnpcid(local1, readint(local15))
        local1\Field96 = readint(local15)
        local1\Field60 = readfloat(local15)
        local1\Field61 = readfloat(local15)
        local1\Field74 = readfloat(local15)
        local1\Field26 = readstring(local15)
        If (local1\Field26 <> "") Then
            local13 = loadtexture_strict(local1\Field26, $01, $00, 1.0)
            entitytexture(local1\Field98, local13, $00, $00)
            deletesingletextureentryfromcache(local13, $00)
            local13 = $00
        EndIf
        local1\Field79 = readbyte(local15)
        If (local1\Field79 <> 0) Then
            createnpcasset(local1)
        EndIf
        local1\Field36 = readbyte(local15)
        If (local1\Field36 <> 0) Then
            local1\Field103 = readfloat(local15)
            setanimtime(local1\Field98, local1\Field103, $00)
        EndIf
        local1\Field93 = readbyte(local15)
        local1\Field1 = readbyte(local15)
        local1\Field4 = readint(local15)
        local1\Field83 = readfloat(local15)
        If (0.0 < local1\Field83) Then
            scaleentity(local1\Field98, local1\Field83, local1\Field83, local1\Field83, $00)
        EndIf
        changenpctextureid(local1, (readbyte(local15) - $01))
        local1\Field22 = readbyte(local15)
        local1\Field73 = readbyte(local15)
        If (0.0 < local1\Field34) Then
            local22 = max(100.0, (255.0 - (local1\Field34 * 0.1)))
            entitycolor(local1\Field98, 255.0, local22, local22)
            If (2093.0 < local1\Field34) Then
                entityshininess(local1\Field98, 1.0, 0.5)
            EndIf
        ElseIf (local1\Field73 <> 0) Then
            entitycolor(local1\Field98, 40.0, 40.0, 40.0)
            If (local1\Field77 = $08) Then
                entitycolor(local1\Field101, 40.0, 40.0, 40.0)
            EndIf
        EndIf
        Select local1\Field77
            Case $18
                local14 = readbyte(local15)
                If (local14 = $01) Then
                    n_i\Field13 = local1
                ElseIf (local14 = $02) Then
                    n_i\Field11 = local1
                EndIf
            Case $12
                If (local1\Field17 = $01) Then
                    entitycolor(local1\Field98, 255.0, 204.0, 140.0)
                EndIf
            Case $0F
                If (2.0 = local1\Field65) Then
                    entitycolor(local1\Field98, 255.0, 255.0, 140.0)
                    entityfx(local1\Field98, $01)
                EndIf
        End Select
    Next
    For local1 = Each npcs
        If (local1\Field96 <> $00) Then
            For local24 = Each npcs
                If (local24 <> local1) Then
                    If (local24\Field56 = local1\Field96) Then
                        local1\Field59 = local24
                    EndIf
                EndIf
            Next
        EndIf
    Next
    If (readint(local15) <> $278) Then
        runtimeerrorex(getlocalstring("save", "corrupted_2"))
    EndIf
    i_zone\Field1[$00] = readbyte(local15)
    i_zone\Field1[$01] = readbyte(local15)
    i_zone\Field0 = readbyte(local15)
    local10 = readint(local15)
    For local8 = $01 To local10 Step $01
        local25 = readint(local15)
        local26 = readint(local15)
        local5 = readfloat(local15)
        local6 = readfloat(local15)
        local7 = readfloat(local15)
        local27 = readbyte(local15)
        local28 = readint(local15)
        local11 = readbyte(local15)
        local26 = (Int wrapangle((Float local26), 360.0))
        For local4 = Each roomtemplates
            If (local4\Field7 = local25) Then
                local0 = createroom(local28, local4\Field3, local5, local6, local7, local4\Field21, (Float local26))
                calculateroomextents(local0)
                local0\Field7 = local27
                Exit
            EndIf
        Next
        If (local11 = $01) Then
            playerroom = local0
        EndIf
        For local9 = $00 To $0F Step $01
            local14 = readint(local15)
            If (local14 > $00) Then
                For local1 = Each npcs
                    If (local1\Field56 = local14) Then
                        local0\Field32[local9] = local1
                        Exit
                    EndIf
                Next
            EndIf
        Next
        For local9 = $00 To $03 Step $01
            local14 = readbyte(local15)
            If (local14 = $00) Then
                rotateentity(local0\Field9[local9]\Field1, 80.0, entityyaw(local0\Field9[local9]\Field1, $00, 1.0), 0.0, $00)
            ElseIf (local14 = $01) Then
                rotateentity(local0\Field9[local9]\Field1, -80.0, entityyaw(local0\Field9[local9]\Field1, $00, 1.0), 0.0, $00)
            EndIf
        Next
        local29 = readbyte(local15)
        If (local29 > $00) Then
            If (local0\Field13 <> Null) Then
                destroyforest(local0\Field13, $01)
            Else
                local0\Field13 = (New forest)
            EndIf
            For local6 = 0.0 To 9.0 Step 1.0
                For local5 = 0.0 To 9.0 Step 1.0
                    local0\Field13\Field5[(Int ((local6 * 10.0) + local5))] = readbyte(local15)
                Next
            Next
            local30 = readfloat(local15)
            local31 = readfloat(local15)
            local32 = readfloat(local15)
            If (local29 = $01) Then
                placeforest(local0\Field13, local30, local31, local32, local0)
            Else
                placemapcreatorforest(local0\Field13, local30, local31, local32, local0)
            EndIf
        ElseIf (local0\Field13 <> Null) Then
            destroyforest(local0\Field13, $01)
            Delete local0\Field13
        EndIf
    Next
    For local0 = Each rooms
        If (((local17 = local0\Field40) And (local18 = local0\Field37)) <> 0) Then
            i_1499\Field2 = local0
            Exit
        EndIf
    Next
    For local1 = Each npcs
        local1\Field90 = X0D8ZZBB4F(local1\Field82, $00)
    Next
    If (readint(local15) <> $3BA) Then
        runtimeerrorex(getlocalstring("save", "corrupted_3"))
    EndIf
    For local3 = Each emitter
        freeemitter(local3, $01)
    Next
    local10 = readint(local15)
    For local8 = $01 To local10 Step $01
        local5 = readfloat(local15)
        local6 = readfloat(local15)
        local7 = readfloat(local15)
        local14 = readint(local15)
        local11 = readbyte(local15)
        local3 = setemitter(Null, local5, local6, local7, local14)
        local3\Field7 = local11
        forcesetemitterid(local3, readint(local15))
    Next
    For local0 = Each rooms
        For local9 = $00 To $07 Step $01
            local14 = readint(local15)
            If (local14 > $00) Then
                For local3 = Each emitter
                    If (local3\Field0 = local14) Then
                        local0\Field17[local9] = local3
                        Exit
                    EndIf
                Next
            EndIf
        Next
    Next
    T20BDD24F02\Field0 = readbyte(local15)
    T20BDD24F02\Field2 = readfloat(local15)
    T20BDD24F02\Field1 = readfloat(local15)
    local6 = (Float X824BX6D68)
    While (0.0 <= local6)
        If (local6 < (Float (i_zone\Field1[$01] - (selectedcustommap = Null)))) Then
            local33 = $03
        ElseIf (((local6 >= (Float (i_zone\Field1[$01] - (selectedcustommap = Null)))) And (local6 < (Float (i_zone\Field1[$00] - (selectedcustommap = Null))))) <> 0) Then
            local33 = $02
        Else
            local33 = $01
        EndIf
        local5 = (Float X824BX6D68)
        While (0.0 <= local5)
            If (currmapgrid\Field4[(Int ((local6 * (Float X824BX6D68)) + local5))] > $00) Then
                For local0 = Each rooms
                    local0\Field21 = (Int wrapangle((Float local0\Field21), 360.0))
                    If (((local5 = (Float (Int (local0\Field40 / 8.0)))) And (local6 = (Float (Int (local0\Field37 / 8.0))))) <> 0) Then
                        Select local0\Field22\Field3
                            Case $00
                                local34 = (90.0 = (Float local0\Field21))
                            Case $01
                                local34 = ((90.0 = (Float local0\Field21)) Lor (270.0 = (Float local0\Field21)))
                            Case $02
                                local34 = ((0.0 = (Float local0\Field21)) Lor (90.0 = (Float local0\Field21)))
                            Case $03
                                local34 = (((0.0 = (Float local0\Field21)) Lor (180.0 = (Float local0\Field21))) Lor (90.0 = (Float local0\Field21)))
                            Default
                                local34 = $01
                        End Select
                        If (local34 <> 0) Then
                            If ((Float (X824BX6D68 + $01)) > (local5 + 1.0)) Then
                                If (currmapgrid\Field4[(Int ((local5 + 1.0) + (local6 * (Float X824BX6D68))))] > $00) Then
                                    local0\Field10[$00] = createdoor(local0, ((local5 * 8.0) + 4.0), 0.0, (local6 * 8.0), 90.0, (Int max((Float rand($FFFFFFFD, $01)), 0.0)), (((local33 - $01) Mod $02) Shl $01), $00, $00, $00)
                                EndIf
                            EndIf
                        EndIf
                        Select local0\Field22\Field3
                            Case $00
                                local34 = (180.0 = (Float local0\Field21))
                            Case $01
                                local34 = ((0.0 = (Float local0\Field21)) Lor (180.0 = (Float local0\Field21)))
                            Case $02
                                local34 = ((180.0 = (Float local0\Field21)) Lor (90.0 = (Float local0\Field21)))
                            Case $03
                                local34 = (((180.0 = (Float local0\Field21)) Lor (90.0 = (Float local0\Field21))) Lor (270.0 = (Float local0\Field21)))
                            Default
                                local34 = $01
                        End Select
                        If (local34 <> 0) Then
                            If ((Float (X824BX6D68 + $01)) > (local6 + 1.0)) Then
                                If (currmapgrid\Field4[(Int (((local6 + 1.0) * (Float X824BX6D68)) + local5))] > $00) Then
                                    local0\Field10[$03] = createdoor(local0, (local5 * 8.0), 0.0, ((local6 * 8.0) + 4.0), 0.0, (Int max((Float rand($FFFFFFFD, $01)), 0.0)), (((local33 - $01) Mod $02) Shl $01), $00, $00, $00)
                                EndIf
                            EndIf
                        EndIf
                        Exit
                    EndIf
                Next
            EndIf
            local5 = (local5 + -1.0)
        Wend
        local6 = (local6 + -1.0)
    Wend
    local10 = readint(local15)
    For local8 = $01 To local10 Step $01
        local5 = readfloat(local15)
        local6 = readfloat(local15)
        local7 = readfloat(local15)
        local37 = readbyte(local15)
        local38 = readfloat(local15)
        local39 = readbyte(local15)
        local40 = readbyte(local15)
        local41 = readfloat(local15)
        local42 = readfloat(local15)
        local43 = readfloat(local15)
        local44 = readfloat(local15)
        local45 = readfloat(local15)
        local46 = readfloat(local15)
        local47 = readfloat(local15)
        local48 = readbyte(local15)
        local49 = readbyte(local15)
        local50 = readbyte(local15)
        local51 = readbyte(local15)
        local52 = readbyte(local15)
        For local2 = Each doors
            If ((((local5 = entityx(local2\Field51, $01, 1.0)) And (local6 = entityy(local2\Field51, $01, 1.0))) And (local7 = entityz(local2\Field51, $01, 1.0))) <> 0) Then
                local2\Field39 = local37
                local2\Field13 = local38
                local2\Field21 = local39
                local2\Field10 = local40
                local2\Field33 = (Int local46)
                local2\Field9 = local47
                local2\Field19 = local48
                local2\Field47 = local49
                local2\Field5 = local50
                local2\Field38 = local51
                local2\Field54 = (Float local52)
                positionentity(local2\Field0, local41, local6, local42, $01)
                rotateentity(local2\Field0, 0.0, local43, 0.0, $01)
                If (local2\Field7 <> $00) Then
                    positionentity(local2\Field7, local44, local6, local45, $01)
                EndIf
                If (local50 <> 0) Then
                    affectdecaydoor(local2)
                EndIf
                Exit
            EndIf
        Next
    Next
    If (readint(local15) <> $735) Then
        runtimeerrorex(getlocalstring("save", "corrupted_4"))
    EndIf
    For local53 = Each decals
        removedecal(local53)
    Next
    local10 = readint(local15)
    For local8 = $01 To local10 Step $01
        local14 = readint(local15)
        local5 = readfloat(local15)
        local6 = readfloat(local15)
        local7 = readfloat(local15)
        local54 = readfloat(local15)
        local55 = readfloat(local15)
        local56 = readfloat(local15)
        local53 = createdecal(local14, local5, local6, local7, local54, local55, local56, 1.0, 1.0, $00, $01, $00, $00, $00)
        local53\Field9 = readfloat(local15)
        scaleentity(local53\Field0, local53\Field9, local53\Field9, 1.0, $01)
        local53\Field3 = readfloat(local15)
        local53\Field12 = readfloat(local15)
        entityalpha(local53\Field0, local53\Field12)
        local53\Field6 = readbyte(local15)
        entityfx(local53\Field0, local53\Field6)
        local53\Field10 = readbyte(local15)
        entityblend(local53\Field0, local53\Field10)
        local53\Field8 = readbyte(local15)
        local53\Field13 = readbyte(local15)
        local53\Field11 = readbyte(local15)
        If ((((local53\Field8 <> $00) Lor (local53\Field13 <> $00)) Lor (local53\Field11 <> $00)) <> 0) Then
            entitycolor(local53\Field0, (Float local53\Field8), (Float local53\Field13), (Float local53\Field11))
        EndIf
        local53\Field1 = readfloat(local15)
        local53\Field2 = readfloat(local15)
        local53\Field14 = readfloat(local15)
        local53\Field5 = readfloat(local15)
        local11 = readbyte(local15)
        If (local11 = $01) Then
            XZ6DBZD4ZD = local53
        EndIf
    Next
    For local57 = Each events
        removeevent(local57)
    Next
    local10 = readint(local15)
    For local8 = $01 To local10 Step $01
        local57 = (New events)
        local57\Field32 = readbyte(local15)
        local57\Field4 = readfloat(local15)
        local57\Field7 = readfloat(local15)
        local57\Field1 = readfloat(local15)
        local57\Field23 = readfloat(local15)
        local5 = readfloat(local15)
        local7 = readfloat(local15)
        For local0 = Each rooms
            If (((local5 = entityx(local0\Field15, $00, 1.0)) And (local7 = entityz(local0\Field15, $00, 1.0))) <> 0) Then
                local57\Field19 = local0
                Exit
            EndIf
        Next
        local57\Field9 = readstring(local15)
        findeventvariable(local57)
    Next
    For local57 = Each events
        Select local57\Field32
            Case $4C
                If (0.0 < local57\Field4) Then
                    hidechunks()
                    For local58 = Each chunk
                        removechunk(local58)
                    Next
                    For local59 = Each chunkpart
                        removechunkpart(local59)
                    Next
                    freeentity(i_1499\Field4)
                    i_1499\Field4 = $00
                    For local1 = Each npcs
                        If (local1\Field77 = $12) Then
                            If (local1\Field24 = $03) Then
                                removenpc(local1)
                            EndIf
                        EndIf
                    Next
                    For local61 = Each dummy1499_1
                        removedummy1499_1(local61)
                    Next
                    local57\Field9 = ""
                    local57\Field4 = 0.0
                EndIf
            Case $05
                local57\Field9 = ""
            Case $17
                If (0.0 = local57\Field7) Then
                    positionentity(local57\Field19\Field27[$01], entityx(local57\Field19\Field27[$01], $01, 1.0), -5.0, entityz(local57\Field19\Field27[$01], $01, 1.0), $01)
                EndIf
                If (local57\Field19\Field32[$01] <> Null) Then
                    hideentity(local57\Field19\Field32[$01]\Field82)
                    hideentity(local57\Field19\Field32[$01]\Field98)
                EndIf
            Case $23
                If (2.0 > local57\Field4) Then
                    rotateentity(local57\Field19\Field27[$01], 85.0, entityyaw(local57\Field19\Field27[$01], $01, 1.0), 0.0, $01)
                EndIf
            Case $44
                If (2.0 = local57\Field1) Then
                    For local60 = Each props
                        If (local60\Field5 = local57\Field19) Then
                            If (local60\Field3 = "tank2.b3d") Then
                                local13 = loadtexture_strict("GFX\Map\Textures\tank2_damaged.png", $01, $00, 1.0)
                                entityinstance(local60\Field0, $00)
                                entitytexture(local60\Field0, local13, $00, $00)
                                X8F80Z2886(local60\Field0, $FFFFFFFF, $00)
                                deletesingletextureentryfromcache(local13, $00)
                                local13 = $00
                                Exit
                            EndIf
                        EndIf
                    Next
                EndIf
        End Select
    Next
    For local63 = Each items
        removeitem(local63, $01)
    Next
    local10 = readint(local15)
    For local8 = $01 To local10 Step $01
        local64 = readstring(local15)
        local14 = readint(local15)
        local65 = readstring(local15)
        local66 = readstring(local15)
        local5 = readfloat(local15)
        local6 = readfloat(local15)
        local7 = readfloat(local15)
        local67 = readbyte(local15)
        local68 = readbyte(local15)
        local69 = readbyte(local15)
        local70 = (Int readfloat(local15))
        local63 = createitem(local64, local14, local5, local6, local7, local67, local68, local69, (Float local70), $00)
        local63\Field19 = local65
        local63\Field24 = local66
        entitytype(local63\Field9, $03, $00)
        local5 = readfloat(local15)
        local6 = readfloat(local15)
        rotateentity(local63\Field9, local5, local6, 0.0, $00)
        local63\Field15 = readfloat(local15)
        local63\Field3 = readfloat(local15)
        local63\Field39 = readfloat(local15)
        local63\Field17 = readbyte(local15)
        If (local63\Field17 <> 0) Then
            hideentity(local63\Field9)
        EndIf
        local71 = readbyte(local15)
        If (local71 = $01) Then
            selecteditem = local63
        EndIf
        local71 = readbyte(local15)
        If (local71 < $42) Then
            TX60DB8XBBZ(local71) = local63
        EndIf
        For local72 = Each itemtemplates
            If (((local72\Field9 = local14) And (local72\Field19 = local64)) <> 0) Then
                If (local72\Field20 <> 0) Then
                    setanimtime(local63\Field5, readfloat(local15), $00)
                    Exit
                EndIf
            EndIf
        Next
        local63\Field36 = readbyte(local15)
        local63\Field27 = readint(local15)
        If (local63\Field27 > lastitemid) Then
            lastitemid = local63\Field27
        EndIf
        If (readbyte(local15) = $00) Then
            local63\Field20 = local63\Field6\Field14
        Else
            local63\Field20 = local63\Field6\Field10
        EndIf
    Next
    local10 = readint(local15)
    For local8 = $01 To local10 Step $01
        local74 = readint(local15)
        For local73 = Each items
            If (local73\Field27 = local74) Then
                local63 = local73
                Exit
            EndIf
        Next
        For local9 = $00 To (local63\Field36 - $01) Step $01
            local74 = readint(local15)
            If (local74 <> $FFFFFFFF) Then
                For local73 = Each items
                    If (local73\Field27 = local74) Then
                        local63\Field8[local9] = local73
                        Exit
                    EndIf
                Next
            EndIf
        Next
    Next
    For local63 = Each items
        If ((((local63\Field6\Field9 = $4D) Lor (local63\Field6\Field9 = $4E)) Lor (local63\Field6\Field9 = $4F)) <> 0) Then
            local63\Field32 = readbyte(local15)
            For local74 = $01 To local63\Field32 Step $01
                local65 = readstring(local15)
                For local72 = Each itemtemplates
                    If (local72\Field19 = local65) Then
                        local63\Field0[local74] = local72
                        Exit
                    EndIf
                Next
            Next
        EndIf
    Next
    For local72 = Each itemtemplates
        local72\Field6 = readbyte(local15)
    Next
    For local3 = Each emitter
        For local0 = Each rooms
            local14 = readbyte(local15)
            If (local14 = $01) Then
                local3\Field14 = local0
                entityparent(local3\Field2, local0\Field15, $01)
            EndIf
        Next
    Next
    escapetimer = readint(local15)
    For local75 = Each securitycams
        local75\Field2 = readbyte(local15)
        local75\Field1 = readint(local15)
    Next
    local10 = readint(local15)
    For local8 = $01 To local10 Step $01
        local14 = readint(local15)
        For local63 = Each items
            If (local63\Field27 = local14) Then
                TX842ZZB6XD(local63, local14)
                local63\Field18 = readint(local15)
            EndIf
        Next
    Next
    For local76 = Each screens
        local76\Field9 = readbyte(local15)
        local76\Field1 = readfloat(local15)
    Next
    closefile(local15)
    fog\Field13 = 8.0
    For local8 = $00 To $01 Step $01
        mon_i\Field1[local8] = $01
    Next
    For local0 = Each rooms
        For local8 = $00 To $03 Step $01
            local0\Field29[local8] = Null
        Next
        For local77 = Each rooms
            If (local0 <> local77) Then
                If (local0\Field37 = local77\Field37) Then
                    If ((local0\Field40 + 8.0) = local77\Field40) Then
                        local0\Field29[$00] = local77
                        If (local0\Field10[$00] = Null) Then
                            local0\Field10[$00] = local77\Field10[$02]
                        EndIf
                    ElseIf ((local0\Field40 - 8.0) = local77\Field40) Then
                        local0\Field29[$02] = local77
                        If (local0\Field10[$02] = Null) Then
                            local0\Field10[$02] = local77\Field10[$00]
                        EndIf
                    EndIf
                ElseIf (local0\Field40 = local77\Field40) Then
                    If ((local0\Field37 - 8.0) = local77\Field37) Then
                        local0\Field29[$01] = local77
                        If (local0\Field10[$01] = Null) Then
                            local0\Field10[$01] = local77\Field10[$03]
                        EndIf
                    ElseIf ((local0\Field37 + 8.0) = local77\Field37) Then
                        local0\Field29[$03] = local77
                        If (local0\Field10[$03] = Null) Then
                            local0\Field10[$03] = local77\Field10[$01]
                        EndIf
                    EndIf
                EndIf
            EndIf
            If (((((local0\Field29[$00] <> Null) And (local0\Field29[$01] <> Null)) And (local0\Field29[$02] <> Null)) And (local0\Field29[$03] <> Null)) <> 0) Then
                Exit
            EndIf
        Next
        For local2 = Each doors
            If (((local2\Field44 = $00) And (local2\Field52 = $00)) <> 0) Then
                If (local0\Field37 = entityz(local2\Field51, $01, 1.0)) Then
                    If ((local0\Field40 + 4.0) = entityx(local2\Field51, $01, 1.0)) Then
                        local0\Field10[$00] = local2
                    ElseIf ((local0\Field40 - 4.0) = entityx(local2\Field51, $01, 1.0)) Then
                        local0\Field10[$02] = local2
                    EndIf
                ElseIf (local0\Field40 = entityx(local2\Field51, $01, 1.0)) Then
                    If ((local0\Field37 + 4.0) = entityz(local2\Field51, $01, 1.0)) Then
                        local0\Field10[$03] = local2
                    ElseIf ((local0\Field37 - 4.0) = entityz(local2\Field51, $01, 1.0)) Then
                        local0\Field10[$01] = local2
                    EndIf
                EndIf
            EndIf
        Next
    Next
    If (playerroom\Field22\Field21 = $70) Then
        XZ0260X8X2\Field53 = -1.0
        teleporttoroom(i_1499\Field2)
    EndIf
    catcherrors((("Uncaught: LoadGame(" + arg0) + ")"))
    Return $00
End Function

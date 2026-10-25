Function loadgamequick%(arg0$)
    Local local0.rooms
    Local local1.npcs
    Local local2.doors
    Local local3.emitter
    Local local4#
    Local local5#
    Local local6#
    Local local7%
    Local local8%
    Local local9%
    Local local10%
    Local local11$
    Local local12%
    Local local13%
    Local local14%
    Local local15%
    Local local16%
    Local local17%
    Local local18%
    Local local19%
    Local local20%
    Local local21%
    Local local22#
    Local local23#
    Local local24$
    Local local25%
    Local local27#
    Local local29.npcs
    Local local30%
    Local local31%
    Local local32%
    Local local33%
    Local local34#
    Local local35#
    Local local36#
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
    catcherrors((("LoadGameQuick(" + arg0) + ")"))
    local9 = $00
    local10 = $00
    local11 = ""
    local20 = readfile_strict((("Saves\" + arg0) + "\save.cb"))
    gamesaved = $01
    msg\Field0 = ""
    msg\Field2 = 0.0
    msg\Field1 = ""
    msg\Field3 = 0.0
    XZ0260X8X2\Field23 = $00
    XZ0260X8X2\Field61 = $00
    XZ0260X8X2\Field9 = 0.0
    XZ0260X8X2\Field38 = $02
    XZ0260X8X2\Field40 = $FFFFFFFF
    readstring(local20)
    readstring(local20)
    local11 = readstring(local20)
    If (local11 <> "2.1.5") Then
        runtimeerrorex(format(format(getlocalstring("save", "imcompatible"), local11, "{0}"), "2.1.5", "{1}"))
    EndIf
    readbyte(local20)
    readstring(local20)
    readstring(local20)
    XZ0260X8X2\Field16 = -0.1
    XZ0260X8X2\Field4 = 0.0
    XZ0260X8X2\Field76 = 0.0
    XZ0260X8X2\Field15 = 0.0
    XZ0260X8X2\Field87 = 0.0
    XZ0260X8X2\Field32 = 0.0
    XZ0260X8X2\Field48 = 0.0
    XZ0260X8X2\Field26 = 0.0
    XZ0260X8X2\Field52 = 0.0
    menuopen = $00
    clearconsole()
    clearcheats()
    wireframestate = $00
    wireframe($00)
    readint(local20)
    readint(local20)
    readint(local20)
    readint(local20)
    local4 = readfloat(local20)
    local5 = readfloat(local20)
    local6 = readfloat(local20)
    positionentity(XZ0260X8X2\Field74, local4, (local5 + 0.3), local6, $00)
    resetentity(XZ0260X8X2\Field74)
    showentity(XZ0260X8X2\Field74)
    local4 = readfloat(local20)
    local5 = readfloat(local20)
    local6 = readfloat(local20)
    positionentity(XZ0260X8X2\Field28, local4, (local5 + 0.3), local6, $00)
    resetentity(XZ0260X8X2\Field28)
    local4 = readfloat(local20)
    local5 = readfloat(local20)
    rotateentity(XZ0260X8X2\Field74, local4, local5, 0.0, $00)
    XZ0260X8X2\Field53 = readfloat(local20)
    XZ0260X8X2\Field12 = readfloat(local20)
    XZ0260X8X2\Field7 = readfloat(local20)
    XZ0260X8X2\Field30 = readfloat(local20)
    XZ0260X8X2\Field64 = readfloat(local20)
    XZ0260X8X2\Field45 = readfloat(local20)
    XZ0260X8X2\Field25 = readbyte(local20)
    XZ0260X8X2\Field56 = readfloat(local20)
    XZ0260X8X2\Field65 = readfloat(local20)
    XZ0260X8X2\Field34 = readfloat(local20)
    XZ0260X8X2\Field43 = readfloat(local20)
    XZ0260X8X2\Field70 = readfloat(local20)
    XZ0260X8X2\Field11 = readfloat(local20)
    XZ0260X8X2\Field39 = readfloat(local20)
    XZ0260X8X2\Field20 = readfloat(local20)
    XZ0260X8X2\Field73 = readfloat(local20)
    msg\Field8 = readstring(local20)
    XZ0260X8X2\Field44 = readint(local20)
    XZ0260X8X2\Field63 = readbyte(local20)
    XZ0260X8X2\Field82 = readfloat(local20)
    XZ0260X8X2\Field37 = readbyte(local20)
    XZ0260X8X2\Field60 = readfloat(local20)
    XZ0260X8X2\Field1 = readfloat(local20)
    XZ0260X8X2\Field14 = readfloat(local20)
    XZ0260X8X2\Field8 = readfloat(local20)
    XZ0260X8X2\Field78 = readfloat(local20)
    XZ0260X8X2\Field42 = readfloat(local20)
    XZ0260X8X2\Field80 = readint(local20)
    i_2022\Field0 = readfloat(local20)
    i_2022\Field1 = readfloat(local20)
    i_005\Field0 = readbyte(local20)
    For local7 = $00 To $06 Step $01
        i_1025\Field0[local7] = readfloat(local20)
    Next
    For local7 = $00 To $04 Step $01
        i_1025\Field1[local7] = readfloat(local20)
    Next
    i_008\Field0 = readfloat(local20)
    i_008\Field1 = readbyte(local20)
    i_009\Field0 = readfloat(local20)
    i_009\Field1 = readbyte(local20)
    i_409\Field0 = readfloat(local20)
    i_409\Field1 = readbyte(local20)
    i_035\Field0 = readbyte(local20)
    local21 = readbyte(local20)
    selecteddifficulty = difficulties[local21]
    If (local21 = $04) Then
        selecteddifficulty\Field2 = readbyte(local20)
        selecteddifficulty\Field1 = readbyte(local20)
        selecteddifficulty\Field8 = readbyte(local20)
        selecteddifficulty\Field4 = readbyte(local20)
    EndIf
    maxitemamount = (selecteddifficulty\Field4 + ((0.0 < i_1025\Field1[$00]) Shl $01))
    Dim TX60DB8XBBZ.items((selecteddifficulty\Field4 + $02))
    T8660BZ460\Field0 = readfloat(local20)
    T8660BZ460\Field3 = readbyte(local20)
    T8660BZ460\Field6 = readbyte(local20)
    T8660BZ460\Field7 = readbyte(local20)
    T8660BZ460\Field10 = readbyte(local20)
    T8660BZ460\Field8 = readbyte(local20)
    T8660BZ460\Field11 = readbyte(local20)
    T8660BZ460\Field4 = readbyte(local20)
    i_1499\Field8 = readbyte(local20)
    i_1499\Field1 = readfloat(local20)
    i_1499\Field3 = readfloat(local20)
    i_1499\Field6 = readfloat(local20)
    i_1499\Field5 = readfloat(local20)
    i_1499\Field0 = readfloat(local20)
    i_1499\Field7 = readfloat(local20)
    local22 = readfloat(local20)
    local23 = readfloat(local20)
    i_966\Field1 = readfloat(local20)
    i_966\Field0 = readfloat(local20)
    i_1048a\Field2 = readfloat(local20)
    i_1048a\Field1 = readbyte(local20)
    i_268\Field2 = readbyte(local20)
    i_268\Field1 = readfloat(local20)
    i_427\Field2 = readbyte(local20)
    i_427\Field1 = readfloat(local20)
    i_714\Field0 = readbyte(local20)
    i_294\Field4 = readbyte(local20)
    randomseed = readstring(local20)
    secondarylighton = readfloat(local20)
    lightvolume = readfloat(local20)
    isblackout = readbyte(local20)
    previsblackout = readbyte(local20)
    remotedooron = readbyte(local20)
    soundtransmission = readbyte(local20)
    key2_spawnrate = readbyte(local20)
    _ClearS2IMap(unlockedachievements)
    Repeat
        local24 = readstring(local20)
        If (local24 = "EOA") Then
            Exit
        EndIf
        _S2IMapSet(unlockedachievements, local24, $1)
    Forever
    usedconsole = readbyte(local20)
    mtftimer = readfloat(local20)
    remove714timer = readfloat(local20)
    removehazmattimer = readfloat(local20)
    For local4 = 0.0 To (Float X824BX6D68) Step 1.0
        For local5 = 0.0 To (Float X824BX6D68) Step 1.0
            currmapgrid\Field4[(Int ((local5 * (Float X824BX6D68)) + local4))] = readbyte(local20)
            currmapgrid\Field0[(Int ((local5 * (Float X824BX6D68)) + local4))] = readbyte(local20)
        Next
    Next
    For local3 = Each emitter
        entityparent(local3\Field2, $00, $01)
    Next
    If (readint(local20) <> $71) Then
        runtimeerrorex(getlocalstring("save", "corrupted_1"))
    EndIf
    For local1 = Each npcs
        removenpc(local1)
    Next
    local9 = readint(local20)
    For local7 = $01 To local9 Step $01
        local25 = readbyte(local20)
        local4 = readfloat(local20)
        local5 = readfloat(local20)
        local6 = readfloat(local20)
        local1 = createnpc(local25, local4, local5, local6)
        Select local25
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
        local4 = readfloat(local20)
        local5 = readfloat(local20)
        local6 = readfloat(local20)
        rotateentity(local1\Field82, local4, local5, local6, $00)
        local1\Field66 = readfloat(local20)
        local1\Field65 = readfloat(local20)
        local1\Field57 = readfloat(local20)
        local1\Field13 = readint(local20)
        local1\Field31 = (Float readbyte(local20))
        local1\Field38 = readfloat(local20)
        local1\Field17 = readint(local20)
        local1\Field64 = readfloat(local20)
        local1\Field84 = readfloat(local20)
        local1\Field62 = readfloat(local20)
        local1\Field34 = readfloat(local20)
        forcesetnpcid(local1, readint(local20))
        local1\Field96 = readint(local20)
        local1\Field60 = readfloat(local20)
        local1\Field61 = readfloat(local20)
        local1\Field74 = readfloat(local20)
        local1\Field26 = readstring(local20)
        If (local1\Field26 <> "") Then
            local13 = loadtexture_strict(local1\Field26, $01, $00, 1.0)
            entitytexture(local1\Field98, local13, $00, $00)
            deletesingletextureentryfromcache(local13, $00)
            local13 = $00
        EndIf
        local1\Field79 = readbyte(local20)
        If (local1\Field79 <> 0) Then
            createnpcasset(local1)
        EndIf
        local1\Field36 = readbyte(local20)
        If (local1\Field36 <> 0) Then
            local1\Field103 = readfloat(local20)
            setanimtime(local1\Field98, local1\Field103, $00)
        EndIf
        local1\Field93 = readbyte(local20)
        local1\Field1 = readbyte(local20)
        local1\Field4 = readint(local20)
        local1\Field83 = readfloat(local20)
        If (0.0 < local1\Field83) Then
            scaleentity(local1\Field98, local1\Field83, local1\Field83, local1\Field83, $00)
        EndIf
        changenpctextureid(local1, (readbyte(local20) - $01))
        local1\Field22 = readbyte(local20)
        local1\Field73 = readbyte(local20)
        If (0.0 < local1\Field34) Then
            local27 = max(100.0, (255.0 - (local1\Field34 * 0.1)))
            entitycolor(local1\Field98, 255.0, local27, local27)
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
                local12 = readbyte(local20)
                If (local12 = $01) Then
                    n_i\Field13 = local1
                ElseIf (local12 = $02) Then
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
            For local29 = Each npcs
                If (local29 <> local1) Then
                    If (local29\Field56 = local1\Field96) Then
                        local1\Field59 = local29
                    EndIf
                EndIf
            Next
        EndIf
    Next
    If (readint(local20) <> $278) Then
        runtimeerrorex(getlocalstring("save", "corrupted_2"))
    EndIf
    i_zone\Field1[$00] = readbyte(local20)
    i_zone\Field1[$01] = readbyte(local20)
    i_zone\Field0 = readbyte(local20)
    local9 = readint(local20)
    For local7 = $01 To local9 Step $01
        local30 = readint(local20)
        local31 = readint(local20)
        local4 = readfloat(local20)
        local5 = readfloat(local20)
        local6 = readfloat(local20)
        local32 = readbyte(local20)
        local33 = readint(local20)
        local10 = readbyte(local20)
        If (360.0 <= (Float local31)) Then
            local31 = (Int ((Float local31) - 360.0))
        EndIf
        For local0 = Each rooms
            If (((local4 = local0\Field40) And (local6 = local0\Field37)) <> 0) Then
                local0\Field7 = local32
                Exit
            EndIf
        Next
        If (local10 = $01) Then
            playerroom = local0
        EndIf
        For local8 = $00 To $0F Step $01
            local12 = readint(local20)
            If (local12 > $00) Then
                For local1 = Each npcs
                    If (local1\Field56 = local12) Then
                        local0\Field32[local8] = local1
                        Exit
                    EndIf
                Next
            EndIf
        Next
        For local8 = $00 To $03 Step $01
            local12 = readbyte(local20)
            If (local12 = $00) Then
                rotateentity(local0\Field9[local8]\Field1, 80.0, entityyaw(local0\Field9[local8]\Field1, $00, 1.0), 0.0, $00)
            ElseIf (local12 = $01) Then
                rotateentity(local0\Field9[local8]\Field1, -80.0, entityyaw(local0\Field9[local8]\Field1, $00, 1.0), 0.0, $00)
            EndIf
        Next
        If (readbyte(local20) > $00) Then
            For local5 = 0.0 To 9.0 Step 1.0
                For local4 = 0.0 To 9.0 Step 1.0
                    readbyte(local20)
                Next
            Next
            local34 = readfloat(local20)
            local35 = readfloat(local20)
            local36 = readfloat(local20)
        ElseIf (local0\Field13 <> Null) Then
            destroyforest(local0\Field13, $01)
            Delete local0\Field13
        EndIf
    Next
    For local0 = Each rooms
        If (((local22 = local0\Field40) And (local23 = local0\Field37)) <> 0) Then
            i_1499\Field2 = local0
            Exit
        EndIf
    Next
    For local1 = Each npcs
        local1\Field90 = GUESSEDloadxb(local1\Field82, $00)
    Next
    If (readint(local20) <> $3BA) Then
        runtimeerrorex(getlocalstring("save", "corrupted_3"))
    EndIf
    For local3 = Each emitter
        freeemitter(local3, $01)
    Next
    local9 = readint(local20)
    For local7 = $01 To local9 Step $01
        local4 = readfloat(local20)
        local5 = readfloat(local20)
        local6 = readfloat(local20)
        local12 = readint(local20)
        local10 = readbyte(local20)
        local3 = setemitter(Null, local4, local5, local6, local12)
        local3\Field7 = local10
        forcesetemitterid(local3, readint(local20))
    Next
    For local0 = Each rooms
        For local8 = $00 To $07 Step $01
            local12 = readint(local20)
            If (local12 > $00) Then
                For local3 = Each emitter
                    If (local3\Field0 = local12) Then
                        local0\Field17[local8] = local3
                        Exit
                    EndIf
                Next
            EndIf
        Next
    Next
    T20BDD24F02\Field0 = readbyte(local20)
    T20BDD24F02\Field2 = readfloat(local20)
    T20BDD24F02\Field1 = readfloat(local20)
    local9 = readint(local20)
    For local7 = $01 To local9 Step $01
        local4 = readfloat(local20)
        local5 = readfloat(local20)
        local6 = readfloat(local20)
        local37 = readbyte(local20)
        local38 = readfloat(local20)
        local39 = readbyte(local20)
        local40 = readbyte(local20)
        local41 = readfloat(local20)
        local42 = readfloat(local20)
        local43 = readfloat(local20)
        local44 = readfloat(local20)
        local45 = readfloat(local20)
        local46 = readfloat(local20)
        local47 = readfloat(local20)
        local48 = readbyte(local20)
        local49 = readbyte(local20)
        local50 = readbyte(local20)
        local51 = readbyte(local20)
        local52 = readbyte(local20)
        For local2 = Each doors
            If ((((local4 = entityx(local2\Field51, $01, 1.0)) And (local5 = entityy(local2\Field51, $01, 1.0))) And (local6 = entityz(local2\Field51, $01, 1.0))) <> 0) Then
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
                positionentity(local2\Field0, local41, local5, local42, $01)
                rotateentity(local2\Field0, 0.0, local43, 0.0, $01)
                If (local2\Field7 <> $00) Then
                    positionentity(local2\Field7, local44, local5, local45, $01)
                EndIf
                If (local50 <> 0) Then
                    affectdecaydoor(local2)
                EndIf
                Exit
            EndIf
        Next
    Next
    If (readint(local20) <> $735) Then
        runtimeerrorex(getlocalstring("save", "corrupted_4"))
    EndIf
    For local53 = Each decals
        removedecal(local53)
    Next
    local9 = readint(local20)
    For local7 = $01 To local9 Step $01
        local12 = readint(local20)
        local4 = readfloat(local20)
        local5 = readfloat(local20)
        local6 = readfloat(local20)
        local54 = readfloat(local20)
        local55 = readfloat(local20)
        local56 = readfloat(local20)
        local53 = createdecal(local12, local4, local5, local6, local54, local55, local56, 1.0, 1.0, $00, $01, $00, $00, $00)
        local53\Field9 = readfloat(local20)
        scaleentity(local53\Field0, local53\Field9, local53\Field9, 1.0, $01)
        local53\Field3 = readfloat(local20)
        local53\Field12 = readfloat(local20)
        entityalpha(local53\Field0, local53\Field12)
        local53\Field6 = readbyte(local20)
        entityfx(local53\Field0, local53\Field6)
        local53\Field10 = readbyte(local20)
        entityblend(local53\Field0, local53\Field10)
        local53\Field8 = readbyte(local20)
        local53\Field13 = readbyte(local20)
        local53\Field11 = readbyte(local20)
        If ((((local53\Field8 <> $00) Lor (local53\Field13 <> $00)) Lor (local53\Field11 <> $00)) <> 0) Then
            entitycolor(local53\Field0, (Float local53\Field8), (Float local53\Field13), (Float local53\Field11))
        EndIf
        local53\Field1 = readfloat(local20)
        local53\Field2 = readfloat(local20)
        local53\Field14 = readfloat(local20)
        local53\Field5 = readfloat(local20)
        local10 = readbyte(local20)
        If (local10 = $01) Then
            XZ6DBZD4ZD = local53
        EndIf
    Next
    For local57 = Each events
        removeevent(local57)
    Next
    local9 = readint(local20)
    For local7 = $01 To local9 Step $01
        local57 = (New events)
        local57\Field32 = readbyte(local20)
        local57\Field4 = readfloat(local20)
        local57\Field7 = readfloat(local20)
        local57\Field1 = readfloat(local20)
        local57\Field23 = readfloat(local20)
        local4 = readfloat(local20)
        local6 = readfloat(local20)
        For local0 = Each rooms
            If (((local4 = entityx(local0\Field15, $00, 1.0)) And (local6 = entityz(local0\Field15, $00, 1.0))) <> 0) Then
                local57\Field19 = local0
                Exit
            EndIf
        Next
        local57\Field9 = readstring(local20)
        findeventvariable(local57)
    Next
    For local57 = Each events
        Select local57\Field32
            Case $03
                For local7 = $00 To $01 Step $01
                    If (local57\Field19\Field27[local7] = $00) Then
                        local57\Field19\Field27[local7] = createpivot($00)
                    EndIf
                Next
            Case $4C
                If (1.0 = local57\Field4) Then
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
            Case $4B
                For local7 = $09 To $0A Step $01
                    positionentity(local57\Field19\Field27[local7], 0.0, -500.0, 0.0, $01)
                Next
            Case $3A
                If (1.0 = local57\Field4) Then
                    showentity(local57\Field19\Field13\Field4)
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
                                GUESSEDfreeentity_7(local60\Field0, $FFFFFFFF, $00)
                                deletesingletextureentryfromcache(local13, $00)
                                local13 = $00
                                Exit
                            EndIf
                        EndIf
                    Next
                EndIf
            Case $10
                For local7 = $07 To $08 Step $01
                    If (local57\Field19\Field27[local7] <> $00) Then
                        freeentity(local57\Field19\Field27[local7])
                        local57\Field19\Field27[local7] = $00
                    EndIf
                Next
                If (local57\Field19\Field25[$08] <> Null) Then
                    removedoor(local57\Field19\Field25[$08])
                EndIf
            Case $0E
                If (2170.0 > local57\Field7) Then
                    local13 = loadtexture_strict("GFX\Map\Textures\scp_012(1).png", $01, $00, 1.0)
                    entitytexture(local57\Field19\Field27[$02], local13, $00, $00)
                    deletesingletextureentryfromcache(local13, $00)
                EndIf
            Case $16
                If (1.0 = local57\Field4) Then
                    hideentity(local57\Field19\Field27[$01])
                EndIf
            Case $17
                setanimtime(local57\Field19\Field27[$05], (((Float (0.0 <> local57\Field4)) * 119.0) + 1.0), $00)
                If (local57\Field19\Field32[$01] <> Null) Then
                    hideentity(local57\Field19\Field32[$01]\Field82)
                    hideentity(local57\Field19\Field32[$01]\Field98)
                EndIf
            Case $33
                setanimtime(local57\Field19\Field27[$00], (((Float (2.0 = local57\Field4)) * 239.0) + 1.0), $00)
            Case $2F
                If (local57\Field19\Field27[$00] <> $00) Then
                    freeentity(local57\Field19\Field27[$00])
                    local57\Field19\Field27[$00] = $00
                EndIf
                If (local57\Field19\Field27[$04] <> $00) Then
                    freeentity(local57\Field19\Field27[$04])
                    local57\Field19\Field27[$04] = $00
                EndIf
                If (local57\Field19\Field27[$05] <> $00) Then
                    freeentity(local57\Field19\Field27[$05])
                    local57\Field19\Field27[$05] = $00
                EndIf
                If (local57\Field19\Field27[$08] <> $00) Then
                    freeentity(local57\Field19\Field27[$08])
                    local57\Field19\Field27[$08] = $00
                EndIf
                If (local57\Field19\Field27[$07] <> $00) Then
                    freeentity(local57\Field19\Field27[$07])
                    local57\Field19\Field27[$07] = $00
                EndIf
                If (local57\Field19\Field27[$09] <> $00) Then
                    freeentity(local57\Field19\Field27[$09])
                    local57\Field19\Field27[$09] = $00
                EndIf
                If (local57\Field19\Field27[$0A] <> $00) Then
                    freeentity(local57\Field19\Field27[$0A])
                    local57\Field19\Field27[$0A] = $00
                EndIf
                If (local57\Field19\Field27[$0B] <> $00) Then
                    freeentity(local57\Field19\Field27[$0B])
                    local57\Field19\Field27[$0B] = $00
                EndIf
                If (local57\Field19\Field27[$0C] <> $00) Then
                    freeentity(local57\Field19\Field27[$0C])
                    local57\Field19\Field27[$0C] = $00
                EndIf
            Case $2D
                If (local57\Field19\Field27[$00] <> $00) Then
                    freeentity(local57\Field19\Field27[$00])
                    local57\Field19\Field27[$00] = $00
                EndIf
                If (local57\Field19\Field27[$06] <> $00) Then
                    freeentity(local57\Field19\Field27[$06])
                    local57\Field19\Field27[$06] = $00
                EndIf
            Case $4E
                If (66.0 <> local57\Field4) Then
                    entitypickmode(local57\Field19\Field27[$01], $02, $01)
                    entitytype(local57\Field19\Field27[$01], $01, $00)
                Else
                    entitypickmode(local57\Field19\Field27[$01], $00, $01)
                    entitytype(local57\Field19\Field27[$01], $00, $00)
                EndIf
            Case $1F
                If (917.0 > local57\Field23) Then
                    For local7 = $02 To $03 Step $01
                        rotateentity(local57\Field19\Field27[local7], 90.0, ((Float local57\Field19\Field21) + (180.0 * (Float (local7 = $03)))), 0.0, $01)
                    Next
                EndIf
            Case $1D
                If (30.0 >= local57\Field4) Then
                    positionentity(local57\Field19\Field27[$00], local57\Field19\Field40, (local57\Field19\Field3 + 1.71875), local57\Field19\Field37, $01)
                    rotateentity(local57\Field19\Field27[$00], 0.0, 0.0, 0.0, $01)
                EndIf
        End Select
    Next
    For local63 = Each items
        removeitem(local63, $01)
    Next
    local9 = readint(local20)
    For local7 = $01 To local9 Step $01
        local64 = readstring(local20)
        local12 = readint(local20)
        local65 = readstring(local20)
        local66 = readstring(local20)
        local4 = readfloat(local20)
        local5 = readfloat(local20)
        local6 = readfloat(local20)
        local67 = readbyte(local20)
        local68 = readbyte(local20)
        local69 = readbyte(local20)
        local70 = (Int readfloat(local20))
        local63 = createitem(local64, local12, local4, local5, local6, local67, local68, local69, (Float local70), $00)
        local63\Field19 = local65
        local63\Field24 = local66
        entitytype(local63\Field9, $03, $00)
        local4 = readfloat(local20)
        local5 = readfloat(local20)
        rotateentity(local63\Field9, local4, local5, 0.0, $00)
        local63\Field15 = readfloat(local20)
        local63\Field3 = readfloat(local20)
        local63\Field39 = readfloat(local20)
        local63\Field17 = readbyte(local20)
        If (local63\Field17 <> 0) Then
            hideentity(local63\Field9)
        EndIf
        local71 = readbyte(local20)
        If (local71 = $01) Then
            selecteditem = local63
        EndIf
        local71 = readbyte(local20)
        If (local71 < $42) Then
            TX60DB8XBBZ(local71) = local63
        EndIf
        For local72 = Each itemtemplates
            If (((local72\Field9 = local12) And (local72\Field19 = local64)) <> 0) Then
                If (local72\Field20 <> 0) Then
                    setanimtime(local63\Field5, readfloat(local20), $00)
                    Exit
                EndIf
            EndIf
        Next
        local63\Field36 = readbyte(local20)
        local63\Field27 = readint(local20)
        If (local63\Field27 > lastitemid) Then
            lastitemid = local63\Field27
        EndIf
        If (readbyte(local20) = $00) Then
            local63\Field20 = local63\Field6\Field14
        Else
            local63\Field20 = local63\Field6\Field10
        EndIf
    Next
    local9 = readint(local20)
    For local7 = $01 To local9 Step $01
        local74 = readint(local20)
        For local73 = Each items
            If (local73\Field27 = local74) Then
                local63 = local73
                Exit
            EndIf
        Next
        For local8 = $00 To (local63\Field36 - $01) Step $01
            local74 = readint(local20)
            If (local74 <> $FFFFFFFF) Then
                For local73 = Each items
                    If (local73\Field27 = local74) Then
                        local63\Field8[local8] = local73
                        Exit
                    EndIf
                Next
            EndIf
        Next
    Next
    For local63 = Each items
        If ((((local63\Field6\Field9 = $4D) Lor (local63\Field6\Field9 = $4E)) Lor (local63\Field6\Field9 = $4F)) <> 0) Then
            local63\Field32 = readbyte(local20)
            For local74 = $01 To local63\Field32 Step $01
                local65 = readstring(local20)
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
        local72\Field6 = readbyte(local20)
    Next
    For local3 = Each emitter
        For local0 = Each rooms
            local12 = readbyte(local20)
            If (local12 = $01) Then
                local3\Field14 = local0
                entityparent(local3\Field2, local0\Field15, $01)
            EndIf
        Next
    Next
    escapetimer = readint(local20)
    For local75 = Each securitycams
        local75\Field2 = readbyte(local20)
        local75\Field1 = readint(local20)
    Next
    local9 = readint(local20)
    For local7 = $01 To local9 Step $01
        local12 = readint(local20)
        For local63 = Each items
            If (local63\Field27 = local12) Then
                GUESSEDloadgame(local63, local12)
                local63\Field18 = readint(local20)
            EndIf
        Next
    Next
    For local76 = Each screens
        local76\Field9 = readbyte(local20)
        local76\Field1 = readfloat(local20)
    Next
    closefile(local20)
    If (0.0 = XZ0260X8X2\Field14) Then
        For local60 = Each props
            If (local60\Field1 <> 0) Then
                rotateentity(local60\Field0, 0.0, entityyaw(local60\Field0, $01, 1.0), entityroll(local60\Field0, $01, 1.0), $01)
            EndIf
        Next
    EndIf
    clearfogcolor()
    d_i\Field13 = $00
    If (T8660BZ460\Field3 = $00) Then
        hideentity(X2Z260BF0Z\Field1[$01])
    EndIf
    If (T8660BZ460\Field10 = $00) Then
        hideentity(X2Z260BF0Z\Field1[$02])
    EndIf
    fog\Field13 = 8.0
    If (sky <> $00) Then
        freeentity(sky)
        sky = $00
    EndIf
    For local0 = Each rooms
        Select local0\Field22\Field21
            Case $2A
                update035label(local0\Field27[$04])
            Case $3B
                If (local0\Field27[$07] <> $00) Then
                    freeentity(local0\Field27[$07])
                    local0\Field27[$07] = $00
                EndIf
        End Select
    Next
    hidedistance = 17.0
    catcherrors((("Uncaught: LoadGameQuick(" + arg0) + ")"))
    Return $00
End Function

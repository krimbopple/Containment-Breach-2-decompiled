Function initnewgame%()
    Local local0.decals
    Local local1.doors
    Local local2.items
    Local local3.rooms
    Local local4.securitycams
    Local local5.events
    Local local6.roomtemplates
    Local local7%
    Local local8%
    Local local9%
    Local local11.tempscreens
    Local local12.tempwaypoints
    Local local13.templights
    Local local14.tempprops
    Local local15.tempsoundemitters
    Local local16.TFFD0Z88DZ
    Local local18%
    Local local19%
    catcherrors("InitNewGame()")
    _Discord_SetPresence("", "Loading in game", "")
    Steam_SetRichPresence("steam_display", "#loading")
    loadentities($00)
    loadsounds()
    fog\Field13 = 8.0
    isblackout = $00
    previsblackout = $00
    remotedooron = $01
    initotherstuff()
    maxitemamount = selecteddifficulty\Field4
    Dim TX60DB8XBBZ.items((maxitemamount + $02))
    renderloading(50.0, getlocalstring("loading", "stuff"), $00, 0.025)
    seedrnd((generateseednumber(randomseed) + $40))
    XZ0260X8X2\Field53 = -10.0
    XZ0260X8X2\Field7 = 1.0
    XZ0260X8X2\Field56 = 100.0
    XZ0260X8X2\Field65 = 1.0
    XZ0260X8X2\Field62 = 70.0
    i_005\Field0 = rand($03, $01)
    key2_spawnrate = rand($06, $01)
    remove714timer = 500.0
    removehazmattimer = 500.0
    code_dr_maynard = $00
    For local8 = $00 To $03 Step $01
        code_dr_maynard = (Int (((Float rand($09, $01)) * (10.0 ^ (Float local8))) + (Float code_dr_maynard)))
    Next
    If ((((code_dr_maynard = $1E88) Lor (code_dr_maynard = $1663)) Lor (code_dr_maynard = $96B)) <> 0) Then
        code_dr_maynard = (code_dr_maynard + $01)
    EndIf
    T20200F42ZD = ((code_dr_maynard Shl $01) Mod $2710)
    If (T20200F42ZD < $3E8) Then
        T20200F42ZD = (T20200F42ZD + $3E8)
    EndIf
    code_maintenance_tunnels = ((code_dr_maynard * $03) Mod $2710)
    If (code_maintenance_tunnels < $3E8) Then
        code_maintenance_tunnels = (code_maintenance_tunnels + $3E8)
    EndIf
    code_dr_gears = ((code_dr_maynard Shl $02) Mod $2710)
    If (code_dr_gears < $3E8) Then
        code_dr_gears = (code_dr_gears + $3E8)
    EndIf
    renderloading(55.0, getlocalstring("loading", "rooms"), $41, 0.025)
    If (selectedcustommap = Null) Then
        createmap()
    Else
        loadmap(("Map Creator\Maps\" + selectedcustommap\Field0))
    EndIf
    loadwaypoints($41, $55)
    n_i\Field3 = createnpc($08, 0.0, -500.0, 0.0)
    n_i\Field2 = createnpc($07, 0.0, -500.0, 0.0)
    n_i\Field2\Field65 = (rnd(12.0, 16.0) * 4200.0)
    For local1 = Each doors
        entityparent(local1\Field0, $00, $01)
        If (local1\Field7 <> $00) Then
            entityparent(local1\Field7, $00, $01)
        EndIf
        Select local1\Field46
            Case $00,$07,$08
                moveentity(local1\Field0, 0.0, 0.0, (1.0 / 32.0), $00)
                If (local1\Field7 <> $00) Then
                    moveentity(local1\Field7, 0.0, 0.0, (1.0 / 32.0), $00)
                EndIf
            Case $04
                moveentity(local1\Field0, 0.359375, 0.0, 0.0, $00)
            Case $05
                moveentity(local1\Field0, 0.265625, 0.0, 0.0, $00)
            Case $06
                moveentity(local1\Field0, (1.0 / 2.245614), 0.0, 0.0, $00)
        End Select
        If (local1\Field51 <> $00) Then
            entityparent(local1\Field51, $00, $01)
        EndIf
        For local8 = $00 To $01 Step $01
            If (local1\Field40[local8] <> $00) Then
                entityparent(local1\Field40[local8], $00, $01)
            EndIf
            If (local1\Field24[local8] <> $00) Then
                entityparent(local1\Field24[local8], $00, $01)
            EndIf
        Next
    Next
    For local2 = Each items
        entitytype(local2\Field9, $03, $00)
        entityparent(local2\Field9, $00, $01)
    Next
    For local4 = Each securitycams
        entityparent(local4\Field0, $00, $01)
        If (local4\Field15 <> $00) Then
            entityparent(local4\Field15, $00, $01)
        EndIf
    Next
    renderloading(85.0, getlocalstring("loading", "reflections"), $41, 0.025)
    GUESSEDupdateentity_5()
    renderloading(86.0, getlocalstring("loading", "events"), $00, 0.025)
    seedrnd((generateseednumber(randomseed) + $02))
    For local3 = Each rooms
        If (local3\Field22\Field20 < $02) Then
            If (rand($04, $01) = $01) Then
                local0 = createdecal(rand($02, $03), (local3\Field40 + rnd(-2.0, 2.0)), (local3\Field3 + 0.005), (local3\Field37 + rnd(-2.0, 2.0)), 90.0, rnd(360.0, 0.0), 0.0, rnd(0.1, 0.4), rnd(0.85, 0.95), $00, $01, $00, $00, $00)
                entityparent(local0\Field0, local3\Field15, $01)
            EndIf
            If (rand($04, $01) = $01) Then
                local0 = createdecal($00, (local3\Field40 + rnd(-2.0, 2.0)), (local3\Field3 + 0.005), (local3\Field37 + rnd(-2.0, 2.0)), 90.0, rnd(360.0, 0.0), 0.0, rnd(0.5, 0.7), rnd(0.7, 0.85), $00, $01, $00, $00, $00)
                entityparent(local0\Field0, local3\Field15, $01)
            EndIf
        EndIf
        If (((local3\Field22\Field21 = $03) And (opt\Field3 = $00)) <> 0) Then
            tformpoint(3584.0, 580.0, 3096.0, local3\Field15, $00)
            positionentity(XZ0260X8X2\Field74, tformedx(), tformedy(), tformedz(), $00)
            playerroom = local3
            local2 = createitem("Class D Orientation Leaflet", $00, 0.0, 0.0, 0.0, $00, $00, $00, 1.0, $00)
            entitytype(local2\Field9, $03, $00)
            pickitem(local2, $00)
            local2\Field29 = $01
        ElseIf (((local3\Field22\Field21 = $04) And opt\Field3) <> 0) Then
            initializeintromovie = $01
            tformpoint(-4096.0, 0.0, 0.0, local3\Field15, $00)
            positionentity(XZ0260X8X2\Field74, tformedx(), 0.0, tformedz(), $00)
            playerroom = local3
        EndIf
    Next
    For local6 = Each roomtemplates
        freeentity(local6\Field0)
        local6\Field0 = $00
    Next
    For local11 = Each tempscreens
        Delete local11
    Next
    For local12 = Each tempwaypoints
        Delete local12
    Next
    For local13 = Each templights
        Delete local13
    Next
    For local14 = Each tempprops
        Delete local14
    Next
    For local15 = Each tempsoundemitters
        Delete local15
    Next
    For local16 = Each TFFD0Z88DZ
        Delete local16
    Next
    If (selectedcustommap = Null) Then
        loadevents()
    EndIf
    For local5 = Each events
        Select local5\Field32
            Case $1F
                local5\Field4 = 1.0
            Case $17
                local5\Field7 = 1.0
            Case $0C
                local5\Field1 = 1.0
        End Select
    Next
    renderloading(90.0, getlocalstring("loading", "pos"), $00, 0.025)
    turnentity(XZ0260X8X2\Field74, 0.0, 180.0, 0.0, $00)
    resetentity(XZ0260X8X2\Field74)
    movemouse(TDD0Z6BXB6\Field6, TDD0Z6BXB6\Field9)
    setfontex(XD00026ZX2\Field0[$00])
    hidepointer()
    XZ0260X8X2\Field16 = 0.0
    resetrender()
    updatenpcs()
    updateworld(1.0, 0.0)
    renderloading(93.0, getlocalstring("loading", "pos"), $00, 0.025)
    deletetextureentriesfromcache($00)
    renderloading(95.0, getlocalstring("loading", "pos"), $00, 0.025)
    mainmenuopen = $00
    clearunusedtextures()
    GUESSEDhideentity_6()
    Steam_SetRichPresence("steam_display", "#playing")
    _Discord_SetPresence("", "Playing", "")
    T8X2046020\Field4 = $01
    If (GUESSEDupdateanimatenpc() <> 0) Then
        TXDFXDZXXDD\Field7 = $01
        If (MP_IsConnected() <> $01) Then
            GUESSEDcreateint(GUESSEDupdatedropitem(), GUESSEDcounthost("localhost"), udpstreamport(GUESSEDupdatexdb()))
        Else
            _Steam_GetUInt64(_Steam_GetPlayerID(), local18, local19)
            GUESSEDcreateint(GUESSEDupdatedropitem(), local18, local19)
        EndIf
        TXXF6F02DB2[GUESSEDupdatedropitem()]\Field23 = GUESSEDinitinitnewgame_6(opt\Field42)
        GUESSEDinitinitnewgame_3(TXXF6F02DB2[GUESSEDupdatedropitem()])
        renderloading(100.0, "", $00, 0.025)
    ElseIf (GUESSEDinitinitnewgame_5() <> $00) Then
        If (MP_IsConnected() = $01) Then
            MP_SendLocalPlayer(GUESSEDinitinitnewgame_5(), GUESSEDinitinitnewgame_2())
        Else
            MP_SendPlayerInfo(GUESSEDinitinitnewgame_5(), GUESSEDinitinitnewgame_2())
        EndIf
        renderloading(99.5, getlocalstring("loading", "establish"), $00, 0.025)
        resetinput(10.0)
        GUESSEDinitinitnewgame_4()
        Repeat
            GUESSEDinitentry_2()
            Steam_Update()
            GUESSEDresetnullgame()
            If ((((T64ZZ6Z68F\Field1 <> $00) Lor (GUESSEDinitinitnewgame_8() <> $00)) Lor mainmenuopen) <> 0) Then
                Exit
            EndIf
            If (keyhit($01) <> 0) Then
                GUESSEDinitinitnewgame_7($00, "", $00)
            EndIf
            renderloading(99.5, "", $00, 0.025)
            delay($01)
        Forever
    EndIf
    fps\Field3[$00] = 0.0
    fps\Field6 = millisecs()
    shoulddeletegadgets = $01
    GUESSEDresetdeletemenugadgets()
    resetinput(10.0)
    catcherrors("Uncaught: InitNewGame()")
    Return $00
End Function

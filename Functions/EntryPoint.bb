Function EntryPoint%()
    Local local0$
    Local local1%
    Local local2%
    local0 = ""
    errormessageinitialized = $00
    If (filesize("BlitzToolbox.dll") = $00) Then
        local0 = (((local0 + "BlitzToolbox.dll") + chr($0D)) + chr($0A))
    EndIf
    If (filesize("FreeImage.dll") = $00) Then
        local0 = (((local0 + "FreeImage.dll") + chr($0D)) + chr($0A))
    EndIf
    If (filesize("IniController.dll") = $00) Then
        local0 = (((local0 + "IniController.dll") + chr($0D)) + chr($0A))
    EndIf
    If (filesize("RapidBson.dll") = $00) Then
        local0 = (((local0 + "RapidBson.dll") + chr($0D)) + chr($0A))
    EndIf
    If (filesize("opus.dll") = $00) Then
        local0 = (((local0 + "opus.dll") + chr($0D)) + chr($0A))
    EndIf
    If (filesize("zlibwapi.dll") = $00) Then
        local0 = (((local0 + "zlibwapi.dll") + chr($0D)) + chr($0A))
    EndIf
    If (filesize("uemp.dll") = $00) Then
        local0 = (((local0 + "uemp.dll") + chr($0D)) + chr($0A))
    EndIf
    If (filesize("bassopus.dll") = $00) Then
        local0 = (((local0 + "bassopus.dll") + chr($0D)) + chr($0A))
    EndIf
    If (filesize("bass.dll") = $00) Then
        local0 = (((local0 + "bass.dll") + chr($0D)) + chr($0A))
    EndIf
    If (filesize("discord-rpc.dll") = $00) Then
        local0 = (((local0 + "discord-rpc.dll") + chr($0D)) + chr($0A))
    EndIf
    If (len(local0) > $00) Then
        runtimeerror((((((("The following DLLs were not found in the game directory:" + chr($0D)) + chr($0A)) + chr($0D)) + chr($0A)) + local0) + "."))
    EndIf
    TXFZZB626D = $01
    TZ284DB4B0 = $BB80
    XBBBDBZB66 = $800
    T4ZB0F88BD = $3C0
    TFZ8B28XDX = createbank($44)
    GUESSEDloadentry()
    
    BASS_SetConfig($32, $01)
    BASS_SetConfig($18, $04)
    BASS_SetConfig($01, $32)
    BASS_SetConfig($00, $FA)
    BASS_SetConfig($45, $00)
    BASS_SetConfig($2B, $00)
    BASS_SetConfig($2C, $00)
    BASS_SetConfig($42, $00)
    BASS_PluginLoad("bassopus.dll", $00)
    GUESSEDcreatemicroseconds()
    graphicslevel($6E)
    enginesetting("SplashScreen", "False")
    initerrormsgs($0E, $01)
    GUESSEDgetbuild()
    T8B628B2BZ = getenv("AppData")
    If (filetype((T8B628B2BZ + "\scpcb-mr\")) <> $02) Then
        createdir((T8B628B2BZ + "\scpcb-mr"))
    EndIf
    If (filetype((T8B628B2BZ + "\scpcb-mr\Data\")) <> $02) Then
        createdir((T8B628B2BZ + "\scpcb-mr\Data"))
    EndIf
    key = (New keys)
    optionfile = (T8B628B2BZ + "\Euclid Labs\SCPCB2\Data\options.ini")
    opt = (New options)
    opt\Field61 = countgfxdrivers()
    opt\Field25 = (totalphys() Sar $0A)
    opt\Field37 = (Int systemproperty("apphwnd"))
    XD82FXFXF4 = $00
    TX82X84B8D6 = createbank($400)
    F60X2B0X6 = Null
    Steam_API_Init()
    GUESSEDinitdiscord()
    loadoptionsini()
    iniwritebuffer("Data\local.ini", $01)
    _IniAddBuffer("Data\local.ini", "Data\MP_local.ini")
    iniwritebuffer("Data\achievements.jsonc", $01)
    iniwritebuffer("Data\fonts.ini", $01)
    TDD0Z6BXB6 = (New mouse)
    XD00026ZX2 = (New fonts)
    lang = (New language)
    setlanguage(opt\Field22, $01)
    fps = (New framesperseconds)
    initlauncher()
    graphicwidthfloat = (Float opt\Field21)
    graphicheightfloat = (Float opt\Field46)
    graphics3dex(opt\Field21, opt\Field46, $00, (((opt\Field14 = $02) + $01) + ((opt\Field14 = $01) * $03)))
    GUESSEDgetbuild()
    apptitle(format(getlocalstring("mpmisc", "title"), "2.1.5", "%s"), "")
    menuscale = ((Float opt\Field46) / 1024.0)
    input_resettime = 0.0
    TDD0Z6BXB6\Field6 = (opt\Field21 Sar $01)
    TDD0Z6BXB6\Field9 = (opt\Field46 Sar $01)
    setbuffer(backbuffer(), $00, $00)
    seedrnd(millisecs())
    fps\Field0 = millisecs()
    If (opt\Field14 = $00) Then
        cursorimg = scaleimageex(loadimage_strict("GFX\Menu\cursor.png"), menuscale, menuscale, $01)
        maskimage(cursorimg, $00, $00, $00)
    EndIf
    initloadingscreens("Data\loading_screens.jsonc")
    loadfonts()
    playstartupvideos()
    setfontex(XD00026ZX2\Field0[$01])
    blinkmeterimg = scaleimageex(loadimage_strict("GFX\HUD\blink_meter(1).png"), menuscale, menuscale, $01)
    renderloading(0.0, getlocalstring("loading", "core.main"), $00, 0.025)
    renderloading(5.0, getlocalstring("loading", "core.achv"), $00, 0.025)
    snavunlocked = $00
    ereaderunlocked = $00
    currachvmsgid = $00
    renderloading(10.0, getlocalstring("loading", "core.diff"), $00, 0.025)
    difficulties[$00] = (New difficulty)
    difficulties[$00]\Field7 = getlocalstring("menu", "new.safe")
    difficulties[$00]\Field11 = getlocalstring("mpmsg", "diff.safe")
    difficulties[$00]\Field2 = $00
    difficulties[$00]\Field4 = $0A
    difficulties[$00]\Field1 = $00
    difficulties[$00]\Field8 = $00
    difficulties[$00]\Field10 = $00
    difficulties[$00]\Field6 = $00
    setdifficultycolor($00, $78, $96, $32)
    difficulties[$01] = (New difficulty)
    difficulties[$01]\Field7 = getlocalstring("menu", "new.euclid")
    difficulties[$01]\Field11 = getlocalstring("mpmsg", "diff.euclid")
    difficulties[$01]\Field2 = $00
    difficulties[$01]\Field4 = $08
    difficulties[$01]\Field1 = $01
    difficulties[$01]\Field8 = $01
    difficulties[$01]\Field10 = $01
    difficulties[$01]\Field6 = $01
    setdifficultycolor($01, $C8, $C8, $32)
    difficulties[$02] = (New difficulty)
    difficulties[$02]\Field7 = getlocalstring("menu", "new.keter")
    difficulties[$02]\Field11 = getlocalstring("msg", "diff.keter")
    difficulties[$02]\Field2 = $01
    difficulties[$02]\Field4 = $06
    difficulties[$02]\Field1 = $02
    difficulties[$02]\Field8 = $02
    difficulties[$02]\Field10 = $01
    difficulties[$02]\Field6 = $02
    setdifficultycolor($02, $C8, $32, $32)
    difficulties[$03] = (New difficulty)
    difficulties[$03]\Field7 = getlocalstring("menu", "new.apollyon")
    difficulties[$03]\Field11 = getlocalstring("msg", "diff.apollyon")
    difficulties[$03]\Field2 = $01
    difficulties[$03]\Field4 = $02
    difficulties[$03]\Field1 = $03
    difficulties[$03]\Field8 = $03
    difficulties[$03]\Field10 = $02
    difficulties[$03]\Field6 = $03
    setdifficultycolor($03, $96, $96, $96)
    difficulties[$04] = (New difficulty)
    difficulties[$04]\Field7 = getlocalstring("menu", "new.esoteric")
    difficulties[$04]\Field2 = $00
    difficulties[$04]\Field4 = $0A
    difficulties[$04]\Field0 = $01
    difficulties[$04]\Field1 = $00
    difficulties[$04]\Field8 = $00
    difficulties[$04]\Field10 = $00
    difficulties[$04]\Field6 = $04
    setdifficultycolor($04, $C8, $32, $C8)
    selecteddifficulty = difficulties[(opt\Field30 = $00)]
    renderloading(15.0, getlocalstring("loading", "core.loading"), $00, 0.025)
    tempsoundindex = $00
    music[$00] = "LightContainmentZone"
    music[$01] = "HeavyContainmentZone"
    music[$02] = "EntranceZone"
    music[$03] = "PD"
    music[$04] = "079Chamber"
    music[$05] = "Gate_B1"
    music[$06] = "Gate_B2"
    music[$07] = "Room3_storage"
    music[$08] = "049Chamber"
    music[$09] = "860_1_Blue"
    music[$0A] = "106Chase"
    music[$0B] = "Menu"
    music[$0C] = "860_2Chase"
    music[$0D] = "173IntroChamber"
    music[$0E] = "PDTrench"
    music[$0F] = "205Chamber"
    music[$10] = "Gate_A"
    music[$11] = "1499Dimension"
    music[$12] = "1499_1Chase"
    music[$13] = "049Chase"
    music[$14] = "..\Ending\MenuBreath"
    music[$15] = "914Chamber"
    music[$16] = "Ending"
    music[$17] = "Credits"
    music[$18] = "SaveMeFrom"
    music[$19] = "106Chamber"
    music[$1A] = "035Chamber"
    music[$1B] = "409Chamber"
    music[$1C] = "457Chamber"
    music[$1D] = "1123Chamber"
    music[$1E] = "008Chamber"
    music[$1F] = "008Cutscene"
    music[$20] = "012Chamber"
    music[$21] = "860_1_Red"
    music[$22] = "Wind"
    musicchn = streamsound_strict((("SFX\Music\" + music[$02]) + ".ogg"), opt\Field45, $02)
    nowplaying = $02
    shouldplay = $0B
    currmusic = $01
    Dim TZ2064ZFDB%($07, $03)
    Dim TX6X4XZX2F%($07, $03)
    Dim YXZ2BB66B%($02, $09)
    Dim XB4XFDZ8DD%($06, $10)
    Dim TFB8222B2X%($02, $05)
    Dim D8BF2B828%($02, $03)
    Dim TXDBZF46ZXF%($06, $02, $08)
    usertrackcheck = $00
    usertrackcheck2 = $00
    usertrackmusicamount = $00
    usertrackflag = $00
    renderloading(20.0, getlocalstring("loading", "core.subtitle"), $00, 0.025)
    renderloading(25.0, getlocalstring("loading", "core.sound"), $00, 0.025)
    TXZ8ZB88X62 = _CreateS2IMap()
    X84X0XD2BF = _CreateI2IMap()
    renderloading(30.0, getlocalstring("loading", "core.item"), $00, 0.025)
    Dim TX60DB8XBBZ.items($00)
    otheropen = Null
    renderloading(35.0, getlocalstring("loading", "core.particle"), $00, 0.025)
    updatedevilparticlestimer = 0.0
    renderloading(40.0, getlocalstring("loading", "core.grap"), $00, 0.025)
    TXX2B2Z8ZFD[$00] = loadimage_strict("GFX\Other\oval.png")
    TXX2B2Z8ZFD[$01] = loadimage_strict("GFX\Other\ovalsolid.png")
    screenshotcount = $01
    While (filetype((("Screenshots\Screenshot" + (Str screenshotcount)) + ".png")) = $01)
        screenshotcount = (screenshotcount + $01)
    Wend
    XZZ2226D60 = $FFFFFFFF
    CZXD2X8XX[$00] = $00
    CZXD2X8XX[$01] = $20
    CZXD2X8XX[$02] = $60
    CZXD2X8XX[$03] = $E0
    XF808DD2ZX = 0.00044
    X8D40BB8XF = 1.0
    FBXZ62B06 = 2.0
    Y08F028F68[$00] = 0.0
    TXB08482FZ2[$00] = 90.0
    Y08F028F68[$01] = 0.0
    TXB08482FZ2[$01] = 0.0
    Y08F028F68[$02] = 0.0
    TXB08482FZ2[$02] = -90.0
    Y08F028F68[$03] = 0.0
    TXB08482FZ2[$03] = 180.0
    Y08F028F68[$04] = -90.0
    TXB08482FZ2[$04] = 0.0
    Y08F028F68[$05] = 90.0
    TXB08482FZ2[$05] = 0.0
    TXF0864ZD8X = $01
    TX8BB24F442 = -999.0
    TXF0FBX4F06 = -999.0
    TXZZF0BZF4 = tan(45.0)
    renderloading(45.0, getlocalstring("loading", "core.map"), $00, 0.025)
    renderloading(50.0, getlocalstring("loading", "core.mat"), $00, 0.025)
    renderloading(55.0, getlocalstring("loading", "core.texcache"), $00, 0.025)
    XX6Z868ZB0 = $00
    Dim TX62ZBFFBZ4$($00, $00)
    Dim TXD02FZF04Z%($00, $00)
    X824BX6D68 = $15
    renderloading(60.0, getlocalstring("loading", "core.sky"), $00, 0.025)
    renderloading(65.0, getlocalstring("loading", "core.npc"), $00, 0.025)
    renderloading(70.0, getlocalstring("loading", "core.event"), $00, 0.025)
    renderloading(75.0, getlocalstring("loading", "core.save"), $00, 0.025)
    renderloading(80.0, getlocalstring("loading", "core.menu"), $00, 0.025)
    GUESSEDgetarray_3()
    GUESSEDgetarray_3_2()
    T64BBD88XX = loadimage_strict("GFX\Other\error.png")
    menuwhite = loadimage_strict("GFX\Menu\menu_white.png")
    menugray = loadimage_strict("GFX\Menu\menu_gray.png")
    menublack = loadimage_strict("GFX\Menu\menu_black.png")
    TX4D0Z2BB = loadimage_strict("GFX\Menu\button_grad.png")
    cursorpos = $FFFFFFFF
    textr = 0.0
    textg = 0.0
    textb = 0.0
    loadingscreensdoc = $00
    initializeintromovie = $00
    TXZ20040BXX = $00
    insertmode = $00
    TZFXXZB824 = $FFFFFFFF
    T488266F4D = $00
    XX0B2X4688 = $00
    ZFF8X2F22 = $00
    scrollbary = 0.0
    scrollmenuheight = 0.0
    renderloading(85.0, getlocalstring("loading", "core.multiplayer"), $00, 0.025)
    TD608042FZ[$00] = _GetHardwareUUID($3F)
    TD608042FZ[$01] = _GetHardwareUUID($01)
    TD608042FZ[$02] = _GetHardwareUUID($02)
    TD608042FZ[$03] = _GetHardwareUUID($04)
    TD608042FZ[$04] = _GetHardwareUUID($08)
    TD608042FZ[$05] = _GetHardwareUUID($10)
    TD608042FZ[$06] = _GetHardwareUUID($20)
    GUESSEDcreateentry()
    Dim T82D02BF6X%($00, $00)
    GUESSEDcreatemap_3()
    GUESSEDcreatemap($100, $06)
    GUESSEDcreateudp()
    GUESSEDsetentry_3($BB8)
    XZFD002ZXZ = (New X42402X2BD)
    XZFD002ZXZ\Field0[$00] = $18
    XZFD002ZXZ\Field0[$01] = $19
    XZFD002ZXZ\Field1[$00] = $3C
    XZFD002ZXZ\Field1[$01] = $3D
    XZFD002ZXZ\Field1[$02] = $3E
    XZFD002ZXZ\Field1[$03] = $3F
    XZFD002ZXZ\Field3[$00] = $38
    XZFD002ZXZ\Field3[$01] = $39
    XZFD002ZXZ\Field3[$02] = $3A
    XZFD002ZXZ\Field3[$03] = $3B
    XZFD002ZXZ\Field4[$00] = $40
    XZFD002ZXZ\Field4[$01] = $41
    XZFD002ZXZ\Field4[$02] = $42
    XZFD002ZXZ\Field5[$00] = $43
    XZFD002ZXZ\Field5[$01] = $44
    XZFD002ZXZ\Field6[$00] = $27
    XZFD002ZXZ\Field6[$01] = $28
    XZFD002ZXZ\Field7[$00] = $26
    XZFD002ZXZ\Field7[$01] = $74
    XZFD002ZXZ\Field2[$00] = $0B
    XZFD002ZXZ\Field2[$01] = $0C
    XZFD002ZXZ\Field2[$02] = $0D
    TX4BX2B62XX = (New XFB46F8ZXB)
    GUESSEDcreateentry_3()
    TXX0BB42DD = "39100"
    TDF046F8Z8 = "127.0.0.1"
    D460D4FZZ[$07] = PackTwoValues($02, $64)
    D460D4FZZ[$12] = PackTwoValues($02, $64)
    D460D4FZZ[$08] = PackTwoValues($04, $64)
    D460D4FZZ[$19] = PackTwoValues($02, $32)
    D460D4FZZ[$10] = PackTwoValues($01, $5DC)
    D460D4FZZ[$0A] = PackTwoValues($28, $3E8)
    D460D4FZZ[$0E] = PackTwoValues($01, $7D0)
    D460D4FZZ[$1A] = PackTwoValues($02, $64)
    D460D4FZZ[$13] = PackTwoValues($01, $FA)
    D460D4FZZ[$1D] = PackTwoValues($02, $FA)
    TDF640ZFFB = GUESSEDupdateentry($20105)
    GUESSEDsetarrayvalue($01, FuncPtr(DF2X840ZX))
    GUESSEDsetarrayvalue($04, FuncPtr(XB6Z0B202F))
    GUESSEDsetarrayvalue($0A, FuncPtr(TX26Z62288))
    GUESSEDsetarrayvalue($07, FuncPtr(YD622ZZ2))
    GUESSEDsetarrayvalue($08, FuncPtr(TXZ4F2DD42D))
    GUESSEDsetarrayvalue($0D, FuncPtr(TZXZB486ZB))
    GUESSEDsetarrayvalue($0E, FuncPtr(TXD6FXD288F))
    GUESSEDsetarrayvalue($10, FuncPtr(XZ06DXDD8F))
    GUESSEDsetarrayvalue($11, FuncPtr(Y0204D644D))
    GUESSEDsetarrayvalue($12, FuncPtr(XBZ68D002X))
    GUESSEDsetarrayvalue($13, FuncPtr(TX8ZF40XX28))
    GUESSEDsetarrayvalue($14, FuncPtr(TXZ804XFB60))
    GUESSEDsetarrayvalue($15, FuncPtr(XD0BXZB688))
    GUESSEDsetarrayvalue($16, FuncPtr(X4X4FFZFXD))
    GUESSEDsetarrayvalue($1D, FuncPtr(TX80FD88F60))
    GUESSEDsetarrayvalue_2($05, FuncPtr(T84XZDDB40))
    GUESSEDsetarrayvalue_2($09, FuncPtr(GUESSEDtxfunc))
    GUESSEDsetarrayvalue_2($06, FuncPtr(T20Z2BDZZD0))
    GUESSEDsetarrayvalue_2($0A, FuncPtr(XD6D4ZF2D0))
    GUESSEDsetarrayvalue_2($0B, FuncPtr(TBDDFF0Z))
    GUESSEDsetarrayvalue_2($0C, FuncPtr(TX4ZXX4F4X6))
    GUESSEDsetarrayvalue_2($0F, FuncPtr(TX0X428X2BB))
    GUESSEDsetarrayvalue_2($12, FuncPtr(X2B0XFFX00))
    GUESSEDsetarrayvalue_2($13, FuncPtr(TX2Z02F0FBX))
    GUESSEDsetarrayvalue_2($15, FuncPtr(D2DXBZB4Z))
    GUESSEDsetarrayvalue_2($17, FuncPtr(X6X80Z28ZZ))
    GUESSEDsetarrayvalue_2($18, FuncPtr(TXD4868Z2XF))
    GUESSEDsetarrayvalue_2($16, FuncPtr(T2406F460F))
    GUESSEDsetarrayvalue_2($19, FuncPtr(TX6ZX0D6FFB))
    GUESSEDsetarrayvalue_2($11, FuncPtr(X02XD4D602))
    GUESSEDsetarrayvalue_2($1B, FuncPtr(XZZFZZ6F86))
    GUESSEDsetarrayvalue_2($14, FuncPtr(TXFD2BD0FZF))
    GUESSEDsetarrayvalue_2($1E, FuncPtr(TX0Z6F8XX60))
    GUESSEDsetarrayvalue_2($1F, FuncPtr(T66B2FFZBZ))
    MP_CreateSession()
    FD020X0BZ = (New Z4ZB80686)
    Y02FXZBDX6 = (T8B628B2BZ + "\Euclid Labs\SCPCB2\Data\servers.jsonc")
    TXFD22D0402 = (New X444F44X0Z)
    MP_LoadMasterServer()
    YXX8D0BX48 = $00
    GUESSEDptrfunc_2()
    T6DX2BF8DB[(($00 + $00) Shr $02)] = $09
    T6DX2BF8DB[(($04 + $00) Shr $02)] = $0E
    T6DX2BF8DB[(($00 + $0C) Shr $02)] = $18
    T6DX2BF8DB[(($04 + $0C) Shr $02)] = $19
    T64Z2260XZ[$04] = $01
    T64Z2260XZ[$05] = $01
    T64Z2260XZ[$08] = $01
    T64Z2260XZ[$09] = $01
    T64Z2260XZ[$0D] = $01
    T64Z2260XZ[$0E] = $01
    T64Z2260XZ[$12] = $01
    T64Z2260XZ[$13] = $01
    GUESSEDreadptr("https://drive.usercontent.google.com/u/0/uc?id=1PJDiU4lylw0fEASB3kHKYW6nWLvJ8TEj&export=download")
    GUESSEDreadptr("https://raw.githubusercontent.com/Ne4to-podobnoe/cbdata/main/playersdata.jsonc")
    GUESSEDcreateentry_2()
    TF442D8X6D = $00
    GUESSEDptrfunc()
    Dim X2ZZZB2806.rooms($00)
    FX06206F0 = Null
    DZ64X028 = (New X6DZX2B4D2)
    FX848D8X0 = $00
    XZB6BXFF02 = (New Y82X62DXF)
    TX84DF6X6B6 = (New YZF00X26)
    T84F6Z402D = (New TX6FF64Z8FF)
    TX6X48DXXDX = $00
    GUESSEDsetentry($00)
    GUESSEDsetentry_2($00, $14)
    GUESSEDsetentry_2($02, $14)
    GUESSEDsetentry_2($03, $14)
    initmainmenuassets()
    mainmenuopen = $01
    resetinput(10.0)
    renderloading(100.0, "", $00, 0.025)
    seterrormsg($00, format(getlocalstring("mperror", "title"), "2.1.5", "%s"))
    seterrormsg($01, getlocalstring("error", "shot"))
    seterrormsg($0C, "Caught exception: _CaughtError_")
    gpuname = converttoutf8(gfxdrivername(opt\Field32))
    Repeat
        seterrormsg($06, (((((("GPU: " + gpuname) + " (") + (Str (Int max((Float (totalvidmem() - availvidmem())), 0.0)))) + "MB/") + (Str totalvidmem())) + " MB)"))
        seterrormsg($07, (((("Global memory status: (" + (Str (opt\Field25 - (availphys() Sar $0A)))) + "MB/") + (Str opt\Field25)) + " MB)"))
        cls()
        GUESSEDinitentry_2()
        millisec = millisecs()
        fps\Field2 = millisec
        local1 = (fps\Field2 - fps\Field6)
        If (((local1 > $00) And (local1 < $1F4)) <> 0) Then
            fps\Field7 = (fps\Field7 + max(0.0, (((Float local1) * 70.0) / 1000.0)))
        EndIf
        fps\Field6 = fps\Field2
        If (0.0 < (Float opt\Field67)) Then
            local2 = (Int ((1000.0 / (Float opt\Field67)) - (Float (millisecs() - fps\Field0))))
            delay(local2)
            fps\Field0 = millisecs()
        EndIf
        fps\Field3[$00] = 1.147541
        fps\Field3[$01] = fps\Field3[$00]
        GUESSEDinputmouse()
        If (mainmenuopen <> 0) Then
            updatemainmenu()
        Else
            updategame()
        EndIf
        If (keyhit(key\Field1) <> 0) Then
            getscreenshot()
        EndIf
        If (opt\Field49 <> 0) Then
            If (fps\Field4 < millisecs()) Then
                fps\Field1 = fps\Field5
                fps\Field5 = $00
                fps\Field4 = (millisecs() + $3E8)
            Else
                fps\Field5 = (fps\Field5 + $01)
            EndIf
        EndIf
        flip((opt\Field16 Lor mainmenuopen))
        MP_Update()
    Forever
    consolereissue = Null
    consoleinbox = $00
    consoleinbar = $00
    T208Z6XX884 = $00
    ZX0F0Z06F = 100.0
End Function

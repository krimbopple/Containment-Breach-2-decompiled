Function nullgame%(arg0%)
    Local local0%
    Local local1.achievementmsg
    Local local2.consolemsg
    Local local3.events
    Local local4.itemtemplates
    Local local5.items
    Local local6.decals
    Local local7.particles
    Local local8.doors
    Local local9.levers
    Local local10.securitycams
    Local local11.dummy1499_1
    Local local12.npcs
    Local local13.screens
    Local local14.waypoints
    Local local15.props
    Local local16.lights
    Local local17.roomtemplates
    Local local18.rooms
    Local local19%
    Local local20.sound
    Local local21.forest
    Local local22.chunk
    Local local23.chunkpart
    Local local24.save
    Local local25.custommaps
    Local local26.soundemitters
    Local local27.template
    Local local28.emitter
    Local local29.TB8DZX8886
    Local local30%
    Local local31.T6068XB4Z2
    Local local32.X4X6Z4D6F2
    Local local33.Y0D6F4BXB0
    Local local34%
    catcherrors("NullGame()")
    XFZ4XXX8D("steam_display", "#mainmenu")
    TBXX4B0X6("", "In main menu", "")
    local0 = $00
    If (X4BX024DX0() <> $00) Then
        FZXXZB468()
        local0 = $01
    EndIf
    TXX4D0XX04X()
    If (mainmenuopen <> 0) Then
        Return $00
    EndIf
    deletetextureentriesfromcache($01)
    stopmousemovement()
    killsounds($00)
    If (XZ0260X8X2\Field61 <> 0) Then
        opt\Field2 = opt\Field5
    EndIf
    If (arg0 <> 0) Then
        playsound_strict(buttonsfx[$00], $00, $00)
    EndIf
    randomseed = ""
    difficultydmgmult = 0.0
    usedconsole = $00
    Delete chs
    chs = Null
    wireframestate = $00
    wireframe($00)
    consoleopen = $00
    consoleinput = ""
    consolescroll = 0.0
    consolescrolldragging = $00
    consolemousemem = $00
    consoler = $00
    consoleg = $00
    consoleb = $00
    consoleinbox = $00
    consoleinbar = $00
    For local2 = Each consolemsg
        Delete local2
    Next
    subjectname = ""
    infacility = $00
    playerfallingpickdistance = 0.0
    toelevatorfloor = $00
    shouldentitiesfall = $00
    hidedistance = 0.0
    coffindistance = 0.0
    camerazoomvalue = 0.0
    secondarylighton = 0.0
    isblackout = $00
    previsblackout = $00
    lightrenderdistance = 0.0
    remotedooron = $00
    gamesaved = $00
    cansave = $00
    mtftimer = 0.0
    mtfcamerachecktimer = 0.0
    mtfcameracheckdetected = $00
    snavunlocked = $00
    ereaderunlocked = $00
    code_dr_maynard = $00
    code_dr_gears = $00
    code_maintenance_tunnels = $00
    T20200F42ZD = $00
    shouldplay = $42
    freeentity(soundemitter)
    soundemitter = $00
    soundtransmission = $00
    templightvolume = 0.0
    lightvolume = 0.0
    grabbedentity = $00
    camerapitch = 0.0
    handentity = $00
    For local30 = $00 To $03 Step $01
        drawarrowicon[local30] = $00
    Next
    batmsgtimer = 0.0
    escapesecondstimer = 0.0
    escapetimer = $00
    If (camera <> $00) Then
        freeentity(camera)
        camera = $00
    EndIf
    If (sky <> $00) Then
        freeentity(sky)
        sky = $00
    EndIf
    If (sky106 <> $00) Then
        freeentity(sky106)
        sky106 = $00
    EndIf
    currtrisamount = $00
    currachvmsgid = $00
    For local1 = Each achievementmsg
        Delete local1
    Next
    For local30 = $00 To $04 Step $01
        If (Y08624XD42\Field1[local30] <> $00) Then
            freeimage(Y08624XD42\Field1[local30])
        EndIf
    Next
    If (subfile <> $00) Then
        Y00DFZDDF6(subfile)
    EndIf
    If (localsubfile <> $00) Then
        Y00DFZDDF6(localsubfile)
    EndIf
    subfile = $00
    localsubfile = $00
    subcolors = $00
    localsubcolors = $00
    subtitlesinit = $00
    clearsubtitles()
    deinitsubtitlesassets()
    Delete msg
    msg = Null
    Delete autosave
    autosave = Null
    freeentity(T8660BZ460\Field9)
    T8660BZ460\Field9 = $00
    Delete T8660BZ460
    T8660BZ460 = Null
    Delete fog
    fog = Null
    Delete BXZDBZ0BB
    BXZDBZ0BB = Null
    Delete i_005
    i_005 = Null
    Delete i_008
    i_008 = Null
    Delete i_009
    i_009 = Null
    Delete i_035
    i_035 = Null
    Delete i_268
    i_268 = Null
    X2B80X0XBB(i_294\Field3)
    i_294\Field3 = $00
    Delete i_294
    i_294 = Null
    Delete i_409
    i_409 = Null
    For local30 = $00 To $01 Step $01
        i_427\Field3[local30] = $00
    Next
    Delete i_427
    i_427 = Null
    Delete i_714
    i_714 = Null
    Delete i_1025
    i_1025 = Null
    If (i_1499\Field4 <> $00) Then
        freeentity(i_1499\Field4)
        i_1499\Field4 = $00
    EndIf
    Delete i_1499
    i_1499 = Null
    scp1499chunks = $00
    Delete i_966
    i_966 = Null
    freesound_strict(i_1123\Field0)
    i_1123\Field0 = $00
    Delete i_1123
    i_1123 = Null
    Delete i_1048a
    i_1048a = Null
    Delete i_2022
    i_2022 = Null
    quickloadpercent = $00
    quickloadpercent_displaytimer = 0.0
    For local3 = Each events
        removeevent(local3)
    Next
    skull_event = Null
    pd_event = Null
    forest_event = Null
    isusingradio = $00
    invopen = $00
    For local30 = $00 To $09 Step $01
        If (local30 < $09) Then
            radiostate[local30] = 0.0
            radiostate2[local30] = $00
        EndIf
        radiostate3[local30] = $00
    Next
    For local31 = Each T6068XB4Z2
        Z0ZB28XFX(local31)
    Next
    maxitemamount = $00
    lastitemid = $00
    For local5 = Each items
        removeitem(local5, $01)
    Next
    FX06206F0 = Null
    Dim TX60DB8XBBZ.items($00)
    For local4 = Each itemtemplates
        removeitemtemplate(local4)
    Next
    For local6 = Each decals
        removedecal(local6)
    Next
    removedecalinstances()
    freeentity(particlepiv)
    particlepiv = $00
    dustparticlechance = $00
    For local28 = Each emitter
        freeemitter(local28, $01)
    Next
    For local27 = Each template
        freetemplate((Handle local27))
    Next
    Delete Each template
    For local7 = Each particles
        removeparticle(local7)
    Next
    removeparticleinstances()
    Delete T20BDD24F02
    T20BDD24F02 = Null
    For local8 = Each doors
        removedoor(local8)
    Next
    d_i\Field13 = $00
    buttondirection = $00
    removedoorinstances()
    For local9 = Each levers
        removelever(local9)
    Next
    removeleverinstances()
    For local10 = Each securitycams
        removesecuritycam(local10)
    Next
    removesecuritycaminstances()
    removemonitorinstances()
    For local13 = Each screens
        removescreen(local13)
    Next
    For local14 = Each waypoints
        removewaypoint(local14)
    Next
    For local15 = Each props
        removeprop(local15)
    Next
    For local16 = Each lights
        removelight(local16)
    Next
    For local29 = Each TB8DZX8886
        B64B6022F(local29)
    Next
    For local26 = Each soundemitters
        removesoundemitter(local26)
    Next
    For local21 = Each forest
        If (local21 <> Null) Then
            destroyforest(local21, $01)
        EndIf
        Delete local21
    Next
    For local30 = $00 To $FFF Step $01
        chunkdata[local30] = $00
    Next
    For local22 = Each chunk
        removechunk(local22)
    Next
    For local23 = Each chunkpart
        removechunkpart(local23)
    Next
    Dim TX62ZBFFBZ4$($00, $00)
    Dim TXD02FZF04Z%($00, $00)
    Delete currmapgrid
    currmapgrid = Null
    Delete i_zone
    i_zone = Null
    roomtempid = $00
    key2_spawnrate = $00
    For local18 = Each rooms
        removeroom(local18)
    Next
    For local17 = Each roomtemplates
        removeroomtemplate(local17)
    Next
    For local32 = Each X4X6Z4D6F2
        A0ZX420ZF(local32)
    Next
    For local33 = Each Y0D6F4BXB0
        Y2BB0D66(local33)
    Next
    XZ0260X8X2\Field74 = $00
    XZ0260X8X2\Field28 = $00
    Delete Y08624XD42
    Y08624XD42 = Null
    Delete XZ0260X8X2
    XZ0260X8X2 = Null
    removehazmattimer = 0.0
    remove714timer = 0.0
    forestnpc = $00
    forestnpctex = $00
    For local30 = $00 To $02 Step $01
        forestnpcdata[local30] = 0.0
    Next
    For local11 = Each dummy1499_1
        removedummy1499_1(local11)
    Next
    For local12 = Each npcs
        removenpc(local12)
    Next
    removenpcinstances()
    removemiscinstances()
    Delete Each T82BBBXXXD
    Delete Each materials
    removetextureinstances()
    Delete Each textureincache
    ambientlightroomtex = $00
    freetexture(missingtexture)
    missingtexture = $00
    mesh_minx = 0.0
    mesh_miny = 0.0
    mesh_minz = 0.0
    mesh_maxx = 0.0
    mesh_maxy = 0.0
    mesh_maxz = 0.0
    mesh_magx = 0.0
    mesh_magy = 0.0
    mesh_magz = 0.0
    mesh_midx = 0.0
    mesh_midy = 0.0
    mesh_midz = 0.0
    initializeintromovie = $00
    For local30 = $00 To $18 Step $01
        commotionstate[local30] = $00
    Next
    currambientsfx = $00
    tempsoundindex = $00
    For local20 = Each sound
        If (local20\Field0 <> $00) Then
            FreeSound(local20\Field0)
            local20\Field0 = $00
        EndIf
        Delete local20
    Next
    removesoundinstances()
    D6X206XX()
    T8X020B22Z()
    For local24 = Each save
        Delete local24
    Next
    For local25 = Each custommaps
        Delete local25
    Next
    TX0B44ZFXDZ()
    freeblur()
    local34 = $00
    rendertween = 0.0
    T208Z6XX884 = $00
    clearcollisions()
    clearworld($01, $01, $00)
    resettimingaccumulator()
    initfastresize()
    selectedinputbox = $00
    shoulddeletegadgets = $01
    deletemenugadgets()
    initmainmenuassets()
    menuopen = $00
    Delete igm
    igm = Null
    mainmenuopen = $01
    T42DZ064FB\Field0 = $00
    If (local0 <> 0) Then
        T42DZ064FB\Field0 = $01
    EndIf
    catcherrors("Uncaught: NullGame()")
    Return $00
End Function

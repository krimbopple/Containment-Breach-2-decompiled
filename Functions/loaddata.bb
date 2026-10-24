Function loaddata%()
    Local local0$
    
    subfile = eax_0007
    localsubfile = X22X8B6X80((lang\Field0 + "Data\subtitles.jsonc"))
    subcolors = TX0Z2Z4F86D(subfile, "colors")
    localsubcolors = TX0Z2Z4F86D(localsubfile, "colors")
    subtitlesinit = $01
    If (scp1499chunksdoc <> $00) Then
        Y00DFZDDF6(scp1499chunksdoc)
    EndIf
    
    scp1499chunksdoc = eax_0026
    scp1499chunks = TD4644B68Z(scp1499chunksdoc)
    subjectname = getlocalstring("misc", "subject")
    playerfallingpickdistance = 10.0
    camerazoomvalue = tan(((atan((tan((opt\Field15 / 2.0)) * (graphicwidthfloat / graphicheightfloat))) * 2.0) / 2.0))
    collisions($02, $01, $02)
    collisions($02, $07, $02)
    collisions($02, $02, $03)
    collisions($03, $01, $02)
    collisions($03, $07, $02)
    collisions($03, $03, $02)
    collisions($04, $04, $02)
    collisions($05, $01, $02)
    collisions($05, $07, $02)
    collisions($06, $01, $02)
    collisions($06, $02, $03)
    collisions($06, $06, $03)
    collisions($08, $01, $02)
    collisions($08, $07, $02)
    collisions($08, $09, $02)
    loadroomtemplates("Data\rooms.ini")
    Select selecteddifficulty\Field8
        Case $00
            difficultydmgmult = 1.0
        Case $01
            difficultydmgmult = 1.15
        Case $02
            difficultydmgmult = 1.3
        Case $03
            difficultydmgmult = 1.45
    End Select
    shouldentitiesfall = $01
    hidedistance = 17.0
    coffindistance = 100.0
    quickloadpercent = $FFFFFFFF
    escapesecondstimer = 70.0
    chs = (New cheats)
    XZ0260X8X2 = (New player)
    T8660BZ460 = (New wearableitems)
    fog = (New fogambient)
    BXZDBZ0BB = (New XB64FDZ26Z)
    Y08624XD42 = (New T28FZD4DX0)
    i_005 = (New scp005)
    i_008 = (New scp008)
    i_009 = (New scp009)
    i_035 = (New scp035)
    i_268 = (New scp268)
    i_294 = (New scp294)
    init294drinks()
    i_409 = (New scp409)
    i_427 = (New scp427)
    i_714 = (New scp714)
    i_1025 = (New scp1025)
    i_1499 = (New scp1499)
    i_966 = (New scp966)
    i_1123 = (New scp1123)
    i_1048a = (New scp1048a)
    i_2022 = (New scp2022)
    autosave = (New TXD246F8B0)
    msg = (New messages)
    i_zone = (New mapzones)
    T20BDD24F02 = (New brokendoor)
    initachievements()
    loadachievementsfile()
    igm = (New ingamemenu)
    X2Z260BF0Z = (New textures)
    Return $00
End Function

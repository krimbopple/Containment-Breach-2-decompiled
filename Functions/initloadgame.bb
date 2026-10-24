Function initloadgame%()
    Local local0.doors
    Local local1.securitycams
    Local local2.roomtemplates
    Local local3.events
    Local local4%
    Local local5%
    Local local6#
    Local local7#
    Local local8#
    Local local9%
    Local local10.tempscreens
    Local local11.tempwaypoints
    Local local12.templights
    Local local13.tempprops
    Local local14.tempsoundemitters
    Local local15.TFFD0Z88DZ
    Local local16.chunk
    catcherrors("InitLoadGame()")
    XFZ4XXX8D("steam_display", "#loading")
    TBXX4B0X6("", "Loading", "")
    initotherstuff()
    loadwaypoints($37, $55)
    For local0 = Each doors
        entityparent(local0\Field0, $00, $01)
        If (local0\Field7 <> $00) Then
            entityparent(local0\Field7, $00, $01)
        EndIf
        If (local0\Field51 <> $00) Then
            entityparent(local0\Field51, $00, $01)
        EndIf
        For local5 = $00 To $01 Step $01
            If (local0\Field40[local5] <> $00) Then
                entityparent(local0\Field40[local5], $00, $01)
            EndIf
            If (local0\Field24[local5] <> $00) Then
                entityparent(local0\Field24[local5], $00, $01)
            EndIf
        Next
    Next
    For local1 = Each securitycams
        entityparent(local1\Field0, $00, $01)
        If (local1\Field15 <> $00) Then
            entityparent(local1\Field15, $00, $01)
        EndIf
    Next
    For local2 = Each roomtemplates
        freeentity(local2\Field0)
        local2\Field0 = $00
    Next
    For local10 = Each tempscreens
        Delete local10
    Next
    For local11 = Each tempwaypoints
        Delete local11
    Next
    For local12 = Each templights
        Delete local12
    Next
    For local13 = Each tempprops
        Delete local13
    Next
    For local14 = Each tempsoundemitters
        Delete local14
    Next
    For local15 = Each TFFD0Z88DZ
        Delete local15
    Next
    renderloading(85.0, getlocalstring("loading", "events"), $00, 0.025)
    For local3 = Each events
        If (local3\Field32 = $4C) Then
            If (2.0 = local3\Field4) Then
                local3\Field19\Field27[$00] = loadmesh_strict("GFX\Map\dimension1499\1499plane.b3d", $00, $01)
                hideentity(local3\Field19\Field27[$00])
                local3\Field19\Field30[$00] = $01
                i_1499\Field4 = createsky("GFX\Map\Textures\1499sky", $00)
                For local5 = $01 To $0F Step $01
                    local3\Field19\Field27[local5] = loadrmesh((("GFX\Map\dimension1499\dimension_1499_object(" + (Str local5)) + ").rmesh"), Null, $00)
                    scaleentity(local3\Field19\Field27[local5], (1.0 / 256.0), (1.0 / 256.0), (1.0 / 256.0), $00)
                    hideentity(local3\Field19\Field27[local5])
                Next
                createchunkparts(local3\Field19)
                local6 = entityx(local3\Field19\Field15, $00, 1.0)
                local7 = entityy(local3\Field19\Field15, $00, 1.0)
                local8 = entityz(local3\Field19\Field15, $00, 1.0)
                For local5 = $FFFFFFFE To $00 Step $02
                    local16 = createchunk(local3\Field19, $FFFFFFFF, (((Float local5) * 2.5) * local6), local7, local8, $01)
                    local16 = createchunk(local3\Field19, $FFFFFFFF, (((Float local5) * 2.5) * local6), local7, (local8 - 40.0), $01)
                Next
            EndIf
            Exit
        EndIf
    Next
    renderloading(90.0, getlocalstring("loading", "pos"), $00, 0.025)
    mainmenuopen = $00
    clearunusedtextures()
    resetentity(XZ0260X8X2\Field74)
    movemouse(TDD0Z6BXB6\Field6, TDD0Z6BXB6\Field9)
    setfontex(XD00026ZX2\Field0[$00])
    hidepointer()
    XZ0260X8X2\Field16 = 0.0
    resetrender()
    updatenpcs()
    updateworld(1.0, 0.0)
    deletetextureentriesfromcache($00)
    renderloading(100.0, "", $00, 0.025)
    fps\Field3[$00] = 0.0
    fps\Field6 = millisecs()
    resetinput(10.0)
    T8X2046020\Field4 = $01
    XFZ4XXX8D("steam_display", "#playing")
    TBXX4B0X6("", "Playing", "")
    catcherrors("Uncaught: InitLoadGame()")
    Return $00
End Function

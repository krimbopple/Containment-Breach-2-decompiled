Function savegame%(arg0$)
    Local local0%
    Local local1.npcs
    Local local2.rooms
    Local local3.doors
    Local local4.emitter
    Local local5%
    Local local6%
    Local local7%
    Local local8%
    Local local9%
    Local local10%
    Local local11$
    Local local12.decals
    Local local13.events
    Local local14.items
    Local local15%
    Local local16.itemtemplates
    Local local17.securitycams
    Local local18.screens
    If ((XZ0260X8X2\Field23 Lor (Int XZ0260X8X2\Field48)) <> 0) Then
        Return $00
    EndIf
    If ((((fps\Field3[$00] * 0.02) < XZ0260X8X2\Field16) Lor ((fps\Field3[$00] * -0.02) > XZ0260X8X2\Field16)) <> 0) Then
        Return $00
    EndIf
    catcherrors((("SaveGame(" + arg0) + ")"))
    arg0 = ("Saves\" + arg0)
    createdir(arg0)
    local0 = writefile((arg0 + "\save.cb"))
    If (local0 = $00) Then
        Return $00
    EndIf
    gamesaved = $01
    writestring(local0, currenttime())
    writestring(local0, currentdate())
    writestring(local0, "2.1.5")
    If (selectedcustommap = Null) Then
        writebyte(local0, $00)
        writestring(local0, randomseed)
    Else
        writebyte(local0, $01)
        writestring(local0, selectedcustommap\Field0)
    EndIf
    writestring(local0, selecteddifficulty\Field7)
    writeint(local0, code_dr_maynard)
    writeint(local0, T20200F42ZD)
    writeint(local0, code_maintenance_tunnels)
    writeint(local0, code_dr_gears)
    writefloat(local0, entityx(XZ0260X8X2\Field74, $00, 1.0))
    writefloat(local0, entityy(XZ0260X8X2\Field74, $00, 1.0))
    writefloat(local0, entityz(XZ0260X8X2\Field74, $00, 1.0))
    writefloat(local0, entityx(XZ0260X8X2\Field28, $00, 1.0))
    writefloat(local0, entityy(XZ0260X8X2\Field28, $00, 1.0))
    writefloat(local0, entityz(XZ0260X8X2\Field28, $00, 1.0))
    writefloat(local0, entitypitch(XZ0260X8X2\Field74, $00, 1.0))
    writefloat(local0, entityyaw(XZ0260X8X2\Field74, $00, 1.0))
    writefloat(local0, XZ0260X8X2\Field53)
    writefloat(local0, XZ0260X8X2\Field12)
    writefloat(local0, XZ0260X8X2\Field7)
    writefloat(local0, XZ0260X8X2\Field30)
    writefloat(local0, XZ0260X8X2\Field64)
    writefloat(local0, XZ0260X8X2\Field45)
    writebyte(local0, XZ0260X8X2\Field25)
    writefloat(local0, XZ0260X8X2\Field56)
    writefloat(local0, XZ0260X8X2\Field65)
    writefloat(local0, XZ0260X8X2\Field34)
    writefloat(local0, XZ0260X8X2\Field43)
    writefloat(local0, XZ0260X8X2\Field70)
    writefloat(local0, XZ0260X8X2\Field11)
    writefloat(local0, XZ0260X8X2\Field39)
    writefloat(local0, XZ0260X8X2\Field20)
    writefloat(local0, XZ0260X8X2\Field73)
    writestring(local0, msg\Field8)
    writeint(local0, XZ0260X8X2\Field44)
    writebyte(local0, XZ0260X8X2\Field63)
    writefloat(local0, XZ0260X8X2\Field82)
    writebyte(local0, XZ0260X8X2\Field37)
    writefloat(local0, XZ0260X8X2\Field60)
    writefloat(local0, XZ0260X8X2\Field1)
    writefloat(local0, XZ0260X8X2\Field14)
    writefloat(local0, XZ0260X8X2\Field8)
    writefloat(local0, XZ0260X8X2\Field78)
    writefloat(local0, XZ0260X8X2\Field42)
    writeint(local0, XZ0260X8X2\Field80)
    writefloat(local0, i_2022\Field0)
    writefloat(local0, i_2022\Field1)
    writebyte(local0, i_005\Field0)
    For local7 = $00 To $06 Step $01
        writefloat(local0, i_1025\Field0[local7])
    Next
    For local7 = $00 To $04 Step $01
        writefloat(local0, i_1025\Field1[local7])
    Next
    writefloat(local0, i_008\Field0)
    writebyte(local0, i_008\Field1)
    writefloat(local0, i_009\Field0)
    writebyte(local0, i_009\Field1)
    writefloat(local0, i_409\Field0)
    writebyte(local0, i_409\Field1)
    writebyte(local0, i_035\Field0)
    For local7 = $00 To $04 Step $01
        If (selecteddifficulty = difficulties[local7]) Then
            writebyte(local0, local7)
            If (local7 = $04) Then
                writebyte(local0, selecteddifficulty\Field2)
                writebyte(local0, selecteddifficulty\Field1)
                writebyte(local0, selecteddifficulty\Field8)
                writebyte(local0, selecteddifficulty\Field4)
            EndIf
        EndIf
    Next
    writefloat(local0, T8660BZ460\Field0)
    writebyte(local0, T8660BZ460\Field3)
    writebyte(local0, T8660BZ460\Field6)
    writebyte(local0, T8660BZ460\Field7)
    writebyte(local0, T8660BZ460\Field10)
    writebyte(local0, T8660BZ460\Field8)
    writebyte(local0, T8660BZ460\Field11)
    writebyte(local0, T8660BZ460\Field4)
    writebyte(local0, i_1499\Field8)
    writefloat(local0, i_1499\Field1)
    writefloat(local0, i_1499\Field3)
    writefloat(local0, i_1499\Field6)
    writefloat(local0, i_1499\Field5)
    writefloat(local0, i_1499\Field0)
    writefloat(local0, i_1499\Field7)
    If (i_1499\Field2 <> Null) Then
        writefloat(local0, i_1499\Field2\Field40)
        writefloat(local0, i_1499\Field2\Field37)
    Else
        writefloat(local0, 0.0)
        writefloat(local0, 0.0)
    EndIf
    writefloat(local0, i_966\Field1)
    writefloat(local0, i_966\Field0)
    writefloat(local0, i_1048a\Field2)
    writebyte(local0, i_1048a\Field1)
    writebyte(local0, i_268\Field2)
    writefloat(local0, i_268\Field1)
    writebyte(local0, i_427\Field2)
    writefloat(local0, i_427\Field1)
    writebyte(local0, i_714\Field0)
    writebyte(local0, i_294\Field4)
    writestring(local0, randomseed)
    writefloat(local0, secondarylighton)
    writefloat(local0, lightvolume)
    writebyte(local0, isblackout)
    writebyte(local0, previsblackout)
    writebyte(local0, remotedooron)
    writebyte(local0, soundtransmission)
    writebyte(local0, key2_spawnrate)
    local9 = TD4644B68Z(TX0Z2Z4F86D(achievementsarray, "achievements"))
    local10 = TD0DFDZ4XX(local9)
    For local7 = $00 To (local10 - $01) Step $01
        local11 = TX240XXB6Z6(TX0Z2Z4F86D(D8XX4X0D0(local9, local7), "id"))
        If (TX6ZD06226X(unlockedachievements, local11) <> 0) Then
            writestring(local0, local11)
        EndIf
    Next
    writestring(local0, "EOA")
    writebyte(local0, usedconsole)
    writefloat(local0, mtftimer)
    writefloat(local0, remove714timer)
    writefloat(local0, removehazmattimer)
    For local5 = $00 To X824BX6D68 Step $01
        For local6 = $00 To X824BX6D68 Step $01
            writebyte(local0, currmapgrid\Field4[((local6 * X824BX6D68) + local5)])
            writebyte(local0, currmapgrid\Field0[((local6 * X824BX6D68) + local5)])
        Next
    Next
    writeint(local0, $71)
    local8 = $00
    For local1 = Each npcs
        local8 = (local8 + $01)
    Next
    writeint(local0, local8)
    For local1 = Each npcs
        writebyte(local0, local1\Field77)
        writefloat(local0, entityx(local1\Field82, $01, 1.0))
        writefloat(local0, entityy(local1\Field82, $01, 1.0))
        writefloat(local0, entityz(local1\Field82, $01, 1.0))
        writefloat(local0, entitypitch(local1\Field82, $00, 1.0))
        writefloat(local0, entityyaw(local1\Field82, $00, 1.0))
        writefloat(local0, entityroll(local1\Field82, $00, 1.0))
        writefloat(local0, local1\Field66)
        writefloat(local0, local1\Field65)
        writefloat(local0, local1\Field57)
        writeint(local0, local1\Field13)
        writebyte(local0, (Int local1\Field31))
        writefloat(local0, local1\Field38)
        writeint(local0, local1\Field17)
        writefloat(local0, local1\Field64)
        writefloat(local0, local1\Field84)
        writefloat(local0, local1\Field62)
        writefloat(local0, local1\Field34)
        writeint(local0, local1\Field56)
        If (local1\Field59 <> Null) Then
            writeint(local0, local1\Field59\Field56)
        Else
            writeint(local0, $00)
        EndIf
        writefloat(local0, local1\Field60)
        writefloat(local0, local1\Field61)
        writefloat(local0, local1\Field74)
        writestring(local0, local1\Field26)
        writebyte(local0, local1\Field79)
        writebyte(local0, local1\Field36)
        If (local1\Field36 <> 0) Then
            writefloat(local0, animtime(local1\Field98))
        EndIf
        writebyte(local0, local1\Field93)
        writebyte(local0, local1\Field1)
        writeint(local0, local1\Field4)
        writefloat(local0, local1\Field83)
        writebyte(local0, local1\Field29)
        writebyte(local0, local1\Field22)
        writebyte(local0, local1\Field73)
        If (local1\Field77 = $18) Then
            writebyte(local0, (((n_i\Field11 = local1) Shl $01) + (n_i\Field13 = local1)))
        EndIf
    Next
    writeint(local0, $278)
    writebyte(local0, i_zone\Field1[$00])
    writebyte(local0, i_zone\Field1[$01])
    writebyte(local0, i_zone\Field0)
    local8 = $00
    For local2 = Each rooms
        local8 = (local8 + $01)
    Next
    writeint(local0, local8)
    For local2 = Each rooms
        writeint(local0, local2\Field22\Field7)
        writeint(local0, local2\Field21)
        writefloat(local0, local2\Field40)
        writefloat(local0, local2\Field3)
        writefloat(local0, local2\Field37)
        writebyte(local0, local2\Field7)
        writeint(local0, local2\Field0)
        writebyte(local0, (playerroom = local2))
        For local7 = $00 To $0F Step $01
            If (local2\Field32[local7] = Null) Then
                writeint(local0, $00)
            Else
                writeint(local0, local2\Field32[local7]\Field56)
            EndIf
        Next
        For local7 = $00 To $03 Step $01
            If (local2\Field9[local7] = Null) Then
                writebyte(local0, $02)
            Else
                writebyte(local0, (0.0 >= entitypitch(local2\Field9[local7]\Field1, $01, 1.0)))
            EndIf
        Next
        If (local2\Field13 = Null) Then
            writebyte(local0, $00)
        Else
            If (i_zone\Field0 <> 0) Then
                writebyte(local0, $02)
            Else
                writebyte(local0, $01)
            EndIf
            For local6 = $00 To $09 Step $01
                For local5 = $00 To $09 Step $01
                    writebyte(local0, local2\Field13\Field5[((local6 * $0A) + local5)])
                Next
            Next
            writefloat(local0, entityx(local2\Field13\Field4, $01, 1.0))
            writefloat(local0, entityy(local2\Field13\Field4, $01, 1.0))
            writefloat(local0, entityz(local2\Field13\Field4, $01, 1.0))
        EndIf
    Next
    writeint(local0, $3BA)
    local8 = $00
    For local4 = Each emitter
        local8 = (local8 + $01)
    Next
    writeint(local0, local8)
    For local4 = Each emitter
        writefloat(local0, entityx(local4\Field2, $01, 1.0))
        writefloat(local0, entityy(local4\Field2, $01, 1.0))
        writefloat(local0, entityz(local4\Field2, $01, 1.0))
        writeint(local0, local4\Field11)
        writebyte(local0, local4\Field7)
        writeint(local0, local4\Field0)
    Next
    For local2 = Each rooms
        For local7 = $00 To $07 Step $01
            If (local2\Field17[local7] = Null) Then
                writeint(local0, $00)
            Else
                writeint(local0, local2\Field17[local7]\Field0)
            EndIf
        Next
    Next
    writebyte(local0, T20BDD24F02\Field0)
    writefloat(local0, T20BDD24F02\Field2)
    writefloat(local0, T20BDD24F02\Field1)
    local8 = $00
    For local3 = Each doors
        local8 = (local8 + $01)
    Next
    writeint(local0, local8)
    For local3 = Each doors
        writefloat(local0, entityx(local3\Field51, $01, 1.0))
        writefloat(local0, entityy(local3\Field51, $01, 1.0))
        writefloat(local0, entityz(local3\Field51, $01, 1.0))
        writebyte(local0, local3\Field39)
        writefloat(local0, local3\Field13)
        writebyte(local0, local3\Field21)
        writebyte(local0, local3\Field10)
        writefloat(local0, entityx(local3\Field0, $01, 1.0))
        writefloat(local0, entityz(local3\Field0, $01, 1.0))
        writefloat(local0, entityyaw(local3\Field0, $01, 1.0))
        If (local3\Field7 <> $00) Then
            writefloat(local0, entityx(local3\Field7, $01, 1.0))
            writefloat(local0, entityz(local3\Field7, $01, 1.0))
        Else
            writefloat(local0, 0.0)
            writefloat(local0, 0.0)
        EndIf
        writefloat(local0, (Float local3\Field33))
        writefloat(local0, local3\Field9)
        writebyte(local0, local3\Field19)
        writebyte(local0, local3\Field47)
        writebyte(local0, local3\Field5)
        writebyte(local0, local3\Field38)
        writebyte(local0, (Int local3\Field54))
    Next
    writeint(local0, $735)
    local8 = $00
    For local12 = Each decals
        local8 = (local8 + $01)
    Next
    writeint(local0, local8)
    For local12 = Each decals
        writeint(local0, local12\Field7)
        writefloat(local0, entityx(local12\Field0, $01, 1.0))
        writefloat(local0, entityy(local12\Field0, $01, 1.0))
        writefloat(local0, entityz(local12\Field0, $01, 1.0))
        writefloat(local0, entitypitch(local12\Field0, $01, 1.0))
        writefloat(local0, entityyaw(local12\Field0, $01, 1.0))
        writefloat(local0, entityroll(local12\Field0, $01, 1.0))
        writefloat(local0, local12\Field9)
        writefloat(local0, local12\Field3)
        writefloat(local0, local12\Field12)
        writebyte(local0, local12\Field6)
        writebyte(local0, local12\Field10)
        writebyte(local0, local12\Field8)
        writebyte(local0, local12\Field13)
        writebyte(local0, local12\Field11)
        writefloat(local0, local12\Field1)
        writefloat(local0, local12\Field2)
        writefloat(local0, local12\Field14)
        writefloat(local0, local12\Field5)
        writebyte(local0, (XZ6DBZD4ZD = local12))
    Next
    local8 = $00
    For local13 = Each events
        local8 = (local8 + $01)
    Next
    writeint(local0, local8)
    For local13 = Each events
        writebyte(local0, local13\Field32)
        writefloat(local0, local13\Field4)
        writefloat(local0, local13\Field7)
        writefloat(local0, local13\Field1)
        writefloat(local0, local13\Field23)
        writefloat(local0, entityx(local13\Field19\Field15, $00, 1.0))
        writefloat(local0, entityz(local13\Field19\Field15, $00, 1.0))
        writestring(local0, local13\Field9)
    Next
    local8 = $00
    For local14 = Each items
        local8 = (local8 + $01)
    Next
    writeint(local0, local8)
    For local14 = Each items
        writestring(local0, local14\Field6\Field19)
        writeint(local0, local14\Field6\Field9)
        writestring(local0, local14\Field19)
        writestring(local0, local14\Field24)
        writefloat(local0, entityx(local14\Field9, $01, 1.0))
        writefloat(local0, entityy(local14\Field9, $01, 1.0))
        writefloat(local0, entityz(local14\Field9, $01, 1.0))
        writebyte(local0, local14\Field16)
        writebyte(local0, local14\Field14)
        writebyte(local0, local14\Field38)
        writefloat(local0, local14\Field1)
        writefloat(local0, entitypitch(local14\Field9, $00, 1.0))
        writefloat(local0, entityyaw(local14\Field9, $00, 1.0))
        writefloat(local0, local14\Field15)
        writefloat(local0, local14\Field3)
        writefloat(local0, local14\Field39)
        writebyte(local0, local14\Field17)
        writebyte(local0, (selecteditem = local14))
        local15 = $00
        For local7 = $00 To (maxitemamount - $01) Step $01
            If (TX60DB8XBBZ(local7) = local14) Then
                local15 = $01
                Exit
            EndIf
        Next
        If (local15 <> 0) Then
            writebyte(local0, local7)
        Else
            writebyte(local0, $42)
        EndIf
        If (local14\Field6\Field20 <> 0) Then
            writefloat(local0, animtime(local14\Field5))
        EndIf
        writebyte(local0, local14\Field36)
        writeint(local0, local14\Field27)
        writebyte(local0, (local14\Field6\Field14 <> local14\Field20))
    Next
    local8 = $00
    For local14 = Each items
        If (local14\Field36 > $00) Then
            local8 = (local8 + $01)
        EndIf
    Next
    writeint(local0, local8)
    For local14 = Each items
        If (local14\Field36 > $00) Then
            writeint(local0, local14\Field27)
            For local7 = $00 To (local14\Field36 - $01) Step $01
                If (local14\Field8[local7] <> Null) Then
                    writeint(local0, local14\Field8[local7]\Field27)
                Else
                    writeint(local0, $FFFFFFFF)
                EndIf
            Next
        EndIf
    Next
    For local14 = Each items
        If ((((local14\Field6\Field9 = $4D) Lor (local14\Field6\Field9 = $4E)) Lor (local14\Field6\Field9 = $4F)) <> 0) Then
            writebyte(local0, local14\Field32)
            For local7 = $01 To local14\Field32 Step $01
                writestring(local0, local14\Field0[local7]\Field19)
            Next
        EndIf
    Next
    For local16 = Each itemtemplates
        writebyte(local0, local16\Field6)
    Next
    For local4 = Each emitter
        For local2 = Each rooms
            writebyte(local0, (local4\Field14 = local2))
        Next
    Next
    writeint(local0, escapetimer)
    For local17 = Each securitycams
        writebyte(local0, local17\Field2)
        writeint(local0, local17\Field1)
    Next
    local8 = $00
    For local14 = Each items
        local8 = (local8 + $01)
    Next
    writeint(local0, local8)
    For local14 = Each items
        writeint(local0, local14\Field27)
        writeint(local0, local14\Field18)
    Next
    For local18 = Each screens
        writebyte(local0, local18\Field9)
        writefloat(local0, local18\Field1)
    Next
    closefile(local0)
    If (selecteddifficulty\Field1 = $01) Then
        playsound_strict(loadtempsound("SFX\General\Save1.ogg"), $00, $00)
    Else
        playsound_strict(loadtempsound("SFX\General\Save0.ogg"), $00, $00)
        autosave\Field0 = 4200.0
    EndIf
    createhintmsg(getlocalstring("save", "saved"), 6.0, $00)
    catcherrors((("Uncaught: SaveGame(" + arg0) + ")"))
    Return $00
End Function

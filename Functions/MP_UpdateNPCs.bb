Function MP_UpdateNPCs%()
    Local local0.npcs
    Local local1.rooms
    Local local2%
    Local local3#
    Local local4%
    Local local5%
    Local local7%
    Local local8.decals
    Local local9%
    Local local10#
    Local local11%
    Local local12%
    Local local13%
    Local local14%
    Local local15%
    catcherrors("MP_UpdateNPCs()")
    If (((GUESSEDupdateanimatenpc() = $00) And ((GUESSEDsetglobal_17() = $00) Lor (GUESSEDgetglobal_16() = $00))) <> 0) Then
        Return $00
    EndIf
    local1 = playerroom
    local2 = XZ0260X8X2\Field74
    local3 = XZ0260X8X2\Field68
    local4 = chs\Field8
    For local0 = Each npcs
        If (((local0\Field50 = $00) And T8X2046020\Field0) <> 0) Then
            removenpc(local0)
        Else
            local0\Field24 = isinfacility(entityy(local0\Field82, $00, 1.0))
            If ((((local0\Field47 < GUESSEDupdateitems_2()) Lor (local0\Field28 = Null)) Lor ((local0\Field28 <> Null) And entityhidden(local0\Field28\Field52))) <> 0) Then
                local0\Field28 = GUESSEDcheckvalue_25(local0)
                If (local0\Field28 = Null) Then
                    local0\Field28 = TXXF6F02DB2[GUESSEDupdatedropitem()]
                EndIf
                local0\Field47 = (GUESSEDupdateitems_2() + $7D0)
            EndIf
            playerroom = local1
            XZ0260X8X2\Field74 = local2
            XZ0260X8X2\Field68 = local3
            chs\Field8 = $01
            local0\Field5 = $01
            If ((((local0\Field28 <> Null) And (entityhidden(local0\Field28\Field52) = $00)) And (XXDB6F64F2[local0\Field28\Field3] <> Null)) <> 0) Then
                chs\Field8 = local4
                playerroom = XXDB6F64F2[local0\Field28\Field3]
                XZ0260X8X2\Field74 = local0\Field28\Field52
                XZ0260X8X2\Field68 = local0\Field28\Field45
                local0\Field5 = (local0\Field28 = TXXF6F02DB2[GUESSEDupdatedropitem()])
            EndIf
            CB64D8DZF = local0\Field28
            GUESSEDpositionentity_6(local0)
            
            If ((((T8660BZ460\Field2 > $00) And (T8660BZ460\Field8 = $02)) And (0.0 >= T8660BZ460\Field1)) <> 0) Then
                local0\Field100 = entityx(local0\Field82, $01, 1.0)
                local0\Field14 = entityy(local0\Field82, $01, 1.0)
                local0\Field97 = entityz(local0\Field82, $01, 1.0)
            EndIf
            If (local0\Field1 <> 0) Then
                If (1.0 = local0\Field42) Then
                    entitytype(local0\Field82, $05, $00)
                    local5 = $00
                    Select local0\Field77
                        Case $02
                            If (548.9 < local0\Field103) Then
                                local7 = createpivot($00)
                                positionentity(local7, entityx(local0\Field82, $00, 1.0), entityy(local0\Field82, $00, 1.0), entityz(local0\Field82, $00, 1.0), $00)
                                turnentity(local7, 90.0, 0.0, 0.0, $00)
                                If (entitypick(local7, 0.5) <> 0) Then
                                    local8 = createdecal($01, entityx(local0\Field82, $00, 1.0), (pickedy() + 0.005), entityz(local0\Field82, $00, 1.0), 90.0, rnd(360.0, 0.0), 0.0, 0.5, 1.0, $00, $01, $00, $00, $00)
                                    local8\Field14 = 0.0005
                                    local8\Field3 = 0.2
                                    local8\Field14 = -0.0001
                                    entityparent(local8\Field0, playerroom\Field15, $01)
                                EndIf
                                freeentity(local7)
                                local7 = $00
                                playsoundex(loadtempsound("SFX\Room\PocketDimension\Impact.ogg"), camera, local0\Field82, 4.0, 0.8, $00, $00)
                                hideentity(local0\Field82)
                                hideentity(local0\Field98)
                                local5 = $01
                                local0\Field42 = 0.0
                            EndIf
                        Case $11,$15
                            hideentity(local0\Field82)
                            hideentity(local0\Field98)
                            local5 = $01
                            local0\Field22 = $01
                            local0\Field42 = 0.0
                        Case $17
                            local0\Field99 = createpivot(findchild(local0\Field98, "Thumb01.R.001"))
                            entityradius(local0\Field99, 0.35, 0.0)
                            entitypickmode(local0\Field99, $01, $00)
                            local5 = $01
                            local0\Field59 = Null
                            local0\Field9 = -1.0
                            local0\Field42 = 0.0
                        Default
                            local5 = $01
                            local0\Field59 = Null
                            local0\Field9 = -1.0
                            local0\Field42 = 0.0
                    End Select
                    If (local5 <> 0) Then
                        If (ChannelPlaying(local0\Field63) <> 0) Then
                            StopChannel(local0\Field63)
                            local0\Field63 = $00
                        EndIf
                        If (local0\Field55 <> $00) Then
                            freesound_strict(local0\Field55)
                            local0\Field55 = $00
                        EndIf
                        If (ChannelPlaying(local0\Field6) <> 0) Then
                            StopChannel(local0\Field6)
                            local0\Field6 = $00
                        EndIf
                        If (local0\Field67 <> $00) Then
                            freesound_strict(local0\Field67)
                            local0\Field67 = $00
                        EndIf
                    EndIf
                EndIf
                If (local0\Field77 = $17) Then
                    If (local0\Field99 <> $00) Then
                        If (1.0 > entitydistancesquared(local0\Field99, GUESSEDgetsetnpcframe())) Then
                            If (entitypick(camera, 1.0) = local0\Field99) Then
                                handentity = local0\Field99
                                If (XZ0260X8X2\Field3 <> 0) Then
                                    local9 = rand($05, $01)
                                    If (playerroom\Field22\Field7 = $57) Then
                                        local9 = $06
                                    EndIf
                                    createmsg(getlocalstring("msg", ("pickup.wpn_" + (Str local9))), 6.0)
                                    handentity = $00
                                    freeentity(local0\Field99)
                                    local0\Field99 = $00
                                EndIf
                            EndIf
                        EndIf
                    EndIf
                EndIf
            Else
                local10 = entitydistancesquared(XZ0260X8X2\Field74, local0\Field82)
                If ((((100.0 > local10) Lor (local0\Field77 = $12)) And (local0\Field24 = isinfacility(entityy(XZ0260X8X2\Field74, $00, 1.0)))) <> 0) Then
                    local12 = $00
                    local13 = countcollisions(local0\Field82)
                    For local14 = $01 To local13 Step $01
                        If (collisiony(local0\Field82, local14) < (entityy(local0\Field82, $00, 1.0) - 0.01)) Then
                            local12 = $01
                            Exit
                        EndIf
                    Next
                    If ((local12 Lor (shouldentitiesfall = $00)) <> 0) Then
                        local0\Field70 = 0.0
                    Else
                        local15 = $00
                        If (local0\Field24 = $00) Then
                            local0\Field90 = GUESSEDloadxb(local0\Field82, $00)
                            If (local0\Field90 <> Null) Then
                                If (((local0\Field90 = playerroom) Lor isroomadjacent(local0\Field90, playerroom)) <> 0) Then
                                    local15 = $01
                                EndIf
                                For local14 = $00 To $03 Step $01
                                    If (isroomadjacent(local0\Field90, playerroom\Field29[local14]) <> 0) Then
                                        local15 = $01
                                        Exit
                                    EndIf
                                Next
                            EndIf
                            If ((((forest_event <> Null) And (forest_event\Field19 = playerroom)) And (1.0 = forest_event\Field4)) <> 0) Then
                                local15 = $01
                            EndIf
                        Else
                            local15 = $01
                        EndIf
                        If (local15 <> 0) Then
                            local0\Field70 = max((local0\Field70 - ((fps\Field3[$00] * 0.005) * local0\Field42)), (- local0\Field46))
                            translateentity(local0\Field82, 0.0, local0\Field70, 0.0, $00)
                        ElseIf (0.0 < local0\Field37) Then
                            local0\Field70 = 0.0
                        Else
                            local0\Field70 = max((local0\Field70 - ((fps\Field3[$00] * 0.005) * local0\Field42)), (- local0\Field46))
                            translateentity(local0\Field82, 0.0, local0\Field70, 0.0, $00)
                        EndIf
                    EndIf
                Else
                    local0\Field70 = 0.0
                EndIf
            EndIf
            updatenpcice(local0)
            GUESSEDsetentity_4(local0)
            catcherrors((((((("Uncaught: MP_UpdateNPCs(NPC Name: " + chr($22)) + local0\Field72) + chr($22)) + ", ID: ") + (Str local0\Field77)) + ")"))
        EndIf
    Next
    playerroom = local1
    XZ0260X8X2\Field74 = local2
    XZ0260X8X2\Field68 = local3
    chs\Field8 = local4
    CB64D8DZF = Null
    updatecameracheck()
    Return $00
End Function

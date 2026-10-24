Function updatesecuritycams%()
    Local local0.securitycams
    Local local1%
    Local local2%
    Local local4%
    Local local5#
    Local local6%
    catcherrors("UpdateSecurityCams()")
    For local0 = Each securitycams
        local1 = ((6.0 > local0\Field6\Field39) Lor (playerroom = local0\Field6))
        If ((local1 Lor (local0 = sc_i\Field2)) <> 0) Then
            If (local0\Field11 <> 0) Then
                If (local0\Field14 = $00) Then
                    local0\Field14 = createpivot(local0\Field0)
                    entityparent(local0\Field14, $00, $01)
                EndIf
                If (entityvisible(local0\Field7, camera, 0.0) <> 0) Then
                    If (local0 <> sc_i\Field2) Then
                        mtfcameracheckdetected = (0.0 < mtfcamerachecktimer)
                    EndIf
                    pointentity(local0\Field14, camera, 0.0)
                    rotateentity(local0\Field7, curveangle(entitypitch(local0\Field14, $00, 1.0), entitypitch(local0\Field7, $00, 1.0), 75.0), curveangle(entityyaw(local0\Field14, $00, 1.0), entityyaw(local0\Field7, $00, 1.0), 75.0), 0.0, $00)
                EndIf
                positionentity(local0\Field7, entityx(local0\Field0, $01, 1.0), (entityy(local0\Field0, $01, 1.0) - 0.083), entityz(local0\Field0, $01, 1.0), $00)
            Else
                If (0.0 < local0\Field8) Then
                    If (local0\Field16 = $00) Then
                        local0\Field13 = (local0\Field13 + (fps\Field3[$00] * 0.2))
                        If ((local0\Field8 * 1.3) < local0\Field13) Then
                            local0\Field16 = $01
                        EndIf
                    Else
                        local0\Field13 = (local0\Field13 - (fps\Field3[$00] * 0.2))
                        If (((- local0\Field8) * 1.3) > local0\Field13) Then
                            local0\Field16 = $00
                        EndIf
                    EndIf
                EndIf
                positionentity(local0\Field7, entityx(local0\Field0, $01, 1.0), (entityy(local0\Field0, $01, 1.0) - 0.083), entityz(local0\Field0, $01, 1.0), $00)
                rotateentity(local0\Field7, entitypitch(local0\Field7, $00, 1.0), (((Float local0\Field6\Field21) + local0\Field20) + clamp(local0\Field13, (- local0\Field8), local0\Field8)), 0.0, $00)
                If (local0\Field21 <> $00) Then
                    positionentity(local0\Field21, entityx(local0\Field7, $01, 1.0), entityy(local0\Field7, $01, 1.0), entityz(local0\Field7, $01, 1.0), $00)
                    rotateentity(local0\Field21, entitypitch(local0\Field7, $00, 1.0), entityyaw(local0\Field7, $00, 1.0), 0.0, $00)
                    moveentity(local0\Field21, 0.0, 0.0, 0.1, $00)
                EndIf
                If (local0 <> sc_i\Field2) Then
                    If (((60.0 > (Abs deltayaw(local0\Field7, camera))) And entityvisible(local0\Field7, camera, 0.0)) <> 0) Then
                        If ((millisec Mod $546) < $320) Then
                            entitytexture(local0\Field7, sc_i\Field4[$00], $00, $00)
                            X8F80Z2886(local0\Field7, $FFFFFFFF, $00)
                        Else
                            entitytexture(local0\Field7, sc_i\Field4[$01], $00, $00)
                            X8F80Z2886(local0\Field7, $FFFFFFFF, $00)
                        EndIf
                        mtfcameracheckdetected = (0.0 < mtfcamerachecktimer)
                    EndIf
                EndIf
            EndIf
        EndIf
        If (local1 <> 0) Then
            If (local0\Field12 <> 0) Then
                If (-800.0 > XZ0260X8X2\Field42) Then
                    XZ0260X8X2\Field69 = $00
                    XZ0260X8X2\Field42 = -1010.0
                    msg\Field8 = getlocalstring("death", "895")
                    If (-10.0 > XZ0260X8X2\Field82) Then
                        kill($00, $01, $00, $01)
                    EndIf
                EndIf
                local0\Field4 = $00
                If ((((min(hidedistance, ((fog\Field13 * lightvolume) * 1.2)) * min(hidedistance, ((fog\Field13 * lightvolume) * 1.2))) > entitydistancesquared(XZ0260X8X2\Field74, local0\Field3)) And (0.3 < secondarylighton)) <> 0) Then
                    local0\Field4 = (entityinview(local0\Field15, camera) And (local0\Field5 Lor entityvisible(camera, local0\Field3, 0.0)))
                    If ((((-6.0 < XZ0260X8X2\Field53) Lor (-11.0 > XZ0260X8X2\Field53)) And local0\Field4) <> 0) Then
                        local2 = local0\Field6\Field22\Field21
                        If ((((local2 = $05) Lor (local2 = $04)) Lor (local2 = $13)) <> 0) Then
                            local0\Field2 = $00
                        Else
                            camerafogcolor(local0\Field21, fog\Field8, fog\Field15, fog\Field5)
                            cameraclscolor(local0\Field21, fog\Field8, fog\Field15, fog\Field5)
                        EndIf
                        If (local0\Field9 > local0\Field23) Then
                            local0\Field23 = (local0\Field23 + fps\Field3[$00])
                        Else
                            local0\Field23 = 0.0
                        EndIf
                        Select local0\Field2
                            Case $01,$03
                                If (((((i_714\Field0 <> $02) And (T8660BZ460\Field10 <> $04)) And (T8660BZ460\Field3 <> $04)) And (chs\Field8 = $00)) <> 0) Then
                                    XZ0260X8X2\Field42 = (XZ0260X8X2\Field42 - ((fps\Field3[$00] * (((Float selecteddifficulty\Field8) * 0.2) + 1.0)) / ((Float i_714\Field0) + 1.0)))
                                    XZ0260X8X2\Field69 = $00
                                    If (selecteddifficulty\Field1 = $01) Then
                                        cansave = $00
                                    EndIf
                                    local4 = createpivot($00)
                                    local5 = clamp((15000.0 / (- XZ0260X8X2\Field42)), 20.0, 200.0)
                                    positionentity(local4, entityx(camera, $00, 1.0), entityy(camera, $00, 1.0), entityz(camera, $00, 1.0), $00)
                                    pointentity(local4, local0\Field3, 0.0)
                                    rotateentity(XZ0260X8X2\Field74, entitypitch(XZ0260X8X2\Field74, $00, 1.0), curveangle(entityyaw(local4, $00, 1.0), entityyaw(XZ0260X8X2\Field74, $00, 1.0), local5), 0.0, $00)
                                    turnentity(local4, 90.0, 0.0, 0.0, $00)
                                    camerapitch = curveangle(entitypitch(local4, $00, 1.0), (camerapitch + 90.0), local5)
                                    camerapitch = (camerapitch - 90.0)
                                    freeentity(local4)
                                    local4 = $00
                                    If (-800.0 > XZ0260X8X2\Field42) Then
                                        If (rand($03, $01) = $01) Then
                                            entitytexture(local0\Field22, mon_i\Field2[$00], $00, $00)
                                        EndIf
                                        If (rand($06, $01) < $05) Then
                                            entitytexture(local0\Field22, mon_i\Field2[rand($06, $10)], $00, $00)
                                            If (local0\Field1 = $01) Then
                                                playsound_strict(snd_i\Field40[$01], $00, $00)
                                            EndIf
                                            local0\Field1 = $02
                                            If (ChannelPlaying(local0\Field18) = $00) Then
                                                local0\Field18 = playsound_strict(snd_i\Field40[$04], $00, $00)
                                            EndIf
                                        EndIf
                                        XZ0260X8X2\Field64 = 1000.0
                                        If (0.0 = XZ0260X8X2\Field82) Then
                                            XZ0260X8X2\Field82 = 1.0
                                        EndIf
                                    ElseIf (-500.0 > XZ0260X8X2\Field42) Then
                                        If (rand($07, $01) = $01) Then
                                            entitytexture(local0\Field22, mon_i\Field2[$00], $00, $00)
                                        EndIf
                                        If (rand($32, $01) = $01) Then
                                            entitytexture(local0\Field22, mon_i\Field2[rand($06, $10)], $00, $00)
                                            If (local0\Field1 = $00) Then
                                                playsound_strict(snd_i\Field40[$00], $00, $00)
                                            EndIf
                                            local0\Field1 = (Int max((Float local0\Field1), 1.0))
                                        EndIf
                                    Else
                                        entitytexture(local0\Field22, mon_i\Field2[$00], $00, $00)
                                    EndIf
                                Else
                                    entitytexture(local0\Field22, mon_i\Field2[$00], $00, $00)
                                EndIf
                            Case $02
                                If (local0\Field1 = $00) Then
                                    local0\Field1 = (rand($C350, $D6D8) - (selecteddifficulty\Field2 * $4E20))
                                EndIf
                                local6 = (millisec Mod local0\Field1)
                                If (rand(($1F4 - ((local6 < $258) * $1E0)), $01) = $01) Then
                                    local0\Field19 = ((local0\Field19 + $01) Mod $06)
                                    entitytexture(local0\Field22, mon_i\Field2[$05], local0\Field19, $00)
                                EndIf
                                If (selecteddifficulty\Field1 = $01) Then
                                    If (((local6 < $258) And local0\Field4) <> 0) Then
                                        cansave = $00
                                    EndIf
                                EndIf
                                If (local6 >= rand($2BC, $01)) Then
                                    entitytexture(local0\Field22, mon_i\Field2[$00], $00, $00)
                                ElseIf (ChannelPlaying(local0\Field18) = $00) Then
                                    local0\Field18 = playsound_strict(loadtempsound((("SFX\SCP\079\Broadcast" + (Str rand($00, $02))) + ".ogg")), $00, $00)
                                    local0\Field2 = $03
                                    local0\Field1 = $00
                                EndIf
                        End Select
                    EndIf
                EndIf
            EndIf
            If (((local0\Field4 = $00) And (local0\Field10 = $00)) <> 0) Then
                local0\Field18 = loopsoundex(snd_i\Field7, local0\Field18, camera, local0\Field7, 4.0, 1.0, $00)
            EndIf
        EndIf
        If (local0 <> Null) Then
            catcherrors((("Uncaught: UpdateSecurityCameras(Room ID: " + (Str local2)) + ")"))
        Else
            catcherrors("Uncaught: UpdateSecurityCameras(Screen doesn't exist anymore!)")
        EndIf
    Next
    Return $00
End Function

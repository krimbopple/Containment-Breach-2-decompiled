Function updatezonecolor%()
    Local local0%
    Local local1%
    Local local2#
    Local local4#
    Local local5#
    Local local8%
    Local local9%
    Local local10%
    Local local11#
    Local local12#
    Local local13#
    Local local15#
    local1 = isplayeroutsidefacility()
    Select opt\Field44
        Case $01
            local2 = 1.5
        Case $02
            local2 = 2.0
        Default
            local2 = 1.0
    End Select
    local4 = ((fog\Field13 * local2) + fog\Field0)
    local5 = min(secondarylighton, 1.0)
    setzonecolor("", "")
    camerafogmode(camera, $01)
    camerafogrange(camera, 0.0, local4)
    camerarange(camera, 0.01, (((Float opt\Field30) * 100.0) + (((Float (opt\Field30 = $00)) * local4) * 1.25)))
    If (((playerroom\Field22\Field21 = $20) And (infacility = $FFFFFFFF)) <> 0) Then
        setzonecolor("002007000", "031031031")
        BDD60668Z("GFX\EnvMaps\HCZ_env.png")
    ElseIf (playerroom\Field22\Field21 = $04) Then
        setzonecolor("030030030", "045045045")
        lightvolume = 1.0
        camerafogrange(camera, 5.0, (fog\Field0 + 60.0))
        camerarange(camera, 0.01, (fog\Field0 + 72.0))
        BDD60668Z("GFX\EnvMaps\LCZ_env.png")
    ElseIf (local1 <> 0) Then
        setzonecolor("015015015", "045045045")
        lightvolume = 1.0
        camerafogrange(camera, 5.0, (fog\Field0 + 60.0))
        camerarange(camera, 0.01, (fog\Field0 + 72.0))
        BDD60668Z("GFX\EnvMaps\outside_env.png")
    ElseIf (playerroom\Field22\Field21 = $70) Then
        setzonecolor("096097104", "050050050")
        lightvolume = 1.0
        camerafogrange(camera, 40.0, (fog\Field0 + 80.0))
        camerarange(camera, 0.01, (fog\Field0 + 96.0))
        BDD60668Z("GFX\EnvMaps\PD_env.png")
    ElseIf (((pd_event <> Null) And (pd_event\Field19 = playerroom)) <> 0) Then
        lightvolume = 1.0
        If (((3.0 = pd_event\Field7) Lor (6.0 = pd_event\Field7)) <> 0) Then
            setzonecolor("038055047", "100100100")
            If (3.0 = pd_event\Field7) Then
                fog\Field13 = 30.0
                camerafogrange(camera, 5.0, (fog\Field13 + fog\Field0))
                camerarange(camera, 0.01, (fog\Field0 + 35.0))
            EndIf
        ElseIf (5.0 = pd_event\Field7) Then
            setzonecolor("021009009", "044032032")
        Else
            setzonecolor("000000000", "100100100")
        EndIf
        BDD60668Z("GFX\EnvMaps\PD_env.png")
    ElseIf (((forest_event <> Null) And (forest_event\Field19 = playerroom)) <> 0) Then
        If (20.0 < entityy(XZ0260X8X2\Field74, $00, 1.0)) Then
            If (forest_event\Field19\Field32[$00] <> Null) Then
                setzonecolor("098133162", "031031031")
                lightvolume = 1.0
                BDD60668Z("GFX\EnvMaps\forest_env.png")
            Else
                setzonecolor("045020020", "031031031")
                lightvolume = 0.8
                BDD60668Z("GFX\EnvMaps\forest_red_env.png")
            EndIf
            If (forest_event\Field19\Field32[$00] <> Null) Then
                If (2.0 <= forest_event\Field19\Field32[$00]\Field66) Then
                    setzonecolor("032044054", "031031031")
                EndIf
            EndIf
            camerafogrange(camera, 0.1, 6.0)
            camerarange(camera, 0.01, 7.2)
        EndIf
    Else
        Select XZ0260X8X2\Field10
            Case $00
                BDD60668Z("GFX\EnvMaps\LCZ_env.png")
            Case $01
                BDD60668Z("GFX\EnvMaps\HCZ_env.png")
            Case $02
                BDD60668Z("GFX\EnvMaps\EZ_env.png")
        End Select
    EndIf
    If (fog\Field14 <> "") Then
        fog\Field10 = fog\Field14
    EndIf
    If (fog\Field6 <> "") Then
        fog\Field4 = fog\Field6
    EndIf
    If (fog\Field4 = "") Then
        Select XZ0260X8X2\Field10
            Case $00
                setzonecolor("024024024", "031031031")
            Case $01
                setzonecolor("021009009", "044032032")
            Case $02
                setzonecolor("014014024", "035035036")
        End Select
    EndIf
    fog\Field8 = curvevalue(((Float left(fog\Field4, $03)) * local5), fog\Field8, ZX0F0Z06F)
    fog\Field15 = curvevalue(((Float mid(fog\Field4, $04, $03)) * local5), fog\Field15, ZX0F0Z06F)
    fog\Field5 = curvevalue(((Float right(fog\Field4, $03)) * local5), fog\Field5, ZX0F0Z06F)
    camerafogcolor(camera, fog\Field8, fog\Field15, fog\Field5)
    cameraclscolor(camera, fog\Field8, fog\Field15, fog\Field5)
    local8 = (Int left(fog\Field10, $03))
    local9 = (Int mid(fog\Field10, $04, $03))
    local10 = (Int right(fog\Field10, $03))
    fog\Field2 = curvevalue((Float local8), fog\Field2, ZX0F0Z06F)
    fog\Field11 = curvevalue((Float local9), fog\Field11, ZX0F0Z06F)
    fog\Field12 = curvevalue((Float local10), fog\Field12, ZX0F0Z06F)
    fog\Field3 = curvevalue(1.0, fog\Field3, (ZX0F0Z06F * 0.5))
    TXD8484Z6B(fog\Field3, $00)
    local11 = ((fog\Field2 * max(local5, 0.4)) * 1.75)
    local12 = ((fog\Field11 * max(local5, 0.4)) * 1.75)
    local13 = ((fog\Field12 * max(local5, 0.4)) * 1.75)
    If (T8660BZ460\Field11 > $00) Then
        local11 = (local11 * 2.0)
        local12 = (local12 * 2.0)
        local13 = (local13 * 2.0)
    Else
        Select T8660BZ460\Field8
            Case $00
                If (((forest_event <> Null) And (forest_event\Field19 = playerroom)) <> 0) Then
                    If (20.0 < entityy(XZ0260X8X2\Field74, $00, 1.0)) Then
                        local11 = 200.0
                        local12 = 200.0
                        local13 = 200.0
                    EndIf
                EndIf
            Case $01
                local11 = (local11 * 3.0)
                local12 = (local12 * 6.0)
                local13 = (local13 * 3.0)
            Case $02
                local11 = (local11 * 3.0)
                local12 = (local12 * 3.0)
                local13 = (local13 * 6.0)
            Case $03
                local11 = (local11 * 6.0)
                local12 = (local12 * 3.0)
                local13 = (local13 * 3.0)
        End Select
    EndIf
    local15 = (XF28BZ6DDD(opt\Field50, 1.0, 0.5) * 0.4)
    fog\Field9 = (local11 * local15)
    fog\Field16 = (local12 * local15)
    fog\Field7 = (local13 * local15)
    Return $00
End Function

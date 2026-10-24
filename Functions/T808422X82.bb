Function T808422X82%()
    Local local0.X0442B862F
    Local local1%
    Local local2%
    Local local3%
    Local local4%
    Local local5#
    Local local6#
    Local local7%
    Local local8%
    Local local9#
    Local local10#
    Local local11#
    Local local12#
    Local local13#
    Local local14#
    Local local15%
    Local local16#
    Local local17#
    Local local18#
    Local local19%
    Local local20%
    Local local22%
    Local local23%
    Local local24#
    Local local25#
    Local local26#
    Local local27%
    Local local28%
    Local local29.particles
    DZ64X028\Field21 = max((DZ64X028\Field21 - (fps\Field3[$00] * 0.04)), 0.0)
    DZ64X028\Field55 = curvevalue((- DZ64X028\Field21), DZ64X028\Field55, 6.0)
    If (DZ64X028\Field18 <> Null) Then
        local0 = DZ64X028\Field18\Field3
        If (((((local0\Field26 = $00) Lor DZ64X028\Field64) And (DZ64X028\Field3 = $00)) And ((((DZ64X028\Field61 = Null) Lor (DZ64X028\Field61\Field17 = $00)) Lor (DZ64X028\Field61\Field29 <> TXXDZB2ZBXX())) Lor (DZ64X028\Field61\Field6\Field11 <> DZ64X028\Field18\Field5))) <> 0) Then
            TX0Z8FFZ8Z0(Null, Null, $00)
            Return $00
        EndIf
        If (((((X4BX024DX0() <> $00) And (TXB2BFFFFFX() = $00)) And (DZ64X028\Field61 <> Null)) And (0.0 >= DZ64X028\Field61\Field26)) <> 0) Then
            DZ64X028\Field1 = TXDFXDZXXDD\Field9
        EndIf
        local1 = $01
        If (TXXF6F02DB2[TXXDZB2ZBXX()] <> Null) Then
            local1 = TXXF6F02DB2[TXXDZB2ZBXX()]\Field55\Field16
        EndIf
        If (DZ64X028\Field3 > $00) Then
            local1 = (DZ64X028\Field3 - $01)
        EndIf
        If (local1 <> YB6XZZXF4(DZ64X028\Field18)) Then
            TXD04BF86D0(DZ64X028\Field18, local1)
        EndIf
        T8X848004F()
        local2 = DZ64X028\Field18\Field9
        local3 = DZ64X028\Field18\Field4
        local4 = Y04BZD8BBF()
        local5 = (1.0 - ((Float (128.0 < DZ64X028\Field22)) * 0.7))
        local6 = (1.0 - ((Float (XZ0260X8X2\Field25 Lor DZ64X028\Field17)) * 0.3))
        local7 = (((((((local0\Field20[$06] <> $00) And keydown(key\Field12)) And (0.0 < XZ0260X8X2\Field76)) And (0.0 < XZ0260X8X2\Field56)) Lor DZ64X028\Field10) And (128.0 > DZ64X028\Field22)) And (1.0 <= local6))
        local8 = ((DZ64X028\Field46 = $03) And local7)
        local9 = (sin((DZ64X028\Field55 * 10.0)) * 40.0)
        local10 = (cos((Float DZ64X028\Field5)) * local9)
        local11 = (sin((Float DZ64X028\Field5)) * local9)
        local12 = local11
        local13 = (((sin(((Float local4) * 0.0001)) * 0.2) * local5) * local6)
        local14 = (((sin(((Float local4) * 0.0002)) * 0.06) * local5) * local6)
        local15 = ((0.005 < XZ0260X8X2\Field76) Lor DZ64X028\Field2)
        If ((keydown(key\Field12) Lor DZ64X028\Field10) <> 0) Then
            local15 = (local15 Shl $01)
        ElseIf (local15 <> 0) Then
            local13 = ((((cos(((Float local4) * 0.0004)) * 0.4) * local5) * local6) + local13)
            local14 = (((((- cos(((Float local4) * 0.0003))) * 0.6) * local5) * local6) + local14)
        EndIf
        If ((((((DZ64X028\Field46 = $06) Lor local8) And (1.0 <= local6)) And (0.0 < (Float local15))) And (0.0 < XZ0260X8X2\Field22)) <> 0) Then
            DZ64X028\Field54 = curvevalue(XF28BZ6DDD(((sin(((Float local4) * 0.00042)) * 0.6) * (1.0 - ((Float local8) * 0.8))), 0.0, clamp((DZ64X028\Field57 * 0.01), 0.0, 1.0)), DZ64X028\Field54, 14.0)
            DZ64X028\Field27 = curvevalue(XF28BZ6DDD(((cos(((Float local4) * 0.0004)) * 0.08) * (1.0 - ((Float local8) * 0.8))), 0.0, clamp((DZ64X028\Field57 * 0.01), 0.0, 1.0)), DZ64X028\Field27, 14.0)
            DZ64X028\Field43 = curvevalue(XF28BZ6DDD(((sin(((Float local4) * 0.0006)) * 0.03) * (1.0 - ((Float local8) * 0.8))), 0.0, clamp((DZ64X028\Field57 * 0.01), 0.0, 1.0)), DZ64X028\Field43, 14.0)
        Else
            DZ64X028\Field54 = curvevalue(0.0, DZ64X028\Field54, 3.5)
            DZ64X028\Field27 = curvevalue(0.0, DZ64X028\Field27, 3.5)
            DZ64X028\Field43 = curvevalue(0.0, DZ64X028\Field43, 3.5)
        EndIf
        DZ64X028\Field6 = curvevalue(DZ64X028\Field11, DZ64X028\Field6, 4.0)
        DZ64X028\Field68 = curvevalue(DZ64X028\Field20, DZ64X028\Field68, 4.0)
        DZ64X028\Field60 = curvevalue(DZ64X028\Field67, DZ64X028\Field60, 4.0)
        DZ64X028\Field52 = curvevalue((((sin(((min((Float local15), 1.0) * 0.0001) * (Float local4))) * 0.05) + DZ64X028\Field54) + (DZ64X028\Field6 * 0.25)), DZ64X028\Field52, 4.0)
        DZ64X028\Field36 = curvevalue((((0.05 / max((DZ64X028\Field22 / 64.0), 1.0)) + DZ64X028\Field27) + (DZ64X028\Field68 * 0.1)), DZ64X028\Field36, 3.0)
        DZ64X028\Field19 = curvevalue(((DZ64X028\Field43 + ((- DZ64X028\Field25) * 0.1)) - (Abs (DZ64X028\Field6 * 0.25))), DZ64X028\Field19, 3.0)
        DZ64X028\Field38 = curvevalue(((((cos((((Float local4) * 0.00042) * min((Float local15), 1.6))) * 0.2) + (DZ64X028\Field27 * 12.0)) + local13) + DZ64X028\Field6), DZ64X028\Field38, 4.0)
        DZ64X028\Field4 = curvevalue(((((sin((((Float local4) * 0.00024) * min((Float local15), 1.6))) * 0.3) - (DZ64X028\Field54 * 1.2)) + local14) + DZ64X028\Field68), DZ64X028\Field4, 4.0)
        DZ64X028\Field72 = curvevalue(((cos((((Float local4) * 0.00048) * min((Float local15), 1.6))) * 0.36) + (DZ64X028\Field43 * 12.0)), (DZ64X028\Field72 + DZ64X028\Field60), 4.0)
        If ((((menuopen Lor consoleopen) Lor invopen) Lor TX6X48DXXDX) = $00) Then
            local16 = (clamp(((- TDD0Z6BXB6\Field11) * 0.45), -10.0, 10.0) * local5)
            local17 = (clamp((TDD0Z6BXB6\Field4 * 0.45), -10.0, 10.0) * local5)
        EndIf
        local18 = ((XZ0260X8X2\Field1 + XZ0260X8X2\Field14) + (XZ0260X8X2\Field79 * 2.0))
        positionentity(local3, 0.0, 0.0, 0.0, $00)
        rotateentity(local3, ((((((entitypitch(camera, $00, 1.0) + local0\Field37) - local10) + local17) + DZ64X028\Field38) + (XZ0260X8X2\Field41 * 6.0)) + rnd((- local18), local18)), (((((entityyaw(camera, $00, 1.0) + local0\Field35) - local11) + local16) + DZ64X028\Field4) + rnd((- local18), local18)), ((((entityroll(camera, $00, 1.0) + local0\Field19) - local12) + DZ64X028\Field72) - (XZ0260X8X2\Field41 * 2.0)), $00)
        freeentity(local19)
        freeentity(local20)
        moveentity(local3, (local0\Field21 + DZ64X028\Field53), (local0\Field31 + DZ64X028\Field42), local0\Field53, $00)
        translateentity(local3, ((- DZ64X028\Field71) * entityscalex(local3, $00, 1.0)), 0.0, ((- DZ64X028\Field33) * entityscalez(local3, $00, 1.0)), $00)
        positionentity(getchild(local3, $01), (((DZ64X028\Field49 * 0.01) + DZ64X028\Field52) + (local16 * 0.08)), ((((DZ64X028\Field15 * 0.01) + DZ64X028\Field36) + DZ64X028\Field14) + (local17 * 0.08)), DZ64X028\Field19, $00)
        DZ64X028\Field71 = curvevalue(clamp(((DZ64X028\Field12 - entityx(camera, $00, 1.0)) * 4.0), -1.0, 1.0), DZ64X028\Field71, 12.0)
        DZ64X028\Field14 = curvevalue(clamp(((DZ64X028\Field16 - entityy(camera, $00, 1.0)) * 4.0), -0.8, 0.8), DZ64X028\Field14, 12.0)
        DZ64X028\Field33 = curvevalue(clamp(((DZ64X028\Field47 - entityz(camera, $00, 1.0)) * 4.0), -1.0, 1.0), DZ64X028\Field33, 12.0)
        DZ64X028\Field12 = entityx(camera, $00, 1.0)
        DZ64X028\Field16 = entityy(camera, $00, 1.0)
        DZ64X028\Field47 = entityz(camera, $00, 1.0)
        If (((0.0 >= DZ64X028\Field8) And (0.0 = getentityalpha(local2))) <> 0) Then
            entityalpha(local2, 1.0)
            captureentity(local2)
        EndIf
        If ((((animseq(local2) <> $06) Lor (local0\Field20[$06] = local0\Field20[$01])) Lor (local0\Field20[$06] = local0\Field20[$08])) <> 0) Then
            tformvector(DZ64X028\Field71, DZ64X028\Field14, DZ64X028\Field33, $00, camera)
            turnentity(local3, 0.0, 0.0, ((tformedx() * 35.0) * local5), $00)
        EndIf
        If ((((DZ64X028\Field46 <> $05) And keyhit($13)) And (((((((((invopen Lor i_294\Field4) Lor (otheropen <> Null)) Lor (d_i\Field3 <> Null)) Lor (selectedscreen <> Null)) Lor menuopen) Lor consoleopen) Lor (0.0 > XZ0260X8X2\Field2)) Lor TX6X48DXXDX) = $00)) <> 0) Then
            If ((((DZ64X028\Field61 <> Null) And ((Float local0\Field52) > DZ64X028\Field61\Field15)) And (0.0 < DZ64X028\Field61\Field3)) <> 0) Then
                TBZXD06BBZ($05, $03, 0.0, 0.0, 1.0)
                T68D24B6DX(local0\Field12, 1.0)
            EndIf
        EndIf
        If (DZ64X028\Field39 <> 0) Then
            DZ64X028\Field57 = max((DZ64X028\Field57 - fps\Field3[$00]), 0.0)
            If (0.0 >= DZ64X028\Field57) Then
                animate(local2, DZ64X028\Field44, (local0\Field34[DZ64X028\Field46] * DZ64X028\Field48), DZ64X028\Field46, (DZ64X028\Field37 + 6.0))
                DZ64X028\Field39 = $00
                If (DZ64X028\Field46 = $05) Then
                    TXFDFX4XDB2(DZ64X028\Field61)
                EndIf
            EndIf
        EndIf
        If ((((DZ64X028\Field46 <> $06) And (DZ64X028\Field46 <> $05)) And (local0\Field20[$04] <> $00)) <> 0) Then
            If (0.0 = DZ64X028\Field40) Then
                If (entitypick(camera, 0.2) <> $00) Then
                    TBZXD06BBZ($04, $03, 0.0, 0.0, 1.0)
                ElseIf (DZ64X028\Field46 = $04) Then
                    TBZXD06BBZ($01, $01, 0.0, 0.0, 1.0)
                EndIf
                DZ64X028\Field40 = 8.0
            EndIf
        EndIf
        Select animseq(local2)
            Case $01,$06,$08
                If (((((local0\Field9 = $00) And (local0\Field20[$03] <> $00)) And (((((local0\Field26 And TDD0Z6BXB6\Field7) Lor ((local0\Field26 = $00) And TDD0Z6BXB6\Field1)) And (0.0 >= DZ64X028\Field29)) And ((((((((((invopen Lor i_294\Field4) Lor (otheropen <> Null)) Lor (selecteditem <> Null)) Lor (d_i\Field3 <> Null)) Lor (selectedscreen <> Null)) Lor menuopen) Lor consoleopen) Lor (0.0 > XZ0260X8X2\Field2)) Lor TX6X48DXXDX) = $00)) And (DZ64X028\Field3 = $00))) Lor DZ64X028\Field51) <> 0) Then
                    TBZXD06BBZ($03, $03, -2.0, 0.0, 1.0)
                    If (DZ64X028\Field3 = $00) Then
                        DZ64X028\Field7 = local0\Field57
                        If ((((DZ64X028\Field61 <> Null) And (1.0 > DZ64X028\Field61\Field15)) And TDD0Z6BXB6\Field7) <> 0) Then
                            T68D24B6DX("SFX\Weapons\shoot_emptyclip.ogg", 1.0)
                        EndIf
                    EndIf
                    If (local0\Field8 <> "") Then
                        T68D24B6DX(local0\Field8, 1.0)
                    EndIf
                ElseIf (local0\Field26 <> 0) Then
                    If (local15 > $00) Then
                        local22 = $08
                        If (local0\Field20[local22] = $00) Then
                            local22 = $06
                        EndIf
                        If (local15 > $01) Then
                            local22 = $06
                        EndIf
                        If (local0\Field20[local22] <> $00) Then
                            If (DZ64X028\Field46 <> local22) Then
                                TBZXD06BBZ(local22, $01, 9.0, 0.0, 1.0)
                            EndIf
                        ElseIf (DZ64X028\Field46 <> $01) Then
                            TBZXD06BBZ($01, $01, 0.0, 0.0, 1.0)
                        EndIf
                    ElseIf (DZ64X028\Field46 <> $01) Then
                        TBZXD06BBZ($01, $01, 0.0, 0.0, 1.0)
                    EndIf
                ElseIf (local7 <> 0) Then
                    If (DZ64X028\Field46 = $01) Then
                        TBZXD06BBZ($06, $01, 9.0, rnd(60.0, 80.0), 1.0)
                    EndIf
                ElseIf (DZ64X028\Field46 = $06) Then
                    TBZXD06BBZ($01, $01, 4.0, 0.0, 1.0)
                EndIf
                DZ64X028\Field25 = curvevalue(0.0, DZ64X028\Field25, 6.0)
                If ((((((DZ64X028\Field46 <> $05) And (DZ64X028\Field61 <> Null)) And (0.0 = DZ64X028\Field61\Field15)) And ((Float local0\Field52) > DZ64X028\Field61\Field15)) And (0.0 < DZ64X028\Field61\Field3)) <> 0) Then
                    TBZXD06BBZ($05, $03, 0.0, 0.0, 1.0)
                    T68D24B6DX(local0\Field12, 1.0)
                EndIf
                DZ64X028\Field66 = curvevalue((Float ((closestitem <> Null) * $FF)), DZ64X028\Field66, 3.0)
            Case $03
                If ((((((local0\Field26 = $00) And TDD0Z6BXB6\Field1) Lor local0\Field39) And (((((((((((invopen Lor i_294\Field4) Lor (otheropen <> Null)) Lor (selecteditem <> Null)) Lor (d_i\Field3 <> Null)) Lor (selectedscreen <> Null)) Lor menuopen) Lor consoleopen) Lor (0.0 > XZ0260X8X2\Field2)) Lor TX6X48DXXDX) = $00) Lor local0\Field39)) Lor DZ64X028\Field51) <> 0) Then
                    If (((DZ64X028\Field61 <> Null) Lor DZ64X028\Field51) <> 0) Then
                        If ((local0\Field17 And (animating(local2, $FFFFFFFF) = $00)) <> 0) Then
                            TBZXD06BBZ($03, $01, 0.0, 0.0, 1.0)
                        EndIf
                        If (((0.0 = DZ64X028\Field32) And ((local0\Field39 = $00) Lor (animating(local2, $FFFFFFFF) = $00))) <> 0) Then
                            If ((DZ64X028\Field51 Lor ((DZ64X028\Field61 <> Null) And (0.0 < DZ64X028\Field61\Field15))) <> 0) Then
                                local23 = rndseed()
                                DZ64X028\Field32 = local0\Field32
                                TBZXD06BBZ($03, $03, -2.0, 0.0, 1.0)
                                DZ64X028\Field58 = 2.0
                                DZ64X028\Field35 = rnd(-180.0, 180.0)
                                DZ64X028\Field59 = rnd(0.6, 1.2)
                                DZ64X028\Field25 = (((local0\Field18 * 1.5) - (local0\Field32 * 0.01)) / (Float (XZ0260X8X2\Field25 + $01)))
                                entitytexture(DZ64X028\Field65, DZ64X028\Field56[rand($00, $03)], $00, $00)
                                X8F80Z2886(DZ64X028\Field65, $60, $00)
                                TZZZ68X802($01)
                                DZ64X028\Field11 = clamp((rnd(((- local0\Field50) * 4.0), (local0\Field50 * 4.0)) + DZ64X028\Field11), -2.0, 2.0)
                                DZ64X028\Field20 = clamp((rnd(((- local0\Field50) * 4.0), (local0\Field50 * 4.0)) + DZ64X028\Field20), -2.0, 2.0)
                                DZ64X028\Field67 = clamp((rnd(((- local0\Field50) * 4.0), (local0\Field50 * 4.0)) + DZ64X028\Field67), -2.0, 2.0)
                                If (DZ64X028\Field51 = $00) Then
                                    seedrnd(DZ64X028\Field7)
                                    DZ64X028\Field15 = max(rnd(((local0\Field50 * 2.2) * 1.1), ((local0\Field50 * 2.3) * 1.1)), DZ64X028\Field15)
                                    DZ64X028\Field49 = rnd((((- local0\Field50) * 0.4) * 1.1), ((local0\Field50 * 0.45) * 1.1))
                                    DZ64X028\Field45 = (local0\Field32 * 0.7)
                                    XZ0260X8X2\Field1 = max((local0\Field50 * 0.2), XZ0260X8X2\Field1)
                                    DZ64X028\Field7 = rndseed()
                                    seedrnd(local23)
                                    seedrnd((DZ64X028\Field1 + $80))
                                    local24 = (1.0 - ((Float ((128.0 < DZ64X028\Field22) Lor XZ0260X8X2\Field25)) * 0.8))
                                    If (DZ64X028\Field18\Field0 <> $00) Then
                                        TDBDBZ6FFD(TXXF6F02DB2[TXXDZB2ZBXX()], local0\Field30, local0\Field58, local0\Field36, local0\Field49, local0\Field14, local0\Field4, local0\Field29, local0\Field44, local0\Field7, local0\Field23, local0\Field55, local0\Field33, local0\Field3, local0\Field0, (DZ64X028\Field1 + $01), $00)
                                    Else
                                        local27 = $00
                                        If (local0\Field60 > $00) Then
                                            local24 = 1.0
                                        EndIf
                                        For local28 = $01 To (local0\Field60 + $01) Step $01
                                            local25 = (rnd((- local0\Field18), local0\Field18) * local24)
                                            local26 = (rnd((- local0\Field18), local0\Field18) * local24)
                                            local27 = TZXXF4882Z(TXXF6F02DB2[TXXDZB2ZBXX()], rnd((local0\Field58 - 0.1), (local0\Field58 + 0.1)), local25, local26, local0)
                                        Next
                                        If (((local0\Field60 < $01) And (DZ64X028\Field50 <> $00)) <> 0) Then
                                            positionentity(TBZ8F4DD4B(), (entityx(DZ64X028\Field50, $01, 1.0) + entityx(camera, $00, 1.0)), (entityy(DZ64X028\Field50, $01, 1.0) + entityy(camera, $00, 1.0)), (entityz(DZ64X028\Field50, $01, 1.0) + entityz(camera, $00, 1.0)), $01)
                                            rotateentity(TBZ8F4DD4B(), (entitypitch(local3, $01, 1.0) + local25), (entityyaw(local3, $01, 1.0) + local26), 0.0, $00)
                                            entityalpha(TBZ8F4DD4B(), 1.0)
                                            If (local27 <> $00) Then
                                                nameentity(TBZ8F4DD4B(), (((((Str pickedx()) + " ") + (Str pickedy())) + " ") + (Str pickedz())))
                                            Else
                                                nameentity(TBZ8F4DD4B(), "")
                                            EndIf
                                        EndIf
                                    EndIf
                                    seedrnd(local23)
                                    If (i_268\Field3 <> 0) Then
                                        i_268\Field1 = max((i_268\Field1 - (((Float (i_268\Field2 = $02)) * 5.0) + 5.0)), 0.0)
                                    EndIf
                                    DZ64X028\Field1 = (DZ64X028\Field1 + $01)
                                    DZ64X028\Field61\Field26 = 70.0
                                    DZ64X028\Field61\Field15 = (DZ64X028\Field61\Field15 - 1.0)
                                    If ((local0\Field42 And (0.0 = DZ64X028\Field61\Field15)) <> 0) Then
                                        If (TXB2BFFFFFX() <> 0) Then
                                            removeitem(DZ64X028\Field61, $01)
                                        Else
                                            TBZXD06BBZ($02, $03, -6.0, 0.0, 0.001)
                                        EndIf
                                    EndIf
                                EndIf
                                If (local0\Field45 > $00) Then
                                    T68D24B6DX((((local0\Field25 + "shoot") + (Str rand($00, (local0\Field45 - $01)))) + ".ogg"), 1.0)
                                Else
                                    T68D24B6DX(local0\Field25, 1.0)
                                EndIf
                                TZZZ68X802($00)
                                If (DZ64X028\Field50 <> $00) Then
                                    local29 = createparticle($01, (entityx(DZ64X028\Field50, $01, 1.0) + entityx(camera, $00, 1.0)), (entityy(DZ64X028\Field50, $01, 1.0) + entityy(camera, $00, 1.0)), (entityz(DZ64X028\Field50, $01, 1.0) + entityz(camera, $00, 1.0)), (rnd(0.008, 0.01) * 0.8), -0.004, 80.0)
                                    rotateentity(local29\Field10, entitypitch(local3, $00, 1.0), (entityyaw(local3, $00, 1.0) + rnd(-10.0, 10.0)), 0.0, $01)
                                    local29\Field11 = rnd(0.0004, 0.0005)
                                    local29\Field7 = 0.0015
                                    local29\Field13 = 0.2
                                    local29\Field5 = -0.03
                                EndIf
                            ElseIf (((DZ64X028\Field61 <> Null) And (0.0 < DZ64X028\Field61\Field3)) <> 0) Then
                                TBZXD06BBZ($05, $03, 0.0, 0.0, 1.0)
                                T68D24B6DX(local0\Field12, 1.0)
                            EndIf
                        EndIf
                    EndIf
                ElseIf (animating(local2, $FFFFFFFF) = $00) Then
                    TBZXD06BBZ($01, $01, 0.0, 0.0, 1.0)
                ElseIf (0.0 = DZ64X028\Field32) Then
                    DZ64X028\Field25 = curvevalue(0.0, DZ64X028\Field25, 6.0)
                EndIf
                DZ64X028\Field66 = curvevalue(0.0, DZ64X028\Field66, 3.0)
            Case $02
                If (animating(local2, $FFFFFFFF) = $00) Then
                    TBZXD06BBZ($01, $01, 0.0, 0.0, 1.0)
                EndIf
                DZ64X028\Field66 = curvevalue(255.0, DZ64X028\Field66, 3.0)
                DZ64X028\Field25 = curvevalue(0.0, DZ64X028\Field25, 6.0)
            Case $07
                If (animating(local2, $FFFFFFFF) = $00) Then
                    TX0Z8FFZ8Z0(Null, Null, $00)
                    Return $00
                EndIf
                DZ64X028\Field66 = curvevalue(255.0, DZ64X028\Field66, 3.0)
                DZ64X028\Field25 = curvevalue(0.0, DZ64X028\Field25, 6.0)
            Case $05
                If (animating(local2, $FFFFFFFF) = $00) Then
                    XZD248D24X(DZ64X028\Field61)
                    TBZXD06BBZ($01, $01, 0.0, 0.0, 1.0)
                EndIf
                DZ64X028\Field66 = curvevalue(255.0, DZ64X028\Field66, 3.0)
                DZ64X028\Field25 = curvevalue(0.0, DZ64X028\Field25, 6.0)
            Case $04
                DZ64X028\Field66 = curvevalue(255.0, DZ64X028\Field66, 3.0)
                DZ64X028\Field25 = curvevalue(0.0, DZ64X028\Field25, 6.0)
        End Select
        If ((((((((TDD0Z6BXB6\Field8 And (local0\Field26 = $00)) And (local0\Field42 = $00)) And (DZ64X028\Field61 <> Null)) And (DZ64X028\Field46 <> $05)) And (DZ64X028\Field46 <> $04)) And ((((((((((invopen Lor i_294\Field4) Lor (otheropen <> Null)) Lor (selecteditem <> Null)) Lor (d_i\Field3 <> Null)) Lor (selectedscreen <> Null)) Lor menuopen) Lor consoleopen) Lor (0.0 > XZ0260X8X2\Field2)) Lor TX6X48DXXDX) = $00)) Lor DZ64X028\Field31) <> 0) Then
            DZ64X028\Field53 = curvevalue(local0\Field41, DZ64X028\Field53, 6.0)
            DZ64X028\Field42 = curvevalue(local0\Field43, DZ64X028\Field42, 6.0)
            DZ64X028\Field22 = curvevalue(255.0, DZ64X028\Field22, 5.0)
            XZ0260X8X2\Field13 = ((DZ64X028\Field22 * 1.0) * local0\Field2)
        Else
            DZ64X028\Field53 = curvevalue(0.0, DZ64X028\Field53, 5.0)
            DZ64X028\Field42 = curvevalue(0.0, DZ64X028\Field42, 5.0)
            DZ64X028\Field22 = curvevalue(0.0, DZ64X028\Field22, 4.0)
            XZ0260X8X2\Field13 = DZ64X028\Field22
        EndIf
        DZ64X028\Field30 = curvevalue(DZ64X028\Field15, DZ64X028\Field30, 3.0)
        DZ64X028\Field70 = curvevalue(DZ64X028\Field49, DZ64X028\Field70, 3.0)
        If (0.0 >= DZ64X028\Field45) Then
            DZ64X028\Field15 = curvevalue(0.0, DZ64X028\Field15, 6.0)
        EndIf
        DZ64X028\Field49 = curvevalue(0.0, DZ64X028\Field49, 6.0)
        camerapitch = (camerapitch - (DZ64X028\Field15 * 0.05))
        turnentity(XZ0260X8X2\Field74, 0.0, rnd(((- DZ64X028\Field49) * 0.07), (DZ64X028\Field49 * 0.07)), 0.0, $00)
        DZ64X028\Field32 = max((DZ64X028\Field32 - fps\Field3[$00]), 0.0)
        DZ64X028\Field40 = max((DZ64X028\Field40 - fps\Field3[$00]), 0.0)
        DZ64X028\Field45 = max((DZ64X028\Field29 - fps\Field3[$00]), 0.0)
        DZ64X028\Field29 = max((DZ64X028\Field29 - fps\Field3[$00]), 0.0)
        DZ64X028\Field26 = max((DZ64X028\Field26 - fps\Field3[$00]), 0.0)
        DZ64X028\Field11 = max((DZ64X028\Field11 - fps\Field3[$00]), 0.0)
        DZ64X028\Field20 = max((DZ64X028\Field20 - fps\Field3[$00]), 0.0)
        DZ64X028\Field67 = max((DZ64X028\Field67 - fps\Field3[$00]), 0.0)
        DZ64X028\Field8 = max((DZ64X028\Field8 - fps\Field3[$00]), 0.0)
        If (DZ64X028\Field3 <> 0) Then
            DZ64X028\Field3 = $00
            DZ64X028\Field51 = $00
            DZ64X028\Field10 = $00
            DZ64X028\Field0 = Null
            DZ64X028\Field31 = $00
            DZ64X028\Field2 = $00
            DZ64X028\Field17 = $00
        EndIf
    Else
        XZ0260X8X2\Field13 = 0.0
        If (DZ64X028\Field3 <> 0) Then
            DZ64X028\Field3 = $00
            DZ64X028\Field51 = $00
            DZ64X028\Field10 = $00
            DZ64X028\Field0 = Null
            DZ64X028\Field31 = $00
            DZ64X028\Field2 = $00
            DZ64X028\Field17 = $00
        EndIf
        DZ64X028\Field30 = 0.0
        DZ64X028\Field70 = 0.0
    EndIf
    X8Z6FF6ZZ6(TBZ8F4DD4B(), 1.0, 0.01)
    Return $00
End Function

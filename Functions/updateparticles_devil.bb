Function updateparticles_devil%()
    Local local0.emitter
    Local local1.particle
    Local local2%
    Local local3%
    Local local4#
    Local local5#
    Local local6%
    Local local7#
    Local local9%
    Local local10#
    Local local11#
    Local local12#
    Local local13#
    Local local14#
    Local local15#
    Local local16%
    Local local17#
    Local local18#
    Local local19#
    Local local20#
    Local local21#
    Local local22#
    Local local23#
    Local local24#
    Local local25#
    Local local26#
    Local local27#
    Local local28#
    Local local29#
    Local local30#
    Local local31#
    Local local32#
    Local local33#
    Local local34%
    Local local35%
    Local local36%
    Local local37%
    Local local38#
    Local local39%
    Local local40%
    Local local41%
    Local local42#
    local3 = $00
    local4 = ((Float ($03 - opt\Field69)) * 2.0)
    local5 = ((getcamerarangefar(camera) * lightvolume) * (getcamerarangefar(camera) * lightvolume))
    For local0 = Each emitter
        clearsurface(local0\Field6, $01, $01)
        If (-1.0 < local0\Field13) Then
            local0\Field10 = (local0\Field10 + 1.0)
            If (local0\Field13 < local0\Field10) Then
                local0\Field9 = $01
            EndIf
        EndIf
        If (((0.0 < fps\Field3[$00]) And (TX6BB60B482(local0\Field14, playerroom) And (local5 > entitydistancesquared(local0\Field2, XZ0260X8X2\Field74)))) <> 0) Then
            If (local0\Field3\Field37 > $FFFFFFFF) Then
                local6 = $00
                For local1 = Each particle
                    If (local1\Field4 = local0) Then
                        local6 = (local6 + $01)
                    EndIf
                Next
            EndIf
            local0\Field4 = ((local0\Field4 + 1.0) Mod (Float local0\Field3\Field3))
            If ((((0.0 = local0\Field4) And (local0\Field9 = $00)) And (0.0 >= local0\Field12)) <> 0) Then
                For local2 = $01 To local0\Field3\Field17 Step $01
                    If ((((local0\Field3\Field37 > $FFFFFFFF) And (local6 < local0\Field3\Field37)) Lor (local0\Field3\Field37 = $FFFFFFFF)) <> 0) Then
                        local1 = (New particle)
                        local1\Field4 = local0
                        local1\Field12 = rand(local0\Field3\Field2, local0\Field3\Field1)
                        local1\Field3 = (entityx(local0\Field2, $01, 1.0) + rnd(local0\Field3\Field12, local0\Field3\Field41))
                        local1\Field11 = (entityy(local0\Field2, $01, 1.0) + rnd(local0\Field3\Field6, local0\Field3\Field36))
                        local1\Field0 = (entityz(local0\Field2, $01, 1.0) + rnd(local0\Field3\Field47, local0\Field3\Field14))
                        local1\Field2 = rnd(local0\Field3\Field10, local0\Field3\Field46)
                        local1\Field1 = rnd(local0\Field3\Field21, local0\Field3\Field45)
                        local1\Field6 = rnd(local0\Field3\Field9, local0\Field3\Field5)
                        local1\Field5 = rnd(local0\Field3\Field19, local0\Field3\Field11)
                        local7 = rnd(local0\Field3\Field31, local0\Field3\Field24)
                        local1\Field7 = ((local1\Field4\Field3\Field44 * local7) * local0\Field5)
                        local1\Field8 = ((local1\Field4\Field3\Field16 * local7) * local0\Field5)
                    EndIf
                Next
                local0\Field12 = local4
            EndIf
            local0\Field12 = (local0\Field12 - fps\Field3[$00])
            If (local0\Field3\Field27 <> 0) Then
                local0\Field3\Field18 = (local0\Field3\Field18 + local0\Field3\Field8)
                If ((Float (local0\Field3\Field34 - $01)) < local0\Field3\Field18) Then
                    local0\Field3\Field18 = 0.0
                EndIf
                entitytexture(local0\Field1, local0\Field3\Field15, (Int local0\Field3\Field18), $00)
            EndIf
            Select local0\Field7
                Case $01
                    local0\Field8 = loopsoundex(snd_i\Field37[$00], local0\Field8, camera, local0\Field2, 10.0, 1.0, $00)
                    If (local3 = $00) Then
                        If (((T8660BZ460\Field3 = $00) And (T8660BZ460\Field10 = $00)) <> 0) Then
                            If (0.81 > distancesquared(entityx(camera, $01, 1.0), entityx(local0\Field2, $01, 1.0), entityz(camera, $01, 1.0), entityz(local0\Field2, $01, 1.0), 0.0, 0.0)) Then
                                If (5.0 > (Abs (entityy(camera, $01, 1.0) - entityy(local0\Field2, $01, 1.0)))) Then
                                    local3 = $01
                                EndIf
                            EndIf
                        EndIf
                    EndIf
                Case $02,$03
                    local0\Field8 = loopsoundex(snd_i\Field37[$01], local0\Field8, camera, local0\Field2, (4.0 - ((Float (3.0 = (Float local0\Field7))) * 1.5)), (1.0 - ((Float (3.0 = (Float local0\Field7))) * 0.6)), $00)
                Case $04
                    local0\Field8 = loopsoundex(snd_i\Field23, local0\Field8, camera, local0\Field2, 4.0, 0.8, $00)
                Case $05
                    local0\Field8 = loopsoundex(snd_i\Field17, local0\Field8, camera, local0\Field2, 4.0, 1.0, $00)
            End Select
        EndIf
        If (local0\Field9 <> 0) Then
            local9 = $01
            For local1 = Each particle
                If (local1\Field4 = local0) Then
                    local9 = $00
                    Exit
                EndIf
            Next
            If (local9 <> 0) Then
                freeemitter(local0, $01)
            EndIf
        EndIf
    Next
    If (local3 <> 0) Then
        If (420.0 < XZ0260X8X2\Field70) Then
            XZ0260X8X2\Field55 = max(XZ0260X8X2\Field55, ((XZ0260X8X2\Field70 - 420.0) / 1680.0))
        EndIf
        If (1680.0 < XZ0260X8X2\Field70) Then
            msg\Field8 = format(getlocalstring("death", "smoke"), subjectname, "%s")
            kill($00, $01, $00, $01)
        EndIf
        updatecough($96)
        XZ0260X8X2\Field70 = (XZ0260X8X2\Field70 + (fps\Field3[$00] * 4.0))
    EndIf
    positionentity(particlepiv, entityx(camera, $01, 1.0), entityy(camera, $01, 1.0), entityz(camera, $01, 1.0), $00)
    local10 = entitypitch(camera, $01, 1.0)
    local11 = entityyaw(camera, $01, 1.0)
    local12 = entityroll(camera, $01, 1.0)
    For local1 = Each particle
        If (((local5 < entitydistancesquared(local1\Field4\Field2, XZ0260X8X2\Field74)) Lor (local1\Field10 > local1\Field12)) <> 0) Then
            Delete local1
        Else
            local1\Field10 = (local1\Field10 + $01)
            If (local1\Field4\Field3\Field40 <> 0) Then
                local1\Field9 = ((Float local1\Field4\Field3\Field38) - atan2(local1\Field2, local1\Field1))
            Else
                local1\Field9 = (local1\Field9 + local1\Field5)
            EndIf
            local1\Field1 = (local1\Field1 - local1\Field4\Field3\Field49)
            If (local1\Field4\Field14 <> Null) Then
                local13 = entityyaw(local1\Field4\Field14\Field15, $00, 1.0)
                local14 = sin(local13)
                local15 = cos(local13)
                local1\Field3 = (((local1\Field2 * local15) + (local1\Field6 * local14)) + local1\Field3)
                local1\Field11 = (local1\Field11 + local1\Field1)
                local1\Field0 = (((local1\Field2 * local14) + (local1\Field6 * local15)) + local1\Field0)
            Else
                local1\Field3 = (local1\Field3 + local1\Field2)
                local1\Field11 = (local1\Field11 + local1\Field1)
                local1\Field0 = (local1\Field0 + local1\Field6)
            EndIf
            local16 = $00
            If (local1\Field4\Field3\Field26 = $01) Then
                If (local1\Field4\Field3\Field0 <= local1\Field11) Then
                    local16 = $01
                EndIf
            ElseIf (local1\Field4\Field3\Field26 = $00) Then
                If (local1\Field4\Field3\Field0 > local1\Field11) Then
                    local16 = $01
                EndIf
            EndIf
            If (local16 <> 0) Then
                local1\Field1 = (local1\Field1 * (- local1\Field4\Field3\Field29))
            EndIf
            local1\Field7 = ((local1\Field7 + local1\Field4\Field3\Field30) * local1\Field4\Field3\Field33)
            local1\Field8 = ((local1\Field8 + local1\Field4\Field3\Field30) * local1\Field4\Field3\Field33)
            rotateentity(particlepiv, local10, local11, ((local1\Field9 + (Float local1\Field4\Field3\Field38)) + local12), $00)
            If (local1\Field4\Field3\Field28 > $FFFFFFFF) Then
                rotateentity(particlepiv, (Float local1\Field4\Field3\Field28), entityyaw(particlepiv, $00, 1.0), entityroll(particlepiv, $00, 1.0), $00)
            EndIf
            If (local1\Field4\Field3\Field35 > $FFFFFFFF) Then
                rotateentity(particlepiv, entitypitch(particlepiv, $00, 1.0), (Float local1\Field4\Field3\Field35), entityroll(particlepiv, $00, 1.0), $00)
            EndIf
            local17 = (entityx(local1\Field4\Field1, $00, 1.0) + local1\Field3)
            local18 = (entityy(local1\Field4\Field1, $00, 1.0) + local1\Field11)
            local19 = (entityz(local1\Field4\Field1, $00, 1.0) + local1\Field0)
            local20 = local1\Field7
            local21 = local1\Field8
            tformvector(local20, (- local21), 0.0, particlepiv, $00)
            local22 = (tformedx() + local17)
            local23 = (tformedy() + local18)
            local24 = (tformedz() + local19)
            tformvector((- local20), (- local21), 0.0, particlepiv, $00)
            local25 = (tformedx() + local17)
            local26 = (tformedy() + local18)
            local27 = (tformedz() + local19)
            tformvector(local20, local21, 0.0, particlepiv, $00)
            local28 = (tformedx() + local17)
            local29 = (tformedy() + local18)
            local30 = (tformedz() + local19)
            tformvector((- local20), local21, 0.0, particlepiv, $00)
            local31 = (tformedx() + local17)
            local32 = (tformedy() + local18)
            local33 = (tformedz() + local19)
            local34 = addvertex(local1\Field4\Field6, local22, local23, local24, 0.0, 0.0, 1.0)
            local35 = addvertex(local1\Field4\Field6, local25, local26, local27, 1.0, 0.0, 1.0)
            local36 = addvertex(local1\Field4\Field6, local28, local29, local30, 0.0, 1.0, 1.0)
            local37 = addvertex(local1\Field4\Field6, local31, local32, local33, 1.0, 1.0, 1.0)
            local38 = ((Float local1\Field10) / (Float local1\Field12))
            local39 = (Int (((Float (local1\Field4\Field3\Field20 - local1\Field4\Field3\Field39)) * local38) + (Float local1\Field4\Field3\Field39)))
            local40 = (Int (((Float (local1\Field4\Field3\Field13 - local1\Field4\Field3\Field25)) * local38) + (Float local1\Field4\Field3\Field25)))
            local41 = (Int (((Float (local1\Field4\Field3\Field22 - local1\Field4\Field3\Field23)) * local38) + (Float local1\Field4\Field3\Field23)))
            If (local1\Field4\Field3\Field7 <> 0) Then
                local42 = ((1.0 - local38) * local1\Field4\Field3\Field43)
            Else
                local42 = local1\Field4\Field3\Field43
            EndIf
            vertexcolor(local1\Field4\Field6, local34, (Float local39), (Float local40), (Float local41), local42)
            vertexcolor(local1\Field4\Field6, local35, (Float local39), (Float local40), (Float local41), local42)
            vertexcolor(local1\Field4\Field6, local36, (Float local39), (Float local40), (Float local41), local42)
            vertexcolor(local1\Field4\Field6, local37, (Float local39), (Float local40), (Float local41), local42)
            For local2 = $01 To local1\Field4\Field3\Field32 Step $01
                addtriangle(local1\Field4\Field6, local34, local35, local36)
                addtriangle(local1\Field4\Field6, local36, local35, local37)
            Next
        EndIf
    Next
    Return $00
End Function

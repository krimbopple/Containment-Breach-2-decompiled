Function updatedecals%()
    Local local0.decals
    Local local1#
    Local local2#
    Local local3%
    Local local4#
    Local local5#
    Local local6.decals
    Local local7#
    Local local8#
    If (0.0 >= BXZDBZ0BB\Field3) Then
        local1 = ((getcamerarangefar(camera) * 1.25) * (getcamerarangefar(camera) * 1.25))
        For local0 = Each decals
            If (0.0 < local0\Field2) Then
                local0\Field2 = max((local0\Field2 - 70.0), 5.0)
            EndIf
            If (5.0 = local0\Field2) Then
                removedecal(local0)
            ElseIf (((local1 > entitydistancesquared(local0\Field0, XZ0260X8X2\Field74)) And GUESSEDupdatedecals(local0\Field4, playerroom)) <> 0) Then
                If (entityhidden(local0\Field0) <> 0) Then
                    showentity(local0\Field0)
                EndIf
            ElseIf (entityhidden(local0\Field0) = $00) Then
                hideentity(local0\Field0)
            EndIf
        Next
        BXZDBZ0BB\Field3 = 48.0
    Else
        BXZDBZ0BB\Field3 = (BXZDBZ0BB\Field3 - fps\Field3[$00])
    EndIf
    For local0 = Each decals
        If (entityhidden(local0\Field0) = $00) Then
            local2 = entityy(local0\Field0, $01, 1.0)
            If (0.0 <> local0\Field14) Then
                local0\Field9 = ((local0\Field14 * fps\Field3[$00]) + local0\Field9)
                scaleentity(local0\Field0, local0\Field9, local0\Field9, 1.0, $01)
                local3 = local0\Field7
                If (local3 = $00) Then
                    If (0.0 >= local0\Field1) Then
                        local4 = rnd(360.0, 0.0)
                        local5 = rnd(local0\Field9, 0.0)
                        local6 = createdecal($01, (entityx(local0\Field0, $01, 1.0) + (cos(local4) * local5)), (local2 - 0.0005), (entityz(local0\Field0, $01, 1.0) + (sin(local4) * local5)), entitypitch(local0\Field0, $01, 1.0), entityyaw(local0\Field0, $01, 1.0), entityroll(local0\Field0, $01, 1.0), rnd(0.1, 0.5), 1.0, $00, $01, $00, $00, $00)
                        entityparent(local6\Field0, getparent(local0\Field0), $01)
                        playsoundex(snd_i\Field1[rand($03, $01)], camera, local6\Field0, 10.0, rnd(0.1, 0.5), $00, $00)
                        local0\Field1 = rnd(50.0, 100.0)
                    Else
                        local0\Field1 = (local0\Field1 - fps\Field3[$00])
                    EndIf
                EndIf
                If (local0\Field3 <= local0\Field9) Then
                    local0\Field14 = 0.0
                    local0\Field9 = local0\Field3
                EndIf
            EndIf
            If (0.0 <> local0\Field5) Then
                local0\Field12 = min(((fps\Field3[$00] * local0\Field5) + local0\Field12), 1.0)
                entityalpha(local0\Field0, local0\Field12)
            EndIf
            If (((0.0 >= local0\Field9) Lor (0.0 >= local0\Field12)) <> 0) Then
                removedecal(local0)
            Else
                local7 = distancesquared(entityx(XZ0260X8X2\Field74, $00, 1.0), entityx(local0\Field0, $01, 1.0), entityz(XZ0260X8X2\Field74, $00, 1.0), entityz(local0\Field0, $01, 1.0), 0.0, 0.0)
                local8 = ((local0\Field9 * 0.8) * (local0\Field9 * 0.8))
                If ((((local8 > local7) And (90.0 = (Float (Int entitypitch(local0\Field0, $01, 1.0))))) And (0.05 > (Abs ((entityy(XZ0260X8X2\Field74, $00, 1.0) - 0.3) - local2)))) <> 0) Then
                    Select local0\Field7
                        Case $00
                            If (local0\Field6 <> $01) Then
                                decalstep = $01
                                XZ0260X8X2\Field76 = curvevalue(0.0, XZ0260X8X2\Field76, max((100.0 - (sqr((local8 - local7)) * 15.0)), 1.0))
                                XZ0260X8X2\Field46 = max(XZ0260X8X2\Field46, ((local8 - local7) / 2.0))
                            Else
                                dustparticlechance = $01
                            EndIf
                        Case $02,$03,$04,$05,$06,$07,$11,$12,$13,$15,$16
                            decalstep = $02
                    End Select
                EndIf
            EndIf
        EndIf
    Next
    Return $00
End Function

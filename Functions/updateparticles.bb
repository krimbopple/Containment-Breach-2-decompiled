Function updateparticles%()
    Local local0.particles
    Local local1#
    catcherrors("UpdateParticles()")
    local1 = ((getcamerarangefar(camera) * lightvolume) * (getcamerarangefar(camera) * lightvolume))
    For local0 = Each particles
        If (local1 >= entitydistancesquared(local0\Field4, XZ0260X8X2\Field74)) Then
            moveentity(local0\Field10, 0.0, 0.0, (local0\Field11 * fps\Field3[$00]), $00)
            If (0.0 <> local0\Field2) Then
                local0\Field0 = (local0\Field0 - (local0\Field2 * fps\Field3[$00]))
            EndIf
            translateentity(local0\Field10, 0.0, (local0\Field0 * fps\Field3[$00]), 0.0, $01)
            positionentity(local0\Field4, entityx(local0\Field10, $01, 1.0), entityy(local0\Field10, $01, 1.0), entityz(local0\Field10, $01, 1.0), $01)
            If (0.0 <> local0\Field5) Then
                local0\Field13 = clamp(((local0\Field5 * fps\Field3[$00]) + local0\Field13), 0.0, 1.0)
                entityalpha(local0\Field4, local0\Field13)
            EndIf
            If (0.0 <> local0\Field7) Then
                local0\Field3 = ((local0\Field7 * fps\Field3[$00]) + local0\Field3)
                scalesprite(local0\Field4, local0\Field3, local0\Field3)
            EndIf
            local0\Field8 = (local0\Field8 - fps\Field3[$00])
            If ((((0.0 >= local0\Field8) Lor (0.00001 > local0\Field3)) Lor (0.0 >= local0\Field13)) <> 0) Then
                removeparticle(local0)
            EndIf
        Else
            removeparticle(local0)
        EndIf
    Next
    catcherrors("Uncaught: UpdateParticles()")
    Return $00
End Function

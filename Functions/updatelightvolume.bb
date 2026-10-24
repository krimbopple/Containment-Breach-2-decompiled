Function updatelightvolume%()
    Local local0.lights
    Local local1#
    Local local2#
    If (0.01 < secondarylighton) Then
        If (8.0 > BXZDBZ0BB\Field1) Then
            BXZDBZ0BB\Field1 = (BXZDBZ0BB\Field1 + fps\Field3[$00])
        Else
            local1 = (hidedistance * hidedistance)
            For local0 = Each lights
                If ((((local0\Field16 <> Null) And TX6BB60B482(local0\Field16, playerroom)) Lor (local0\Field16 = Null)) <> 0) Then
                    local2 = entitydistancesquared(camera, local0\Field7)
                    If (local2 < ((local0\Field4 * local0\Field4) + local1)) Then
                        templightvolume = max(((((local0\Field15 * local0\Field15) * ((hidedistance - sqr(local2)) / hidedistance)) + templightvolume) / 4.5), 1.0)
                    EndIf
                    local0\Field14 = $01
                Else
                    local0\Field14 = $00
                EndIf
            Next
            BXZDBZ0BB\Field1 = 0.0
        EndIf
        lightvolume = curvevalue((templightvolume / ((Float ((0.1 >= secondarylighton) * (T8660BZ460\Field8 = $00))) + 1.0)), lightvolume, 40.0)
    Else
        lightvolume = curvevalue(0.6, lightvolume, 40.0)
        BXZDBZ0BB\Field1 = 0.0
    EndIf
    TD8DBBBZ2B(curvevalue(min(secondarylighton, 1.0), ZB40B06B0(), 5.0), $00)
    Return $00
End Function

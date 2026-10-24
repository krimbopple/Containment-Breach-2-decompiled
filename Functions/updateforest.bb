Function updateforest%(arg0.forest)
    Local local0%
    Local local1%
    Local local2#
    catcherrors("UpdateForest()")
    local2 = (hidedistance * hidedistance)
    For local0 = $00 To $09 Step $01
        For local1 = $00 To $09 Step $01
            If (arg0\Field6[((local1 * $0A) + local0)] <> $00) Then
                If (local2 > distancesquared(entityx(XZ0260X8X2\Field74, $01, 1.0), entityx(arg0\Field6[((local1 * $0A) + local0)], $01, 1.0), entityz(XZ0260X8X2\Field74, $01, 1.0), entityz(arg0\Field6[((local1 * $0A) + local0)], $01, 1.0), 0.0, 0.0)) Then
                    If (entityhidden(arg0\Field4) <> 0) Then
                        showentity(arg0\Field4)
                    EndIf
                    If (entityhidden(arg0\Field6[((local1 * $0A) + local0)]) <> 0) Then
                        showentity(arg0\Field6[((local1 * $0A) + local0)])
                    EndIf
                ElseIf (entityhidden(arg0\Field6[((local1 * $0A) + local0)]) = $00) Then
                    hideentity(arg0\Field6[((local1 * $0A) + local0)])
                EndIf
            EndIf
        Next
    Next
    catcherrors("Uncaught: UpdateForest()")
    Return $00
End Function

Function GUESSEDcreatebank_5%()
    Local local0%
    Local local1.A262400ZZ
    Local local2.F4X4XZ2BZ
    local0 = createbank($40)
    pokefloat(local0, $00, 0.5)
    pokefloat(local0, $14, -0.5)
    pokefloat(local0, $28, 1.0)
    pokefloat(local0, $30, 0.5)
    pokefloat(local0, $34, 0.5)
    pokefloat(local0, $3C, 1.0)
    For local1 = Each A262400ZZ
        effectmatrix(local1\Field1, "ShadowsAdjust", bankpointer(local0), $00)
    Next
    For local2 = Each F4X4XZ2BZ
        If (local2\Field1 <> $00) Then
            effecttexture(local2\Field1, "tLighting", X2BFB86264, $00)
            effecttexture(local2\Field1, "tMRTDepth", T20Z2020X22, $00)
        EndIf
    Next
    GUESSEDupdateeffect(X0844FD2Z6, $01)
    GUESSEDupdateeffect_2(X6F6FZB0DD, $01)
    freebank(local0)
    local0 = $00
    Return $00
End Function

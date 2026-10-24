Function TXDDB62DBZ.T24B4ZF6F6(arg0%, arg1$, arg2%, arg3%)
    Local local0.T24B4ZF6F6
    If (X8ZZ6XZBBD[arg0] <> Null) Then
        Return Null
    EndIf
    For local0 = Each T24B4ZF6F6
        If (local0\Field8 = arg1) Then
            X8ZZ6XZBBD[arg0]\Field9 = copyentity(local0\Field9, $00)
        EndIf
    Next
    arg1 = lower(arg1)
    X8ZZ6XZBBD[arg0] = (New T24B4ZF6F6)
    X8ZZ6XZBBD[arg0]\Field3 = (New X0442B862F)
    X8ZZ6XZBBD[arg0]\Field5 = arg0
    X8ZZ6XZBBD[arg0]\Field4 = createpivot($00)
    X8ZZ6XZBBD[arg0]\Field8 = arg1
    X8ZZ6XZBBD[arg0]\Field6 = arg2
    X8ZZ6XZBBD[arg0]\Field10 = arg3
    If (X8ZZ6XZBBD[arg0]\Field9 = $00) Then
        X8ZZ6XZBBD[arg0]\Field9 = loadanimmesh_strict(arg1, createpivot(X8ZZ6XZBBD[arg0]\Field4), (instr(arg1, "addons", $01) < $01))
    EndIf
    X8ZZ6XZBBD[arg0]\Field3\Field30 = arg0
    X8ZZ6XZBBD[arg0]\Field3\Field0 = ""
    X8ZZ6XZBBD[arg0]\Field3\Field3 = $FFFFFFFF
    X8ZZ6XZBBD[arg0]\Field3\Field16 = 1.0
    X8ZZ6XZBBD[arg0]\Field3\Field51 = 30.0
    X8ZZ6XZBBD[arg0]\Field3\Field2 = 1.0
    entityfx(X8ZZ6XZBBD[arg0]\Field9, $10)
    entityshininess(X8ZZ6XZBBD[arg0]\Field9, 0.0, 0.0)
    hideentity(X8ZZ6XZBBD[arg0]\Field9)
    YX2D2860X(X8ZZ6XZBBD[arg0]\Field9, $00, $14000)
    Return X8ZZ6XZBBD[arg0]
    Return Null
End Function

Function E2BXBBZ62%(arg0%)
    Local local0%
    Local local1%
    Select arg0
        Case $01
            local0 = TXXB002X4D0(texturewidth(T22FB2Z0B2), textureheight(T22FB2Z0B2), XFXFXB6F68)
        Case $02
            local0 = createsphere($05, $00)
        Case $03
            local0 = createmesh($00)
            local1 = createsurface(local0, $00)
            addvertex(local1, 0.00001, 0.00001, 0.00001, 0.0, 0.0, 1.0)
            addvertex(local1, 0.00001, -0.00001, 0.00001, 0.0, 0.0, 1.0)
            addvertex(local1, -0.00001, -0.00001, 0.00001, 0.0, 0.0, 1.0)
            addvertex(local1, -0.00001, 0.00001, 0.00001, 0.0, 0.0, 1.0)
            addvertex(local1, 1.0, 1.0, 0.99999, 0.0, 0.0, 1.0)
            addvertex(local1, 1.0, -1.0, 0.99999, 0.0, 0.0, 1.0)
            addvertex(local1, -1.0, -1.0, 0.99999, 0.0, 0.0, 1.0)
            addvertex(local1, -1.0, 1.0, 0.99999, 0.0, 0.0, 1.0)
            addtriangle(local1, $03, $00, $01)
            addtriangle(local1, $03, $01, $02)
            addtriangle(local1, $00, $04, $05)
            addtriangle(local1, $00, $05, $01)
            addtriangle(local1, $03, $07, $04)
            addtriangle(local1, $03, $04, $00)
            addtriangle(local1, $07, $03, $02)
            addtriangle(local1, $07, $02, $06)
            addtriangle(local1, $06, $02, $01)
            addtriangle(local1, $06, $01, $05)
            addtriangle(local1, $07, $05, $04)
            addtriangle(local1, $07, $06, $05)
    End Select
    Return local0
    Return $00
End Function

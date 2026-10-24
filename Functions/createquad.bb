Function createquad%(arg0%)
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    Local local4%
    Local local5%
    local0 = createmesh(arg0)
    local1 = createsurface(local0, $00)
    local2 = addvertex(local1, -1.0, 1.0, 0.0, 0.0, 0.0, 1.0)
    local3 = addvertex(local1, 1.0, 1.0, 0.0, 1.0, 0.0, 1.0)
    local4 = addvertex(local1, 1.0, -1.0, 0.0, 1.0, 1.0, 1.0)
    local5 = addvertex(local1, -1.0, -1.0, 0.0, 0.0, 1.0, 1.0)
    addtriangle(local1, local2, local3, local4)
    addtriangle(local1, local2, local4, local5)
    updatenormals(local0, $00)
    Return local0
    Return $00
End Function

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<title>Archive</title>
<meta charset="utf-8">
<link rel="stylesheet" href="styles.css">
<div class="content-container">
    <div class="top-panel">
        <nav class="main-menu">
            <ul>
                <li><a href="/search">Пошук приміщення</a></li>
                <li><a href="/statistics">Статистика</a></li>
                <li><a href="/current">Поточні оренди</a></li>
            </ul>
        </nav>
        <div class="search-panel">
            <form class="search-form" method="post" action="/search">
                <input class="street-field" name="street" placeholder="Вулиця" required/>
                <select class="rooms-num-field" name="roomsNum" required>
                    <option disabled selected hidden>К-ть кімнат</option>
                    <c:forEach items="${roomsNums}" var="roomsNum">
                        <option>${roomsNum}</option>
                    </c:forEach>
                </select>
                <select class="type-field" name="type" required>
                    <option disabled selected hidden>Тип</option>
                    <c:forEach items="${types}" var="type">
                        <option>${type}</option>
                    </c:forEach>
                </select>
                <select class="price-field" name="priceRange" required>
                    <option disabled selected hidden>Ціна</option>
                    <c:forEach items="${prices}" var="price">
                        <option>${price}</option>
                    </c:forEach>
                </select>
                <button class="search-button">Знайти</button>
            </form>
        </div>
    </div>
    <div class="search-results-summary">Знайдено ${objects.size()} записів про оренд</div>
    <div class="search-results">
        <table class="data-table">
            <tr>
                <th>№</th>
                <th>Адреса</th>
                <th>Кімнат</th>
                <th>Тип</th>
                <th>Ціна</th>
                <th>Тривалість оренди</th>
            </tr>
            <c:forEach items="${objects}" var="object" varStatus="loop">
                <tr>
                    <td>${loop.index}</td>
                    <td>${object.address}</td>
                    <td>${object.roomsNum}</td>
                    <td>${object.type}</td>
                    <td>${object.price}</td>
                    <td>${object.daysInRent} днів</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>